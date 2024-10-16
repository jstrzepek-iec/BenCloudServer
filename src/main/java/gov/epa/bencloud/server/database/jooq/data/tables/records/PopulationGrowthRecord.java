/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.PopulationGrowth;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationGrowthRecord extends UpdatableRecordImpl<PopulationGrowthRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Short, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.population_growth.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.population_growth.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.population_growth.gender_id</code>.
     */
    public void setGenderId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.population_growth.gender_id</code>.
     */
    public Integer getGenderId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.population_growth.ethnicity_id</code>.
     */
    public void setEthnicityId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.population_growth.ethnicity_id</code>.
     */
    public Integer getEthnicityId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.population_growth.age_range_id</code>.
     */
    public void setAgeRangeId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.population_growth.age_range_id</code>.
     */
    public Integer getAgeRangeId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.population_growth.grid_cell_id</code>.
     */
    public void setGridCellId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.population_growth.grid_cell_id</code>.
     */
    public Integer getGridCellId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.population_growth.pop_year</code>.
     */
    public void setPopYear(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.population_growth.pop_year</code>.
     */
    public Short getPopYear() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>data.population_growth.growth_value</code>.
     */
    public void setGrowthValue(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.population_growth.growth_value</code>.
     */
    public Double getGrowthValue() {
        return (Double) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record6<Integer, Integer, Integer, Integer, Integer, Short> key() {
        return (Record6) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Short, Double> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Short, Double> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PopulationGrowth.POPULATION_GROWTH.RACE_ID;
    }

    @Override
    public Field<Integer> field2() {
        return PopulationGrowth.POPULATION_GROWTH.GENDER_ID;
    }

    @Override
    public Field<Integer> field3() {
        return PopulationGrowth.POPULATION_GROWTH.ETHNICITY_ID;
    }

    @Override
    public Field<Integer> field4() {
        return PopulationGrowth.POPULATION_GROWTH.AGE_RANGE_ID;
    }

    @Override
    public Field<Integer> field5() {
        return PopulationGrowth.POPULATION_GROWTH.GRID_CELL_ID;
    }

    @Override
    public Field<Short> field6() {
        return PopulationGrowth.POPULATION_GROWTH.POP_YEAR;
    }

    @Override
    public Field<Double> field7() {
        return PopulationGrowth.POPULATION_GROWTH.GROWTH_VALUE;
    }

    @Override
    public Integer component1() {
        return getRaceId();
    }

    @Override
    public Integer component2() {
        return getGenderId();
    }

    @Override
    public Integer component3() {
        return getEthnicityId();
    }

    @Override
    public Integer component4() {
        return getAgeRangeId();
    }

    @Override
    public Integer component5() {
        return getGridCellId();
    }

    @Override
    public Short component6() {
        return getPopYear();
    }

    @Override
    public Double component7() {
        return getGrowthValue();
    }

    @Override
    public Integer value1() {
        return getRaceId();
    }

    @Override
    public Integer value2() {
        return getGenderId();
    }

    @Override
    public Integer value3() {
        return getEthnicityId();
    }

    @Override
    public Integer value4() {
        return getAgeRangeId();
    }

    @Override
    public Integer value5() {
        return getGridCellId();
    }

    @Override
    public Short value6() {
        return getPopYear();
    }

    @Override
    public Double value7() {
        return getGrowthValue();
    }

    @Override
    public PopulationGrowthRecord value1(Integer value) {
        setRaceId(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord value2(Integer value) {
        setGenderId(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord value3(Integer value) {
        setEthnicityId(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord value4(Integer value) {
        setAgeRangeId(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord value5(Integer value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord value6(Short value) {
        setPopYear(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord value7(Double value) {
        setGrowthValue(value);
        return this;
    }

    @Override
    public PopulationGrowthRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Short value6, Double value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PopulationGrowthRecord
     */
    public PopulationGrowthRecord() {
        super(PopulationGrowth.POPULATION_GROWTH);
    }

    /**
     * Create a detached, initialised PopulationGrowthRecord
     */
    public PopulationGrowthRecord(Integer raceId, Integer genderId, Integer ethnicityId, Integer ageRangeId, Integer gridCellId, Short popYear, Double growthValue) {
        super(PopulationGrowth.POPULATION_GROWTH);

        setRaceId(raceId);
        setGenderId(genderId);
        setEthnicityId(ethnicityId);
        setAgeRangeId(ageRangeId);
        setGridCellId(gridCellId);
        setPopYear(popYear);
        setGrowthValue(growthValue);
    }
}
