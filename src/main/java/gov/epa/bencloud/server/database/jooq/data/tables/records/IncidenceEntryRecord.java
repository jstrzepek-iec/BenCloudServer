/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.IncidenceEntry;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IncidenceEntryRecord extends UpdatableRecordImpl<IncidenceEntryRecord> implements Record15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Short, Short, Boolean, Integer, String, String, String, Double> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.incidence_entry.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.incidence_entry.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.incidence_entry.incidence_dataset_id</code>.
     */
    public void setIncidenceDatasetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.incidence_entry.incidence_dataset_id</code>.
     */
    public Integer getIncidenceDatasetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.incidence_entry.year</code>.
     */
    public void setYear(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.incidence_entry.year</code>.
     */
    public Integer getYear() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.incidence_entry.endpoint_group_id</code>.
     */
    public void setEndpointGroupId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.incidence_entry.endpoint_group_id</code>.
     */
    public Integer getEndpointGroupId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.incidence_entry.endpoint_id</code>.
     */
    public void setEndpointId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.incidence_entry.endpoint_id</code>.
     */
    public Integer getEndpointId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.incidence_entry.race_id</code>.
     */
    public void setRaceId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.incidence_entry.race_id</code>.
     */
    public Integer getRaceId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>data.incidence_entry.gender_id</code>.
     */
    public void setGenderId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.incidence_entry.gender_id</code>.
     */
    public Integer getGenderId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>data.incidence_entry.start_age</code>.
     */
    public void setStartAge(Short value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.incidence_entry.start_age</code>.
     */
    public Short getStartAge() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>data.incidence_entry.end_age</code>.
     */
    public void setEndAge(Short value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.incidence_entry.end_age</code>.
     */
    public Short getEndAge() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>data.incidence_entry.prevalence</code>.
     */
    public void setPrevalence(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.incidence_entry.prevalence</code>.
     */
    public Boolean getPrevalence() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>data.incidence_entry.ethnicity_id</code>.
     */
    public void setEthnicityId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.incidence_entry.ethnicity_id</code>.
     */
    public Integer getEthnicityId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>data.incidence_entry.timeframe</code>.
     */
    public void setTimeframe(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>data.incidence_entry.timeframe</code>.
     */
    public String getTimeframe() {
        return (String) get(11);
    }

    /**
     * Setter for <code>data.incidence_entry.units</code>.
     */
    public void setUnits(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.incidence_entry.units</code>.
     */
    public String getUnits() {
        return (String) get(12);
    }

    /**
     * Setter for <code>data.incidence_entry.distribution</code>.
     */
    public void setDistribution(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>data.incidence_entry.distribution</code>.
     */
    public String getDistribution() {
        return (String) get(13);
    }

    /**
     * Setter for <code>data.incidence_entry.standard_error</code>.
     */
    public void setStandardError(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>data.incidence_entry.standard_error</code>.
     */
    public Double getStandardError() {
        return (Double) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Short, Short, Boolean, Integer, String, String, String, Double> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Short, Short, Boolean, Integer, String, String, String, Double> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return IncidenceEntry.INCIDENCE_ENTRY.ID;
    }

    @Override
    public Field<Integer> field2() {
        return IncidenceEntry.INCIDENCE_ENTRY.INCIDENCE_DATASET_ID;
    }

    @Override
    public Field<Integer> field3() {
        return IncidenceEntry.INCIDENCE_ENTRY.YEAR;
    }

    @Override
    public Field<Integer> field4() {
        return IncidenceEntry.INCIDENCE_ENTRY.ENDPOINT_GROUP_ID;
    }

    @Override
    public Field<Integer> field5() {
        return IncidenceEntry.INCIDENCE_ENTRY.ENDPOINT_ID;
    }

    @Override
    public Field<Integer> field6() {
        return IncidenceEntry.INCIDENCE_ENTRY.RACE_ID;
    }

    @Override
    public Field<Integer> field7() {
        return IncidenceEntry.INCIDENCE_ENTRY.GENDER_ID;
    }

    @Override
    public Field<Short> field8() {
        return IncidenceEntry.INCIDENCE_ENTRY.START_AGE;
    }

    @Override
    public Field<Short> field9() {
        return IncidenceEntry.INCIDENCE_ENTRY.END_AGE;
    }

    @Override
    public Field<Boolean> field10() {
        return IncidenceEntry.INCIDENCE_ENTRY.PREVALENCE;
    }

    @Override
    public Field<Integer> field11() {
        return IncidenceEntry.INCIDENCE_ENTRY.ETHNICITY_ID;
    }

    @Override
    public Field<String> field12() {
        return IncidenceEntry.INCIDENCE_ENTRY.TIMEFRAME;
    }

    @Override
    public Field<String> field13() {
        return IncidenceEntry.INCIDENCE_ENTRY.UNITS;
    }

    @Override
    public Field<String> field14() {
        return IncidenceEntry.INCIDENCE_ENTRY.DISTRIBUTION;
    }

    @Override
    public Field<Double> field15() {
        return IncidenceEntry.INCIDENCE_ENTRY.STANDARD_ERROR;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getIncidenceDatasetId();
    }

    @Override
    public Integer component3() {
        return getYear();
    }

    @Override
    public Integer component4() {
        return getEndpointGroupId();
    }

    @Override
    public Integer component5() {
        return getEndpointId();
    }

    @Override
    public Integer component6() {
        return getRaceId();
    }

    @Override
    public Integer component7() {
        return getGenderId();
    }

    @Override
    public Short component8() {
        return getStartAge();
    }

    @Override
    public Short component9() {
        return getEndAge();
    }

    @Override
    public Boolean component10() {
        return getPrevalence();
    }

    @Override
    public Integer component11() {
        return getEthnicityId();
    }

    @Override
    public String component12() {
        return getTimeframe();
    }

    @Override
    public String component13() {
        return getUnits();
    }

    @Override
    public String component14() {
        return getDistribution();
    }

    @Override
    public Double component15() {
        return getStandardError();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getIncidenceDatasetId();
    }

    @Override
    public Integer value3() {
        return getYear();
    }

    @Override
    public Integer value4() {
        return getEndpointGroupId();
    }

    @Override
    public Integer value5() {
        return getEndpointId();
    }

    @Override
    public Integer value6() {
        return getRaceId();
    }

    @Override
    public Integer value7() {
        return getGenderId();
    }

    @Override
    public Short value8() {
        return getStartAge();
    }

    @Override
    public Short value9() {
        return getEndAge();
    }

    @Override
    public Boolean value10() {
        return getPrevalence();
    }

    @Override
    public Integer value11() {
        return getEthnicityId();
    }

    @Override
    public String value12() {
        return getTimeframe();
    }

    @Override
    public String value13() {
        return getUnits();
    }

    @Override
    public String value14() {
        return getDistribution();
    }

    @Override
    public Double value15() {
        return getStandardError();
    }

    @Override
    public IncidenceEntryRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value2(Integer value) {
        setIncidenceDatasetId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value3(Integer value) {
        setYear(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value4(Integer value) {
        setEndpointGroupId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value5(Integer value) {
        setEndpointId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value6(Integer value) {
        setRaceId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value7(Integer value) {
        setGenderId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value8(Short value) {
        setStartAge(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value9(Short value) {
        setEndAge(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value10(Boolean value) {
        setPrevalence(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value11(Integer value) {
        setEthnicityId(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value12(String value) {
        setTimeframe(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value13(String value) {
        setUnits(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value14(String value) {
        setDistribution(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord value15(Double value) {
        setStandardError(value);
        return this;
    }

    @Override
    public IncidenceEntryRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Short value8, Short value9, Boolean value10, Integer value11, String value12, String value13, String value14, Double value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IncidenceEntryRecord
     */
    public IncidenceEntryRecord() {
        super(IncidenceEntry.INCIDENCE_ENTRY);
    }

    /**
     * Create a detached, initialised IncidenceEntryRecord
     */
    public IncidenceEntryRecord(Integer id, Integer incidenceDatasetId, Integer year, Integer endpointGroupId, Integer endpointId, Integer raceId, Integer genderId, Short startAge, Short endAge, Boolean prevalence, Integer ethnicityId, String timeframe, String units, String distribution, Double standardError) {
        super(IncidenceEntry.INCIDENCE_ENTRY);

        setId(id);
        setIncidenceDatasetId(incidenceDatasetId);
        setYear(year);
        setEndpointGroupId(endpointGroupId);
        setEndpointId(endpointId);
        setRaceId(raceId);
        setGenderId(genderId);
        setStartAge(startAge);
        setEndAge(endAge);
        setPrevalence(prevalence);
        setEthnicityId(ethnicityId);
        setTimeframe(timeframe);
        setUnits(units);
        setDistribution(distribution);
        setStandardError(standardError);
    }
}
