/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.grids.tables;


import gov.epa.bencloud.server.database.jooq.grids.Grids;
import gov.epa.bencloud.server.database.jooq.grids.Indexes;
import gov.epa.bencloud.server.database.jooq.grids.Keys;
import gov.epa.bencloud.server.database.jooq.grids.tables.records.UsCmaq_12kmNationClippedRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row19;
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
public class UsCmaq_12kmNationClipped extends TableImpl<UsCmaq_12kmNationClippedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>grids.us_cmaq_12km_nation_clipped</code>
     */
    public static final UsCmaq_12kmNationClipped US_CMAQ_12KM_NATION_CLIPPED = new UsCmaq_12kmNationClipped();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsCmaq_12kmNationClippedRecord> getRecordType() {
        return UsCmaq_12kmNationClippedRecord.class;
    }

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.gid</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, Integer> GID = createField(DSL.name("gid"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.area</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> AREA = createField(DSL.name("area"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.perimeter</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> PERIMETER = createField(DSL.name("perimeter"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.combo12km_</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> COMBO12KM_ = createField(DSL.name("combo12km_"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.combo12km1</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> COMBO12KM1 = createField(DSL.name("combo12km1"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.col</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> COL = createField(DSL.name("col"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.row</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> ROW = createField(DSL.name("row"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.newcr</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> NEWCR = createField(DSL.name("newcr"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.euscol</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> EUSCOL = createField(DSL.name("euscol"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.eusrow</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> EUSROW = createField(DSL.name("eusrow"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.euscr</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> EUSCR = createField(DSL.name("euscr"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.wuscol</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> WUSCOL = createField(DSL.name("wuscol"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.wusrow</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> WUSROW = createField(DSL.name("wusrow"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.wuscr</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, BigDecimal> WUSCR = createField(DSL.name("wuscr"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.oid_</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, Integer> OID_ = createField(DSL.name("oid_"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.row_1</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, Double> ROW_1 = createField(DSL.name("row_1"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.column</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, Double> COLUMN = createField(DSL.name("column"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>grids.us_cmaq_12km_nation_clipped.newcr_1</code>.
     */
    public final TableField<UsCmaq_12kmNationClippedRecord, Double> NEWCR_1 = createField(DSL.name("newcr_1"), SQLDataType.DOUBLE, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public final TableField<UsCmaq_12kmNationClippedRecord, Object> GEOM = createField(DSL.name("geom"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"public\".\"geometry\""), this, "");

    private UsCmaq_12kmNationClipped(Name alias, Table<UsCmaq_12kmNationClippedRecord> aliased) {
        this(alias, aliased, null);
    }

    private UsCmaq_12kmNationClipped(Name alias, Table<UsCmaq_12kmNationClippedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>grids.us_cmaq_12km_nation_clipped</code> table
     * reference
     */
    public UsCmaq_12kmNationClipped(String alias) {
        this(DSL.name(alias), US_CMAQ_12KM_NATION_CLIPPED);
    }

    /**
     * Create an aliased <code>grids.us_cmaq_12km_nation_clipped</code> table
     * reference
     */
    public UsCmaq_12kmNationClipped(Name alias) {
        this(alias, US_CMAQ_12KM_NATION_CLIPPED);
    }

    /**
     * Create a <code>grids.us_cmaq_12km_nation_clipped</code> table reference
     */
    public UsCmaq_12kmNationClipped() {
        this(DSL.name("us_cmaq_12km_nation_clipped"), null);
    }

    public <O extends Record> UsCmaq_12kmNationClipped(Table<O> child, ForeignKey<O, UsCmaq_12kmNationClippedRecord> key) {
        super(child, key, US_CMAQ_12KM_NATION_CLIPPED);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Grids.GRIDS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.US_CMAQ_12KM_NATION_CLIPPED_GEOM_IDX);
    }

    @Override
    public Identity<UsCmaq_12kmNationClippedRecord, Integer> getIdentity() {
        return (Identity<UsCmaq_12kmNationClippedRecord, Integer>) super.getIdentity();
    }

    @Override
    public UniqueKey<UsCmaq_12kmNationClippedRecord> getPrimaryKey() {
        return Keys.US_CMAQ_12KM_NATION_CLIPPED_PKEY;
    }

    @Override
    public UsCmaq_12kmNationClipped as(String alias) {
        return new UsCmaq_12kmNationClipped(DSL.name(alias), this);
    }

    @Override
    public UsCmaq_12kmNationClipped as(Name alias) {
        return new UsCmaq_12kmNationClipped(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UsCmaq_12kmNationClipped rename(String name) {
        return new UsCmaq_12kmNationClipped(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UsCmaq_12kmNationClipped rename(Name name) {
        return new UsCmaq_12kmNationClipped(name, null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, Double, Double, Double, Object> fieldsRow() {
        return (Row19) super.fieldsRow();
    }
}
