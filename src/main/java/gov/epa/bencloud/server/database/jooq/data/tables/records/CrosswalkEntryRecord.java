/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.CrosswalkEntry;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CrosswalkEntryRecord extends TableRecordImpl<CrosswalkEntryRecord> implements Record8<Integer, Integer, Integer, Long, Integer, Integer, Long, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.crosswalk_entry.crosswalk_id</code>.
     */
    public void setCrosswalkId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.crosswalk_id</code>.
     */
    public Integer getCrosswalkId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.crosswalk_entry.source_col</code>.
     */
    public void setSourceCol(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.source_col</code>.
     */
    public Integer getSourceCol() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.crosswalk_entry.source_row</code>.
     */
    public void setSourceRow(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.source_row</code>.
     */
    public Integer getSourceRow() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.crosswalk_entry.source_grid_cell_id</code>.
     */
    public void setSourceGridCellId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.source_grid_cell_id</code>.
     */
    public Long getSourceGridCellId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>data.crosswalk_entry.target_col</code>.
     */
    public void setTargetCol(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.target_col</code>.
     */
    public Integer getTargetCol() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.crosswalk_entry.target_row</code>.
     */
    public void setTargetRow(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.target_row</code>.
     */
    public Integer getTargetRow() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>data.crosswalk_entry.target_grid_cell_id</code>.
     */
    public void setTargetGridCellId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.target_grid_cell_id</code>.
     */
    public Long getTargetGridCellId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>data.crosswalk_entry.percentage</code>.
     */
    public void setPercentage(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.crosswalk_entry.percentage</code>.
     */
    public Double getPercentage() {
        return (Double) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Long, Integer, Integer, Long, Double> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Integer, Integer, Integer, Long, Integer, Integer, Long, Double> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return CrosswalkEntry.CROSSWALK_ENTRY.CROSSWALK_ID;
    }

    @Override
    public Field<Integer> field2() {
        return CrosswalkEntry.CROSSWALK_ENTRY.SOURCE_COL;
    }

    @Override
    public Field<Integer> field3() {
        return CrosswalkEntry.CROSSWALK_ENTRY.SOURCE_ROW;
    }

    @Override
    public Field<Long> field4() {
        return CrosswalkEntry.CROSSWALK_ENTRY.SOURCE_GRID_CELL_ID;
    }

    @Override
    public Field<Integer> field5() {
        return CrosswalkEntry.CROSSWALK_ENTRY.TARGET_COL;
    }

    @Override
    public Field<Integer> field6() {
        return CrosswalkEntry.CROSSWALK_ENTRY.TARGET_ROW;
    }

    @Override
    public Field<Long> field7() {
        return CrosswalkEntry.CROSSWALK_ENTRY.TARGET_GRID_CELL_ID;
    }

    @Override
    public Field<Double> field8() {
        return CrosswalkEntry.CROSSWALK_ENTRY.PERCENTAGE;
    }

    @Override
    public Integer component1() {
        return getCrosswalkId();
    }

    @Override
    public Integer component2() {
        return getSourceCol();
    }

    @Override
    public Integer component3() {
        return getSourceRow();
    }

    @Override
    public Long component4() {
        return getSourceGridCellId();
    }

    @Override
    public Integer component5() {
        return getTargetCol();
    }

    @Override
    public Integer component6() {
        return getTargetRow();
    }

    @Override
    public Long component7() {
        return getTargetGridCellId();
    }

    @Override
    public Double component8() {
        return getPercentage();
    }

    @Override
    public Integer value1() {
        return getCrosswalkId();
    }

    @Override
    public Integer value2() {
        return getSourceCol();
    }

    @Override
    public Integer value3() {
        return getSourceRow();
    }

    @Override
    public Long value4() {
        return getSourceGridCellId();
    }

    @Override
    public Integer value5() {
        return getTargetCol();
    }

    @Override
    public Integer value6() {
        return getTargetRow();
    }

    @Override
    public Long value7() {
        return getTargetGridCellId();
    }

    @Override
    public Double value8() {
        return getPercentage();
    }

    @Override
    public CrosswalkEntryRecord value1(Integer value) {
        setCrosswalkId(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value2(Integer value) {
        setSourceCol(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value3(Integer value) {
        setSourceRow(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value4(Long value) {
        setSourceGridCellId(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value5(Integer value) {
        setTargetCol(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value6(Integer value) {
        setTargetRow(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value7(Long value) {
        setTargetGridCellId(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord value8(Double value) {
        setPercentage(value);
        return this;
    }

    @Override
    public CrosswalkEntryRecord values(Integer value1, Integer value2, Integer value3, Long value4, Integer value5, Integer value6, Long value7, Double value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CrosswalkEntryRecord
     */
    public CrosswalkEntryRecord() {
        super(CrosswalkEntry.CROSSWALK_ENTRY);
    }

    /**
     * Create a detached, initialised CrosswalkEntryRecord
     */
    public CrosswalkEntryRecord(Integer crosswalkId, Integer sourceCol, Integer sourceRow, Long sourceGridCellId, Integer targetCol, Integer targetRow, Long targetGridCellId, Double percentage) {
        super(CrosswalkEntry.CROSSWALK_ENTRY);

        setCrosswalkId(crosswalkId);
        setSourceCol(sourceCol);
        setSourceRow(sourceRow);
        setSourceGridCellId(sourceGridCellId);
        setTargetCol(targetCol);
        setTargetRow(targetRow);
        setTargetGridCellId(targetGridCellId);
        setPercentage(percentage);
    }
}
