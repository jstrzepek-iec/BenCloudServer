/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Indexes;
import gov.epa.bencloud.server.database.jooq.data.tables.records.PopulationValueRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationValue extends TableImpl<PopulationValueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.population_value</code>
     */
    public static final PopulationValue POPULATION_VALUE = new PopulationValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PopulationValueRecord> getRecordType() {
        return PopulationValueRecord.class;
    }

    /**
     * The column <code>data.population_value.pop_entry_id</code>.
     */
    public final TableField<PopulationValueRecord, Integer> POP_ENTRY_ID = createField(DSL.name("pop_entry_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.population_value.grid_cell_id</code>.
     */
    public final TableField<PopulationValueRecord, Integer> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.population_value.pop_value</code>.
     */
    public final TableField<PopulationValueRecord, Double> POP_VALUE = createField(DSL.name("pop_value"), SQLDataType.DOUBLE, this, "");

    private PopulationValue(Name alias, Table<PopulationValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private PopulationValue(Name alias, Table<PopulationValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.population_value</code> table reference
     */
    public PopulationValue(String alias) {
        this(DSL.name(alias), POPULATION_VALUE);
    }

    /**
     * Create an aliased <code>data.population_value</code> table reference
     */
    public PopulationValue(Name alias) {
        this(alias, POPULATION_VALUE);
    }

    /**
     * Create a <code>data.population_value</code> table reference
     */
    public PopulationValue() {
        this(DSL.name("population_value"), null);
    }

    public <O extends Record> PopulationValue(Table<O> child, ForeignKey<O, PopulationValueRecord> key) {
        super(child, key, POPULATION_VALUE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.POPULATION_VALUE_POP_ENTRY_ID_IDX);
    }

    @Override
    public PopulationValue as(String alias) {
        return new PopulationValue(DSL.name(alias), this);
    }

    @Override
    public PopulationValue as(Name alias) {
        return new PopulationValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PopulationValue rename(String name) {
        return new PopulationValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PopulationValue rename(Name name) {
        return new PopulationValue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
