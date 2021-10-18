/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.InflationEntryRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class InflationEntry extends TableImpl<InflationEntryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.inflation_entry</code>
     */
    public static final InflationEntry INFLATION_ENTRY = new InflationEntry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InflationEntryRecord> getRecordType() {
        return InflationEntryRecord.class;
    }

    /**
     * The column <code>data.inflation_entry.inflation_dataset_id</code>.
     */
    public final TableField<InflationEntryRecord, Integer> INFLATION_DATASET_ID = createField(DSL.name("inflation_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.inflation_entry.entry_year</code>.
     */
    public final TableField<InflationEntryRecord, Integer> ENTRY_YEAR = createField(DSL.name("entry_year"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.inflation_entry.all_goods_index</code>.
     */
    public final TableField<InflationEntryRecord, Double> ALL_GOODS_INDEX = createField(DSL.name("all_goods_index"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.inflation_entry.medical_cost_index</code>.
     */
    public final TableField<InflationEntryRecord, Double> MEDICAL_COST_INDEX = createField(DSL.name("medical_cost_index"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.inflation_entry.wage_index</code>.
     */
    public final TableField<InflationEntryRecord, Double> WAGE_INDEX = createField(DSL.name("wage_index"), SQLDataType.DOUBLE, this, "");

    private InflationEntry(Name alias, Table<InflationEntryRecord> aliased) {
        this(alias, aliased, null);
    }

    private InflationEntry(Name alias, Table<InflationEntryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.inflation_entry</code> table reference
     */
    public InflationEntry(String alias) {
        this(DSL.name(alias), INFLATION_ENTRY);
    }

    /**
     * Create an aliased <code>data.inflation_entry</code> table reference
     */
    public InflationEntry(Name alias) {
        this(alias, INFLATION_ENTRY);
    }

    /**
     * Create a <code>data.inflation_entry</code> table reference
     */
    public InflationEntry() {
        this(DSL.name("inflation_entry"), null);
    }

    public <O extends Record> InflationEntry(Table<O> child, ForeignKey<O, InflationEntryRecord> key) {
        super(child, key, INFLATION_ENTRY);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public InflationEntry as(String alias) {
        return new InflationEntry(DSL.name(alias), this);
    }

    @Override
    public InflationEntry as(Name alias) {
        return new InflationEntry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InflationEntry rename(String name) {
        return new InflationEntry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InflationEntry rename(Name name) {
        return new InflationEntry(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, Integer, Double, Double, Double> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}