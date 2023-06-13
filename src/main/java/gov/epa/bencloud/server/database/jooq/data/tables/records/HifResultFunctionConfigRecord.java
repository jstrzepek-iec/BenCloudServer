/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.HifResultFunctionConfig;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HifResultFunctionConfigRecord extends TableRecordImpl<HifResultFunctionConfigRecord> implements Record14<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>data.hif_result_function_config.hif_result_dataset_id</code>.
     */
    public void setHifResultDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>data.hif_result_function_config.hif_result_dataset_id</code>.
     */
    public Integer getHifResultDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.hif_result_function_config.hif_id</code>.
     */
    public void setHifId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.hif_id</code>.
     */
    public Integer getHifId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.hif_result_function_config.start_age</code>.
     */
    public void setStartAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.start_age</code>.
     */
    public Integer getStartAge() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.hif_result_function_config.end_age</code>.
     */
    public void setEndAge(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.end_age</code>.
     */
    public Integer getEndAge() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>data.hif_result_function_config.incidence_dataset_id</code>.
     */
    public void setIncidenceDatasetId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>data.hif_result_function_config.incidence_dataset_id</code>.
     */
    public Integer getIncidenceDatasetId() {
        return (Integer) get(4);
    }

    /**
     * Setter for
     * <code>data.hif_result_function_config.prevalence_dataset_id</code>.
     */
    public void setPrevalenceDatasetId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>data.hif_result_function_config.prevalence_dataset_id</code>.
     */
    public Integer getPrevalenceDatasetId() {
        return (Integer) get(5);
    }

    /**
     * Setter for
     * <code>data.hif_result_function_config.variable_dataset_id</code>.
     */
    public void setVariableDatasetId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>data.hif_result_function_config.variable_dataset_id</code>.
     */
    public Integer getVariableDatasetId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>data.hif_result_function_config.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>data.hif_result_function_config.gender_id</code>.
     */
    public void setGenderId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.gender_id</code>.
     */
    public Integer getGenderId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>data.hif_result_function_config.ethnicity_id</code>.
     */
    public void setEthnicityId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.ethnicity_id</code>.
     */
    public Integer getEthnicityId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>data.hif_result_function_config.metric_id</code>.
     */
    public void setMetricId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.metric_id</code>.
     */
    public Integer getMetricId() {
        return (Integer) get(10);
    }

    /**
     * Setter for
     * <code>data.hif_result_function_config.seasonal_metric_id</code>.
     */
    public void setSeasonalMetricId(Integer value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>data.hif_result_function_config.seasonal_metric_id</code>.
     */
    public Integer getSeasonalMetricId() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>data.hif_result_function_config.metric_statistic</code>.
     */
    public void setMetricStatistic(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.metric_statistic</code>.
     */
    public Integer getMetricStatistic() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>data.hif_result_function_config.hif_instance_id</code>.
     */
    public void setHifInstanceId(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>data.hif_result_function_config.hif_instance_id</code>.
     */
    public Integer getHifInstanceId() {
        return (Integer) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.HIF_RESULT_DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.HIF_ID;
    }

    @Override
    public Field<Integer> field3() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.START_AGE;
    }

    @Override
    public Field<Integer> field4() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.END_AGE;
    }

    @Override
    public Field<Integer> field5() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.INCIDENCE_DATASET_ID;
    }

    @Override
    public Field<Integer> field6() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.PREVALENCE_DATASET_ID;
    }

    @Override
    public Field<Integer> field7() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.VARIABLE_DATASET_ID;
    }

    @Override
    public Field<Integer> field8() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.RACE_ID;
    }

    @Override
    public Field<Integer> field9() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.GENDER_ID;
    }

    @Override
    public Field<Integer> field10() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.ETHNICITY_ID;
    }

    @Override
    public Field<Integer> field11() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.METRIC_ID;
    }

    @Override
    public Field<Integer> field12() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.SEASONAL_METRIC_ID;
    }

    @Override
    public Field<Integer> field13() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.METRIC_STATISTIC;
    }

    @Override
    public Field<Integer> field14() {
        return HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG.HIF_INSTANCE_ID;
    }

    @Override
    public Integer component1() {
        return getHifResultDatasetId();
    }

    @Override
    public Integer component2() {
        return getHifId();
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
        return getIncidenceDatasetId();
    }

    @Override
    public Integer component6() {
        return getPrevalenceDatasetId();
    }

    @Override
    public Integer component7() {
        return getVariableDatasetId();
    }

    @Override
    public Integer component8() {
        return getRaceId();
    }

    @Override
    public Integer component9() {
        return getGenderId();
    }

    @Override
    public Integer component10() {
        return getEthnicityId();
    }

    @Override
    public Integer component11() {
        return getMetricId();
    }

    @Override
    public Integer component12() {
        return getSeasonalMetricId();
    }

    @Override
    public Integer component13() {
        return getMetricStatistic();
    }

    @Override
    public Integer component14() {
        return getHifInstanceId();
    }

    @Override
    public Integer value1() {
        return getHifResultDatasetId();
    }

    @Override
    public Integer value2() {
        return getHifId();
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
        return getIncidenceDatasetId();
    }

    @Override
    public Integer value6() {
        return getPrevalenceDatasetId();
    }

    @Override
    public Integer value7() {
        return getVariableDatasetId();
    }

    @Override
    public Integer value8() {
        return getRaceId();
    }

    @Override
    public Integer value9() {
        return getGenderId();
    }

    @Override
    public Integer value10() {
        return getEthnicityId();
    }

    @Override
    public Integer value11() {
        return getMetricId();
    }

    @Override
    public Integer value12() {
        return getSeasonalMetricId();
    }

    @Override
    public Integer value13() {
        return getMetricStatistic();
    }

    @Override
    public Integer value14() {
        return getHifInstanceId();
    }

    @Override
    public HifResultFunctionConfigRecord value1(Integer value) {
        setHifResultDatasetId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value2(Integer value) {
        setHifId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value3(Integer value) {
        setStartAge(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value4(Integer value) {
        setEndAge(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value5(Integer value) {
        setIncidenceDatasetId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value6(Integer value) {
        setPrevalenceDatasetId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value7(Integer value) {
        setVariableDatasetId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value8(Integer value) {
        setRaceId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value9(Integer value) {
        setGenderId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value10(Integer value) {
        setEthnicityId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value11(Integer value) {
        setMetricId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value12(Integer value) {
        setSeasonalMetricId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value13(Integer value) {
        setMetricStatistic(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord value14(Integer value) {
        setHifInstanceId(value);
        return this;
    }

    @Override
    public HifResultFunctionConfigRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14) {
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
     * Create a detached HifResultFunctionConfigRecord
     */
    public HifResultFunctionConfigRecord() {
        super(HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG);
    }

    /**
     * Create a detached, initialised HifResultFunctionConfigRecord
     */
    public HifResultFunctionConfigRecord(Integer hifResultDatasetId, Integer hifId, Integer startAge, Integer endAge, Integer incidenceDatasetId, Integer prevalenceDatasetId, Integer variableDatasetId, Integer raceId, Integer genderId, Integer ethnicityId, Integer metricId, Integer seasonalMetricId, Integer metricStatistic, Integer hifInstanceId) {
        super(HifResultFunctionConfig.HIF_RESULT_FUNCTION_CONFIG);

        setHifResultDatasetId(hifResultDatasetId);
        setHifId(hifId);
        setStartAge(startAge);
        setEndAge(endAge);
        setIncidenceDatasetId(incidenceDatasetId);
        setPrevalenceDatasetId(prevalenceDatasetId);
        setVariableDatasetId(variableDatasetId);
        setRaceId(raceId);
        setGenderId(genderId);
        setEthnicityId(ethnicityId);
        setMetricId(metricId);
        setSeasonalMetricId(seasonalMetricId);
        setMetricStatistic(metricStatistic);
        setHifInstanceId(hifInstanceId);
    }
}
