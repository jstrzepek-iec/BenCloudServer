/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.GetVariable;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetVariableRecord extends TableRecordImpl<GetVariableRecord> implements Record3<String, Integer, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.get_variable.variable_name</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.get_variable.variable_name</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>data.get_variable.grid_cell_id</code>.
     */
    public void setGridCellId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.get_variable.grid_cell_id</code>.
     */
    public Integer getGridCellId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.get_variable.value</code>.
     */
    public void setValue(Double value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.get_variable.value</code>.
     */
    public Double getValue() {
        return (Double) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Integer, Double> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return GetVariable.GET_VARIABLE.VARIABLE_NAME;
    }

    @Override
    public Field<Integer> field2() {
        return GetVariable.GET_VARIABLE.GRID_CELL_ID;
    }

    @Override
    public Field<Double> field3() {
        return GetVariable.GET_VARIABLE.VALUE;
    }

    @Override
    public String component1() {
        return getVariableName();
    }

    @Override
    public Integer component2() {
        return getGridCellId();
    }

    @Override
    public Double component3() {
        return getValue();
    }

    @Override
    public String value1() {
        return getVariableName();
    }

    @Override
    public Integer value2() {
        return getGridCellId();
    }

    @Override
    public Double value3() {
        return getValue();
    }

    @Override
    public GetVariableRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    @Override
    public GetVariableRecord value2(Integer value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public GetVariableRecord value3(Double value) {
        setValue(value);
        return this;
    }

    @Override
    public GetVariableRecord values(String value1, Integer value2, Double value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetVariableRecord
     */
    public GetVariableRecord() {
        super(GetVariable.GET_VARIABLE);
    }

    /**
     * Create a detached, initialised GetVariableRecord
     */
    public GetVariableRecord(String variableName, Integer gridCellId, Double value) {
        super(GetVariable.GET_VARIABLE);

        setVariableName(variableName);
        setGridCellId(gridCellId);
        setValue(value);
    }
}