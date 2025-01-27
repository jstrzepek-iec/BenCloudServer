/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.EndpointGroupRecord;

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
public class EndpointGroup extends TableImpl<EndpointGroupRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.endpoint_group</code>
     */
    public static final EndpointGroup ENDPOINT_GROUP = new EndpointGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EndpointGroupRecord> getRecordType() {
        return EndpointGroupRecord.class;
    }

    /**
     * The column <code>data.endpoint_group.id</code>.
     */
    public final TableField<EndpointGroupRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.endpoint_group.name</code>.
     */
    public final TableField<EndpointGroupRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    private EndpointGroup(Name alias, Table<EndpointGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private EndpointGroup(Name alias, Table<EndpointGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.endpoint_group</code> table reference
     */
    public EndpointGroup(String alias) {
        this(DSL.name(alias), ENDPOINT_GROUP);
    }

    /**
     * Create an aliased <code>data.endpoint_group</code> table reference
     */
    public EndpointGroup(Name alias) {
        this(alias, ENDPOINT_GROUP);
    }

    /**
     * Create a <code>data.endpoint_group</code> table reference
     */
    public EndpointGroup() {
        this(DSL.name("endpoint_group"), null);
    }

    public <O extends Record> EndpointGroup(Table<O> child, ForeignKey<O, EndpointGroupRecord> key) {
        super(child, key, ENDPOINT_GROUP);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public Identity<EndpointGroupRecord, Integer> getIdentity() {
        return (Identity<EndpointGroupRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<EndpointGroupRecord> getPrimaryKey() {
        return Keys.ENDPOINT_GROUP_PKEY;
    }

    @Override
    public EndpointGroup as(String alias) {
        return new EndpointGroup(DSL.name(alias), this);
    }

    @Override
    public EndpointGroup as(Name alias) {
        return new EndpointGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EndpointGroup rename(String name) {
        return new EndpointGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EndpointGroup rename(Name name) {
        return new EndpointGroup(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
