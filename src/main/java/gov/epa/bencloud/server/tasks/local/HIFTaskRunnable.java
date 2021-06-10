package gov.epa.bencloud.server.tasks.local;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.jooq.Record2;
import org.jooq.Record6;
import org.jooq.Record8;
import org.jooq.Result;
import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import gov.epa.bencloud.api.AirQualityApi;
import gov.epa.bencloud.api.IncidenceApi;
import gov.epa.bencloud.api.PopulationApi;
import gov.epa.bencloud.api.util.HIFConfig;
import gov.epa.bencloud.api.util.HIFTaskConfig;
import gov.epa.bencloud.api.util.HIFUtil;
import gov.epa.bencloud.server.database.jooq.tables.records.AirQualityCellRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.HealthImpactFunctionRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.HifResultsRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopulationEntryRecord;
import gov.epa.bencloud.server.tasks.TaskComplete;
import gov.epa.bencloud.server.tasks.TaskQueue;
import gov.epa.bencloud.server.tasks.TaskWorker;
import gov.epa.bencloud.server.tasks.model.Task;

public class HIFTaskRunnable implements Runnable {

	private String taskUuid;
	private String taskWorkerUuid;

	public HIFTaskRunnable(String taskUuid, String taskWorkerUuid) {
		this.taskUuid = taskUuid;
		this.taskWorkerUuid = taskWorkerUuid;
	}

	private boolean taskSuccessful = true;
	private String taskCompleteMessage = "Task Complete";

