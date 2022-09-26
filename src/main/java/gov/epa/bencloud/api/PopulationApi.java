package gov.epa.bencloud.api;

import static gov.epa.bencloud.server.database.jooq.data.Tables.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

import org.jooq.JSONFormat;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.JSONFormat.RecordFormat;
import org.jooq.impl.DSL;
import org.pac4j.core.profile.UserProfile;

import gov.epa.bencloud.api.model.HIFConfig;
import gov.epa.bencloud.api.model.HIFTaskConfig;
import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.database.jooq.data.Routines;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetPopulationRecord;
import spark.Request;
import spark.Response;

/*
 * Methods related to population data
 */
public class PopulationApi {

	/**
	 * 
	 * @param hifTaskConfig
	 * @return a map of population entry groups, with key = grid cell id,
	 * 			value = population records
	 */
	public static Map<Long, Result<GetPopulationRecord>> getPopulationEntryGroups(HIFTaskConfig hifTaskConfig) {

		Integer aqGrid = AirQualityApi.getAirQualityLayerGridId(hifTaskConfig.aqBaselineId);
		
		// Get the array of age ranges to include based on the configured hifs
		ArrayList<Integer> ageRangeIds = getAgeRangesForHifs(hifTaskConfig);
        Integer arrAgeRangeIds[] = new Integer[ageRangeIds.size()];
        arrAgeRangeIds = ageRangeIds.toArray(arrAgeRangeIds);
        
        //Get array of race, ethnicity and gender to include based on the configured hifs
        //TODO: If all hifs calls for "all" or null, set groupby = false. Will the values in lookup table stay forever? 
        ArrayList<Integer> raceIds = getRacesForHifs(hifTaskConfig);
        Integer arrRaceIds[] = new Integer[raceIds.size()];
        arrRaceIds = raceIds.toArray(arrRaceIds);
        boolean booGroupByRace = false;  //1ASIAN, 2BLACK, 3NATAMER, 4WHITE, 5All, 6null  
		for(Integer race : raceIds) {
        	if(race != 5) {
        		booGroupByRace = true;
        		break;
        	}
        }
        
        ArrayList<Integer> ethnicityIds = getEthnicityForHifs(hifTaskConfig);
        Integer arrEthnicityIds[] = new Integer[ethnicityIds.size()];
        arrEthnicityIds = ethnicityIds.toArray(arrEthnicityIds);
        boolean booGroupByEthnicity = false;  //1NON-HISP, 2HISP, 3All, 4null       
		for(Integer ethnicity : ethnicityIds) {
        	if(ethnicity != 3) {
        		booGroupByEthnicity = true;
        		break;
        	}
        }
        
        ArrayList<Integer> genderIds = getGendersForHifs(hifTaskConfig);
        Integer arrGenderIds[] = new Integer[genderIds.size()];
        arrGenderIds = genderIds.toArray(arrGenderIds);
        boolean booGroupByGender = false; //1F, 2M, 3All, 4null 
		for(Integer gender : genderIds) {
        	if(gender != 3) {
        		booGroupByGender = true;
        		break;
        	}
        }
        
		Map<Long, Result<GetPopulationRecord>> popRecords = Routines.getPopulation(JooqUtil.getJooqConfiguration(), 
				hifTaskConfig.popId, 
				hifTaskConfig.popYear,
				null, //arrRaceIds, 
				null, //arrEthnicityIds, 
				null, //arrGenderIds, 
				arrAgeRangeIds, 
				booGroupByRace, 
				booGroupByEthnicity, 
				booGroupByGender, 
				true, //YY: groupbyAgeRange
				aqGrid
				).intoGroups(GET_POPULATION.GRID_CELL_ID);

		return popRecords;
	}

	/**
	 * 
	 * @param hifTaskConfig
	 * @return a list of age ranges for health impact functions in the given hif task configuration.
	 */
	private static ArrayList<Integer> getAgeRangesForHifs(HIFTaskConfig hifTaskConfig) {
		
		int minHifAge = 999;
		int maxHifAge = 0;
		
		for(HIFConfig hif : hifTaskConfig.hifs) {
			minHifAge = hif.startAge < minHifAge ? hif.startAge : minHifAge;
			maxHifAge = hif.endAge > maxHifAge ? hif.endAge : maxHifAge;
		}
		
		Record1<Integer> popConfig = DSL.using(JooqUtil.getJooqConfiguration())
		.select(POPULATION_DATASET.POP_CONFIG_ID)
		.from(POPULATION_DATASET)
		.where(POPULATION_DATASET.ID.eq(hifTaskConfig.popId))
		.fetchOne();
		
		
		Result<Record3<Integer, Short, Short>> popAgeRanges = DSL.using(JooqUtil.getJooqConfiguration())
				.select(AGE_RANGE.ID, AGE_RANGE.START_AGE, AGE_RANGE.END_AGE)
				.from(AGE_RANGE)
				.where(AGE_RANGE.POP_CONFIG_ID.eq(popConfig.value1())
						.and(AGE_RANGE.END_AGE.greaterOrEqual((short) minHifAge))
						.and(AGE_RANGE.START_AGE.lessOrEqual((short) maxHifAge))
						)
				.fetch();
		
		ArrayList<Integer> ageRangeIds = new  ArrayList<Integer>();
		
		for(Record3<Integer, Short, Short> ageRange : popAgeRanges) {
			ageRangeIds.add(ageRange.value1());
		}
		
		return ageRangeIds;
	}
	
