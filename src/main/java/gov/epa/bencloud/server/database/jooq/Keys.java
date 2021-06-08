/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq;


import gov.epa.bencloud.server.database.jooq.tables.AgeRange;
import gov.epa.bencloud.server.database.jooq.tables.AirQualityCell;
import gov.epa.bencloud.server.database.jooq.tables.AirQualityLayer;
import gov.epa.bencloud.server.database.jooq.tables.Endpoint;
import gov.epa.bencloud.server.database.jooq.tables.EndpointGroup;
import gov.epa.bencloud.server.database.jooq.tables.Ethnicity;
import gov.epa.bencloud.server.database.jooq.tables.Gender;
import gov.epa.bencloud.server.database.jooq.tables.GridDefinition;
import gov.epa.bencloud.server.database.jooq.tables.HealthImpactFunction;
import gov.epa.bencloud.server.database.jooq.tables.HealthImpactFunctionDataset;
import gov.epa.bencloud.server.database.jooq.tables.HifResultDatasets;
import gov.epa.bencloud.server.database.jooq.tables.IncidenceDataset;
import gov.epa.bencloud.server.database.jooq.tables.IncidenceEntry;
import gov.epa.bencloud.server.database.jooq.tables.IncidenceValue;
import gov.epa.bencloud.server.database.jooq.tables.IncomeGrowthAdjDataset;
import gov.epa.bencloud.server.database.jooq.tables.IncomeGrowthAdjFactor;
import gov.epa.bencloud.server.database.jooq.tables.Pollutant;
import gov.epa.bencloud.server.database.jooq.tables.PollutantMetric;
import gov.epa.bencloud.server.database.jooq.tables.PopConfig;
import gov.epa.bencloud.server.database.jooq.tables.PopConfigEthnicity;
import gov.epa.bencloud.server.database.jooq.tables.PopConfigGender;
import gov.epa.bencloud.server.database.jooq.tables.PopConfigRace;
import gov.epa.bencloud.server.database.jooq.tables.PopulationDataset;
import gov.epa.bencloud.server.database.jooq.tables.PopulationEntry;
import gov.epa.bencloud.server.database.jooq.tables.Race;
import gov.epa.bencloud.server.database.jooq.tables.SeasonalMetric;
import gov.epa.bencloud.server.database.jooq.tables.SeasonalMetricSeason;
import gov.epa.bencloud.server.database.jooq.tables.TaskComplete;
import gov.epa.bencloud.server.database.jooq.tables.TaskQueue;
import gov.epa.bencloud.server.database.jooq.tables.TaskWorker;
import gov.epa.bencloud.server.database.jooq.tables.records.AgeRangeRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.AirQualityCellRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.AirQualityLayerRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.EndpointGroupRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.EndpointRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.EthnicityRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.GenderRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.GridDefinitionRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.HealthImpactFunctionDatasetRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.HealthImpactFunctionRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.HifResultDatasetsRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.IncidenceDatasetRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.IncidenceEntryRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.IncidenceValueRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.IncomeGrowthAdjDatasetRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.IncomeGrowthAdjFactorRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PollutantMetricRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PollutantRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopConfigEthnicityRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopConfigGenderRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopConfigRaceRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopConfigRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopulationDatasetRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.PopulationEntryRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.RaceRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.SeasonalMetricRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.SeasonalMetricSeasonRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.TaskCompleteRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.TaskQueueRecord;
import gov.epa.bencloud.server.database.jooq.tables.records.TaskWorkerRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * data.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AgeRangeRecord> AGE_RANGE_PKEY = Internal.createUniqueKey(AgeRange.AGE_RANGE, DSL.name("age_range_pkey"), new TableField[] { AgeRange.AGE_RANGE.ID }, true);
    public static final UniqueKey<AirQualityLayerRecord> AIR_QUALITY_LAYER_PKEY = Internal.createUniqueKey(AirQualityLayer.AIR_QUALITY_LAYER, DSL.name("air_quality_layer_pkey"), new TableField[] { AirQualityLayer.AIR_QUALITY_LAYER.ID }, true);
    public static final UniqueKey<EndpointRecord> ENDPOINT_PKEY = Internal.createUniqueKey(Endpoint.ENDPOINT, DSL.name("endpoint_pkey"), new TableField[] { Endpoint.ENDPOINT.ID }, true);
    public static final UniqueKey<EndpointGroupRecord> ENDPOINT_GROUP_PKEY = Internal.createUniqueKey(EndpointGroup.ENDPOINT_GROUP, DSL.name("endpoint_group_pkey"), new TableField[] { EndpointGroup.ENDPOINT_GROUP.ID }, true);
    public static final UniqueKey<EthnicityRecord> ETHNICITY_PKEY = Internal.createUniqueKey(Ethnicity.ETHNICITY, DSL.name("ethnicity_pkey"), new TableField[] { Ethnicity.ETHNICITY.ID }, true);
    public static final UniqueKey<GenderRecord> GENDER_PKEY = Internal.createUniqueKey(Gender.GENDER, DSL.name("gender_pkey"), new TableField[] { Gender.GENDER.ID }, true);
    public static final UniqueKey<GridDefinitionRecord> GRID_DEFINITION_PKEY = Internal.createUniqueKey(GridDefinition.GRID_DEFINITION, DSL.name("grid_definition_pkey"), new TableField[] { GridDefinition.GRID_DEFINITION.ID }, true);
    public static final UniqueKey<HealthImpactFunctionRecord> HEALTH_IMPACT_FUNCTION_PKEY = Internal.createUniqueKey(HealthImpactFunction.HEALTH_IMPACT_FUNCTION, DSL.name("health_impact_function_pkey"), new TableField[] { HealthImpactFunction.HEALTH_IMPACT_FUNCTION.ID }, true);
    public static final UniqueKey<HealthImpactFunctionDatasetRecord> HEALTH_IMPACT_FUNCTION_DATASET_PKEY = Internal.createUniqueKey(HealthImpactFunctionDataset.HEALTH_IMPACT_FUNCTION_DATASET, DSL.name("health_impact_function_dataset_pkey"), new TableField[] { HealthImpactFunctionDataset.HEALTH_IMPACT_FUNCTION_DATASET.ID }, true);
    public static final UniqueKey<HifResultDatasetsRecord> HIF_RESULT_DATASETS_PKEY = Internal.createUniqueKey(HifResultDatasets.HIF_RESULT_DATASETS, DSL.name("hif_result_datasets_pkey"), new TableField[] { HifResultDatasets.HIF_RESULT_DATASETS.ID }, true);
    public static final UniqueKey<IncidenceDatasetRecord> INCIDENCE_DATASET_PKEY = Internal.createUniqueKey(IncidenceDataset.INCIDENCE_DATASET, DSL.name("incidence_dataset_pkey"), new TableField[] { IncidenceDataset.INCIDENCE_DATASET.ID }, true);
    public static final UniqueKey<IncidenceEntryRecord> INCIDENCE_ENTRY_PKEY = Internal.createUniqueKey(IncidenceEntry.INCIDENCE_ENTRY, DSL.name("incidence_entry_pkey"), new TableField[] { IncidenceEntry.INCIDENCE_ENTRY.ID }, true);
    public static final UniqueKey<IncomeGrowthAdjDatasetRecord> INCOME_GROWTH_ADJ_DATASET_PKEY = Internal.createUniqueKey(IncomeGrowthAdjDataset.INCOME_GROWTH_ADJ_DATASET, DSL.name("income_growth_adj_dataset_pkey"), new TableField[] { IncomeGrowthAdjDataset.INCOME_GROWTH_ADJ_DATASET.ID }, true);
    public static final UniqueKey<IncomeGrowthAdjFactorRecord> INCOME_GROWTH_ADJ_FACTOR_PKEY = Internal.createUniqueKey(IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR, DSL.name("income_growth_adj_factor_pkey"), new TableField[] { IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR.ID }, true);
    public static final UniqueKey<PollutantRecord> POLLUTANT_PKEY = Internal.createUniqueKey(Pollutant.POLLUTANT, DSL.name("pollutant_pkey"), new TableField[] { Pollutant.POLLUTANT.ID }, true);
    public static final UniqueKey<PollutantMetricRecord> POLLUTANT_METRIC_PKEY = Internal.createUniqueKey(PollutantMetric.POLLUTANT_METRIC, DSL.name("pollutant_metric_pkey"), new TableField[] { PollutantMetric.POLLUTANT_METRIC.ID }, true);
    public static final UniqueKey<PopConfigRecord> POP_CONFIG_PKEY = Internal.createUniqueKey(PopConfig.POP_CONFIG, DSL.name("pop_config_pkey"), new TableField[] { PopConfig.POP_CONFIG.ID }, true);
    public static final UniqueKey<PopulationDatasetRecord> POPULATION_DATASET_PKEY = Internal.createUniqueKey(PopulationDataset.POPULATION_DATASET, DSL.name("population_dataset_pkey"), new TableField[] { PopulationDataset.POPULATION_DATASET.ID }, true);
    public static final UniqueKey<RaceRecord> RACE_PKEY = Internal.createUniqueKey(Race.RACE, DSL.name("race_pkey"), new TableField[] { Race.RACE.ID }, true);
    public static final UniqueKey<SeasonalMetricRecord> SEASONAL_METRIC_PKEY = Internal.createUniqueKey(SeasonalMetric.SEASONAL_METRIC, DSL.name("seasonal_metric_pkey"), new TableField[] { SeasonalMetric.SEASONAL_METRIC.ID }, true);
    public static final UniqueKey<SeasonalMetricSeasonRecord> SEASONAL_METRIC_SEASON_PKEY = Internal.createUniqueKey(SeasonalMetricSeason.SEASONAL_METRIC_SEASON, DSL.name("seasonal_metric_season_pkey"), new TableField[] { SeasonalMetricSeason.SEASONAL_METRIC_SEASON.ID }, true);
    public static final UniqueKey<TaskCompleteRecord> TASK_COMPLETE_PKEY = Internal.createUniqueKey(TaskComplete.TASK_COMPLETE, DSL.name("task_complete_pkey"), new TableField[] { TaskComplete.TASK_COMPLETE.TASK_ID }, true);
    public static final UniqueKey<TaskQueueRecord> TASK_QUEUE_PKEY = Internal.createUniqueKey(TaskQueue.TASK_QUEUE, DSL.name("task_queue_pkey"), new TableField[] { TaskQueue.TASK_QUEUE.TASK_ID }, true);
    public static final UniqueKey<TaskWorkerRecord> TASK_WORKER_PKEY = Internal.createUniqueKey(TaskWorker.TASK_WORKER, DSL.name("task_worker_pkey"), new TableField[] { TaskWorker.TASK_WORKER.TASK_ID }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AgeRangeRecord, PopConfigRecord> AGE_RANGE__AGE_RANGE_POP_CONFIG_ID_FKEY = Internal.createForeignKey(AgeRange.AGE_RANGE, DSL.name("age_range_pop_config_id_fkey"), new TableField[] { AgeRange.AGE_RANGE.POP_CONFIG_ID }, Keys.POP_CONFIG_PKEY, new TableField[] { PopConfig.POP_CONFIG.ID }, true);
    public static final ForeignKey<AirQualityCellRecord, AirQualityLayerRecord> AIR_QUALITY_CELL__AIR_QUALITY_CELL_AIR_QUALITY_LAYER_ID_FKEY = Internal.createForeignKey(AirQualityCell.AIR_QUALITY_CELL, DSL.name("air_quality_cell_air_quality_layer_id_fkey"), new TableField[] { AirQualityCell.AIR_QUALITY_CELL.AIR_QUALITY_LAYER_ID }, Keys.AIR_QUALITY_LAYER_PKEY, new TableField[] { AirQualityLayer.AIR_QUALITY_LAYER.ID }, true);
    public static final ForeignKey<AirQualityCellRecord, PollutantMetricRecord> AIR_QUALITY_CELL__AIR_QUALITY_CELL_METRIC_ID_FKEY = Internal.createForeignKey(AirQualityCell.AIR_QUALITY_CELL, DSL.name("air_quality_cell_metric_id_fkey"), new TableField[] { AirQualityCell.AIR_QUALITY_CELL.METRIC_ID }, Keys.POLLUTANT_METRIC_PKEY, new TableField[] { PollutantMetric.POLLUTANT_METRIC.ID }, true);
    public static final ForeignKey<AirQualityCellRecord, SeasonalMetricRecord> AIR_QUALITY_CELL__AIR_QUALITY_CELL_SEASONAL_METRIC_ID_FKEY = Internal.createForeignKey(AirQualityCell.AIR_QUALITY_CELL, DSL.name("air_quality_cell_seasonal_metric_id_fkey"), new TableField[] { AirQualityCell.AIR_QUALITY_CELL.SEASONAL_METRIC_ID }, Keys.SEASONAL_METRIC_PKEY, new TableField[] { SeasonalMetric.SEASONAL_METRIC.ID }, true);
    public static final ForeignKey<AirQualityLayerRecord, GridDefinitionRecord> AIR_QUALITY_LAYER__AIR_QUALITY_LAYER_GRID_DEFINITION_ID_FKEY = Internal.createForeignKey(AirQualityLayer.AIR_QUALITY_LAYER, DSL.name("air_quality_layer_grid_definition_id_fkey"), new TableField[] { AirQualityLayer.AIR_QUALITY_LAYER.GRID_DEFINITION_ID }, Keys.GRID_DEFINITION_PKEY, new TableField[] { GridDefinition.GRID_DEFINITION.ID }, true);
    public static final ForeignKey<AirQualityLayerRecord, PollutantRecord> AIR_QUALITY_LAYER__AIR_QUALITY_LAYER_POLLUTANT_ID_FKEY = Internal.createForeignKey(AirQualityLayer.AIR_QUALITY_LAYER, DSL.name("air_quality_layer_pollutant_id_fkey"), new TableField[] { AirQualityLayer.AIR_QUALITY_LAYER.POLLUTANT_ID }, Keys.POLLUTANT_PKEY, new TableField[] { Pollutant.POLLUTANT.ID }, true);
    public static final ForeignKey<EndpointRecord, EndpointGroupRecord> ENDPOINT__ENDPOINT_ENDPOINT_GROUP_ID_FKEY = Internal.createForeignKey(Endpoint.ENDPOINT, DSL.name("endpoint_endpoint_group_id_fkey"), new TableField[] { Endpoint.ENDPOINT.ENDPOINT_GROUP_ID }, Keys.ENDPOINT_GROUP_PKEY, new TableField[] { EndpointGroup.ENDPOINT_GROUP.ID }, true);
    public static final ForeignKey<IncidenceDatasetRecord, GridDefinitionRecord> INCIDENCE_DATASET__INCIDENCE_DATASET_GRID_DEFINITION_ID_FKEY = Internal.createForeignKey(IncidenceDataset.INCIDENCE_DATASET, DSL.name("incidence_dataset_grid_definition_id_fkey"), new TableField[] { IncidenceDataset.INCIDENCE_DATASET.GRID_DEFINITION_ID }, Keys.GRID_DEFINITION_PKEY, new TableField[] { GridDefinition.GRID_DEFINITION.ID }, true);
    public static final ForeignKey<IncidenceEntryRecord, IncidenceDatasetRecord> INCIDENCE_ENTRY__INCIDENCE_ENTRY_INCIDENCE_DATASET_ID_FKEY = Internal.createForeignKey(IncidenceEntry.INCIDENCE_ENTRY, DSL.name("incidence_entry_incidence_dataset_id_fkey"), new TableField[] { IncidenceEntry.INCIDENCE_ENTRY.INCIDENCE_DATASET_ID }, Keys.INCIDENCE_DATASET_PKEY, new TableField[] { IncidenceDataset.INCIDENCE_DATASET.ID }, true);
    public static final ForeignKey<IncidenceValueRecord, IncidenceEntryRecord> INCIDENCE_VALUE__INCIDENCE_VALUE_INCIDENCE_ENTRY_ID_FKEY = Internal.createForeignKey(IncidenceValue.INCIDENCE_VALUE, DSL.name("incidence_value_incidence_entry_id_fkey"), new TableField[] { IncidenceValue.INCIDENCE_VALUE.INCIDENCE_ENTRY_ID }, Keys.INCIDENCE_ENTRY_PKEY, new TableField[] { IncidenceEntry.INCIDENCE_ENTRY.ID }, true);
    public static final ForeignKey<IncomeGrowthAdjFactorRecord, EndpointGroupRecord> INCOME_GROWTH_ADJ_FACTOR__INCOME_GROWTH_ADJ_FACTOR_ENDPOINT_GROUP_ID_FKEY = Internal.createForeignKey(IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR, DSL.name("income_growth_adj_factor_endpoint_group_id_fkey"), new TableField[] { IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR.ENDPOINT_GROUP_ID }, Keys.ENDPOINT_GROUP_PKEY, new TableField[] { EndpointGroup.ENDPOINT_GROUP.ID }, true);
    public static final ForeignKey<IncomeGrowthAdjFactorRecord, IncomeGrowthAdjDatasetRecord> INCOME_GROWTH_ADJ_FACTOR__INCOME_GROWTH_ADJ_FACTOR_INCOME_GROWTH_ADJ_DATASET_ID_FKEY = Internal.createForeignKey(IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR, DSL.name("income_growth_adj_factor_income_growth_adj_dataset_id_fkey"), new TableField[] { IncomeGrowthAdjFactor.INCOME_GROWTH_ADJ_FACTOR.INCOME_GROWTH_ADJ_DATASET_ID }, Keys.INCOME_GROWTH_ADJ_DATASET_PKEY, new TableField[] { IncomeGrowthAdjDataset.INCOME_GROWTH_ADJ_DATASET.ID }, true);
    public static final ForeignKey<PollutantMetricRecord, PollutantRecord> POLLUTANT_METRIC__POLLUTANT_METRIC_POLLUTANT_ID_FKEY = Internal.createForeignKey(PollutantMetric.POLLUTANT_METRIC, DSL.name("pollutant_metric_pollutant_id_fkey"), new TableField[] { PollutantMetric.POLLUTANT_METRIC.POLLUTANT_ID }, Keys.POLLUTANT_PKEY, new TableField[] { Pollutant.POLLUTANT.ID }, true);
    public static final ForeignKey<PopConfigEthnicityRecord, EthnicityRecord> POP_CONFIG_ETHNICITY__POP_CONFIG_ETHNICITY_ETHNICITY_ID_FKEY = Internal.createForeignKey(PopConfigEthnicity.POP_CONFIG_ETHNICITY, DSL.name("pop_config_ethnicity_ethnicity_id_fkey"), new TableField[] { PopConfigEthnicity.POP_CONFIG_ETHNICITY.ETHNICITY_ID }, Keys.ETHNICITY_PKEY, new TableField[] { Ethnicity.ETHNICITY.ID }, true);
    public static final ForeignKey<PopConfigEthnicityRecord, PopConfigRecord> POP_CONFIG_ETHNICITY__POP_CONFIG_ETHNICITY_POP_CONFIG_ID_FKEY = Internal.createForeignKey(PopConfigEthnicity.POP_CONFIG_ETHNICITY, DSL.name("pop_config_ethnicity_pop_config_id_fkey"), new TableField[] { PopConfigEthnicity.POP_CONFIG_ETHNICITY.POP_CONFIG_ID }, Keys.POP_CONFIG_PKEY, new TableField[] { PopConfig.POP_CONFIG.ID }, true);
    public static final ForeignKey<PopConfigGenderRecord, GenderRecord> POP_CONFIG_GENDER__POP_CONFIG_GENDER_GENDER_ID_FKEY = Internal.createForeignKey(PopConfigGender.POP_CONFIG_GENDER, DSL.name("pop_config_gender_gender_id_fkey"), new TableField[] { PopConfigGender.POP_CONFIG_GENDER.GENDER_ID }, Keys.GENDER_PKEY, new TableField[] { Gender.GENDER.ID }, true);
    public static final ForeignKey<PopConfigGenderRecord, PopConfigRecord> POP_CONFIG_GENDER__POP_CONFIG_GENDER_POP_CONFIG_ID_FKEY = Internal.createForeignKey(PopConfigGender.POP_CONFIG_GENDER, DSL.name("pop_config_gender_pop_config_id_fkey"), new TableField[] { PopConfigGender.POP_CONFIG_GENDER.POP_CONFIG_ID }, Keys.POP_CONFIG_PKEY, new TableField[] { PopConfig.POP_CONFIG.ID }, true);
    public static final ForeignKey<PopConfigRaceRecord, PopConfigRecord> POP_CONFIG_RACE__POP_CONFIG_RACE_POP_CONFIG_ID_FKEY = Internal.createForeignKey(PopConfigRace.POP_CONFIG_RACE, DSL.name("pop_config_race_pop_config_id_fkey"), new TableField[] { PopConfigRace.POP_CONFIG_RACE.POP_CONFIG_ID }, Keys.POP_CONFIG_PKEY, new TableField[] { PopConfig.POP_CONFIG.ID }, true);
    public static final ForeignKey<PopConfigRaceRecord, RaceRecord> POP_CONFIG_RACE__POP_CONFIG_RACE_RACE_ID_FKEY = Internal.createForeignKey(PopConfigRace.POP_CONFIG_RACE, DSL.name("pop_config_race_race_id_fkey"), new TableField[] { PopConfigRace.POP_CONFIG_RACE.RACE_ID }, Keys.RACE_PKEY, new TableField[] { Race.RACE.ID }, true);
    public static final ForeignKey<PopulationDatasetRecord, PopConfigRecord> POPULATION_DATASET__POPULATION_DATASET_POP_CONFIG_ID_FKEY = Internal.createForeignKey(PopulationDataset.POPULATION_DATASET, DSL.name("population_dataset_pop_config_id_fkey"), new TableField[] { PopulationDataset.POPULATION_DATASET.POP_CONFIG_ID }, Keys.POP_CONFIG_PKEY, new TableField[] { PopConfig.POP_CONFIG.ID }, true);
    public static final ForeignKey<PopulationEntryRecord, PopulationDatasetRecord> POPULATION_ENTRY__POPULATION_ENTRY_POP_DATASET_ID_FKEY = Internal.createForeignKey(PopulationEntry.POPULATION_ENTRY, DSL.name("population_entry_pop_dataset_id_fkey"), new TableField[] { PopulationEntry.POPULATION_ENTRY.POP_DATASET_ID }, Keys.POPULATION_DATASET_PKEY, new TableField[] { PopulationDataset.POPULATION_DATASET.ID }, true);
    public static final ForeignKey<SeasonalMetricRecord, PollutantMetricRecord> SEASONAL_METRIC__SEASONAL_METRIC_METRIC_ID_FKEY = Internal.createForeignKey(SeasonalMetric.SEASONAL_METRIC, DSL.name("seasonal_metric_metric_id_fkey"), new TableField[] { SeasonalMetric.SEASONAL_METRIC.METRIC_ID }, Keys.POLLUTANT_METRIC_PKEY, new TableField[] { PollutantMetric.POLLUTANT_METRIC.ID }, true);
    public static final ForeignKey<SeasonalMetricSeasonRecord, SeasonalMetricRecord> SEASONAL_METRIC_SEASON__SEASONAL_METRIC_SEASON_SEASONAL_METRIC_ID_FKEY = Internal.createForeignKey(SeasonalMetricSeason.SEASONAL_METRIC_SEASON, DSL.name("seasonal_metric_season_seasonal_metric_id_fkey"), new TableField[] { SeasonalMetricSeason.SEASONAL_METRIC_SEASON.SEASONAL_METRIC_ID }, Keys.SEASONAL_METRIC_PKEY, new TableField[] { SeasonalMetric.SEASONAL_METRIC.ID }, true);
}
