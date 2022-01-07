/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetIncidenceRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row7;
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
public class GetIncidence extends TableImpl<GetIncidenceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.get_incidence</code>
     */
    public static final GetIncidence GET_INCIDENCE = new GetIncidence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetIncidenceRecord> getRecordType() {
        return GetIncidenceRecord.class;
    }

    /**
     * The column <code>data.get_incidence.grid_cell_id</code>.
     */
    public final TableField<GetIncidenceRecord, Integer> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_incidence.race_id</code>.
     */
    public final TableField<GetIncidenceRecord, Integer> RACE_ID = createField(DSL.name("race_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_incidence.ethnicity_id</code>.
     */
    public final TableField<GetIncidenceRecord, Integer> ETHNICITY_ID = createField(DSL.name("ethnicity_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_incidence.gender_id</code>.
     */
    public final TableField<GetIncidenceRecord, Integer> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.get_incidence.start_age</code>.
     */
    public final TableField<GetIncidenceRecord, Short> START_AGE = createField(DSL.name("start_age"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>data.get_incidence.end_age</code>.
     */
    public final TableField<GetIncidenceRecord, Short> END_AGE = createField(DSL.name("end_age"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>data.get_incidence.value</code>.
     */
    public final TableField<GetIncidenceRecord, Double> VALUE = createField(DSL.name("value"), SQLDataType.DOUBLE, this, "");

    private GetIncidence(Name alias, Table<GetIncidenceRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(null, SQLDataType.SMALLINT),
            DSL.val(null, SQLDataType.SMALLINT),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.BOOLEAN),
            DSL.val(null, SQLDataType.INTEGER)
        });
    }

    private GetIncidence(Name alias, Table<GetIncidenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>data.get_incidence</code> table reference
     */
    public GetIncidence(String alias) {
        this(DSL.name(alias), GET_INCIDENCE);
    }

    /**
     * Create an aliased <code>data.get_incidence</code> table reference
     */
    public GetIncidence(Name alias) {
        this(alias, GET_INCIDENCE);
    }

    /**
     * Create a <code>data.get_incidence</code> table reference
     */
    public GetIncidence() {
        this(DSL.name("get_incidence"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public GetIncidence as(String alias) {
        return new GetIncidence(DSL.name(alias), this, parameters);
    }

    @Override
    public GetIncidence as(Name alias) {
        return new GetIncidence(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIncidence rename(String name) {
        return new GetIncidence(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetIncidence rename(Name name) {
        return new GetIncidence(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, Integer, Short, Short, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetIncidence call(
          Integer _DatasetId
        , Integer _Year
        , Integer _EndpointId
        , Integer[] _RaceId
        , Integer[] _EthnicityId
        , Integer[] _GenderId
        , Short _StartAge
        , Short _EndAge
        , Boolean _GroupByRace
        , Boolean _GroupByEthnicity
        , Boolean _GroupByGender
        , Boolean _GroupByAgeRange
        , Integer _OutputGridDefinitionId
    ) {
        GetIncidence result = new GetIncidence(DSL.name("get_incidence"), null, new Field[] {
            DSL.val(_DatasetId, SQLDataType.INTEGER),
            DSL.val(_Year, SQLDataType.INTEGER),
            DSL.val(_EndpointId, SQLDataType.INTEGER),
            DSL.val(_RaceId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_EthnicityId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_GenderId, SQLDataType.INTEGER.getArrayDataType()),
            DSL.val(_StartAge, SQLDataType.SMALLINT),
            DSL.val(_EndAge, SQLDataType.SMALLINT),
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
    public GetIncidence call(
          Field<Integer> _DatasetId
        , Field<Integer> _Year
        , Field<Integer> _EndpointId
        , Field<Integer[]> _RaceId
        , Field<Integer[]> _EthnicityId
        , Field<Integer[]> _GenderId
        , Field<Short> _StartAge
        , Field<Short> _EndAge
        , Field<Boolean> _GroupByRace
        , Field<Boolean> _GroupByEthnicity
        , Field<Boolean> _GroupByGender
        , Field<Boolean> _GroupByAgeRange
        , Field<Integer> _OutputGridDefinitionId
    ) {
        GetIncidence result = new GetIncidence(DSL.name("get_incidence"), null, new Field[] {
            _DatasetId,
            _Year,
            _EndpointId,
            _RaceId,
            _EthnicityId,
            _GenderId,
            _StartAge,
            _EndAge,
            _GroupByRace,
            _GroupByEthnicity,
            _GroupByGender,
            _GroupByAgeRange,
            _OutputGridDefinitionId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
