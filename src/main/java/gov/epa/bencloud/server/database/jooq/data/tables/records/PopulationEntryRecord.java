/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.PopulationEntry;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationEntryRecord extends UpdatableRecordImpl<PopulationEntryRecord> implements Record7<Integer, Integer, Integer, Integer, Integer, Integer, Short> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.population_entry.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.population_entry.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.population_entry.pop_dataset_id</code>.
     */
    public void setPopDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.population_entry.pop_dataset_id</code>.
     */
    public Integer getPopDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.population_entry.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.population_entry.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.population_entry.ethnicity_id</code>.
     */
    public void setEthnicityId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.population_entry.ethnicity_id</code>.
     */
    public Integer getEthnicityId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.population_entry.gender_id</code>.
     */
    public void setGenderId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.population_entry.gender_id</code>.
     */
    public Integer getGenderId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.population_entry.age_range_id</code>.
     */
    public void setAgeRangeId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.population_entry.age_range_id</code>.
     */
    public Integer getAgeRangeId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>data.population_entry.pop_year</code>.
     */
    public void setPopYear(Short value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.population_entry.pop_year</code>.
     */
    public Short getPopYear() {
        return (Short) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Short> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Integer, Integer, Integer, Integer, Integer, Short> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PopulationEntry.POPULATION_ENTRY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return PopulationEntry.POPULATION_ENTRY.POP_DATASET_ID;
    }

    @Override
    public Field<Integer> field3() {
        return PopulationEntry.POPULATION_ENTRY.RACE_ID;
    }

    @Override
    public Field<Integer> field4() {
        return PopulationEntry.POPULATION_ENTRY.ETHNICITY_ID;
    }

    @Override
    public Field<Integer> field5() {
        return PopulationEntry.POPULATION_ENTRY.GENDER_ID;
    }

    @Override
    public Field<Integer> field6() {
        return PopulationEntry.POPULATION_ENTRY.AGE_RANGE_ID;
    }

    @Override
    public Field<Short> field7() {
        return PopulationEntry.POPULATION_ENTRY.POP_YEAR;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getPopDatasetId();
    }

    @Override
    public Integer component3() {
        return getRaceId();
    }

    @Override
    public Integer component4() {
        return getEthnicityId();
    }

    @Override
    public Integer component5() {
        return getGenderId();
    }

    @Override
    public Integer component6() {
        return getAgeRangeId();
    }

    @Override
    public Short component7() {
        return getPopYear();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getPopDatasetId();
    }

    @Override
    public Integer value3() {
        return getRaceId();
    }

    @Override
    public Integer value4() {
        return getEthnicityId();
    }

    @Override
    public Integer value5() {
        return getGenderId();
    }

    @Override
    public Integer value6() {
        return getAgeRangeId();
    }

    @Override
    public Short value7() {
        return getPopYear();
    }

    @Override
    public PopulationEntryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public PopulationEntryRecord value2(Integer value) {
        setPopDatasetId(value);
        return this;
    }

    @Override
    public PopulationEntryRecord value3(Integer value) {
        setRaceId(value);
        return this;
    }

    @Override
    public PopulationEntryRecord value4(Integer value) {
        setEthnicityId(value);
        return this;
    }

    @Override
    public PopulationEntryRecord value5(Integer value) {
        setGenderId(value);
        return this;
    }

    @Override
    public PopulationEntryRecord value6(Integer value) {
        setAgeRangeId(value);
        return this;
    }

    @Override
    public PopulationEntryRecord value7(Short value) {
        setPopYear(value);
        return this;
    }

    @Override
    public PopulationEntryRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Short value7) {
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
     * Create a detached PopulationEntryRecord
     */
    public PopulationEntryRecord() {
        super(PopulationEntry.POPULATION_ENTRY);
    }

    /**
     * Create a detached, initialised PopulationEntryRecord
     */
    public PopulationEntryRecord(Integer id, Integer popDatasetId, Integer raceId, Integer ethnicityId, Integer genderId, Integer ageRangeId, Short popYear) {
        super(PopulationEntry.POPULATION_ENTRY);

        setId(id);
        setPopDatasetId(popDatasetId);
        setRaceId(raceId);
        setEthnicityId(ethnicityId);
        setGenderId(genderId);
        setAgeRangeId(ageRangeId);
        setPopYear(popYear);
    }
}
