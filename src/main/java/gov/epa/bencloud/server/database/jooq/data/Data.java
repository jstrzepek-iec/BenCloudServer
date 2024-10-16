/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data;


import gov.epa.bencloud.server.database.jooq.DefaultCatalog;
import gov.epa.bencloud.server.database.jooq.data.tables.AgeRange;
import gov.epa.bencloud.server.database.jooq.data.tables.AirQualityCell;
import gov.epa.bencloud.server.database.jooq.data.tables.AirQualityLayer;
import gov.epa.bencloud.server.database.jooq.data.tables.AirQualityLayerMetrics;
import gov.epa.bencloud.server.database.jooq.data.tables.CrosswalkDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.CrosswalkEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.Endpoint;
import gov.epa.bencloud.server.database.jooq.data.tables.EndpointGroup;
import gov.epa.bencloud.server.database.jooq.data.tables.Ethnicity;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureFunction;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureFunctionDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureFunctionGroup;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureFunctionGroupMember;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureResult;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureResultDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.ExposureResultFunctionConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.Gender;
import gov.epa.bencloud.server.database.jooq.data.tables.GetExposureResults;
import gov.epa.bencloud.server.database.jooq.data.tables.GetHifResults;
import gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence;
import gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation;
import gov.epa.bencloud.server.database.jooq.data.tables.GetValuationResults;
import gov.epa.bencloud.server.database.jooq.data.tables.GetVariable;
import gov.epa.bencloud.server.database.jooq.data.tables.GridDefinition;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunction;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionGroup;
import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionGroupMember;
import gov.epa.bencloud.server.database.jooq.data.tables.HifResult;
import gov.epa.bencloud.server.database.jooq.data.tables.HifResultDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.HifResultFunctionConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceValue;
import gov.epa.bencloud.server.database.jooq.data.tables.IncomeGrowthAdjDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.IncomeGrowthAdjFactor;
import gov.epa.bencloud.server.database.jooq.data.tables.InflationDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.InflationEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.Pollutant;
import gov.epa.bencloud.server.database.jooq.data.tables.PollutantMetric;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfigEthnicity;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfigGender;
import gov.epa.bencloud.server.database.jooq.data.tables.PopConfigRace;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationGrowth;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationGrowthWeight;
import gov.epa.bencloud.server.database.jooq.data.tables.PopulationValue;
import gov.epa.bencloud.server.database.jooq.data.tables.Race;
import gov.epa.bencloud.server.database.jooq.data.tables.SeasonalMetric;
import gov.epa.bencloud.server.database.jooq.data.tables.SeasonalMetricSeason;
import gov.epa.bencloud.server.database.jooq.data.tables.Settings;
import gov.epa.bencloud.server.database.jooq.data.tables.StatisticType;
import gov.epa.bencloud.server.database.jooq.data.tables.TPopDatasetYear;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskBatch;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskComplete;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskQueue;
import gov.epa.bencloud.server.database.jooq.data.tables.TaskWorker;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationFunction;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationFunctionDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResult;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResultDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResultFunctionConfig;
import gov.epa.bencloud.server.database.jooq.data.tables.VariableDataset;
import gov.epa.bencloud.server.database.jooq.data.tables.VariableEntry;
import gov.epa.bencloud.server.database.jooq.data.tables.VariableValue;
import gov.epa.bencloud.server.database.jooq.data.tables._RaceId;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetExposureResultsRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetHifResultsRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetIncidenceRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetPopulationRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetValuationResultsRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetVariableRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Data extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data</code>
     */
    public static final Data DATA = new Data();

    /**
     * The table <code>data._race_id</code>.
     */
    public final _RaceId _RACE_ID = _RaceId._RACE_ID;

    /**
     * The table <code>data.age_range</code>.
     */
    public final AgeRange AGE_RANGE = AgeRange.AGE_RANGE;

    /**
     * The table <code>data.air_quality_cell</code>.
     */
    public final AirQualityCell AIR_QUALITY_CELL = AirQualityCell.AIR_QUALITY_CELL;

    /**
     * The table <code>data.air_quality_layer</code>.
     */
    public final AirQualityLayer AIR_QUALITY_LAYER = AirQualityLayer.AIR_QUALITY_LAYER;

    /**
     * The table <code>data.air_quality_layer_metrics</code>.
     */
    public final AirQualityLayerMetrics AIR_QUALITY_LAYER_METRICS = AirQualityLayerMetrics.AIR_QUALITY_LAYER_METRICS;

    /**
     * The table <code>data.crosswalk_dataset</code>.
     */
    public final CrosswalkDataset CROSSWALK_DATASET = CrosswalkDataset.CROSSWALK_DATASET;

    /**
     * The table <code>data.crosswalk_entry</code>.
     */
    public final CrosswalkEntry CROSSWALK_ENTRY = CrosswalkEntry.CROSSWALK_ENTRY;

    /**
     * The table <code>data.endpoint</code>.
     */
    public final Endpoint ENDPOINT = Endpoint.ENDPOINT;

    /**
     * The table <code>data.endpoint_group</code>.
     */
    public final EndpointGroup ENDPOINT_GROUP = EndpointGroup.ENDPOINT_GROUP;

    /**
     * The table <code>data.ethnicity</code>.
     */
    public final Ethnicity ETHNICITY = Ethnicity.ETHNICITY;

    /**
     * The table <code>data.exposure_function</code>.
     */
    public final ExposureFunction EXPOSURE_FUNCTION = ExposureFunction.EXPOSURE_FUNCTION;

    /**
     * The table <code>data.exposure_function_dataset</code>.
     */
    public final ExposureFunctionDataset EXPOSURE_FUNCTION_DATASET = ExposureFunctionDataset.EXPOSURE_FUNCTION_DATASET;

    /**
     * The table <code>data.exposure_function_group</code>.
     */
    public final ExposureFunctionGroup EXPOSURE_FUNCTION_GROUP = ExposureFunctionGroup.EXPOSURE_FUNCTION_GROUP;

    /**
     * The table <code>data.exposure_function_group_member</code>.
     */
    public final ExposureFunctionGroupMember EXPOSURE_FUNCTION_GROUP_MEMBER = ExposureFunctionGroupMember.EXPOSURE_FUNCTION_GROUP_MEMBER;

    /**
     * The table <code>data.exposure_result</code>.
     */
    public final ExposureResult EXPOSURE_RESULT = ExposureResult.EXPOSURE_RESULT;

    /**
     * The table <code>data.exposure_result_dataset</code>.
     */
    public final ExposureResultDataset EXPOSURE_RESULT_DATASET = ExposureResultDataset.EXPOSURE_RESULT_DATASET;

    /**
     * The table <code>data.exposure_result_function_config</code>.
     */
    public final ExposureResultFunctionConfig EXPOSURE_RESULT_FUNCTION_CONFIG = ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG;

    /**
     * The table <code>data.gender</code>.
     */
    public final Gender GENDER = Gender.GENDER;

    /**
     * The table <code>data.get_exposure_results</code>.
     */
    public final GetExposureResults GET_EXPOSURE_RESULTS = GetExposureResults.GET_EXPOSURE_RESULTS;

    /**
     * Call <code>data.get_exposure_results</code>.
     */
    public static Result<GetExposureResultsRecord> GET_EXPOSURE_RESULTS(
          Configuration configuration
        , Integer _DatasetId
        , Integer[] _EfId
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetExposureResults.GET_EXPOSURE_RESULTS.call(
              _DatasetId
            , _EfId
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_exposure_results</code> as a table.
     */
    public static GetExposureResults GET_EXPOSURE_RESULTS(
          Integer _DatasetId
        , Integer[] _EfId
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetExposureResults.GET_EXPOSURE_RESULTS.call(
            _DatasetId,
            _EfId,
            _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_exposure_results</code> as a table.
     */
    public static GetExposureResults GET_EXPOSURE_RESULTS(
          Field<Integer> _DatasetId
        , Field<Integer[]> _EfId
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetExposureResults.GET_EXPOSURE_RESULTS.call(
            _DatasetId,
            _EfId,
            _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_hif_results</code>.
     */
    public final GetHifResults GET_HIF_RESULTS = GetHifResults.GET_HIF_RESULTS;

    /**
     * Call <code>data.get_hif_results</code>.
     */
    public static Result<GetHifResultsRecord> GET_HIF_RESULTS(
          Configuration configuration
        , Integer _DatasetId
        , Integer[] _HifId
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetHifResults.GET_HIF_RESULTS.call(
              _DatasetId
            , _HifId
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_hif_results</code> as a table.
     */
    public static GetHifResults GET_HIF_RESULTS(
          Integer _DatasetId
        , Integer[] _HifId
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetHifResults.GET_HIF_RESULTS.call(
            _DatasetId,
            _HifId,
            _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_hif_results</code> as a table.
     */
    public static GetHifResults GET_HIF_RESULTS(
          Field<Integer> _DatasetId
        , Field<Integer[]> _HifId
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetHifResults.GET_HIF_RESULTS.call(
            _DatasetId,
            _HifId,
            _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_incidence</code>.
     */
    public final GetIncidence GET_INCIDENCE = GetIncidence.GET_INCIDENCE;

    /**
     * Call <code>data.get_incidence</code>.
     */
    public static Result<GetIncidenceRecord> GET_INCIDENCE(
          Configuration configuration
        , Integer _DatasetId
        , Integer _Year
        , Integer _EndpointId
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Short _StartAge
        , Short _EndAge
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence.GET_INCIDENCE.call(
              _DatasetId
            , _Year
            , _EndpointId
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _StartAge
            , _EndAge
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_incidence</code> as a table.
     */
    public static GetIncidence GET_INCIDENCE(
          Integer _DatasetId
        , Integer _Year
        , Integer _EndpointId
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Short _StartAge
        , Short _EndAge
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence.GET_INCIDENCE.call(
            _DatasetId,
            _Year,
            _EndpointId,
            _RaceId,
            _EthnicityId,
            _GenderId,
            _StartAge,
            _EndAge,
            _GroupByRace,
            _GroupByEthnicity,
            _GroupByGender,
            _GroupByAgeRange,
            _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_incidence</code> as a table.
     */
    public static GetIncidence GET_INCIDENCE(
          Field<Integer> _DatasetId
        , Field<Integer> _Year
        , Field<Integer> _EndpointId
        , Field<Integer[]> _RaceId
        , Field<Integer[]> _EthnicityId
        , Field<Integer[]> _GenderId
        , Field<Short> _StartAge
        , Field<Short> _EndAge
        , Field<Boolean> _GroupByRace
        , Field<Boolean> _GroupByEthnicity
        , Field<Boolean> _GroupByGender
        , Field<Boolean> _GroupByAgeRange
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetIncidence.GET_INCIDENCE.call(
            _DatasetId,
            _Year,
            _EndpointId,
            _RaceId,
            _EthnicityId,
            _GenderId,
            _StartAge,
            _EndAge,
            _GroupByRace,
            _GroupByEthnicity,
            _GroupByGender,
            _GroupByAgeRange,
            _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_population</code>.
     */
    public final GetPopulation GET_POPULATION = GetPopulation.GET_POPULATION;

    /**
     * Call <code>data.get_population</code>.
     */
    public static Result<GetPopulationRecord> GET_POPULATION(
          Configuration configuration
        , Integer _DatasetId
        , Integer _Year
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Integer[] _AgeRangeId
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation.GET_POPULATION.call(
              _DatasetId
            , _Year
            , _RaceId
            , _EthnicityId
            , _GenderId
            , _AgeRangeId
            , _GroupByRace
            , _GroupByEthnicity
            , _GroupByGender
            , _GroupByAgeRange
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_population</code> as a table.
     */
    public static GetPopulation GET_POPULATION(
          Integer _DatasetId
        , Integer _Year
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Integer[] _AgeRangeId
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation.GET_POPULATION.call(
            _DatasetId,
            _Year,
            _RaceId,
            _EthnicityId,
            _GenderId,
            _AgeRangeId,
            _GroupByRace,
            _GroupByEthnicity,
            _GroupByGender,
            _GroupByAgeRange,
            _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_population</code> as a table.
     */
    public static GetPopulation GET_POPULATION(
          Field<Integer> _DatasetId
        , Field<Integer> _Year
        , Field<Integer[]> _RaceId
        , Field<Integer[]> _EthnicityId
        , Field<Integer[]> _GenderId
        , Field<Integer[]> _AgeRangeId
        , Field<Boolean> _GroupByRace
        , Field<Boolean> _GroupByEthnicity
        , Field<Boolean> _GroupByGender
        , Field<Boolean> _GroupByAgeRange
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetPopulation.GET_POPULATION.call(
            _DatasetId,
            _Year,
            _RaceId,
            _EthnicityId,
            _GenderId,
            _AgeRangeId,
            _GroupByRace,
            _GroupByEthnicity,
            _GroupByGender,
            _GroupByAgeRange,
            _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_valuation_results</code>.
     */
    public final GetValuationResults GET_VALUATION_RESULTS = GetValuationResults.GET_VALUATION_RESULTS;

    /**
     * Call <code>data.get_valuation_results</code>.
     */
    public static Result<GetValuationResultsRecord> GET_VALUATION_RESULTS(
          Configuration configuration
        , Integer _DatasetId
        , Integer[] _HifId
        , Integer[] _VfId
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetValuationResults.GET_VALUATION_RESULTS.call(
              _DatasetId
            , _HifId
            , _VfId
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_valuation_results</code> as a table.
     */
    public static GetValuationResults GET_VALUATION_RESULTS(
          Integer _DatasetId
        , Integer[] _HifId
        , Integer[] _VfId
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetValuationResults.GET_VALUATION_RESULTS.call(
            _DatasetId,
            _HifId,
            _VfId,
            _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_valuation_results</code> as a table.
     */
    public static GetValuationResults GET_VALUATION_RESULTS(
          Field<Integer> _DatasetId
        , Field<Integer[]> _HifId
        , Field<Integer[]> _VfId
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetValuationResults.GET_VALUATION_RESULTS.call(
            _DatasetId,
            _HifId,
            _VfId,
            _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.get_variable</code>.
     */
    public final GetVariable GET_VARIABLE = GetVariable.GET_VARIABLE;

    /**
     * Call <code>data.get_variable</code>.
     */
    public static Result<GetVariableRecord> GET_VARIABLE(
          Configuration configuration
        , Integer _DatasetId
        , String _VariableName
        , Integer _OutputGridDefinitionId
    ) {
        return configuration.dsl().selectFrom(gov.epa.bencloud.server.database.jooq.data.tables.GetVariable.GET_VARIABLE.call(
              _DatasetId
            , _VariableName
            , _OutputGridDefinitionId
        )).fetch();
    }

    /**
     * Get <code>data.get_variable</code> as a table.
     */
    public static GetVariable GET_VARIABLE(
          Integer _DatasetId
        , String _VariableName
        , Integer _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetVariable.GET_VARIABLE.call(
            _DatasetId,
            _VariableName,
            _OutputGridDefinitionId
        );
    }

    /**
     * Get <code>data.get_variable</code> as a table.
     */
    public static GetVariable GET_VARIABLE(
          Field<Integer> _DatasetId
        , Field<String> _VariableName
        , Field<Integer> _OutputGridDefinitionId
    ) {
        return gov.epa.bencloud.server.database.jooq.data.tables.GetVariable.GET_VARIABLE.call(
            _DatasetId,
            _VariableName,
            _OutputGridDefinitionId
        );
    }

    /**
     * The table <code>data.grid_definition</code>.
     */
    public final GridDefinition GRID_DEFINITION = GridDefinition.GRID_DEFINITION;

    /**
     * The table <code>data.health_impact_function</code>.
     */
    public final HealthImpactFunction HEALTH_IMPACT_FUNCTION = HealthImpactFunction.HEALTH_IMPACT_FUNCTION;

    /**
     * The table <code>data.health_impact_function_dataset</code>.
     */
    public final HealthImpactFunctionDataset HEALTH_IMPACT_FUNCTION_DATASET = HealthImpactFunctionDataset.HEALTH_IMPACT_FUNCTION_DATASET;

    /**
     * The table <code>data.health_impact_function_group</code>.
     */
    public final HealthImpactFunctionGroup HEALTH_IMPACT_FUNCTION_GROUP = HealthImpactFunctionGroup.HEALTH_IMPACT_FUNCTION_GROUP;

    /**
     * The table <code>data.health_impact_function_group_member</code>.
     */
    public final HealthImpactFunctionGroupMember HEALTH_IMPACT_FUNCTION_GROUP_MEMBER = HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER;

    /**
     * The table <code>data.hif_result</code>.
     */
    public final HifResult HIF_RESULT = HifResult.HIF_RESULT;

    /**
     * The table <code>data.hif_result_dataset</code>.
     */
    public final HifResultDataset HIF_RESULT_DATASET = HifResultDataset.HIF_RESULT_DATASET;

    /**
     * The table <code>data.hif_result_function_config</code>.
     */
    public final HifResultFunctionConfig HIF_RESULT_FUNCTION_CONFIG = HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG;

    /**
     * The table <code>data.incidence_dataset</code>.
     */
    public final IncidenceDataset INCIDENCE_DATASET = IncidenceDataset.INCIDENCE_DATASET;

    /**
     * The table <code>data.incidence_entry</code>.
     */
    public final IncidenceEntry INCIDENCE_ENTRY = IncidenceEntry.INCIDENCE_ENTRY;

    /**
     * The table <code>data.incidence_value</code>.
     */
    public final IncidenceValue INCIDENCE_VALUE = IncidenceValue.INCIDENCE_VALUE;

    /**
     * The table <code>data.income_growth_adj_dataset</code>.
     */
    public final IncomeGrowthAdjDataset INCOME_GROWTH_ADJ_DATASET = IncomeGrowthAdjDataset.INCOME_GROWTH_ADJ_DATASET;

    /**
     * The table <code>data.income_growth_adj_factor</code>.
     */
    public final IncomeGrowthAdjFactor INCOME_GROWTH_ADJ_FACTOR = IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR;

    /**
     * The table <code>data.inflation_dataset</code>.
     */
    public final InflationDataset INFLATION_DATASET = InflationDataset.INFLATION_DATASET;

    /**
     * The table <code>data.inflation_entry</code>.
     */
    public final InflationEntry INFLATION_ENTRY = InflationEntry.INFLATION_ENTRY;

    /**
     * The table <code>data.pollutant</code>.
     */
    public final Pollutant POLLUTANT = Pollutant.POLLUTANT;

    /**
     * The table <code>data.pollutant_metric</code>.
     */
    public final PollutantMetric POLLUTANT_METRIC = PollutantMetric.POLLUTANT_METRIC;

    /**
     * The table <code>data.pop_config</code>.
     */
    public final PopConfig POP_CONFIG = PopConfig.POP_CONFIG;

    /**
     * The table <code>data.pop_config_ethnicity</code>.
     */
    public final PopConfigEthnicity POP_CONFIG_ETHNICITY = PopConfigEthnicity.POP_CONFIG_ETHNICITY;

    /**
     * The table <code>data.pop_config_gender</code>.
     */
    public final PopConfigGender POP_CONFIG_GENDER = PopConfigGender.POP_CONFIG_GENDER;

    /**
     * The table <code>data.pop_config_race</code>.
     */
    public final PopConfigRace POP_CONFIG_RACE = PopConfigRace.POP_CONFIG_RACE;

    /**
     * The table <code>data.population_dataset</code>.
     */
    public final PopulationDataset POPULATION_DATASET = PopulationDataset.POPULATION_DATASET;

    /**
     * The table <code>data.population_entry</code>.
     */
    public final PopulationEntry POPULATION_ENTRY = PopulationEntry.POPULATION_ENTRY;

    /**
     * The table <code>data.population_growth</code>.
     */
    public final PopulationGrowth POPULATION_GROWTH = PopulationGrowth.POPULATION_GROWTH;

    /**
     * The table <code>data.population_growth_weight</code>.
     */
    public final PopulationGrowthWeight POPULATION_GROWTH_WEIGHT = PopulationGrowthWeight.POPULATION_GROWTH_WEIGHT;

    /**
     * The table <code>data.population_value</code>.
     */
    public final PopulationValue POPULATION_VALUE = PopulationValue.POPULATION_VALUE;

    /**
     * The table <code>data.race</code>.
     */
    public final Race RACE = Race.RACE;

    /**
     * The table <code>data.seasonal_metric</code>.
     */
    public final SeasonalMetric SEASONAL_METRIC = SeasonalMetric.SEASONAL_METRIC;

    /**
     * The table <code>data.seasonal_metric_season</code>.
     */
    public final SeasonalMetricSeason SEASONAL_METRIC_SEASON = SeasonalMetricSeason.SEASONAL_METRIC_SEASON;

    /**
     * The table <code>data.settings</code>.
     */
    public final Settings SETTINGS = Settings.SETTINGS;

    /**
     * The table <code>data.statistic_type</code>.
     */
    public final StatisticType STATISTIC_TYPE = StatisticType.STATISTIC_TYPE;

    /**
     * The table <code>data.t_pop_dataset_year</code>.
     */
    public final TPopDatasetYear T_POP_DATASET_YEAR = TPopDatasetYear.T_POP_DATASET_YEAR;

    /**
     * The table <code>data.task_batch</code>.
     */
    public final TaskBatch TASK_BATCH = TaskBatch.TASK_BATCH;

    /**
     * The table <code>data.task_complete</code>.
     */
    public final TaskComplete TASK_COMPLETE = TaskComplete.TASK_COMPLETE;

    /**
     * The table <code>data.task_config</code>.
     */
    public final TaskConfig TASK_CONFIG = TaskConfig.TASK_CONFIG;

    /**
     * The table <code>data.task_queue</code>.
     */
    public final TaskQueue TASK_QUEUE = TaskQueue.TASK_QUEUE;

    /**
     * The table <code>data.task_worker</code>.
     */
    public final TaskWorker TASK_WORKER = TaskWorker.TASK_WORKER;

    /**
     * The table <code>data.valuation_function</code>.
     */
    public final ValuationFunction VALUATION_FUNCTION = ValuationFunction.VALUATION_FUNCTION;

    /**
     * The table <code>data.valuation_function_dataset</code>.
     */
    public final ValuationFunctionDataset VALUATION_FUNCTION_DATASET = ValuationFunctionDataset.VALUATION_FUNCTION_DATASET;

    /**
     * The table <code>data.valuation_result</code>.
     */
    public final ValuationResult VALUATION_RESULT = ValuationResult.VALUATION_RESULT;

    /**
     * The table <code>data.valuation_result_dataset</code>.
     */
    public final ValuationResultDataset VALUATION_RESULT_DATASET = ValuationResultDataset.VALUATION_RESULT_DATASET;

    /**
     * The table <code>data.valuation_result_function_config</code>.
     */
    public final ValuationResultFunctionConfig VALUATION_RESULT_FUNCTION_CONFIG = ValuationResultFunctionConfig.VALUATION_RESULT_FUNCTION_CONFIG;

    /**
     * The table <code>data.variable_dataset</code>.
     */
    public final VariableDataset VARIABLE_DATASET = VariableDataset.VARIABLE_DATASET;

    /**
     * The table <code>data.variable_entry</code>.
     */
    public final VariableEntry VARIABLE_ENTRY = VariableEntry.VARIABLE_ENTRY;

    /**
     * The table <code>data.variable_value</code>.
     */
    public final VariableValue VARIABLE_VALUE = VariableValue.VARIABLE_VALUE;

    /**
     * No further instances allowed
     */
    private Data() {
        super("data", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            _RaceId._RACE_ID,
            AgeRange.AGE_RANGE,
            AirQualityCell.AIR_QUALITY_CELL,
            AirQualityLayer.AIR_QUALITY_LAYER,
            AirQualityLayerMetrics.AIR_QUALITY_LAYER_METRICS,
            CrosswalkDataset.CROSSWALK_DATASET,
            CrosswalkEntry.CROSSWALK_ENTRY,
            Endpoint.ENDPOINT,
            EndpointGroup.ENDPOINT_GROUP,
            Ethnicity.ETHNICITY,
            ExposureFunction.EXPOSURE_FUNCTION,
            ExposureFunctionDataset.EXPOSURE_FUNCTION_DATASET,
            ExposureFunctionGroup.EXPOSURE_FUNCTION_GROUP,
            ExposureFunctionGroupMember.EXPOSURE_FUNCTION_GROUP_MEMBER,
            ExposureResult.EXPOSURE_RESULT,
            ExposureResultDataset.EXPOSURE_RESULT_DATASET,
            ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG,
            Gender.GENDER,
            GetExposureResults.GET_EXPOSURE_RESULTS,
            GetHifResults.GET_HIF_RESULTS,
            GetIncidence.GET_INCIDENCE,
            GetPopulation.GET_POPULATION,
            GetValuationResults.GET_VALUATION_RESULTS,
            GetVariable.GET_VARIABLE,
            GridDefinition.GRID_DEFINITION,
            HealthImpactFunction.HEALTH_IMPACT_FUNCTION,
            HealthImpactFunctionDataset.HEALTH_IMPACT_FUNCTION_DATASET,
            HealthImpactFunctionGroup.HEALTH_IMPACT_FUNCTION_GROUP,
            HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER,
            HifResult.HIF_RESULT,
            HifResultDataset.HIF_RESULT_DATASET,
            HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG,
            IncidenceDataset.INCIDENCE_DATASET,
            IncidenceEntry.INCIDENCE_ENTRY,
            IncidenceValue.INCIDENCE_VALUE,
            IncomeGrowthAdjDataset.INCOME_GROWTH_ADJ_DATASET,
            IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR,
            InflationDataset.INFLATION_DATASET,
            InflationEntry.INFLATION_ENTRY,
            Pollutant.POLLUTANT,
            PollutantMetric.POLLUTANT_METRIC,
            PopConfig.POP_CONFIG,
            PopConfigEthnicity.POP_CONFIG_ETHNICITY,
            PopConfigGender.POP_CONFIG_GENDER,
            PopConfigRace.POP_CONFIG_RACE,
            PopulationDataset.POPULATION_DATASET,
            PopulationEntry.POPULATION_ENTRY,
            PopulationGrowth.POPULATION_GROWTH,
            PopulationGrowthWeight.POPULATION_GROWTH_WEIGHT,
            PopulationValue.POPULATION_VALUE,
            Race.RACE,
            SeasonalMetric.SEASONAL_METRIC,
            SeasonalMetricSeason.SEASONAL_METRIC_SEASON,
            Settings.SETTINGS,
            StatisticType.STATISTIC_TYPE,
            TPopDatasetYear.T_POP_DATASET_YEAR,
            TaskBatch.TASK_BATCH,
            TaskComplete.TASK_COMPLETE,
            TaskConfig.TASK_CONFIG,
            TaskQueue.TASK_QUEUE,
            TaskWorker.TASK_WORKER,
            ValuationFunction.VALUATION_FUNCTION,
            ValuationFunctionDataset.VALUATION_FUNCTION_DATASET,
            ValuationResult.VALUATION_RESULT,
            ValuationResultDataset.VALUATION_RESULT_DATASET,
            ValuationResultFunctionConfig.VALUATION_RESULT_FUNCTION_CONFIG,
            VariableDataset.VARIABLE_DATASET,
            VariableEntry.VARIABLE_ENTRY,
            VariableValue.VARIABLE_VALUE
        );
    }
}
