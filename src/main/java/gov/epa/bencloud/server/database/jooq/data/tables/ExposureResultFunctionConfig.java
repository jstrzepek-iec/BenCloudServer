/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.ExposureResultFunctionConfigRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row15;
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
public class ExposureResultFunctionConfig extends TableImpl<ExposureResultFunctionConfigRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>data.exposure_result_function_config</code>
     */
    public static final ExposureResultFunctionConfig EXPOSURE_RESULT_FUNCTION_CONFIG = new ExposureResultFunctionConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExposureResultFunctionConfigRecord> getRecordType() {
        return ExposureResultFunctionConfigRecord.class;
    }

    /**
     * The column
     * <code>data.exposure_result_function_config.exposure_result_dataset_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> EXPOSURE_RESULT_DATASET_ID = createField(DSL.name("exposure_result_dataset_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.exposure_function_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> EXPOSURE_FUNCTION_ID = createField(DSL.name("exposure_function_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result_function_config.start_age</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> START_AGE = createField(DSL.name("start_age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result_function_config.end_age</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> END_AGE = createField(DSL.name("end_age"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result_function_config.variable_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> VARIABLE_ID = createField(DSL.name("variable_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result_function_config.race_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> RACE_ID = createField(DSL.name("race_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result_function_config.gender_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.ethnicity_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> ETHNICITY_ID = createField(DSL.name("ethnicity_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.exposure_result_function_config.metric_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> METRIC_ID = createField(DSL.name("metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.seasonal_metric_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> SEASONAL_METRIC_ID = createField(DSL.name("seasonal_metric_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.metric_statistic</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> METRIC_STATISTIC = createField(DSL.name("metric_statistic"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.exposure_function_instance_id</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, Integer> EXPOSURE_FUNCTION_INSTANCE_ID = createField(DSL.name("exposure_function_instance_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.population_group</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, String> POPULATION_GROUP = createField(DSL.name("population_group"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.hidden_sort_order</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, String> HIDDEN_SORT_ORDER = createField(DSL.name("hidden_sort_order"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>data.exposure_result_function_config.function_type</code>.
     */
    public final TableField<ExposureResultFunctionConfigRecord, String> FUNCTION_TYPE = createField(DSL.name("function_type"), SQLDataType.CLOB, this, "");

    private ExposureResultFunctionConfig(Name alias, Table<ExposureResultFunctionConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExposureResultFunctionConfig(Name alias, Table<ExposureResultFunctionConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.exposure_result_function_config</code> table
     * reference
     */
    public ExposureResultFunctionConfig(String alias) {
        this(DSL.name(alias), EXPOSURE_RESULT_FUNCTION_CONFIG);
    }

    /**
     * Create an aliased <code>data.exposure_result_function_config</code> table
     * reference
     */
    public ExposureResultFunctionConfig(Name alias) {
        this(alias, EXPOSURE_RESULT_FUNCTION_CONFIG);
    }

    /**
     * Create a <code>data.exposure_result_function_config</code> table
     * reference
     */
    public ExposureResultFunctionConfig() {
        this(DSL.name("exposure_result_function_config"), null);
    }

    public <O extends Record> ExposureResultFunctionConfig(Table<O> child, ForeignKey<O, ExposureResultFunctionConfigRecord> key) {
        super(child, key, EXPOSURE_RESULT_FUNCTION_CONFIG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public ExposureResultFunctionConfig as(String alias) {
        return new ExposureResultFunctionConfig(DSL.name(alias), this);
    }

    @Override
    public ExposureResultFunctionConfig as(Name alias) {
        return new ExposureResultFunctionConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExposureResultFunctionConfig rename(String name) {
        return new ExposureResultFunctionConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExposureResultFunctionConfig rename(Name name) {
        return new ExposureResultFunctionConfig(name, null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }
}
