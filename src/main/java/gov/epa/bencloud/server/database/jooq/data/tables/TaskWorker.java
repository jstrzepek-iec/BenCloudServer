/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Indexes;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.TaskWorkerRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class TaskWorker extends TableImpl<TaskWorkerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.task_worker</code>
     */
    public static final TaskWorker TASK_WORKER = new TaskWorker();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TaskWorkerRecord> getRecordType() {
        return TaskWorkerRecord.class;
    }

    /**
     * The column <code>data.task_worker.task_id</code>.
     */
    public final TableField<TaskWorkerRecord, Long> TASK_ID = createField(DSL.name("task_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.task_worker.task_worker_uuid</code>.
     */
    public final TableField<TaskWorkerRecord, String> TASK_WORKER_UUID = createField(DSL.name("task_worker_uuid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_worker.task_uuid</code>.
     */
    public final TableField<TaskWorkerRecord, String> TASK_UUID = createField(DSL.name("task_uuid"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.task_worker.last_heartbeat_date</code>.
     */
    public final TableField<TaskWorkerRecord, LocalDateTime> LAST_HEARTBEAT_DATE = createField(DSL.name("last_heartbeat_date"), SQLDataType.LOCALDATETIME(6), this, "");

    private TaskWorker(Name alias, Table<TaskWorkerRecord> aliased) {
        this(alias, aliased, null);
    }

    private TaskWorker(Name alias, Table<TaskWorkerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.task_worker</code> table reference
     */
    public TaskWorker(String alias) {
        this(DSL.name(alias), TASK_WORKER);
    }

    /**
     * Create an aliased <code>data.task_worker</code> table reference
     */
    public TaskWorker(Name alias) {
        this(alias, TASK_WORKER);
    }

    /**
     * Create a <code>data.task_worker</code> table reference
     */
    public TaskWorker() {
        this(DSL.name("task_worker"), null);
    }

    public <O extends Record> TaskWorker(Table<O> child, ForeignKey<O, TaskWorkerRecord> key) {
        super(child, key, TASK_WORKER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.TASK_WORKER_ON_TASK_UUID, Indexes.TASK_WORKER_ON_UUID);
    }

    @Override
    public Identity<TaskWorkerRecord, Long> getIdentity() {
        return (Identity<TaskWorkerRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TaskWorkerRecord> getPrimaryKey() {
        return Keys.TASK_WORKER_PKEY;
    }

    @Override
    public TaskWorker as(String alias) {
        return new TaskWorker(DSL.name(alias), this);
    }

    @Override
    public TaskWorker as(Name alias) {
        return new TaskWorker(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskWorker rename(String name) {
        return new TaskWorker(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TaskWorker rename(Name name) {
        return new TaskWorker(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
