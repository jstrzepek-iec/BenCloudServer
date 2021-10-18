/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.TaskComplete;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskCompleteRecord extends UpdatableRecordImpl<TaskCompleteRecord> implements Record15<Long, String, String, Integer, String, String, String, String, String, Boolean, String, LocalDateTime, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.task_complete.task_id</code>.
     */
    public void setTaskId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.task_complete.task_id</code>.
     */
    public Long getTaskId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>data.task_complete.task_uuid</code>.
     */
    public void setTaskUuid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.task_complete.task_uuid</code>.
     */
    public String getTaskUuid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>data.task_complete.task_user_identifier</code>.
     */
    public void setTaskUserIdentifier(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.task_complete.task_user_identifier</code>.
     */
    public String getTaskUserIdentifier() {
        return (String) get(2);
    }

    /**
     * Setter for <code>data.task_complete.task_priority</code>.
     */
    public void setTaskPriority(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.task_complete.task_priority</code>.
     */
    public Integer getTaskPriority() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.task_complete.task_name</code>.
     */
    public void setTaskName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.task_complete.task_name</code>.
     */
    public String getTaskName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>data.task_complete.task_description</code>.
     */
    public void setTaskDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.task_complete.task_description</code>.
     */
    public String getTaskDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>data.task_complete.task_type</code>.
     */
    public void setTaskType(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.task_complete.task_type</code>.
     */
    public String getTaskType() {
        return (String) get(6);
    }

    /**
     * Setter for <code>data.task_complete.task_parameters</code>.
     */
    public void setTaskParameters(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.task_complete.task_parameters</code>.
     */
    public String getTaskParameters() {
        return (String) get(7);
    }

    /**
     * Setter for <code>data.task_complete.task_results</code>.
     */
    public void setTaskResults(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.task_complete.task_results</code>.
     */
    public String getTaskResults() {
        return (String) get(8);
    }

    /**
     * Setter for <code>data.task_complete.task_successful</code>.
     */
    public void setTaskSuccessful(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.task_complete.task_successful</code>.
     */
    public Boolean getTaskSuccessful() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>data.task_complete.task_complete_message</code>.
     */
    public void setTaskCompleteMessage(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.task_complete.task_complete_message</code>.
     */
    public String getTaskCompleteMessage() {
        return (String) get(10);
    }

    /**
     * Setter for <code>data.task_complete.task_submitted_date</code>.
     */
    public void setTaskSubmittedDate(LocalDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>data.task_complete.task_submitted_date</code>.
     */
    public LocalDateTime getTaskSubmittedDate() {
        return (LocalDateTime) get(11);
    }

    /**
     * Setter for <code>data.task_complete.task_started_date</code>.
     */
    public void setTaskStartedDate(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.task_complete.task_started_date</code>.
     */
    public LocalDateTime getTaskStartedDate() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>data.task_complete.task_completed_date</code>.
     */
    public void setTaskCompletedDate(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>data.task_complete.task_completed_date</code>.
     */
    public LocalDateTime getTaskCompletedDate() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>data.task_complete.task_parent_uuid</code>.
     */
    public void setTaskParentUuid(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>data.task_complete.task_parent_uuid</code>.
     */
    public String getTaskParentUuid() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, String, String, Integer, String, String, String, String, String, Boolean, String, LocalDateTime, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Long, String, String, Integer, String, String, String, String, String, Boolean, String, LocalDateTime, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TaskComplete.TASK_COMPLETE.TASK_ID;
    }

    @Override
    public Field<String> field2() {
        return TaskComplete.TASK_COMPLETE.TASK_UUID;
    }

    @Override
    public Field<String> field3() {
        return TaskComplete.TASK_COMPLETE.TASK_USER_IDENTIFIER;
    }

    @Override
    public Field<Integer> field4() {
        return TaskComplete.TASK_COMPLETE.TASK_PRIORITY;
    }

    @Override
    public Field<String> field5() {
        return TaskComplete.TASK_COMPLETE.TASK_NAME;
    }

    @Override
    public Field<String> field6() {
        return TaskComplete.TASK_COMPLETE.TASK_DESCRIPTION;
    }

    @Override
    public Field<String> field7() {
        return TaskComplete.TASK_COMPLETE.TASK_TYPE;
    }

    @Override
    public Field<String> field8() {
        return TaskComplete.TASK_COMPLETE.TASK_PARAMETERS;
    }

    @Override
    public Field<String> field9() {
        return TaskComplete.TASK_COMPLETE.TASK_RESULTS;
    }

    @Override
    public Field<Boolean> field10() {
        return TaskComplete.TASK_COMPLETE.TASK_SUCCESSFUL;
    }

    @Override
    public Field<String> field11() {
        return TaskComplete.TASK_COMPLETE.TASK_COMPLETE_MESSAGE;
    }

    @Override
    public Field<LocalDateTime> field12() {
        return TaskComplete.TASK_COMPLETE.TASK_SUBMITTED_DATE;
    }

    @Override
    public Field<LocalDateTime> field13() {
        return TaskComplete.TASK_COMPLETE.TASK_STARTED_DATE;
    }

    @Override
    public Field<LocalDateTime> field14() {
        return TaskComplete.TASK_COMPLETE.TASK_COMPLETED_DATE;
    }

    @Override
    public Field<String> field15() {
        return TaskComplete.TASK_COMPLETE.TASK_PARENT_UUID;
    }

    @Override
    public Long component1() {
        return getTaskId();
    }

    @Override
    public String component2() {
        return getTaskUuid();
    }

    @Override
    public String component3() {
        return getTaskUserIdentifier();
    }

    @Override
    public Integer component4() {
        return getTaskPriority();
    }

    @Override
    public String component5() {
        return getTaskName();
    }

    @Override
    public String component6() {
        return getTaskDescription();
    }

    @Override
    public String component7() {
        return getTaskType();
    }

    @Override
    public String component8() {
        return getTaskParameters();
    }

    @Override
    public String component9() {
        return getTaskResults();
    }

    @Override
    public Boolean component10() {
        return getTaskSuccessful();
    }

    @Override
    public String component11() {
        return getTaskCompleteMessage();
    }

    @Override
    public LocalDateTime component12() {
        return getTaskSubmittedDate();
    }

    @Override
    public LocalDateTime component13() {
        return getTaskStartedDate();
    }

    @Override
    public LocalDateTime component14() {
        return getTaskCompletedDate();
    }

    @Override
    public String component15() {
        return getTaskParentUuid();
    }

    @Override
    public Long value1() {
        return getTaskId();
    }

    @Override
    public String value2() {
        return getTaskUuid();
    }

    @Override
    public String value3() {
        return getTaskUserIdentifier();
    }

    @Override
    public Integer value4() {
        return getTaskPriority();
    }

    @Override
    public String value5() {
        return getTaskName();
    }

    @Override
    public String value6() {
        return getTaskDescription();
    }

    @Override
    public String value7() {
        return getTaskType();
    }

    @Override
    public String value8() {
        return getTaskParameters();
    }

    @Override
    public String value9() {
        return getTaskResults();
    }

    @Override
    public Boolean value10() {
        return getTaskSuccessful();
    }

    @Override
    public String value11() {
        return getTaskCompleteMessage();
    }

    @Override
    public LocalDateTime value12() {
        return getTaskSubmittedDate();
    }

    @Override
    public LocalDateTime value13() {
        return getTaskStartedDate();
    }

    @Override
    public LocalDateTime value14() {
        return getTaskCompletedDate();
    }

    @Override
    public String value15() {
        return getTaskParentUuid();
    }

    @Override
    public TaskCompleteRecord value1(Long value) {
        setTaskId(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value2(String value) {
        setTaskUuid(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value3(String value) {
        setTaskUserIdentifier(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value4(Integer value) {
        setTaskPriority(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value5(String value) {
        setTaskName(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value6(String value) {
        setTaskDescription(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value7(String value) {
        setTaskType(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value8(String value) {
        setTaskParameters(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value9(String value) {
        setTaskResults(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value10(Boolean value) {
        setTaskSuccessful(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value11(String value) {
        setTaskCompleteMessage(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value12(LocalDateTime value) {
        setTaskSubmittedDate(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value13(LocalDateTime value) {
        setTaskStartedDate(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value14(LocalDateTime value) {
        setTaskCompletedDate(value);
        return this;
    }

    @Override
    public TaskCompleteRecord value15(String value) {
        setTaskParentUuid(value);
        return this;
    }

    @Override
    public TaskCompleteRecord values(Long value1, String value2, String value3, Integer value4, String value5, String value6, String value7, String value8, String value9, Boolean value10, String value11, LocalDateTime value12, LocalDateTime value13, LocalDateTime value14, String value15) {
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
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskCompleteRecord
     */
    public TaskCompleteRecord() {
        super(TaskComplete.TASK_COMPLETE);
    }

    /**
     * Create a detached, initialised TaskCompleteRecord
     */
    public TaskCompleteRecord(Long taskId, String taskUuid, String taskUserIdentifier, Integer taskPriority, String taskName, String taskDescription, String taskType, String taskParameters, String taskResults, Boolean taskSuccessful, String taskCompleteMessage, LocalDateTime taskSubmittedDate, LocalDateTime taskStartedDate, LocalDateTime taskCompletedDate, String taskParentUuid) {
        super(TaskComplete.TASK_COMPLETE);

        setTaskId(taskId);
        setTaskUuid(taskUuid);
        setTaskUserIdentifier(taskUserIdentifier);
        setTaskPriority(taskPriority);
        setTaskName(taskName);
        setTaskDescription(taskDescription);
        setTaskType(taskType);
        setTaskParameters(taskParameters);
        setTaskResults(taskResults);
        setTaskSuccessful(taskSuccessful);
        setTaskCompleteMessage(taskCompleteMessage);
        setTaskSubmittedDate(taskSubmittedDate);
        setTaskStartedDate(taskStartedDate);
        setTaskCompletedDate(taskCompletedDate);
        setTaskParentUuid(taskParentUuid);
    }
}
