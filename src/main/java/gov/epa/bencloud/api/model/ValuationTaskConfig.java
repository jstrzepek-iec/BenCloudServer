package gov.epa.bencloud.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import gov.epa.bencloud.api.util.HIFUtil;
import gov.epa.bencloud.server.tasks.model.Task;


/*
 * Representation of a valuation task configuration
 */
public class ValuationTaskConfig {
	private static final Logger log = LoggerFactory.getLogger(ValuationTaskConfig.class);
	

	public String name;
	public Integer resultDatasetId = 0;
	public Integer hifResultDatasetId = null;
	
	public String hifTaskUuid = null;
	public Integer variableDatasetId = null;
	public Integer inflationYear = null;
	public Integer incomeGrowthYear = null;
	
	public Boolean useInflationFactors = true;
	public Boolean useGrowthFactors = true;
	
	
	public List<ValuationConfig> valuationFunctions = new ArrayList<ValuationConfig>();
	
	/*
	 * Default constructor
	 */
	public ValuationTaskConfig() {
		super();
	}
	
	/*
	 * Creates the valuation task configuration object from a task object
	 */
	public ValuationTaskConfig(Task task) {
		super();
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode params = mapper.readTree(task.getParameters());

			this.name = task.getName();
			

			// **********************************************************************************
			// TODO: This is temporarily overridden so we won't use inflation or growth data.
			// these factors are only applied in the desktop tool when the user opens the 
			// advanced settings dialog and clicks OK.
			// This code helps us better match the BenMAP-CE Desktop results
			// **********************************************************************************
			this.useInflationFactors = params.has("useInflationFactors") ? params.get("useInflationFactors").asBoolean(false) : false;
			this.useGrowthFactors = params.has("useGrowthFactors") ? params.get("useGrowthFactors").asBoolean(false) : false;
			
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

	/*
	 * Returns a string representation of the valuation task configuration.
	 */
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
		
		b.append("ADVANCED SETTINGS\n\n");
		b.append("Use Inflation Factors: ").append(useInflationFactors ? "Yes" : "No (used for matching BenMAP desktop results)").append("\n");
		b.append("Use Growth Factors: ").append(useGrowthFactors ? "Yes" : "No (used for matching BenMAP desktop results)").append("\n");
		
		return b.toString();
	}

}
