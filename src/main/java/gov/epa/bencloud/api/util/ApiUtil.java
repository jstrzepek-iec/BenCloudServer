package gov.epa.bencloud.api.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Record;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.impl.DSL;
import static gov.epa.bencloud.server.database.jooq.data.Tables.*;

import gov.epa.bencloud.api.HIFApi;
import gov.epa.bencloud.api.ValuationApi;
import gov.epa.bencloud.api.model.ValuationTaskConfig;
import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.database.jooq.data.Routines;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetVariableRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.InflationEntryRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.ValuationFunctionRecord;
import gov.epa.bencloud.server.tasks.TaskComplete;
import gov.epa.bencloud.server.tasks.TaskUtil;
import gov.epa.bencloud.server.tasks.model.Task;
import spark.Request;
import spark.Response;

/**
 * @author jimanderton
 *
 */
public class ApiUtil {

	
	/**
	 * @param columnIdx
	 * @param rowIdx
	 * @return unique integer using the Cantor pairing function to combine column and row indices
	 * https://en.wikipedia.org/wiki/Pairing_function
	 */
	public static int getCellId(int columnIdx, int rowIdx) {
		return (int)(((columnIdx+rowIdx)*(columnIdx+rowIdx+1)*0.5)+rowIdx);
	}


	public static Map<String, Double> getInflationIndices(int id, Integer inflationYear) {

		InflationEntryRecord inflationRecord = DSL.using(JooqUtil.getJooqConfiguration())
				.selectFrom(INFLATION_ENTRY)
				.where(INFLATION_ENTRY.INFLATION_DATASET_ID.eq(id).and(INFLATION_ENTRY.ENTRY_YEAR.eq(inflationYear)))
				.fetchOne();
		Map<String, Double> inflationIndices = new HashMap<String, Double>();
		inflationIndices.put("AllGoodsIndex", inflationRecord.getAllGoodsIndex().doubleValue());
		inflationIndices.put("MedicalCostIndex", inflationRecord.getMedicalCostIndex().doubleValue());		
		inflationIndices.put("WageIndex", inflationRecord.getWageIndex().doubleValue());
		
		return inflationIndices;
	}

	public static Map<Short, Record2<Short, Double>> getIncomeGrowthFactors(int id, Integer popYear) {

		Map<Short, Record2<Short, Double>> incomeGrowthFactorRecords = DSL.using(JooqUtil.getJooqConfiguration())
				.select(INCOME_GROWTH_ADJ_FACTOR.ENDPOINT_GROUP_ID,
						INCOME_GROWTH_ADJ_FACTOR.MEAN_VALUE)
				.from(INCOME_GROWTH_ADJ_FACTOR)
				.where(INCOME_GROWTH_ADJ_FACTOR.INCOME_GROWTH_ADJ_DATASET_ID.eq((short) id).and(INCOME_GROWTH_ADJ_FACTOR.GROWTH_YEAR.eq(popYear.shortValue())))
				.fetchMap(INCOME_GROWTH_ADJ_FACTOR.ENDPOINT_GROUP_ID);
				
		return incomeGrowthFactorRecords;
	}

	public static Map<String, Integer> getStatisticIdLookup() {
		Map<String, Integer> statistics = DSL.using(JooqUtil.getJooqConfiguration())
				.select(DSL.lower(STATISTIC_TYPE.NAME), STATISTIC_TYPE.ID)
				.from(STATISTIC_TYPE)
				.fetchMap(DSL.lower(STATISTIC_TYPE.NAME), STATISTIC_TYPE.ID);		
		return statistics;	
	}

	public static Object deleteTaskResults(Request req, Response res) {
		String uuid = req.params("uuid");
		
		Result<Record> completedTasks = 
				DSL.using(JooqUtil.getJooqConfiguration()).select().from(TASK_COMPLETE)
				.where(TASK_COMPLETE.TASK_UUID.eq(uuid))
				.fetch();

		if (completedTasks.size() == 0) {
			// System.out.println("no tasks to process");
		} else {
			Record taskCompleteRecord = completedTasks.get(0);
			
			if (taskCompleteRecord.get(TASK_COMPLETE.TASK_TYPE).equals("HIF")) {
				TaskUtil.deleteHifResults(uuid);
			} else if (taskCompleteRecord.get(TASK_COMPLETE.TASK_TYPE).equals("Valuation")) {
				TaskUtil.deleteValuationResults(uuid);
			}
		}
		
		return null;
	}

	public static Map<String, Map<Integer, Double>> getVariableValues(ValuationTaskConfig valuationTaskConfig, List<ValuationFunctionRecord> vfDefinitionList) {
		 // Load list of functions from the database
		
		//TODO: Change this to only load what we need
		List<String> allVariableNames = ApiUtil.getAllVariableNames(valuationTaskConfig.variableDatasetId);
		
		//TODO: Temp override until we can improve variable selection
		allVariableNames.removeIf(n -> (!n.equals("median_income")));
		
		HashMap<String, Map<Integer, Double>> variableMap = new HashMap<String, Map<Integer, Double>>();
		
		Result<GetVariableRecord> variableRecords = Routines.getVariable(JooqUtil.getJooqConfiguration(), 
				1, 
				allVariableNames.toArray(new String[0]), 
				28);
		//Look at all valuation functions to determine which variables are needed
		for(String variableName: allVariableNames) {
			for(ValuationFunctionRecord function : vfDefinitionList) {
				if(function.getFunctionText().toLowerCase().contains(variableName)) {
					if(!variableMap.containsKey(variableName)) {
						variableMap.put(variableName, new HashMap<Integer, Double>());
					}
				}
			}
		}
		// Finally load the cell values for each needed variable
		for (GetVariableRecord variableRecord : variableRecords) {
			if(variableMap.containsKey(variableRecord.getVariableName())) {
				variableMap.get(variableRecord.getVariableName()).put(variableRecord.getGridCellId(), variableRecord.getValue().doubleValue());
			}
		}
		
		return variableMap;
	}

	private static List<String> getAllVariableNames(Integer variableDatasetId) {
		if(variableDatasetId == null) {
			return null;
		}

		List<String> allVariableNames = DSL.using(JooqUtil.getJooqConfiguration())
				.select(VARIABLE_ENTRY.NAME)
				.from(VARIABLE_ENTRY)
				.where(VARIABLE_ENTRY.VARIABLE_DATASET_ID.eq(variableDatasetId))
				.orderBy(VARIABLE_ENTRY.NAME)
				.fetch(VARIABLE_ENTRY.NAME);
		return allVariableNames;
	}
}
