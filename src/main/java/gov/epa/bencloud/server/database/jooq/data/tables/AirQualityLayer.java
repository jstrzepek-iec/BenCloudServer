/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.Keys;
import gov.epa.bencloud.server.database.jooq.data.tables.records.AirQualityLayerRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class AirQualityLayer extends TableImpl<AirQualityLayerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.air_quality_layer</code>
     */
    public static final AirQualityLayer AIR_QUALITY_LAYER = new AirQualityLayer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AirQualityLayerRecord> getRecordType() {
        return AirQualityLayerRecord.class;
    }

    /**
     * The column <code>data.air_quality_layer.id</code>.
     */
    public final TableField<AirQualityLayerRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field("nextval('data.air_quality_layer_id_seq1'::regclass)", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>data.air_quality_layer.name</code>.
     */
    public final TableField<AirQualityLayerRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.air_quality_layer.pollutant_id</code>.
     */
    public final TableField<AirQualityLayerRecord, Integer> POLLUTANT_ID = createField(DSL.name("pollutant_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_layer.grid_definition_id</code>.
     */
    public final TableField<AirQualityLayerRecord, Integer> GRID_DEFINITION_ID = createField(DSL.name("grid_definition_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>data.air_quality_layer.user_id</code>.
     */
    public final TableField<AirQualityLayerRecord, String> USER_ID = createField(DSL.name("user_id"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.air_quality_layer.share_scope</code>.
     */
    public final TableField<AirQualityLayerRecord, Short> SHARE_SCOPE = createField(DSL.name("share_scope"), SQLDataType.SMALLINT.defaultValue(DSL.field("0", SQLDataType.SMALLINT)), this, "");

    private AirQualityLayer(Name alias, Table<AirQualityLayerRecord> aliased) {
        this(alias, aliased, null);
    }

    private AirQualityLayer(Name alias, Table<AirQualityLayerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>data.air_quality_layer</code> table reference
     */
    public AirQualityLayer(String alias) {
        this(DSL.name(alias), AIR_QUALITY_LAYER);
    }

    /**
     * Create an aliased <code>data.air_quality_layer</code> table reference
     */
    public AirQualityLayer(Name alias) {
        this(alias, AIR_QUALITY_LAYER);
    }

    /**
     * Create a <code>data.air_quality_layer</code> table reference
     */
    public AirQualityLayer() {
        this(DSL.name("air_quality_layer"), null);
    }

    public <O extends Record> AirQualityLayer(Table<O> child, ForeignKey<O, AirQualityLayerRecord> key) {
        super(child, key, AIR_QUALITY_LAYER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public UniqueKey<AirQualityLayerRecord> getPrimaryKey() {
        return Keys.AIR_QUALITY_LAYER_PKEY;
    }

    @Override
    public List<ForeignKey<AirQualityLayerRecord, ?>> getReferences() {
        return Arrays.asList(Keys.AIR_QUALITY_LAYER__AIR_QUALITY_LAYER_POLLUTANT_ID_FKEY, Keys.AIR_QUALITY_LAYER__AIR_QUALITY_LAYER_GRID_DEFINITION_ID_FKEY);
    }

    private transient Pollutant _pollutant;
    private transient GridDefinition _gridDefinition;

    public Pollutant pollutant() {
        if (_pollutant == null)
            _pollutant = new Pollutant(this, Keys.AIR_QUALITY_LAYER__AIR_QUALITY_LAYER_POLLUTANT_ID_FKEY);

        return _pollutant;
    }

    public GridDefinition gridDefinition() {
        if (_gridDefinition == null)
            _gridDefinition = new GridDefinition(this, Keys.AIR_QUALITY_LAYER__AIR_QUALITY_LAYER_GRID_DEFINITION_ID_FKEY);

        return _gridDefinition;
    }

    @Override
    public AirQualityLayer as(String alias) {
        return new AirQualityLayer(DSL.name(alias), this);
    }

    @Override
    public AirQualityLayer as(Name alias) {
        return new AirQualityLayer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AirQualityLayer rename(String name) {
        return new AirQualityLayer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AirQualityLayer rename(Name name) {
        return new AirQualityLayer(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, String, Integer, Integer, String, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