	public static ArrayList<Integer> getRacesForHifs(HIFTaskConfig hifTaskConfig){
		ArrayList<Integer> raceIds = new  ArrayList<Integer>();
		for(HIFConfig hif : hifTaskConfig.hifs) {
			if(!raceIds.contains(hif.race)) {
				raceIds.add(hif.race);
			}
		}		
		return raceIds;		
	}
	
	public static ArrayList<Integer> getEthnicityForHifs(HIFTaskConfig hifTaskConfig){
		ArrayList<Integer> ethnicityIds = new  ArrayList<Integer>();
		for(HIFConfig hif : hifTaskConfig.hifs) {
			if(!ethnicityIds.contains(hif.ethnicity)) {
				ethnicityIds.add(hif.ethnicity);
			}
		}		
		return ethnicityIds;		
	}
	
	public static ArrayList<Integer> getGendersForHifs(HIFTaskConfig hifTaskConfig){
		ArrayList<Integer> genderIds = new  ArrayList<Integer>();
		for(HIFConfig hif : hifTaskConfig.hifs) {
			if(!genderIds.contains(hif.gender)) {
				genderIds.add(hif.gender);
			}
		}		
		return genderIds;		
	}

	/**
	 * 
	 * @param id Population dataset id
	 * @return population age ranges for a given population dataset.
	 */
	public static Result<Record3<Integer, Short, Short>> getPopAgeRanges(Integer id) {

		Record1<Integer> popConfig = DSL.using(JooqUtil.getJooqConfiguration())
		.select(POPULATION_DATASET.POP_CONFIG_ID)
		.from(POPULATION_DATASET)
		.where(POPULATION_DATASET.ID.eq(id))
		.fetchOne();
		
		Result<Record3<Integer, Short, Short>> popAgeRanges = DSL.using(JooqUtil.getJooqConfiguration())
				.select(AGE_RANGE.ID, AGE_RANGE.START_AGE, AGE_RANGE.END_AGE)
				.from(AGE_RANGE)
				.where(AGE_RANGE.POP_CONFIG_ID.eq(popConfig.value1()))
				.fetch();
		
		return popAgeRanges;
	}
	
	/**
	 * 
	 * @param request
	 * @param response
	 * @param userProfile
	 * @return a JSON represenation of all population datasets
	 */
	public static Object getAllPopulationDatasets(Request request, Response response, Optional<UserProfile> userProfile) {

			Result<Record4<String, Integer, Integer, Short[]>> records = DSL.using(JooqUtil.getJooqConfiguration())
					.select(POPULATION_DATASET.NAME,
							POPULATION_DATASET.ID,
							POPULATION_DATASET.GRID_DEFINITION_ID,
							DSL.arrayAggDistinct(POPULATION_ENTRY.POP_YEAR).orderBy(POPULATION_ENTRY.POP_YEAR).as("years"))
					.from(POPULATION_DATASET)
					.join(POPULATION_ENTRY).on(POPULATION_DATASET.ID.eq(POPULATION_ENTRY.POP_DATASET_ID))
					.groupBy(POPULATION_DATASET.NAME,
							POPULATION_DATASET.ID,
							POPULATION_DATASET.GRID_DEFINITION_ID)
					.orderBy(POPULATION_DATASET.NAME)
					.fetch();
			
			response.type("application/json");
			return records.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));

	}
	
	/**
	 * 
	 * @param id 
	 * @return a ist of population dataset information
	 */
	public static Record3<String, Integer, String> getPopulationDatasetInfo(Integer id) {

		Record3<String, Integer, String> record = DSL.using(JooqUtil.getJooqConfiguration())
				.select(POPULATION_DATASET.NAME,
						POPULATION_DATASET.GRID_DEFINITION_ID,
						GRID_DEFINITION.NAME)
				.from(POPULATION_DATASET)
				.join(GRID_DEFINITION).on(POPULATION_DATASET.GRID_DEFINITION_ID.eq(GRID_DEFINITION.ID))
				.fetchOne();
		
		return record;
		}
	
}
