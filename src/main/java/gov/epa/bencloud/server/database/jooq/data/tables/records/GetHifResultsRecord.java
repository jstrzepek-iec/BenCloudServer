/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.GetHifResults;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetHifResultsRecord extends TableRecordImpl<GetHifResultsRecord> implements Record17<Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.get_hif_results.grid_col</code>.
     */
    public void setGridCol(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.get_hif_results.grid_col</code>.
     */
    public Integer getGridCol() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.get_hif_results.grid_row</code>.
     */
    public void setGridRow(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.get_hif_results.grid_row</code>.
     */
    public Integer getGridRow() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.get_hif_results.hif_id</code>.
     */
    public void setHifId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.get_hif_results.hif_id</code>.
     */
    public Integer getHifId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.get_hif_results.hif_instance_id</code>.
     */
    public void setHifInstanceId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.get_hif_results.hif_instance_id</code>.
     */
    public Integer getHifInstanceId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.get_hif_results.point_estimate</code>.
     */
    public void setPointEstimate(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.get_hif_results.point_estimate</code>.
     */
    public Double getPointEstimate() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>data.get_hif_results.population</code>.
     */
    public void setPopulation(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.get_hif_results.population</code>.
     */
    public Double getPopulation() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>data.get_hif_results.baseline_aq</code>.
     */
    public void setBaselineAq(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.get_hif_results.baseline_aq</code>.
     */
    public Double getBaselineAq() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>data.get_hif_results.scenario_aq</code>.
     */
    public void setScenarioAq(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.get_hif_results.scenario_aq</code>.
     */
    public Double getScenarioAq() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>data.get_hif_results.delta_aq</code>.
     */
    public void setDeltaAq(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.get_hif_results.delta_aq</code>.
     */
    public Double getDeltaAq() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>data.get_hif_results.incidence</code>.
     */
    public void setIncidence(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.get_hif_results.incidence</code>.
     */
    public Double getIncidence() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>data.get_hif_results.mean</code>.
     */
    public void setMean(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.get_hif_results.mean</code>.
     */
    public Double getMean() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>data.get_hif_results.baseline</code>.
     */
    public void setBaseline(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>data.get_hif_results.baseline</code>.
     */
    public Double getBaseline() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>data.get_hif_results.standard_dev</code>.
     */
    public void setStandardDev(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.get_hif_results.standard_dev</code>.
     */
    public Double getStandardDev() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>data.get_hif_results.variance</code>.
     */
    public void setVariance(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>data.get_hif_results.variance</code>.
     */
    public Double getVariance() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>data.get_hif_results.pct_2_5</code>.
     */
    public void setPct_2_5(Double value) {
        set(14, value);
    }

    /**
     * Getter for <code>data.get_hif_results.pct_2_5</code>.
     */
    public Double getPct_2_5() {
        return (Double) get(14);
    }

    /**
     * Setter for <code>data.get_hif_results.pct_97_5</code>.
     */
    public void setPct_97_5(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>data.get_hif_results.pct_97_5</code>.
     */
    public Double getPct_97_5() {
        return (Double) get(15);
    }

    /**
     * Setter for <code>data.get_hif_results.percentiles</code>.
     */
    public void setPercentiles(Double[] value) {
        set(16, value);
    }

    /**
     * Getter for <code>data.get_hif_results.percentiles</code>.
     */
    public Double[] getPercentiles() {
        return (Double[]) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double[]> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double[]> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GetHifResults.GET_HIF_RESULTS.GRID_COL;
    }

    @Override
    public Field<Integer> field2() {
        return GetHifResults.GET_HIF_RESULTS.GRID_ROW;
    }

    @Override
    public Field<Integer> field3() {
        return GetHifResults.GET_HIF_RESULTS.HIF_ID;
    }

    @Override
    public Field<Integer> field4() {
        return GetHifResults.GET_HIF_RESULTS.HIF_INSTANCE_ID;
    }

    @Override
    public Field<Double> field5() {
        return GetHifResults.GET_HIF_RESULTS.POINT_ESTIMATE;
    }

    @Override
    public Field<Double> field6() {
        return GetHifResults.GET_HIF_RESULTS.POPULATION;
    }

    @Override
    public Field<Double> field7() {
        return GetHifResults.GET_HIF_RESULTS.BASELINE_AQ;
    }

    @Override
    public Field<Double> field8() {
        return GetHifResults.GET_HIF_RESULTS.SCENARIO_AQ;
    }

    @Override
    public Field<Double> field9() {
        return GetHifResults.GET_HIF_RESULTS.DELTA_AQ;
    }

    @Override
    public Field<Double> field10() {
        return GetHifResults.GET_HIF_RESULTS.INCIDENCE;
    }

    @Override
    public Field<Double> field11() {
        return GetHifResults.GET_HIF_RESULTS.MEAN;
    }

    @Override
    public Field<Double> field12() {
        return GetHifResults.GET_HIF_RESULTS.BASELINE;
    }

    @Override
    public Field<Double> field13() {
        return GetHifResults.GET_HIF_RESULTS.STANDARD_DEV;
    }

    @Override
    public Field<Double> field14() {
        return GetHifResults.GET_HIF_RESULTS.VARIANCE;
    }

    @Override
    public Field<Double> field15() {
        return GetHifResults.GET_HIF_RESULTS.PCT_2_5;
    }

    @Override
    public Field<Double> field16() {
        return GetHifResults.GET_HIF_RESULTS.PCT_97_5;
    }

    @Override
    public Field<Double[]> field17() {
        return GetHifResults.GET_HIF_RESULTS.PERCENTILES;
    }

    @Override
    public Integer component1() {
        return getGridCol();
    }

    @Override
    public Integer component2() {
        return getGridRow();
    }

    @Override
    public Integer component3() {
        return getHifId();
    }

    @Override
    public Integer component4() {
        return getHifInstanceId();
    }

    @Override
    public Double component5() {
        return getPointEstimate();
    }

    @Override
    public Double component6() {
        return getPopulation();
    }

    @Override
    public Double component7() {
        return getBaselineAq();
    }

    @Override
    public Double component8() {
        return getScenarioAq();
    }

    @Override
    public Double component9() {
        return getDeltaAq();
    }

    @Override
    public Double component10() {
        return getIncidence();
    }

    @Override
    public Double component11() {
        return getMean();
    }

    @Override
    public Double component12() {
        return getBaseline();
    }

    @Override
    public Double component13() {
        return getStandardDev();
    }

    @Override
    public Double component14() {
        return getVariance();
    }

    @Override
    public Double component15() {
        return getPct_2_5();
    }

    @Override
    public Double component16() {
        return getPct_97_5();
    }

    @Override
    public Double[] component17() {
        return getPercentiles();
    }

    @Override
    public Integer value1() {
        return getGridCol();
    }

    @Override
    public Integer value2() {
        return getGridRow();
    }

    @Override
    public Integer value3() {
        return getHifId();
    }

    @Override
    public Integer value4() {
        return getHifInstanceId();
    }

    @Override
    public Double value5() {
        return getPointEstimate();
    }

    @Override
    public Double value6() {
        return getPopulation();
    }

    @Override
    public Double value7() {
        return getBaselineAq();
    }

    @Override
    public Double value8() {
        return getScenarioAq();
    }

    @Override
    public Double value9() {
        return getDeltaAq();
    }

    @Override
    public Double value10() {
        return getIncidence();
    }

    @Override
    public Double value11() {
        return getMean();
    }

    @Override
    public Double value12() {
        return getBaseline();
    }

    @Override
    public Double value13() {
        return getStandardDev();
    }

    @Override
    public Double value14() {
        return getVariance();
    }

    @Override
    public Double value15() {
        return getPct_2_5();
    }

    @Override
    public Double value16() {
        return getPct_97_5();
    }

    @Override
    public Double[] value17() {
        return getPercentiles();
    }

    @Override
    public GetHifResultsRecord value1(Integer value) {
        setGridCol(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value2(Integer value) {
        setGridRow(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value3(Integer value) {
        setHifId(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value4(Integer value) {
        setHifInstanceId(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value5(Double value) {
        setPointEstimate(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value6(Double value) {
        setPopulation(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value7(Double value) {
        setBaselineAq(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value8(Double value) {
        setScenarioAq(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value9(Double value) {
        setDeltaAq(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value10(Double value) {
        setIncidence(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value11(Double value) {
        setMean(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value12(Double value) {
        setBaseline(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value13(Double value) {
        setStandardDev(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value14(Double value) {
        setVariance(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value15(Double value) {
        setPct_2_5(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value16(Double value) {
        setPct_97_5(value);
        return this;
    }

    @Override
    public GetHifResultsRecord value17(Double[] value) {
        setPercentiles(value);
        return this;
    }

    @Override
    public GetHifResultsRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Double value5, Double value6, Double value7, Double value8, Double value9, Double value10, Double value11, Double value12, Double value13, Double value14, Double value15, Double value16, Double[] value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetHifResultsRecord
     */
    public GetHifResultsRecord() {
        super(GetHifResults.GET_HIF_RESULTS);
    }

    /**
     * Create a detached, initialised GetHifResultsRecord
     */
    public GetHifResultsRecord(Integer gridCol, Integer gridRow, Integer hifId, Integer hifInstanceId, Double pointEstimate, Double population, Double baselineAq, Double scenarioAq, Double deltaAq, Double incidence, Double mean, Double baseline, Double standardDev, Double variance, Double pct_2_5, Double pct_97_5, Double[] percentiles) {
        super(GetHifResults.GET_HIF_RESULTS);

        setGridCol(gridCol);
        setGridRow(gridRow);
        setHifId(hifId);
        setHifInstanceId(hifInstanceId);
        setPointEstimate(pointEstimate);
        setPopulation(population);
        setBaselineAq(baselineAq);
        setScenarioAq(scenarioAq);
        setDeltaAq(deltaAq);
        setIncidence(incidence);
        setMean(mean);
        setBaseline(baseline);
        setStandardDev(standardDev);
        setVariance(variance);
        setPct_2_5(pct_2_5);
        setPct_97_5(pct_97_5);
        setPercentiles(percentiles);
    }
}
