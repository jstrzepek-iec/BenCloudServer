/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.RaceRecord;

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
public class Race extends TableImpl<RaceRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.race</code>
     */
    public static final Race RACE = new Race();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RaceRecord> getRecordType() {
        return RaceRecord.class;
    }

    /**
     * The column <code>data.race.id</code>.
     */
    public final TableField<RaceRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.race.name</code>.
     */
    public final TableField<RaceRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    private Race(Name alias, Table<RaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Race(Name alias, Table<RaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.race</code> table reference
     */
    public Race(String alias) {
        this(DSL.name(alias), RACE);
    }

    /**
     * Create an aliased <code>data.race</code> table reference
     */
    public Race(Name alias) {
        this(alias, RACE);
    }

    /**
     * Create a <code>data.race</code> table reference
     */
    public Race() {
        this(DSL.name("race"), null);
    }

    public <O extends Record> Race(Table<O> child, ForeignKey<O, RaceRecord> key) {
        super(child, key, RACE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public Identity<RaceRecord, Integer> getIdentity() {
        return (Identity<RaceRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<RaceRecord> getPrimaryKey() {
        return Keys.RACE_PKEY;
    }

    @Override
    public Race as(String alias) {
        return new Race(DSL.name(alias), this);
    }

    @Override
    public Race as(Name alias) {
        return new Race(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Race rename(String name) {
        return new Race(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Race rename(Name name) {
        return new Race(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
