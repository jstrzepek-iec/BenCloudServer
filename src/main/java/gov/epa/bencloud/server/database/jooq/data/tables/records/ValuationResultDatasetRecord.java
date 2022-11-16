/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResultDataset;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValuationResultDatasetRecord extends UpdatableRecordImpl<ValuationResultDatasetRecord> implements Record9<Integer, String, Integer, String, Integer, JSON, String, Short, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.valuation_result_dataset.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.valuation_result_dataset.task_uuid</code>.
     */
    public void setTaskUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.task_uuid</code>.
     */
    public String getTaskUuid() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>data.valuation_result_dataset.hif_result_dataset_id</code>.
     */
    public void setHifResultDatasetId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>data.valuation_result_dataset.hif_result_dataset_id</code>.
     */
    public Integer getHifResultDatasetId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.valuation_result_dataset.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>data.valuation_result_dataset.variable_dataset_id</code>.
     */
    public void setVariableDatasetId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>data.valuation_result_dataset.variable_dataset_id</code>.
     */
    public Integer getVariableDatasetId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.valuation_result_dataset.task_log</code>.
     */
    public void setTaskLog(JSON value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.task_log</code>.
     */
    public JSON getTaskLog() {
        return (JSON) get(5);
    }

    /**
     * Setter for <code>data.valuation_result_dataset.user_id</code>.
     */
    public void setUserId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.user_id</code>.
     */
    public String getUserId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>data.valuation_result_dataset.sharing_scope</code>.
     */
    public void setSharingScope(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.sharing_scope</code>.
     */
    public Short getSharingScope() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>data.valuation_result_dataset.grid_definition_id</code>.
     */
    public void setGridDefinitionId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.valuation_result_dataset.grid_definition_id</code>.
     */
    public Integer getGridDefinitionId() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, Integer, String, Integer, JSON, String, Short, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, Integer, String, Integer, JSON, String, Short, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.ID;
    }

    @Override
    public Field<String> field2() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.TASK_UUID;
    }

    @Override
    public Field<Integer> field3() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.HIF_RESULT_DATASET_ID;
    }

    @Override
    public Field<String> field4() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.NAME;
    }

    @Override
    public Field<Integer> field5() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.VARIABLE_DATASET_ID;
    }

    @Override
    public Field<JSON> field6() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.TASK_LOG;
    }

    @Override
    public Field<String> field7() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.USER_ID;
    }

    @Override
    public Field<Short> field8() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.SHARING_SCOPE;
    }

    @Override
    public Field<Integer> field9() {
        return ValuationResultDataset.VALUATION_RESULT_DATASET.GRID_DEFINITION_ID;
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
    public Integer component3() {
        return getHifResultDatasetId();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public Integer component5() {
        return getVariableDatasetId();
    }

    @Override
    public JSON component6() {
        return getTaskLog();
    }

    @Override
    public String component7() {
        return getUserId();
    }

    @Override
    public Short component8() {
        return getSharingScope();
    }

    @Override
    public Integer component9() {
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
    public Integer value3() {
        return getHifResultDatasetId();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public Integer value5() {
        return getVariableDatasetId();
    }

    @Override
    public JSON value6() {
        return getTaskLog();
    }

    @Override
    public String value7() {
        return getUserId();
    }

    @Override
    public Short value8() {
        return getSharingScope();
    }

    @Override
    public Integer value9() {
        return getGridDefinitionId();
    }

    @Override
    public ValuationResultDatasetRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value2(String value) {
        setTaskUuid(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value3(Integer value) {
        setHifResultDatasetId(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value5(Integer value) {
        setVariableDatasetId(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value6(JSON value) {
        setTaskLog(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value7(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value8(Short value) {
        setSharingScope(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord value9(Integer value) {
        setGridDefinitionId(value);
        return this;
    }

    @Override
    public ValuationResultDatasetRecord values(Integer value1, String value2, Integer value3, String value4, Integer value5, JSON value6, String value7, Short value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ValuationResultDatasetRecord
     */
    public ValuationResultDatasetRecord() {
        super(ValuationResultDataset.VALUATION_RESULT_DATASET);
    }

    /**
     * Create a detached, initialised ValuationResultDatasetRecord
     */
    public ValuationResultDatasetRecord(Integer id, String taskUuid, Integer hifResultDatasetId, String name, Integer variableDatasetId, JSON taskLog, String userId, Short sharingScope, Integer gridDefinitionId) {
        super(ValuationResultDataset.VALUATION_RESULT_DATASET);

        setId(id);
        setTaskUuid(taskUuid);
        setHifResultDatasetId(hifResultDatasetId);
        setName(name);
        setVariableDatasetId(variableDatasetId);
        setTaskLog(taskLog);
        setUserId(userId);
        setSharingScope(sharingScope);
        setGridDefinitionId(gridDefinitionId);
    }
}
