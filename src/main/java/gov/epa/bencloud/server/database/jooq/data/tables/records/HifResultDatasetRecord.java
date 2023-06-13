/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.HifResultDataset;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HifResultDatasetRecord extends UpdatableRecordImpl<HifResultDatasetRecord> implements Record11<Integer, String, String, Integer, Integer, Integer, Integer, JSON, String, Short, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.hif_result_dataset.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.hif_result_dataset.task_uuid</code>.
     */
    public void setTaskUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.task_uuid</code>.
     */
    public String getTaskUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.hif_result_dataset.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>data.hif_result_dataset.population_dataset_id</code>.
     */
    public void setPopulationDatasetId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.population_dataset_id</code>.
     */
    public Integer getPopulationDatasetId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.hif_result_dataset.population_year</code>.
     */
    public void setPopulationYear(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.population_year</code>.
     */
    public Integer getPopulationYear() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.hif_result_dataset.baseline_aq_layer_id</code>.
     */
    public void setBaselineAqLayerId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.baseline_aq_layer_id</code>.
     */
    public Integer getBaselineAqLayerId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>data.hif_result_dataset.scenario_aq_layer_id</code>.
     */
    public void setScenarioAqLayerId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.scenario_aq_layer_id</code>.
     */
    public Integer getScenarioAqLayerId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>data.hif_result_dataset.task_log</code>.
     */
    public void setTaskLog(JSON value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.task_log</code>.
     */
    public JSON getTaskLog() {
        return (JSON) get(7);
    }

    /**
     * Setter for <code>data.hif_result_dataset.user_id</code>.
     */
    public void setUserId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.user_id</code>.
     */
    public String getUserId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>data.hif_result_dataset.sharing_scope</code>.
     */
    public void setSharingScope(Short value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.sharing_scope</code>.
     */
    public Short getSharingScope() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>data.hif_result_dataset.grid_definition_id</code>.
     */
    public void setGridDefinitionId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.hif_result_dataset.grid_definition_id</code>.
     */
    public Integer getGridDefinitionId() {
        return (Integer) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, Integer, Integer, Integer, Integer, JSON, String, Short, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, Integer, Integer, Integer, Integer, JSON, String, Short, Integer> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HifResultDataset.HIF_RESULT_DATASET.ID;
    }

    @Override
    public Field<String> field2() {
        return HifResultDataset.HIF_RESULT_DATASET.TASK_UUID;
    }

    @Override
    public Field<String> field3() {
        return HifResultDataset.HIF_RESULT_DATASET.NAME;
    }

    @Override
    public Field<Integer> field4() {
        return HifResultDataset.HIF_RESULT_DATASET.POPULATION_DATASET_ID;
    }

    @Override
    public Field<Integer> field5() {
        return HifResultDataset.HIF_RESULT_DATASET.POPULATION_YEAR;
    }

    @Override
    public Field<Integer> field6() {
        return HifResultDataset.HIF_RESULT_DATASET.BASELINE_AQ_LAYER_ID;
    }

    @Override
    public Field<Integer> field7() {
        return HifResultDataset.HIF_RESULT_DATASET.SCENARIO_AQ_LAYER_ID;
    }

    @Override
    public Field<JSON> field8() {
        return HifResultDataset.HIF_RESULT_DATASET.TASK_LOG;
    }

    @Override
    public Field<String> field9() {
        return HifResultDataset.HIF_RESULT_DATASET.USER_ID;
    }

    @Override
    public Field<Short> field10() {
        return HifResultDataset.HIF_RESULT_DATASET.SHARING_SCOPE;
    }

    @Override
    public Field<Integer> field11() {
        return HifResultDataset.HIF_RESULT_DATASET.GRID_DEFINITION_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getTaskUuid();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Integer component4() {
        return getPopulationDatasetId();
    }

    @Override
    public Integer component5() {
        return getPopulationYear();
    }

    @Override
    public Integer component6() {
        return getBaselineAqLayerId();
    }

    @Override
    public Integer component7() {
        return getScenarioAqLayerId();
    }

    @Override
    public JSON component8() {
        return getTaskLog();
    }

    @Override
    public String component9() {
        return getUserId();
    }

    @Override
    public Short component10() {
        return getSharingScope();
    }

    @Override
    public Integer component11() {
        return getGridDefinitionId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getTaskUuid();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Integer value4() {
        return getPopulationDatasetId();
    }

    @Override
    public Integer value5() {
        return getPopulationYear();
    }

    @Override
    public Integer value6() {
        return getBaselineAqLayerId();
    }

    @Override
    public Integer value7() {
        return getScenarioAqLayerId();
    }

    @Override
    public JSON value8() {
        return getTaskLog();
    }

    @Override
    public String value9() {
        return getUserId();
    }

    @Override
    public Short value10() {
        return getSharingScope();
    }

    @Override
    public Integer value11() {
        return getGridDefinitionId();
    }

    @Override
    public HifResultDatasetRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value2(String value) {
        setTaskUuid(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value4(Integer value) {
        setPopulationDatasetId(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value5(Integer value) {
        setPopulationYear(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value6(Integer value) {
        setBaselineAqLayerId(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value7(Integer value) {
        setScenarioAqLayerId(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value8(JSON value) {
        setTaskLog(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value9(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value10(Short value) {
        setSharingScope(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord value11(Integer value) {
        setGridDefinitionId(value);
        return this;
    }

    @Override
    public HifResultDatasetRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, JSON value8, String value9, Short value10, Integer value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HifResultDatasetRecord
     */
    public HifResultDatasetRecord() {
        super(HifResultDataset.HIF_RESULT_DATASET);
    }

    /**
     * Create a detached, initialised HifResultDatasetRecord
     */
    public HifResultDatasetRecord(Integer id, String taskUuid, String name, Integer populationDatasetId, Integer populationYear, Integer baselineAqLayerId, Integer scenarioAqLayerId, JSON taskLog, String userId, Short sharingScope, Integer gridDefinitionId) {
        super(HifResultDataset.HIF_RESULT_DATASET);

        setId(id);
        setTaskUuid(taskUuid);
        setName(name);
        setPopulationDatasetId(populationDatasetId);
        setPopulationYear(populationYear);
        setBaselineAqLayerId(baselineAqLayerId);
        setScenarioAqLayerId(scenarioAqLayerId);
        setTaskLog(taskLog);
        setUserId(userId);
        setSharingScope(sharingScope);
        setGridDefinitionId(gridDefinitionId);
    }
}
