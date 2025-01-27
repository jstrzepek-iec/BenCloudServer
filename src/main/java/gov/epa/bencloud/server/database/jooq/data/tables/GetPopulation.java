/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetPopulationRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row6;
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
public class GetPopulation extends TableImpl<GetPopulationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.get_population</code>
     */
    public static final GetPopulation GET_POPULATION = new GetPopulation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetPopulationRecord> getRecordType() {
        return GetPopulationRecord.class;
    }

    /**
     * The column <code>data.get_population.grid_cell_id</code>.
     */
    public final TableField<GetPopulationRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.get_population.race_id</code>.
     */
    public final TableField<GetPopulationRecord, Integer> RACE_ID = createField(DSL.name("race_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_population.ethnicity_id</code>.
     */
    public final TableField<GetPopulationRecord, Integer> ETHNICITY_ID = createField(DSL.name("ethnicity_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_population.gender_id</code>.
     */
    public final TableField<GetPopulationRecord, Integer> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_population.age_range_id</code>.
     */
    public final TableField<GetPopulationRecord, Integer> AGE_RANGE_ID = createField(DSL.name("age_range_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_population.pop_value</code>.
     */
    public final TableField<GetPopulationRecord, Double> POP_VALUE = createField(DSL.name("pop_value"), SQLDataType.DOUBLE, this, "");

    private GetPopulation(Name alias, Table<GetPopulationRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.INTEGER)
        });
    }

    private GetPopulation(Name alias, Table<GetPopulationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>data.get_population</code> table reference
     */
    public GetPopulation(String alias) {
        this(DSL.name(alias), GET_POPULATION);
    }

    /**
     * Create an aliased <code>data.get_population</code> table reference
     */
    public GetPopulation(Name alias) {
        this(alias, GET_POPULATION);
    }

    /**
     * Create a <code>data.get_population</code> table reference
     */
    public GetPopulation() {
        this(DSL.name("get_population"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public GetPopulation as(String alias) {
        return new GetPopulation(DSL.name(alias), this, parameters);
    }

    @Override
    public GetPopulation as(Name alias) {
        return new GetPopulation(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetPopulation rename(String name) {
        return new GetPopulation(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetPopulation rename(Name name) {
        return new GetPopulation(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Integer, Integer, Integer, Integer, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetPopulation call(
          Integer _DatasetId
        , Integer _Year
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Integer[] _AgeRangeId
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        GetPopulation result = new GetPopulation(DSL.name("get_population"), null, new Field[] {
            DSL.val(_DatasetId, SQLDataType.INTEGER),
            DSL.val(_Year, SQLDataType.INTEGER),
            DSL.val(_RaceId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_EthnicityId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_GenderId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_AgeRangeId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_GroupByRace, SQLDataType.BOOLEAN),
            DSL.val(_GroupByEthnicity, SQLDataType.BOOLEAN),
            DSL.val(_GroupByGender, SQLDataType.BOOLEAN),
            DSL.val(_GroupByAgeRange, SQLDataType.BOOLEAN),
            DSL.val(_OutputGridDefinitionId, SQLDataType.INTEGER)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GetPopulation call(
          Field<Integer> _DatasetId
        , Field<Integer> _Year
        , Field<Integer[]> _RaceId
        , Field<Integer[]> _EthnicityId
        , Field<Integer[]> _GenderId
        , Field<Integer[]> _AgeRangeId
        , Field<Boolean> _GroupByRace
        , Field<Boolean> _GroupByEthnicity
        , Field<Boolean> _GroupByGender
        , Field<Boolean> _GroupByAgeRange
        , Field<Integer> _OutputGridDefinitionId
    ) {
        GetPopulation result = new GetPopulation(DSL.name("get_population"), null, new Field[] {
            _DatasetId,
            _Year,
            _RaceId,
            _EthnicityId,
            _GenderId,
            _AgeRangeId,
            _GroupByRace,
            _GroupByEthnicity,
            _GroupByGender,
            _GroupByAgeRange,
            _OutputGridDefinitionId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
