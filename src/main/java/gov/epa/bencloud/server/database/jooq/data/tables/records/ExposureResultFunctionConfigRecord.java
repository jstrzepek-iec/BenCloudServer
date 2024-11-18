/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.ExposureResultFunctionConfig;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExposureResultFunctionConfigRecord extends TableRecordImpl<ExposureResultFunctionConfigRecord> implements Record14<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>data.exposure_result_function_config.exposure_result_dataset_id</code>.
     */
    public void setExposureResultDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.exposure_result_dataset_id</code>.
     */
    public Integer getExposureResultDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.exposure_function_id</code>.
     */
    public void setExposureFunctionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.exposure_function_id</code>.
     */
    public Integer getExposureFunctionId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.exposure_result_function_config.start_age</code>.
     */
    public void setStartAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.exposure_result_function_config.start_age</code>.
     */
    public Integer getStartAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.exposure_result_function_config.end_age</code>.
     */
    public void setEndAge(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.exposure_result_function_config.end_age</code>.
     */
    public Integer getEndAge() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.exposure_result_function_config.variable_id</code>.
     */
    public void setVariableId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.exposure_result_function_config.variable_id</code>.
     */
    public Integer getVariableId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.exposure_result_function_config.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.exposure_result_function_config.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>data.exposure_result_function_config.gender_id</code>.
     */
    public void setGenderId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.exposure_result_function_config.gender_id</code>.
     */
    public Integer getGenderId() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.ethnicity_id</code>.
     */
    public void setEthnicityId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.ethnicity_id</code>.
     */
    public Integer getEthnicityId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>data.exposure_result_function_config.metric_id</code>.
     */
    public void setMetricId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.exposure_result_function_config.metric_id</code>.
     */
    public Integer getMetricId() {
        return (Integer) get(8);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.seasonal_metric_id</code>.
     */
    public void setSeasonalMetricId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.seasonal_metric_id</code>.
     */
    public Integer getSeasonalMetricId() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.metric_statistic</code>.
     */
    public void setMetricStatistic(Integer value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.metric_statistic</code>.
     */
    public Integer getMetricStatistic() {
        return (Integer) get(10);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.exposure_function_instance_id</code>.
     */
    public void setExposureFunctionInstanceId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.exposure_function_instance_id</code>.
     */
    public Integer getExposureFunctionInstanceId() {
        return (Integer) get(11);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.population_group</code>.
     */
    public void setPopulationGroup(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.population_group</code>.
     */
    public String getPopulationGroup() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>data.exposure_result_function_config.hidden_sort_order</code>.
     */
    public void setHiddenSortOrder(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>data.exposure_result_function_config.hidden_sort_order</code>.
     */
    public String getHiddenSortOrder() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.EXPOSURE_RESULT_DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.EXPOSURE_FUNCTION_ID;
    }

    @Override
    public Field<Integer> field3() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.START_AGE;
    }

    @Override
    public Field<Integer> field4() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.END_AGE;
    }

    @Override
    public Field<Integer> field5() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.VARIABLE_ID;
    }

    @Override
    public Field<Integer> field6() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.RACE_ID;
    }

    @Override
    public Field<Integer> field7() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.GENDER_ID;
    }

    @Override
    public Field<Integer> field8() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.ETHNICITY_ID;
    }

    @Override
    public Field<Integer> field9() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.METRIC_ID;
    }

    @Override
    public Field<Integer> field10() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.SEASONAL_METRIC_ID;
    }

    @Override
    public Field<Integer> field11() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.METRIC_STATISTIC;
    }

    @Override
    public Field<Integer> field12() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.EXPOSURE_FUNCTION_INSTANCE_ID;
    }

    @Override
    public Field<String> field13() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.POPULATION_GROUP;
    }

    @Override
    public Field<String> field14() {
        return ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG.HIDDEN_SORT_ORDER;
    }

    @Override
    public Integer component1() {
        return getExposureResultDatasetId();
    }

    @Override
    public Integer component2() {
        return getExposureFunctionId();
    }

    @Override
    public Integer component3() {
        return getStartAge();
    }

    @Override
    public Integer component4() {
        return getEndAge();
    }

    @Override
    public Integer component5() {
        return getVariableId();
    }

    @Override
    public Integer component6() {
        return getRaceId();
    }

    @Override
    public Integer component7() {
        return getGenderId();
    }

    @Override
    public Integer component8() {
        return getEthnicityId();
    }

    @Override
    public Integer component9() {
        return getMetricId();
    }

    @Override
    public Integer component10() {
        return getSeasonalMetricId();
    }

    @Override
    public Integer component11() {
        return getMetricStatistic();
    }

    @Override
    public Integer component12() {
        return getExposureFunctionInstanceId();
    }

    @Override
    public String component13() {
        return getPopulationGroup();
    }

    @Override
    public String component14() {
        return getHiddenSortOrder();
    }

    @Override
    public Integer value1() {
        return getExposureResultDatasetId();
    }

    @Override
    public Integer value2() {
        return getExposureFunctionId();
    }

    @Override
    public Integer value3() {
        return getStartAge();
    }

    @Override
    public Integer value4() {
        return getEndAge();
    }

    @Override
    public Integer value5() {
        return getVariableId();
    }

    @Override
    public Integer value6() {
        return getRaceId();
    }

    @Override
    public Integer value7() {
        return getGenderId();
    }

    @Override
    public Integer value8() {
        return getEthnicityId();
    }

    @Override
    public Integer value9() {
        return getMetricId();
    }

    @Override
    public Integer value10() {
        return getSeasonalMetricId();
    }

    @Override
    public Integer value11() {
        return getMetricStatistic();
    }

    @Override
    public Integer value12() {
        return getExposureFunctionInstanceId();
    }

    @Override
    public String value13() {
        return getPopulationGroup();
    }

    @Override
    public String value14() {
        return getHiddenSortOrder();
    }

    @Override
    public ExposureResultFunctionConfigRecord value1(Integer value) {
        setExposureResultDatasetId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value2(Integer value) {
        setExposureFunctionId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value3(Integer value) {
        setStartAge(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value4(Integer value) {
        setEndAge(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value5(Integer value) {
        setVariableId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value6(Integer value) {
        setRaceId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value7(Integer value) {
        setGenderId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value8(Integer value) {
        setEthnicityId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value9(Integer value) {
        setMetricId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value10(Integer value) {
        setSeasonalMetricId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value11(Integer value) {
        setMetricStatistic(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value12(Integer value) {
        setExposureFunctionInstanceId(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value13(String value) {
        setPopulationGroup(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord value14(String value) {
        setHiddenSortOrder(value);
        return this;
    }

    @Override
    public ExposureResultFunctionConfigRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, String value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExposureResultFunctionConfigRecord
     */
    public ExposureResultFunctionConfigRecord() {
        super(ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG);
    }

    /**
     * Create a detached, initialised ExposureResultFunctionConfigRecord
     */
    public ExposureResultFunctionConfigRecord(Integer exposureResultDatasetId, Integer exposureFunctionId, Integer startAge, Integer endAge, Integer variableId, Integer raceId, Integer genderId, Integer ethnicityId, Integer metricId, Integer seasonalMetricId, Integer metricStatistic, Integer exposureFunctionInstanceId, String populationGroup, String hiddenSortOrder) {
        super(ExposureResultFunctionConfig.EXPOSURE_RESULT_FUNCTION_CONFIG);

        setExposureResultDatasetId(exposureResultDatasetId);
        setExposureFunctionId(exposureFunctionId);
        setStartAge(startAge);
        setEndAge(endAge);
        setVariableId(variableId);
        setRaceId(raceId);
        setGenderId(genderId);
        setEthnicityId(ethnicityId);
        setMetricId(metricId);
        setSeasonalMetricId(seasonalMetricId);
        setMetricStatistic(metricStatistic);
        setExposureFunctionInstanceId(exposureFunctionInstanceId);
        setPopulationGroup(populationGroup);
        setHiddenSortOrder(hiddenSortOrder);
    }
}
