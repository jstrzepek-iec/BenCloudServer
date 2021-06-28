/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.tables;


import gov.epa.bencloud.server.database.jooq.Data;
import gov.epa.bencloud.server.database.jooq.Keys;
import gov.epa.bencloud.server.database.jooq.tables.records.VariableDatasetRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class VariableDataset extends TableImpl<VariableDatasetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.variable_dataset</code>
     */
    public static final VariableDataset VARIABLE_DATASET = new VariableDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VariableDatasetRecord> getRecordType() {
        return VariableDatasetRecord.class;
    }

    /**
     * The column <code>data.variable_dataset.id</code>.
     */
    public final TableField<VariableDatasetRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.variable_dataset.name</code>.
     */
    public final TableField<VariableDatasetRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    private VariableDataset(Name alias, Table<VariableDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private VariableDataset(Name alias, Table<VariableDatasetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.variable_dataset</code> table reference
     */
    public VariableDataset(String alias) {
        this(DSL.name(alias), VARIABLE_DATASET);
    }

    /**
     * Create an aliased <code>data.variable_dataset</code> table reference
     */
    public VariableDataset(Name alias) {
        this(alias, VARIABLE_DATASET);
    }

    /**
     * Create a <code>data.variable_dataset</code> table reference
     */
    public VariableDataset() {
        this(DSL.name("variable_dataset"), null);
    }

    public <O extends Record> VariableDataset(Table<O> child, ForeignKey<O, VariableDatasetRecord> key) {
        super(child, key, VARIABLE_DATASET);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<VariableDatasetRecord, Integer> getIdentity() {
        return (Identity<VariableDatasetRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<VariableDatasetRecord> getPrimaryKey() {
        return Keys.VARIABLE_DATASET_PKEY;
    }

    @Override
    public List<UniqueKey<VariableDatasetRecord>> getKeys() {
        return Arrays.<UniqueKey<VariableDatasetRecord>>asList(Keys.VARIABLE_DATASET_PKEY);
    }

    @Override
    public VariableDataset as(String alias) {
        return new VariableDataset(DSL.name(alias), this);
    }

    @Override
    public VariableDataset as(Name alias) {
        return new VariableDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VariableDataset rename(String name) {
        return new VariableDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VariableDataset rename(Name name) {
        return new VariableDataset(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}