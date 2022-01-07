/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.HealthImpactFunctionGroupMember;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HealthImpactFunctionGroupMemberRecord extends TableRecordImpl<HealthImpactFunctionGroupMemberRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>data.health_impact_function_group_member.health_impact_function_group_id</code>.
     */
    public void setHealthImpactFunctionGroupId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>data.health_impact_function_group_member.health_impact_function_group_id</code>.
     */
    public Integer getHealthImpactFunctionGroupId() {
        return (Integer) get(0);
    }

    /**
     * Setter for
     * <code>data.health_impact_function_group_member.health_impact_function_id</code>.
     */
    public void setHealthImpactFunctionId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>data.health_impact_function_group_member.health_impact_function_id</code>.
     */
    public Integer getHealthImpactFunctionId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER.HEALTH_IMPACT_FUNCTION_GROUP_ID;
    }

    @Override
    public Field<Integer> field2() {
        return HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER.HEALTH_IMPACT_FUNCTION_ID;
    }

    @Override
    public Integer component1() {
        return getHealthImpactFunctionGroupId();
    }

    @Override
    public Integer component2() {
        return getHealthImpactFunctionId();
    }

    @Override
    public Integer value1() {
        return getHealthImpactFunctionGroupId();
    }

    @Override
    public Integer value2() {
        return getHealthImpactFunctionId();
    }

    @Override
    public HealthImpactFunctionGroupMemberRecord value1(Integer value) {
        setHealthImpactFunctionGroupId(value);
        return this;
    }

    @Override
    public HealthImpactFunctionGroupMemberRecord value2(Integer value) {
        setHealthImpactFunctionId(value);
        return this;
    }

    @Override
    public HealthImpactFunctionGroupMemberRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HealthImpactFunctionGroupMemberRecord
     */
    public HealthImpactFunctionGroupMemberRecord() {
        super(HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER);
    }

    /**
     * Create a detached, initialised HealthImpactFunctionGroupMemberRecord
     */
    public HealthImpactFunctionGroupMemberRecord(Integer healthImpactFunctionGroupId, Integer healthImpactFunctionId) {
        super(HealthImpactFunctionGroupMember.HEALTH_IMPACT_FUNCTION_GROUP_MEMBER);

        setHealthImpactFunctionGroupId(healthImpactFunctionGroupId);
        setHealthImpactFunctionId(healthImpactFunctionId);
    }
}
