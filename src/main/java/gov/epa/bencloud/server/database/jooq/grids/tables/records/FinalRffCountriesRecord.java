/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.grids.tables.records;


import gov.epa.bencloud.server.database.jooq.grids.tables.FinalRffCountries;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FinalRffCountriesRecord extends UpdatableRecordImpl<FinalRffCountriesRecord> implements Record19<Integer, Long, String, String, String, String, String, String, String, String, Long, String, String, Long, Long, BigDecimal, BigDecimal, BigDecimal, Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>grids.final_rff_countries.gid</code>.
     */
    public void setGid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.gid</code>.
     */
    public Integer getGid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>grids.final_rff_countries.objectid</code>.
     */
    public void setObjectid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.objectid</code>.
     */
    public Long getObjectid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>grids.final_rff_countries.country</code>.
     */
    public void setCountry(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.country</code>.
     */
    public String getCountry() {
        return (String) get(2);
    }

    /**
     * Setter for <code>grids.final_rff_countries.iso</code>.
     */
    public void setIso(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.iso</code>.
     */
    public String getIso() {
        return (String) get(3);
    }

    /**
     * Setter for <code>grids.final_rff_countries.countryaff</code>.
     */
    public void setCountryaff(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.countryaff</code>.
     */
    public String getCountryaff() {
        return (String) get(4);
    }

    /**
     * Setter for <code>grids.final_rff_countries.aff_iso</code>.
     */
    public void setAffIso(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.aff_iso</code>.
     */
    public String getAffIso() {
        return (String) get(5);
    }

    /**
     * Setter for <code>grids.final_rff_countries.country_na</code>.
     */
    public void setCountryNa(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.country_na</code>.
     */
    public String getCountryNa() {
        return (String) get(6);
    }

    /**
     * Setter for <code>grids.final_rff_countries.official_s</code>.
     */
    public void setOfficialS(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.official_s</code>.
     */
    public String getOfficialS() {
        return (String) get(7);
    }

    /**
     * Setter for <code>grids.final_rff_countries.sovereignt</code>.
     */
    public void setSovereignt(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.sovereignt</code>.
     */
    public String getSovereignt() {
        return (String) get(8);
    }

    /**
     * Setter for <code>grids.final_rff_countries.alpha_3_co</code>.
     */
    public void setAlpha_3Co(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.alpha_3_co</code>.
     */
    public String getAlpha_3Co() {
        return (String) get(9);
    }

    /**
     * Setter for <code>grids.final_rff_countries.numeric_co</code>.
     */
    public void setNumericCo(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.numeric_co</code>.
     */
    public Long getNumericCo() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>grids.final_rff_countries.subdivisio</code>.
     */
    public void setSubdivisio(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.subdivisio</code>.
     */
    public String getSubdivisio() {
        return (String) get(11);
    }

    /**
     * Setter for <code>grids.final_rff_countries.internet_c</code>.
     */
    public void setInternetC(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.internet_c</code>.
     */
    public String getInternetC() {
        return (String) get(12);
    }

    /**
     * Setter for <code>grids.final_rff_countries.col</code>.
     */
    public void setCol(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.col</code>.
     */
    public Long getCol() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>grids.final_rff_countries.row</code>.
     */
    public void setRow(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.row</code>.
     */
    public Long getRow() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>grids.final_rff_countries.shape_leng</code>.
     */
    public void setShapeLeng(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.shape_leng</code>.
     */
    public BigDecimal getShapeLeng() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>grids.final_rff_countries.shape_area</code>.
     */
    public void setShapeArea(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.shape_area</code>.
     */
    public BigDecimal getShapeArea() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>grids.final_rff_countries.country_ar</code>.
     */
    public void setCountryAr(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>grids.final_rff_countries.country_ar</code>.
     */
    public BigDecimal getCountryAr() {
        return (BigDecimal) get(17);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public void setGeom(Object value) {
        set(18, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    public Object getGeom() {
        return get(18);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Integer, Long, String, String, String, String, String, String, String, String, Long, String, String, Long, Long, BigDecimal, BigDecimal, BigDecimal, Object> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Integer, Long, String, String, String, String, String, String, String, String, Long, String, String, Long, Long, BigDecimal, BigDecimal, BigDecimal, Object> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.GID;
    }

    @Override
    public Field<Long> field2() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.OBJECTID;
    }

    @Override
    public Field<String> field3() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.COUNTRY;
    }

    @Override
    public Field<String> field4() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.ISO;
    }

    @Override
    public Field<String> field5() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.COUNTRYAFF;
    }

    @Override
    public Field<String> field6() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.AFF_ISO;
    }

    @Override
    public Field<String> field7() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.COUNTRY_NA;
    }

    @Override
    public Field<String> field8() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.OFFICIAL_S;
    }

    @Override
    public Field<String> field9() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.SOVEREIGNT;
    }

    @Override
    public Field<String> field10() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.ALPHA_3_CO;
    }

    @Override
    public Field<Long> field11() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.NUMERIC_CO;
    }

    @Override
    public Field<String> field12() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.SUBDIVISIO;
    }

    @Override
    public Field<String> field13() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.INTERNET_C;
    }

    @Override
    public Field<Long> field14() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.COL;
    }

    @Override
    public Field<Long> field15() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.ROW;
    }

    @Override
    public Field<BigDecimal> field16() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.SHAPE_LENG;
    }

    @Override
    public Field<BigDecimal> field17() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.SHAPE_AREA;
    }

    @Override
    public Field<BigDecimal> field18() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.COUNTRY_AR;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field19() {
        return FinalRffCountries.FINAL_RFF_COUNTRIES.GEOM;
    }

    @Override
    public Integer component1() {
        return getGid();
    }

    @Override
    public Long component2() {
        return getObjectid();
    }

    @Override
    public String component3() {
        return getCountry();
    }

    @Override
    public String component4() {
        return getIso();
    }

    @Override
    public String component5() {
        return getCountryaff();
    }

    @Override
    public String component6() {
        return getAffIso();
    }

    @Override
    public String component7() {
        return getCountryNa();
    }

    @Override
    public String component8() {
        return getOfficialS();
    }

    @Override
    public String component9() {
        return getSovereignt();
    }

    @Override
    public String component10() {
        return getAlpha_3Co();
    }

    @Override
    public Long component11() {
        return getNumericCo();
    }

    @Override
    public String component12() {
        return getSubdivisio();
    }

    @Override
    public String component13() {
        return getInternetC();
    }

    @Override
    public Long component14() {
        return getCol();
    }

    @Override
    public Long component15() {
        return getRow();
    }

    @Override
    public BigDecimal component16() {
        return getShapeLeng();
    }

    @Override
    public BigDecimal component17() {
        return getShapeArea();
    }

    @Override
    public BigDecimal component18() {
        return getCountryAr();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object component19() {
        return getGeom();
    }

    @Override
    public Integer value1() {
        return getGid();
    }

    @Override
    public Long value2() {
        return getObjectid();
    }

    @Override
    public String value3() {
        return getCountry();
    }

    @Override
    public String value4() {
        return getIso();
    }

    @Override
    public String value5() {
        return getCountryaff();
    }

    @Override
    public String value6() {
        return getAffIso();
    }

    @Override
    public String value7() {
        return getCountryNa();
    }

    @Override
    public String value8() {
        return getOfficialS();
    }

    @Override
    public String value9() {
        return getSovereignt();
    }

    @Override
    public String value10() {
        return getAlpha_3Co();
    }

    @Override
    public Long value11() {
        return getNumericCo();
    }

    @Override
    public String value12() {
        return getSubdivisio();
    }

    @Override
    public String value13() {
        return getInternetC();
    }

    @Override
    public Long value14() {
        return getCol();
    }

    @Override
    public Long value15() {
        return getRow();
    }

    @Override
    public BigDecimal value16() {
        return getShapeLeng();
    }

    @Override
    public BigDecimal value17() {
        return getShapeArea();
    }

    @Override
    public BigDecimal value18() {
        return getCountryAr();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public Object value19() {
        return getGeom();
    }

    @Override
    public FinalRffCountriesRecord value1(Integer value) {
        setGid(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value2(Long value) {
        setObjectid(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value3(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value4(String value) {
        setIso(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value5(String value) {
        setCountryaff(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value6(String value) {
        setAffIso(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value7(String value) {
        setCountryNa(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value8(String value) {
        setOfficialS(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value9(String value) {
        setSovereignt(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value10(String value) {
        setAlpha_3Co(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value11(Long value) {
        setNumericCo(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value12(String value) {
        setSubdivisio(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value13(String value) {
        setInternetC(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value14(Long value) {
        setCol(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value15(Long value) {
        setRow(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value16(BigDecimal value) {
        setShapeLeng(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value17(BigDecimal value) {
        setShapeArea(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord value18(BigDecimal value) {
        setCountryAr(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link
     * org.jooq.Binding} to specify how this type should be handled. Deprecation
     * can be turned off using {@literal <deprecationOnUnknownTypes/>} in your
     * code generator configuration.
     */
    @Deprecated
    @Override
    public FinalRffCountriesRecord value19(Object value) {
        setGeom(value);
        return this;
    }

    @Override
    public FinalRffCountriesRecord values(Integer value1, Long value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Long value11, String value12, String value13, Long value14, Long value15, BigDecimal value16, BigDecimal value17, BigDecimal value18, Object value19) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FinalRffCountriesRecord
     */
    public FinalRffCountriesRecord() {
        super(FinalRffCountries.FINAL_RFF_COUNTRIES);
    }

    /**
     * Create a detached, initialised FinalRffCountriesRecord
     */
    public FinalRffCountriesRecord(Integer gid, Long objectid, String country, String iso, String countryaff, String affIso, String countryNa, String officialS, String sovereignt, String alpha_3Co, Long numericCo, String subdivisio, String internetC, Long col, Long row, BigDecimal shapeLeng, BigDecimal shapeArea, BigDecimal countryAr, Object geom) {
        super(FinalRffCountries.FINAL_RFF_COUNTRIES);

        setGid(gid);
        setObjectid(objectid);
        setCountry(country);
        setIso(iso);
        setCountryaff(countryaff);
        setAffIso(affIso);
        setCountryNa(countryNa);
        setOfficialS(officialS);
        setSovereignt(sovereignt);
        setAlpha_3Co(alpha_3Co);
        setNumericCo(numericCo);
        setSubdivisio(subdivisio);
        setInternetC(internetC);
        setCol(col);
        setRow(row);
        setShapeLeng(shapeLeng);
        setShapeArea(shapeArea);
        setCountryAr(countryAr);
        setGeom(geom);
    }
}
