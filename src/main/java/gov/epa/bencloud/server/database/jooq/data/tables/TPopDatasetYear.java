/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.TPopDatasetYearRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class TPopDatasetYear extends TableImpl<TPopDatasetYearRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.t_pop_dataset_year</code>
     */
    public static final TPopDatasetYear T_POP_DATASET_YEAR = new TPopDatasetYear();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPopDatasetYearRecord> getRecordType() {
        return TPopDatasetYearRecord.class;
    }

    /**
     * The column <code>data.t_pop_dataset_year.pop_dataset_id</code>.
     */
    public final TableField<TPopDatasetYearRecord, Integer> POP_DATASET_ID = createField(DSL.name("pop_dataset_id"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>data.t_pop_dataset_year.pop_year</code>.
     */
    public final TableField<TPopDatasetYearRecord, Short> POP_YEAR = createField(DSL.name("pop_year"), SQLDataType.SMALLINT.nullable(false), this, "");

    private TPopDatasetYear(Name alias, Table<TPopDatasetYearRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPopDatasetYear(Name alias, Table<TPopDatasetYearRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.t_pop_dataset_year</code> table reference
     */
    public TPopDatasetYear(String alias) {
        this(DSL.name(alias), T_POP_DATASET_YEAR);
    }

    /**
     * Create an aliased <code>data.t_pop_dataset_year</code> table reference
     */
    public TPopDatasetYear(Name alias) {
        this(alias, T_POP_DATASET_YEAR);
    }

    /**
     * Create a <code>data.t_pop_dataset_year</code> table reference
     */
    public TPopDatasetYear() {
        this(DSL.name("t_pop_dataset_year"), null);
    }

    public <O extends Record> TPopDatasetYear(Table<O> child, ForeignKey<O, TPopDatasetYearRecord> key) {
        super(child, key, T_POP_DATASET_YEAR);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public TPopDatasetYear as(String alias) {
        return new TPopDatasetYear(DSL.name(alias), this);
    }

    @Override
    public TPopDatasetYear as(Name alias) {
        return new TPopDatasetYear(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPopDatasetYear rename(String name) {
        return new TPopDatasetYear(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPopDatasetYear rename(Name name) {
        return new TPopDatasetYear(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Short> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
