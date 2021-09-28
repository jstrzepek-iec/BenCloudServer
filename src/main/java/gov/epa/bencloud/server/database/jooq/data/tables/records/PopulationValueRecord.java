/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.PopulationValue;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationValueRecord extends TableRecordImpl<PopulationValueRecord> implements Record3<Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.population_value.pop_entry_id</code>.
     */
    public void setPopEntryId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.population_value.pop_entry_id</code>.
     */
    public Integer getPopEntryId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.population_value.grid_cell_id</code>.
     */
    public void setGridCellId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.population_value.grid_cell_id</code>.
     */
    public Integer getGridCellId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.population_value.pop_value</code>.
     */
    public void setPopValue(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.population_value.pop_value</code>.
     */
    public BigDecimal getPopValue() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PopulationValue.POPULATION_VALUE.POP_ENTRY_ID;
    }

    @Override
    public Field<Integer> field2() {
        return PopulationValue.POPULATION_VALUE.GRID_CELL_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return PopulationValue.POPULATION_VALUE.POP_VALUE;
    }

    @Override
    public Integer component1() {
        return getPopEntryId();
    }

    @Override
    public Integer component2() {
        return getGridCellId();
    }

    @Override
    public BigDecimal component3() {
        return getPopValue();
    }

    @Override
    public Integer value1() {
        return getPopEntryId();
    }

    @Override
    public Integer value2() {
        return getGridCellId();
    }

    @Override
    public BigDecimal value3() {
        return getPopValue();
    }

    @Override
    public PopulationValueRecord value1(Integer value) {
        setPopEntryId(value);
        return this;
    }

    @Override
    public PopulationValueRecord value2(Integer value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public PopulationValueRecord value3(BigDecimal value) {
        setPopValue(value);
        return this;
    }

    @Override
    public PopulationValueRecord values(Integer value1, Integer value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PopulationValueRecord
     */
    public PopulationValueRecord() {
        super(PopulationValue.POPULATION_VALUE);
    }

    /**
     * Create a detached, initialised PopulationValueRecord
     */
    public PopulationValueRecord(Integer popEntryId, Integer gridCellId, BigDecimal popValue) {
        super(PopulationValue.POPULATION_VALUE);

        setPopEntryId(popEntryId);
        setGridCellId(gridCellId);
        setPopValue(popValue);
    }
}