	public void run() {

		Task task = TaskQueue.getTaskFromQueueRecord(taskUuid);

		// String paramString = task.getParameters();
		String paramString = task.getParameters();

		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode params = mapper.readTree(paramString);
			JsonNode aqLayers = params.get("airQualityData");

			HIFTaskConfig hifTaskConfig = new HIFTaskConfig();
			hifTaskConfig.name = task.getName();

			for (JsonNode aqLayer : aqLayers) {
				switch (aqLayer.get("type").asText().toLowerCase()) {
				case "baseline":
					hifTaskConfig.aqBaselineId = aqLayer.get("id").asInt();
					break;
				case "scenario":
					hifTaskConfig.aqScenarioId = aqLayer.get("id").asInt();
					break;
				}
			}
			JsonNode popConfig = params.get("population");

			hifTaskConfig.popId = popConfig.get("id").asInt();
			hifTaskConfig.popYear = popConfig.get("year").asInt();
			JsonNode functions = params.get("functions");
			parseFunctions(functions, hifTaskConfig);

			ArrayList<Expression> hifExpressionList = new ArrayList<Expression>();
			ArrayList<HealthImpactFunctionRecord> hifDefinitionList = new ArrayList<HealthImpactFunctionRecord>();
			ArrayList<Map<Long, Result<Record8<Long, Integer, Integer, Integer, Integer, Short, Short, BigDecimal>>>> incidenceLists = new ArrayList<Map<Long, Result<Record8<Long, Integer, Integer, Integer, Integer, Short, Short, BigDecimal>>>>();

			for(HIFConfig hif : hifTaskConfig.hifs) {
				Expression e = HIFUtil.getFunctionExpression(hif.hifId);
				hifExpressionList.add(e);
				HealthImpactFunctionRecord h = HIFUtil.getFunctionDefinition(hif.hifId);
				hifDefinitionList.add(h);
				
				// Load the incidence dataset each function
				//TODO: Optimize this to avoid duplicate effort with multiple HIFs that overlap
				Map<Long, Result<Record8<Long, Integer, Integer, Integer, Integer, Short, Short, BigDecimal>>> incidenceMap = IncidenceApi.getIncidenceEntryGroups(hif.incidence, h.getEndpointId());
				incidenceLists.add(incidenceMap);
			}

			Map<Long, AirQualityCellRecord> baseline = AirQualityApi.getAirQualityLayerMap(hifTaskConfig.aqBaselineId);
			Map<Long, AirQualityCellRecord> scenario = AirQualityApi.getAirQualityLayerMap(hifTaskConfig.aqScenarioId);

			// Load the population dataset
			Map<Long, Result<Record6<Long, Integer, Integer, Integer, Integer, BigDecimal>>> populationMap = PopulationApi.getPopulationEntryGroups(hifTaskConfig.popId, hifTaskConfig.popYear);
			

			// Load data for the selected HIFs
			// Determine the race/gender/ethnicity groups and age ranges needed for the selected HIFs
			// Load incidence, prevalence, and variables
			// For each AQ grid cell
			// For each population category
			// Run each HIF
			// Create list of results for each HIF. Columns include col, row, start age, end
			// age, point estimate, population, delta, mean, baseline, pct
			
			int totalCells = baseline.size();
			int currentCell = 0;
			int prevPct = -999;
			
			ArrayList<HifResultsRecord> hifResults = new ArrayList<HifResultsRecord>();
			mXparser.setToOverrideBuiltinTokens();
			
			/*
			 * FOR EACH CELL IN THE BASELINE AIR QUALITY SURFACE
			 */
			for (Entry<Long, AirQualityCellRecord> baselineEntry : baseline.entrySet()) {
				// updating task percentage
				int currentPct = Math.round(currentCell * 100 / totalCells);
				currentCell++;
				
				if(prevPct != currentPct) {
					TaskQueue.updateTaskPercentage(taskUuid, currentPct);
					TaskWorker.updateTaskWorkerHeartbeat(taskWorkerUuid);
					prevPct = currentPct;
				}
				
				AirQualityCellRecord baselineCell = baselineEntry.getValue();
				AirQualityCellRecord scenarioCell = scenario.getOrDefault(baselineEntry.getKey(), null);
				if(scenarioCell == null) {
					continue;
				}
				if(baselineCell.getValue().equals(scenarioCell.getValue())) {
					continue;
				}
				Result<Record6<Long, Integer, Integer, Integer, Integer, BigDecimal>> populationCell = populationMap.getOrDefault(baselineEntry.getKey(), null);
				if(populationCell == null) {
					continue;
				}
				
				/*
				 * FOR EACH FUNCTION THE USER SELECTED
				 */
				for(int hifIdx=0; hifIdx < hifTaskConfig.hifs.size(); hifIdx++) {
					//TODO: Loop over all the population cells and sum the results for all the relevant bins
					Expression hifExpression = hifExpressionList.get(hifIdx);
					HIFConfig hifConfig = hifTaskConfig.hifs.get(hifIdx);
					HealthImpactFunctionRecord hifDefinition = hifDefinitionList.get(hifIdx);
					
					hifExpression.setArgumentValue("DELTAQ", baselineCell.getValue().subtract(scenarioCell.getValue()).doubleValue());
					hifExpression.setArgumentValue("Q0", baselineCell.getValue().doubleValue());
					hifExpression.setArgumentValue("Q1", scenarioCell.getValue().doubleValue());
					
					Map<Long, Result<Record8<Long, Integer, Integer, Integer, Integer, Short, Short, BigDecimal>>> incidenceMap = incidenceLists.get(hifIdx);
					/*
					 * ACCUMULATE THE ESTIMATE FOR EACH AGE CATEGORY IN THIS CELL
					 */
					
					BigDecimal totalPop = new BigDecimal(0);
					Double hifEstimate=0.0;
					for(Record6<Long, Integer, Integer, Integer, Integer, BigDecimal> popRow : populationCell) {
						Result<Record8<Long, Integer, Integer, Integer, Integer, Short, Short, BigDecimal>> incidenceCell = incidenceMap.get(popRow.value1());
						totalPop.add(popRow.value6());

						hifExpression.setArgumentValue("INCIDENCE", 0.5);
						hifExpression.setArgumentValue("POPULATION", populationCell.get(0).value2().doubleValue());
						hifEstimate += hifExpression.calculate();
					}
					
					//System.out.println(baselineCell.getGridCol() + ", " + baselineCell.getGridRow() + ", " + hif1.getArgumentValue("DELTAQ") + ", " + hif1.getArgumentValue("POPULATION")  + " = " + hif1.calculate());
					HifResultsRecord rec = new HifResultsRecord();
					rec.setGridCellId(baselineEntry.getKey());
					rec.setGridCol(baselineCell.getGridCol());
					rec.setGridRow(baselineCell.getGridRow());
					rec.setHifId(hifConfig.hifId);
					rec.setPopulation(totalPop);
					rec.setDelta(baselineCell.getValue().subtract(scenarioCell.getValue()));
					rec.setResult(BigDecimal.valueOf(hifEstimate));
					hifResults.add(rec);
				}
			}
			HIFUtil.storeResults(task, hifResults);
			
			TaskComplete.addTaskToCompleteAndRemoveTaskFromQueue(taskUuid, taskWorkerUuid, taskSuccessful,
					taskCompleteMessage);

		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void parseFunctions(JsonNode functions, HIFTaskConfig hifTaskConfig) {
		for (JsonNode function : functions) {
			HIFConfig hifConfig = new HIFConfig();
			hifConfig.hifId = function.get("id").asInt();
//			hifConfig.startAge = function.get("startAge").asInt();
//			hifConfig.endAge = function.get("endAge").asInt();
//			hifConfig.race = function.get("race").asInt();
//			hifConfig.ethnicity = function.get("ethnicity").asInt();
//			hifConfig.gender = function.get("gender").asInt();
//			hifConfig.incidence = function.get("incidence").asInt();
//			hifConfig.prevalence = function.get("prevalence").asInt();
//			hifConfig.variable = function.get("variable").asInt();
			hifTaskConfig.hifs.add(hifConfig);
		}
	}


}
