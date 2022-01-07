/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Indexes;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.TaskQueueRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskQueue extends TableImpl<TaskQueueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.task_queue</code>
     */
    public static final TaskQueue TASK_QUEUE = new TaskQueue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskQueueRecord> getRecordType() {
        return TaskQueueRecord.class;
    }

    /**
     * The column <code>data.task_queue.task_id</code>.
     */
    public final TableField<TaskQueueRecord, Long> TASK_ID = createField(DSL.name("task_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.task_queue.task_user_identifier</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_USER_IDENTIFIER = createField(DSL.name("task_user_identifier"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_priority</code>.
     */
    public final TableField<TaskQueueRecord, Integer> TASK_PRIORITY = createField(DSL.name("task_priority"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.task_queue.task_uuid</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_UUID = createField(DSL.name("task_uuid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_name</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_NAME = createField(DSL.name("task_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_description</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_DESCRIPTION = createField(DSL.name("task_description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_type</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_TYPE = createField(DSL.name("task_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_parameters</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_PARAMETERS = createField(DSL.name("task_parameters"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_percentage</code>.
     */
    public final TableField<TaskQueueRecord, Integer> TASK_PERCENTAGE = createField(DSL.name("task_percentage"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.task_queue.task_message</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_MESSAGE = createField(DSL.name("task_message"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_queue.task_in_process</code>.
     */
    public final TableField<TaskQueueRecord, Boolean> TASK_IN_PROCESS = createField(DSL.name("task_in_process"), SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>data.task_queue.task_submitted_date</code>.
     */
    public final TableField<TaskQueueRecord, LocalDateTime> TASK_SUBMITTED_DATE = createField(DSL.name("task_submitted_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>data.task_queue.task_started_date</code>.
     */
    public final TableField<TaskQueueRecord, LocalDateTime> TASK_STARTED_DATE = createField(DSL.name("task_started_date"), SQLDataType.LOCALDATETIME(6), this, "");

    /**
     * The column <code>data.task_queue.task_parent_uuid</code>.
     */
    public final TableField<TaskQueueRecord, String> TASK_PARENT_UUID = createField(DSL.name("task_parent_uuid"), SQLDataType.CLOB, this, "");

    private TaskQueue(Name alias, Table<TaskQueueRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskQueue(Name alias, Table<TaskQueueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.task_queue</code> table reference
     */
    public TaskQueue(String alias) {
        this(DSL.name(alias), TASK_QUEUE);
    }

    /**
     * Create an aliased <code>data.task_queue</code> table reference
     */
    public TaskQueue(Name alias) {
        this(alias, TASK_QUEUE);
    }

    /**
     * Create a <code>data.task_queue</code> table reference
     */
    public TaskQueue() {
        this(DSL.name("task_queue"), null);
    }

    public <O extends Record> TaskQueue(Table<O> child, ForeignKey<O, TaskQueueRecord> key) {
        super(child, key, TASK_QUEUE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.TASK_QUEUE_ON_DATE, Indexes.TASK_QUEUE_ON_PRIORITY_SUBMITTED_DATE, Indexes.TASK_QUEUE_ON_UUID);
    }

    @Override
    public Identity<TaskQueueRecord, Long> getIdentity() {
        return (Identity<TaskQueueRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TaskQueueRecord> getPrimaryKey() {
        return Keys.TASK_QUEUE_PKEY;
    }

    @Override
    public TaskQueue as(String alias) {
        return new TaskQueue(DSL.name(alias), this);
    }

    @Override
    public TaskQueue as(Name alias) {
        return new TaskQueue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskQueue rename(String name) {
        return new TaskQueue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskQueue rename(Name name) {
        return new TaskQueue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, String, Integer, String, String, String, String, String, Integer, String, Boolean, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
