/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.ValuationResultFunctionConfigRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ValuationResultFunctionConfig extends TableImpl<ValuationResultFunctionConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>data.valuation_result_function_config</code>
     */
    public static final ValuationResultFunctionConfig VALUATION_RESULT_FUNCTION_CONFIG = new ValuationResultFunctionConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ValuationResultFunctionConfigRecord> getRecordType() {
        return ValuationResultFunctionConfigRecord.class;
    }

    /**
     * The column
     * <code>data.valuation_result_function_config.valuation_result_dataset_id</code>.
     */
    public final TableField<ValuationResultFunctionConfigRecord, Integer> VALUATION_RESULT_DATASET_ID = createField(DSL.name("valuation_result_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result_function_config.vf_id</code>.
     */
    public final TableField<ValuationResultFunctionConfigRecord, Integer> VF_ID = createField(DSL.name("vf_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.valuation_result_function_config.hif_id</code>.
     */
    public final TableField<ValuationResultFunctionConfigRecord, Integer> HIF_ID = createField(DSL.name("hif_id"), SQLDataType.INTEGER, this, "");

    private ValuationResultFunctionConfig(Name alias, Table<ValuationResultFunctionConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private ValuationResultFunctionConfig(Name alias, Table<ValuationResultFunctionConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.valuation_result_function_config</code>
     * table reference
     */
    public ValuationResultFunctionConfig(String alias) {
        this(DSL.name(alias), VALUATION_RESULT_FUNCTION_CONFIG);
    }

    /**
     * Create an aliased <code>data.valuation_result_function_config</code>
     * table reference
     */
    public ValuationResultFunctionConfig(Name alias) {
        this(alias, VALUATION_RESULT_FUNCTION_CONFIG);
    }

    /**
     * Create a <code>data.valuation_result_function_config</code> table
     * reference
     */
    public ValuationResultFunctionConfig() {
        this(DSL.name("valuation_result_function_config"), null);
    }

    public <O extends Record> ValuationResultFunctionConfig(Table<O> child, ForeignKey<O, ValuationResultFunctionConfigRecord> key) {
        super(child, key, VALUATION_RESULT_FUNCTION_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public ValuationResultFunctionConfig as(String alias) {
        return new ValuationResultFunctionConfig(DSL.name(alias), this);
    }

    @Override
    public ValuationResultFunctionConfig as(Name alias) {
        return new ValuationResultFunctionConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ValuationResultFunctionConfig rename(String name) {
        return new ValuationResultFunctionConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ValuationResultFunctionConfig rename(Name name) {
        return new ValuationResultFunctionConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
