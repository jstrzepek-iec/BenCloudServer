/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables;


import gov.epa.bencloud.server.database.jooq.data.Data;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetVariableRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
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
public class GetVariable extends TableImpl<GetVariableRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>data.get_variable</code>
     */
    public static final GetVariable GET_VARIABLE = new GetVariable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GetVariableRecord> getRecordType() {
        return GetVariableRecord.class;
    }

    /**
     * The column <code>data.get_variable.variable_name</code>.
     */
    public final TableField<GetVariableRecord, String> VARIABLE_NAME = createField(DSL.name("variable_name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>data.get_variable.grid_cell_id</code>.
     */
    public final TableField<GetVariableRecord, Long> GRID_CELL_ID = createField(DSL.name("grid_cell_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>data.get_variable.value</code>.
     */
    public final TableField<GetVariableRecord, Double> VALUE = createField(DSL.name("value"), SQLDataType.DOUBLE, this, "");

    private GetVariable(Name alias, Table<GetVariableRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB),
            DSL.val(null, SQLDataType.INTEGER)
        });
    }

    private GetVariable(Name alias, Table<GetVariableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>data.get_variable</code> table reference
     */
    public GetVariable(String alias) {
        this(DSL.name(alias), GET_VARIABLE);
    }

    /**
     * Create an aliased <code>data.get_variable</code> table reference
     */
    public GetVariable(Name alias) {
        this(alias, GET_VARIABLE);
    }

    /**
     * Create a <code>data.get_variable</code> table reference
     */
    public GetVariable() {
        this(DSL.name("get_variable"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Data.DATA;
    }

    @Override
    public GetVariable as(String alias) {
        return new GetVariable(DSL.name(alias), this, parameters);
    }

    @Override
    public GetVariable as(Name alias) {
        return new GetVariable(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetVariable rename(String name) {
        return new GetVariable(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public GetVariable rename(Name name) {
        return new GetVariable(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, Double> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public GetVariable call(
          Integer _DatasetId
        , String _VariableName
        , Integer _OutputGridDefinitionId
    ) {
        GetVariable result = new GetVariable(DSL.name("get_variable"), null, new Field[] {
            DSL.val(_DatasetId, SQLDataType.INTEGER),
            DSL.val(_VariableName, SQLDataType.CLOB),
            DSL.val(_OutputGridDefinitionId, SQLDataType.INTEGER)
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public GetVariable call(
          Field<Integer> _DatasetId
        , Field<String> _VariableName
        , Field<Integer> _OutputGridDefinitionId
    ) {
        GetVariable result = new GetVariable(DSL.name("get_variable"), null, new Field[] {
            _DatasetId,
            _VariableName,
            _OutputGridDefinitionId
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
