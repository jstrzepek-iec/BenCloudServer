/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetExposureResultsRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row9;
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
public class GetExposureResults extends TableImpl<GetExposureResultsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.get_exposure_results</code>
     */
    public static final GetExposureResults GET_EXPOSURE_RESULTS = new GetExposureResults();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetExposureResultsRecord> getRecordType() {
        return GetExposureResultsRecord.class;
    }

    /**
     * The column <code>data.get_exposure_results.grid_col</code>.
     */
    public final TableField<GetExposureResultsRecord, Integer> GRID_COL = createField(DSL.name("grid_col"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_exposure_results.grid_row</code>.
     */
    public final TableField<GetExposureResultsRecord, Integer> GRID_ROW = createField(DSL.name("grid_row"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_exposure_results.exposure_function_id</code>.
     */
    public final TableField<GetExposureResultsRecord, Integer> EXPOSURE_FUNCTION_ID = createField(DSL.name("exposure_function_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_exposure_results.result</code>.
     */
    public final TableField<GetExposureResultsRecord, Double> RESULT = createField(DSL.name("result"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.get_exposure_results.subgroup_population</code>.
     */
    public final TableField<GetExposureResultsRecord, Double> SUBGROUP_POPULATION = createField(DSL.name("subgroup_population"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.get_exposure_results.all_population</code>.
     */
    public final TableField<GetExposureResultsRecord, Double> ALL_POPULATION = createField(DSL.name("all_population"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.get_exposure_results.baseline_aq</code>.
     */
    public final TableField<GetExposureResultsRecord, Double> BASELINE_AQ = createField(DSL.name("baseline_aq"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.get_exposure_results.scenario_aq</code>.
     */
    public final TableField<GetExposureResultsRecord, Double> SCENARIO_AQ = createField(DSL.name("scenario_aq"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>data.get_exposure_results.delta_aq</code>.
     */
    public final TableField<GetExposureResultsRecord, Double> DELTA_AQ = createField(DSL.name("delta_aq"), SQLDataType.DOUBLE, this, "");

    private GetExposureResults(Name alias, Table<GetExposureResultsRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.INTEGER)
        });
    }

    private GetExposureResults(Name alias, Table<GetExposureResultsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>data.get_exposure_results</code> table reference
     */
    public GetExposureResults(String alias) {
        this(DSL.name(alias), GET_EXPOSURE_RESULTS);
    }

    /**
     * Create an aliased <code>data.get_exposure_results</code> table reference
     */
    public GetExposureResults(Name alias) {
        this(alias, GET_EXPOSURE_RESULTS);
    }

    /**
     * Create a <code>data.get_exposure_results</code> table reference
     */
    public GetExposureResults() {
        this(DSL.name("get_exposure_results"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public GetExposureResults as(String alias) {
        return new GetExposureResults(DSL.name(alias), this, parameters);
    }

    @Override
    public GetExposureResults as(Name alias) {
        return new GetExposureResults(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetExposureResults rename(String name) {
        return new GetExposureResults(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetExposureResults rename(Name name) {
        return new GetExposureResults(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Integer, Integer, Double, Double, Double, Double, Double, Double> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetExposureResults call(
          Integer _DatasetId
        , Integer[] _EfId
        , Integer _OutputGridDefinitionId
    ) {
        GetExposureResults result = new GetExposureResults(DSL.name("get_exposure_results"), null, new Field[] {
            DSL.val(_DatasetId, SQLDataType.INTEGER),
            DSL.val(_EfId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_OutputGridDefinitionId, SQLDataType.INTEGER)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GetExposureResults call(
          Field<Integer> _DatasetId
        , Field<Integer[]> _EfId
        , Field<Integer> _OutputGridDefinitionId
    ) {
        GetExposureResults result = new GetExposureResults(DSL.name("get_exposure_results"), null, new Field[] {
            _DatasetId,
            _EfId,
            _OutputGridDefinitionId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
