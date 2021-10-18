/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.PollutantRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class Pollutant extends TableImpl<PollutantRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.pollutant</code>
     */
    public static final Pollutant POLLUTANT = new Pollutant();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PollutantRecord> getRecordType() {
        return PollutantRecord.class;
    }

    /**
     * The column <code>data.pollutant.id</code>.
     */
    public final TableField<PollutantRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.pollutant.name</code>.
     */
    public final TableField<PollutantRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.pollutant.observation_type</code>.
     */
    public final TableField<PollutantRecord, Short> OBSERVATION_TYPE = createField(DSL.name("observation_type"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>data.pollutant.friendly_name</code>.
     */
    public final TableField<PollutantRecord, String> FRIENDLY_NAME = createField(DSL.name("friendly_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.pollutant.help_text</code>.
     */
    public final TableField<PollutantRecord, String> HELP_TEXT = createField(DSL.name("help_text"), SQLDataType.CLOB, this, "");

    private Pollutant(Name alias, Table<PollutantRecord> aliased) {
        this(alias, aliased, null);
    }

    private Pollutant(Name alias, Table<PollutantRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.pollutant</code> table reference
     */
    public Pollutant(String alias) {
        this(DSL.name(alias), POLLUTANT);
    }

    /**
     * Create an aliased <code>data.pollutant</code> table reference
     */
    public Pollutant(Name alias) {
        this(alias, POLLUTANT);
    }

    /**
     * Create a <code>data.pollutant</code> table reference
     */
    public Pollutant() {
        this(DSL.name("pollutant"), null);
    }

    public <O extends Record> Pollutant(Table<O> child, ForeignKey<O, PollutantRecord> key) {
        super(child, key, POLLUTANT);
    }

    @Override
    public Schema getSchema() {
        return Data.DATA;
    }

    @Override
    public Identity<PollutantRecord, Integer> getIdentity() {
        return (Identity<PollutantRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<PollutantRecord> getPrimaryKey() {
        return Keys.POLLUTANT_PKEY;
    }

    @Override
    public List<UniqueKey<PollutantRecord>> getKeys() {
        return Arrays.<UniqueKey<PollutantRecord>>asList(Keys.POLLUTANT_PKEY);
    }

    @Override
    public Pollutant as(String alias) {
        return new Pollutant(DSL.name(alias), this);
    }

    @Override
    public Pollutant as(Name alias) {
        return new Pollutant(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Pollutant rename(String name) {
        return new Pollutant(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Pollutant rename(Name name) {
        return new Pollutant(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, Short, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}