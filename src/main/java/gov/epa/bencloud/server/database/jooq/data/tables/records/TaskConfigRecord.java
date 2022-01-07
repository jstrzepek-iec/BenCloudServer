/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.TaskConfig;

import org.jooq.Field;
import org.jooq.JSON;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskConfigRecord extends UpdatableRecordImpl<TaskConfigRecord> implements Record4<Integer, String, String, JSON> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.task_config.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.task_config.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.task_config.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.task_config.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.task_config.type</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.task_config.type</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>data.task_config.parameters</code>.
     */
    public void setParameters(JSON value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.task_config.parameters</code>.
     */
    public JSON getParameters() {
        return (JSON) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, JSON> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, JSON> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TaskConfig.TASK_CONFIG.ID;
    }

    @Override
    public Field<String> field2() {
        return TaskConfig.TASK_CONFIG.NAME;
    }

    @Override
    public Field<String> field3() {
        return TaskConfig.TASK_CONFIG.TYPE;
    }

    @Override
    public Field<JSON> field4() {
        return TaskConfig.TASK_CONFIG.PARAMETERS;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getType();
    }

    @Override
    public JSON component4() {
        return getParameters();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getType();
    }

    @Override
    public JSON value4() {
        return getParameters();
    }

    @Override
    public TaskConfigRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TaskConfigRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TaskConfigRecord value3(String value) {
        setType(value);
        return this;
    }

    @Override
    public TaskConfigRecord value4(JSON value) {
        setParameters(value);
        return this;
    }

    @Override
    public TaskConfigRecord values(Integer value1, String value2, String value3, JSON value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskConfigRecord
     */
    public TaskConfigRecord() {
        super(TaskConfig.TASK_CONFIG);
    }

    /**
     * Create a detached, initialised TaskConfigRecord
     */
    public TaskConfigRecord(Integer id, String name, String type, JSON parameters) {
        super(TaskConfig.TASK_CONFIG);

        setId(id);
        setName(name);
        setType(type);
        setParameters(parameters);
    }
}
