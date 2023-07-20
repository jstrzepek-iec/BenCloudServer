/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.ExposureResultRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class ExposureResult extends TableImpl<ExposureResultRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.exposure_result</code>
     */
    public static final ExposureResult EXPOSURE_RESULT = new ExposureResult();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExposureResultRecord> getRecordType() {
        return ExposureResultRecord.class;
    }

    /**
     * The column <code>data.exposure_result.exposure_result_dataset_id</code>.
     */
    public final TableField<ExposureResultRecord, Integer> EXPOSURE_RESULT_DATASET_ID = createField(DSL.name("exposure_result_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result.exposure_function_id</code>.
     */
    public final TableField<ExposureResultRecord, Integer> EXPOSURE_FUNCTION_ID = createField(DSL.name("exposure_function_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result.grid_col</code>.
     */
    public final TableField<ExposureResultRecord, Integer> GRID_COL = createField(DSL.name("grid_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result.grid_row</code>.
     */
    public final TableField<ExposureResultRecord, Integer> GRID_ROW = createField(DSL.name("grid_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result.grid_cell_id</code>.
     */
    public final TableField<ExposureResultRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.exposure_result.subgroup_population</code>.
     */
    public final TableField<ExposureResultRecord, Double> SUBGROUP_POPULATION = createField(DSL.name("subgroup_population"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.exposure_result.all_population</code>.
     */
    public final TableField<ExposureResultRecord, Double> ALL_POPULATION = createField(DSL.name("all_population"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.exposure_result.delta_aq</code>.
     */
    public final TableField<ExposureResultRecord, Double> DELTA_AQ = createField(DSL.name("delta_aq"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.exposure_result.baseline_aq</code>.
     */
    public final TableField<ExposureResultRecord, Double> BASELINE_AQ = createField(DSL.name("baseline_aq"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.exposure_result.scenario_aq</code>.
     */
    public final TableField<ExposureResultRecord, Double> SCENARIO_AQ = createField(DSL.name("scenario_aq"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>data.exposure_result.exposure_function_instance_id</code>.
     */
    public final TableField<ExposureResultRecord, Integer> EXPOSURE_FUNCTION_INSTANCE_ID = createField(DSL.name("exposure_function_instance_id"), SQLDataType.INTEGER, this, "");

    private ExposureResult(Name alias, Table<ExposureResultRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExposureResult(Name alias, Table<ExposureResultRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.exposure_result</code> table reference
     */
    public ExposureResult(String alias) {
        this(DSL.name(alias), EXPOSURE_RESULT);
    }

    /**
     * Create an aliased <code>data.exposure_result</code> table reference
     */
    public ExposureResult(Name alias) {
        this(alias, EXPOSURE_RESULT);
    }

    /**
     * Create a <code>data.exposure_result</code> table reference
     */
    public ExposureResult() {
        this(DSL.name("exposure_result"), null);
    }

    public <O extends Record> ExposureResult(Table<O> child, ForeignKey<O, ExposureResultRecord> key) {
        super(child, key, EXPOSURE_RESULT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public ExposureResult as(String alias) {
        return new ExposureResult(DSL.name(alias), this);
    }

    @Override
    public ExposureResult as(Name alias) {
        return new ExposureResult(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExposureResult rename(String name) {
        return new ExposureResult(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExposureResult rename(Name name) {
        return new ExposureResult(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, Integer, Integer, Integer, Long, Double, Double, Double, Double, Double, Integer> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
