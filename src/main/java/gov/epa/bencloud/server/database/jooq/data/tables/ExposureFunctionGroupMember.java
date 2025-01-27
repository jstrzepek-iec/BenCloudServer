/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.ExposureFunctionGroupMemberRecord;

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
public class ExposureFunctionGroupMember extends TableImpl<ExposureFunctionGroupMemberRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>data.exposure_function_group_member</code>
     */
    public static final ExposureFunctionGroupMember EXPOSURE_FUNCTION_GROUP_MEMBER = new ExposureFunctionGroupMember();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExposureFunctionGroupMemberRecord> getRecordType() {
        return ExposureFunctionGroupMemberRecord.class;
    }

    /**
     * The column
     * <code>data.exposure_function_group_member.exposure_function_group_id</code>.
     */
    public final TableField<ExposureFunctionGroupMemberRecord, Integer> EXPOSURE_FUNCTION_GROUP_ID = createField(DSL.name("exposure_function_group_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>data.exposure_function_group_member.exposure_function_id</code>.
     */
    public final TableField<ExposureFunctionGroupMemberRecord, Integer> EXPOSURE_FUNCTION_ID = createField(DSL.name("exposure_function_id"), SQLDataType.INTEGER, this, "");

    private ExposureFunctionGroupMember(Name alias, Table<ExposureFunctionGroupMemberRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExposureFunctionGroupMember(Name alias, Table<ExposureFunctionGroupMemberRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.exposure_function_group_member</code> table
     * reference
     */
    public ExposureFunctionGroupMember(String alias) {
        this(DSL.name(alias), EXPOSURE_FUNCTION_GROUP_MEMBER);
    }

    /**
     * Create an aliased <code>data.exposure_function_group_member</code> table
     * reference
     */
    public ExposureFunctionGroupMember(Name alias) {
        this(alias, EXPOSURE_FUNCTION_GROUP_MEMBER);
    }

    /**
     * Create a <code>data.exposure_function_group_member</code> table reference
     */
    public ExposureFunctionGroupMember() {
        this(DSL.name("exposure_function_group_member"), null);
    }

    public <O extends Record> ExposureFunctionGroupMember(Table<O> child, ForeignKey<O, ExposureFunctionGroupMemberRecord> key) {
        super(child, key, EXPOSURE_FUNCTION_GROUP_MEMBER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public ExposureFunctionGroupMember as(String alias) {
        return new ExposureFunctionGroupMember(DSL.name(alias), this);
    }

    @Override
    public ExposureFunctionGroupMember as(Name alias) {
        return new ExposureFunctionGroupMember(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExposureFunctionGroupMember rename(String name) {
        return new ExposureFunctionGroupMember(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExposureFunctionGroupMember rename(Name name) {
        return new ExposureFunctionGroupMember(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
