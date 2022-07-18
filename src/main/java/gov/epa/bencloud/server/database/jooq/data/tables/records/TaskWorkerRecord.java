/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.TaskWorker;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskWorkerRecord extends UpdatableRecordImpl<TaskWorkerRecord> implements Record4<Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.task_worker.task_id</code>.
     */
    public void setTaskId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.task_worker.task_id</code>.
     */
    public Integer getTaskId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.task_worker.task_worker_uuid</code>.
     */
    public void setTaskWorkerUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.task_worker.task_worker_uuid</code>.
     */
    public String getTaskWorkerUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.task_worker.task_uuid</code>.
     */
    public void setTaskUuid(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.task_worker.task_uuid</code>.
     */
    public String getTaskUuid() {
        return (String) get(2);
    }

    /**
     * Setter for <code>data.task_worker.last_heartbeat_date</code>.
     */
    public void setLastHeartbeatDate(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.task_worker.last_heartbeat_date</code>.
     */
    public LocalDateTime getLastHeartbeatDate() {
        return (LocalDateTime) get(3);
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
    public Row4<Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TaskWorker.TASK_WORKER.TASK_ID;
    }

    @Override
    public Field<String> field2() {
        return TaskWorker.TASK_WORKER.TASK_WORKER_UUID;
    }

    @Override
    public Field<String> field3() {
        return TaskWorker.TASK_WORKER.TASK_UUID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return TaskWorker.TASK_WORKER.LAST_HEARTBEAT_DATE;
    }

    @Override
    public Integer component1() {
        return getTaskId();
    }

    @Override
    public String component2() {
        return getTaskWorkerUuid();
    }

    @Override
    public String component3() {
        return getTaskUuid();
    }

    @Override
    public LocalDateTime component4() {
        return getLastHeartbeatDate();
    }

    @Override
    public Integer value1() {
        return getTaskId();
    }

    @Override
    public String value2() {
        return getTaskWorkerUuid();
    }

    @Override
    public String value3() {
        return getTaskUuid();
    }

    @Override
    public LocalDateTime value4() {
        return getLastHeartbeatDate();
    }

    @Override
    public TaskWorkerRecord value1(Integer value) {
        setTaskId(value);
        return this;
    }

    @Override
    public TaskWorkerRecord value2(String value) {
        setTaskWorkerUuid(value);
        return this;
    }

    @Override
    public TaskWorkerRecord value3(String value) {
        setTaskUuid(value);
        return this;
    }

    @Override
    public TaskWorkerRecord value4(LocalDateTime value) {
        setLastHeartbeatDate(value);
        return this;
    }

    @Override
    public TaskWorkerRecord values(Integer value1, String value2, String value3, LocalDateTime value4) {
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
     * Create a detached TaskWorkerRecord
     */
    public TaskWorkerRecord() {
        super(TaskWorker.TASK_WORKER);
    }

    /**
     * Create a detached, initialised TaskWorkerRecord
     */
    public TaskWorkerRecord(Integer taskId, String taskWorkerUuid, String taskUuid, LocalDateTime lastHeartbeatDate) {
        super(TaskWorker.TASK_WORKER);

        setTaskId(taskId);
        setTaskWorkerUuid(taskWorkerUuid);
        setTaskUuid(taskUuid);
        setLastHeartbeatDate(lastHeartbeatDate);
    }
}
