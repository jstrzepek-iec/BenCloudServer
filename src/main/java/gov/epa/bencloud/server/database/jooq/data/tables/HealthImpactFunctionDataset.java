/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.HealthImpactFunctionDatasetRecord;

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
public class HealthImpactFunctionDataset extends TableImpl<HealthImpactFunctionDatasetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>data.health_impact_function_dataset</code>
     */
    public static final HealthImpactFunctionDataset HEALTH_IMPACT_FUNCTION_DATASET = new HealthImpactFunctionDataset();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HealthImpactFunctionDatasetRecord> getRecordType() {
        return HealthImpactFunctionDatasetRecord.class;
    }

    /**
     * The column <code>data.health_impact_function_dataset.id</code>.
     */
    public final TableField<HealthImpactFunctionDatasetRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>data.health_impact_function_dataset.name</code>.
     */
    public final TableField<HealthImpactFunctionDatasetRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB.nullable(false), this, "");

    private HealthImpactFunctionDataset(Name alias, Table<HealthImpactFunctionDatasetRecord> aliased) {
        this(alias, aliased, null);
    }

    private HealthImpactFunctionDataset(Name alias, Table<HealthImpactFunctionDatasetRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.health_impact_function_dataset</code> table
     * reference
     */
    public HealthImpactFunctionDataset(String alias) {
        this(DSL.name(alias), HEALTH_IMPACT_FUNCTION_DATASET);
    }

    /**
     * Create an aliased <code>data.health_impact_function_dataset</code> table
     * reference
     */
    public HealthImpactFunctionDataset(Name alias) {
        this(alias, HEALTH_IMPACT_FUNCTION_DATASET);
    }

    /**
     * Create a <code>data.health_impact_function_dataset</code> table reference
     */
    public HealthImpactFunctionDataset() {
        this(DSL.name("health_impact_function_dataset"), null);
    }

    public <O extends Record> HealthImpactFunctionDataset(Table<O> child, ForeignKey<O, HealthImpactFunctionDatasetRecord> key) {
        super(child, key, HEALTH_IMPACT_FUNCTION_DATASET);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public Identity<HealthImpactFunctionDatasetRecord, Integer> getIdentity() {
        return (Identity<HealthImpactFunctionDatasetRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<HealthImpactFunctionDatasetRecord> getPrimaryKey() {
        return Keys.HEALTH_IMPACT_FUNCTION_DATASET_PKEY;
    }

    @Override
    public HealthImpactFunctionDataset as(String alias) {
        return new HealthImpactFunctionDataset(DSL.name(alias), this);
    }

    @Override
    public HealthImpactFunctionDataset as(Name alias) {
        return new HealthImpactFunctionDataset(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthImpactFunctionDataset rename(String name) {
        return new HealthImpactFunctionDataset(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthImpactFunctionDataset rename(Name name) {
        return new HealthImpactFunctionDataset(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
