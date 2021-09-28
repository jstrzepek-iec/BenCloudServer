/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Indexes;
import gov.epa.bencloud.server.database.jooq.data.tables.records.CrosswalkEntryRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class CrosswalkEntry extends TableImpl<CrosswalkEntryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.crosswalk_entry</code>
     */
    public static final CrosswalkEntry CROSSWALK_ENTRY = new CrosswalkEntry();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CrosswalkEntryRecord> getRecordType() {
        return CrosswalkEntryRecord.class;
    }

    /**
     * The column <code>data.crosswalk_entry.crosswalk_id</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> CROSSWALK_ID = createField(DSL.name("crosswalk_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.source_col</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> SOURCE_COL = createField(DSL.name("source_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.source_row</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> SOURCE_ROW = createField(DSL.name("source_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.source_grid_cell_id</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> SOURCE_GRID_CELL_ID = createField(DSL.name("source_grid_cell_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.target_col</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> TARGET_COL = createField(DSL.name("target_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.target_row</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> TARGET_ROW = createField(DSL.name("target_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.target_grid_cell_id</code>.
     */
    public final TableField<CrosswalkEntryRecord, Integer> TARGET_GRID_CELL_ID = createField(DSL.name("target_grid_cell_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.crosswalk_entry.percentage</code>.
     */
    public final TableField<CrosswalkEntryRecord, BigDecimal> PERCENTAGE = createField(DSL.name("percentage"), SQLDataType.NUMERIC, this, "");

    private CrosswalkEntry(Name alias, Table<CrosswalkEntryRecord> aliased) {
        this(alias, aliased, null);
    }

    private CrosswalkEntry(Name alias, Table<CrosswalkEntryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.crosswalk_entry</code> table reference
     */
    public CrosswalkEntry(String alias) {
        this(DSL.name(alias), CROSSWALK_ENTRY);
    }

    /**
     * Create an aliased <code>data.crosswalk_entry</code> table reference
     */
    public CrosswalkEntry(Name alias) {
        this(alias, CROSSWALK_ENTRY);
    }

    /**
     * Create a <code>data.crosswalk_entry</code> table reference
     */
    public CrosswalkEntry() {
        this(DSL.name("crosswalk_entry"), null);
    }

    public <O extends Record> CrosswalkEntry(Table<O> child, ForeignKey<O, CrosswalkEntryRecord> key) {
        super(child, key, CROSSWALK_ENTRY);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CROSSWALK_ENTRY_CROSSWALK_ID_IDX);
    }

    @Override
    public CrosswalkEntry as(String alias) {
        return new CrosswalkEntry(DSL.name(alias), this);
    }

    @Override
    public CrosswalkEntry as(Name alias) {
        return new CrosswalkEntry(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CrosswalkEntry rename(String name) {
        return new CrosswalkEntry(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CrosswalkEntry rename(Name name) {
        return new CrosswalkEntry(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
