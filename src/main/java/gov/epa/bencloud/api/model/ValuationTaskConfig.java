package gov.epa.bencloud.api.model;

import static gov.epa.bencloud.server.database.jooq.data.Tables.AIR_QUALITY_LAYER;
import static gov.epa.bencloud.server.database.jooq.data.Tables.GRID_DEFINITION;
import static gov.epa.bencloud.server.database.jooq.data.Tables.POPULATION_DATASET;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jooq.JSON;
import org.jooq.Record3;
import org.jooq.Record9;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import gov.epa.bencloud.api.AirQualityApi;
import gov.epa.bencloud.api.GridDefinitionApi;
import gov.epa.bencloud.api.PopulationApi;
import gov.epa.bencloud.api.util.AirQualityUtil;
import gov.epa.bencloud.api.util.HIFUtil;
import gov.epa.bencloud.server.tasks.model.Task;

public class ValuationTaskConfig {
	private static final Logger log = LoggerFactory.getLogger(ValuationTaskConfig.class);
	

	public String name;
	public Integer resultDatasetId = 0;
	public Integer hifResultDatasetId = null;
	
	public String hifTaskUuid = null;
	public Integer variableDatasetId = null;
	public Integer inflationYear = null;
	public Integer incomeGrowthYear = null;
	
	public List<ValuationConfig> valuationFunctions = new ArrayList<ValuationConfig>();
	
	
	public ValuationTaskConfig() {
		super();
	}
	
	public ValuationTaskConfig(Task task) {
		super();
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode params = mapper.readTree(task.getParameters());

			this.name = task.getName();
			
			this.hifTaskUuid = params.get("parent_task_uuid").asText();

			this.hifResultDatasetId = params.get("hif_result_dataset_id").asInt();
			this.variableDatasetId = params.get("variable_dataset_id")==null || params.get("variable_dataset_id").isEmpty() ? 1 : params.get("variable_dataset_id").asInt();

			JsonNode functions = params.get("functions");

			for (JsonNode function : functions) {
				this.valuationFunctions.add(new ValuationConfig(function));
			}

		} catch (JsonMappingException e) {
			log.error("Error parsing task parameters", e);
		} catch (JsonProcessingException e) {
			log.error("Error processing task parameters", e);
		}
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		
		b.append("Task Name: ").append(name).append("\n\n");
		
		b.append("Inflation Year: ").append(inflationYear).append("\n");
		b.append("Income Growth Year: ").append(incomeGrowthYear).append("\n\n");
		
		/*
		 * Valuation Functions
		 */
		b.append("VALUATION FUNCTIONS\n\n");
		// For each HIF, list the valuation functions that were used.
		// First, build a list of unique HIFs
		// Then, for each HIF, list the VFs
		Map<Integer, String> hifMap = new HashMap<Integer, String>();
		for(ValuationConfig vf : valuationFunctions) {
			if(! hifMap.containsKey(vf.hifId)) {
				hifMap.put(vf.hifId, HIFUtil.getHifHeadingForVFTaskLog(vf.hifId));
			}
		}
		
		for(Entry<Integer, String> hifEntry : hifMap.entrySet() ) {
			b.append("HEALTH IMPACT FUNCTION ").append(hifEntry.getValue()).append(":\n");	
			int vfCount = 0;
			for(int i=0; i < valuationFunctions.size(); i++) {
				ValuationConfig vf = valuationFunctions.get(i);
				if(vf.hifId.equals(hifEntry.getKey())) {
					vfCount++;
				}
			}			
			b.append("Valuation Functions Selected: ").append(vfCount).append("\n\n");
			
			for(int i=0; i < valuationFunctions.size(); i++) {
				ValuationConfig vf = valuationFunctions.get(i);
				if(vf.hifId.equals(hifEntry.getKey())) {
					b.append(vf.toString());
					b.append("\n");
				}
			}
		}
		

		
		return b.toString();
	}

}
