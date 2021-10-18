/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.HifResult;

import org.jooq.Field;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HifResultRecord extends TableRecordImpl<HifResultRecord> implements Record15<Integer, Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>data.hif_result.hif_result_dataset_id</code>.
     */
    public void setHifResultDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>data.hif_result.hif_result_dataset_id</code>.
     */
    public Integer getHifResultDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.hif_result.hif_id</code>.
     */
    public void setHifId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.hif_result.hif_id</code>.
     */
    public Integer getHifId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.hif_result.grid_col</code>.
     */
    public void setGridCol(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.hif_result.grid_col</code>.
     */
    public Integer getGridCol() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.hif_result.grid_row</code>.
     */
    public void setGridRow(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.hif_result.grid_row</code>.
     */
    public Integer getGridRow() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.hif_result.grid_cell_id</code>.
     */
    public void setGridCellId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.hif_result.grid_cell_id</code>.
     */
    public Integer getGridCellId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.hif_result.population</code>.
     */
    public void setPopulation(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.hif_result.population</code>.
     */
    public Double getPopulation() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>data.hif_result.delta</code>.
     */
    public void setDelta(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.hif_result.delta</code>.
     */
    public Double getDelta() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>data.hif_result.result</code>.
     */
    public void setResult(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.hif_result.result</code>.
     */
    public Double getResult() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>data.hif_result.baseline</code>.
     */
    public void setBaseline(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.hif_result.baseline</code>.
     */
    public Double getBaseline() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>data.hif_result.result_mean</code>.
     */
    public void setResultMean(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.hif_result.result_mean</code>.
     */
    public Double getResultMean() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>data.hif_result.standard_dev</code>.
     */
    public void setStandardDev(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.hif_result.standard_dev</code>.
     */
    public Double getStandardDev() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>data.hif_result.result_variance</code>.
     */
    public void setResultVariance(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>data.hif_result.result_variance</code>.
     */
    public Double getResultVariance() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>data.hif_result.pct_2_5</code>.
     */
    public void setPct_2_5(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.hif_result.pct_2_5</code>.
     */
    public Double getPct_2_5() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>data.hif_result.pct_97_5</code>.
     */
    public void setPct_97_5(Double value) {
        set(13, value);
    }

    /**
     * Getter for <code>data.hif_result.pct_97_5</code>.
     */
    public Double getPct_97_5() {
        return (Double) get(13);
    }

    /**
     * Setter for <code>data.hif_result.percentiles</code>.
     */
    public void setPercentiles(Double[] value) {
        set(14, value);
    }

    /**
     * Getter for <code>data.hif_result.percentiles</code>.
     */
    public Double[] getPercentiles() {
        return (Double[]) get(14);
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double[]> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Integer, Integer, Integer, Integer, Integer, Double, Double, Double, Double, Double, Double, Double, Double, Double, Double[]> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return HifResult.HIF_RESULT.HIF_RESULT_DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return HifResult.HIF_RESULT.HIF_ID;
    }

    @Override
    public Field<Integer> field3() {
        return HifResult.HIF_RESULT.GRID_COL;
    }

    @Override
    public Field<Integer> field4() {
        return HifResult.HIF_RESULT.GRID_ROW;
    }

    @Override
    public Field<Integer> field5() {
        return HifResult.HIF_RESULT.GRID_CELL_ID;
    }

    @Override
    public Field<Double> field6() {
        return HifResult.HIF_RESULT.POPULATION;
    }

    @Override
    public Field<Double> field7() {
        return HifResult.HIF_RESULT.DELTA;
    }

    @Override
    public Field<Double> field8() {
        return HifResult.HIF_RESULT.RESULT;
    }

    @Override
    public Field<Double> field9() {
        return HifResult.HIF_RESULT.BASELINE;
    }

    @Override
    public Field<Double> field10() {
        return HifResult.HIF_RESULT.RESULT_MEAN;
    }

    @Override
    public Field<Double> field11() {
        return HifResult.HIF_RESULT.STANDARD_DEV;
    }

    @Override
    public Field<Double> field12() {
        return HifResult.HIF_RESULT.RESULT_VARIANCE;
    }

    @Override
    public Field<Double> field13() {
        return HifResult.HIF_RESULT.PCT_2_5;
    }

    @Override
    public Field<Double> field14() {
        return HifResult.HIF_RESULT.PCT_97_5;
    }

    @Override
    public Field<Double[]> field15() {
        return HifResult.HIF_RESULT.PERCENTILES;
    }

    @Override
    public Integer component1() {
        return getHifResultDatasetId();
    }

    @Override
    public Integer component2() {
        return getHifId();
    }

    @Override
    public Integer component3() {
        return getGridCol();
    }

    @Override
    public Integer component4() {
        return getGridRow();
    }

    @Override
    public Integer component5() {
        return getGridCellId();
    }

    @Override
    public Double component6() {
        return getPopulation();
    }

    @Override
    public Double component7() {
        return getDelta();
    }

    @Override
    public Double component8() {
        return getResult();
    }

    @Override
    public Double component9() {
        return getBaseline();
    }

    @Override
    public Double component10() {
        return getResultMean();
    }

    @Override
    public Double component11() {
        return getStandardDev();
    }

    @Override
    public Double component12() {
        return getResultVariance();
    }

    @Override
    public Double component13() {
        return getPct_2_5();
    }

    @Override
    public Double component14() {
        return getPct_97_5();
    }

    @Override
    public Double[] component15() {
        return getPercentiles();
    }

    @Override
    public Integer value1() {
        return getHifResultDatasetId();
    }

    @Override
    public Integer value2() {
        return getHifId();
    }

    @Override
    public Integer value3() {
        return getGridCol();
    }

    @Override
    public Integer value4() {
        return getGridRow();
    }

    @Override
    public Integer value5() {
        return getGridCellId();
    }

    @Override
    public Double value6() {
        return getPopulation();
    }

    @Override
    public Double value7() {
        return getDelta();
    }

    @Override
    public Double value8() {
        return getResult();
    }

    @Override
    public Double value9() {
        return getBaseline();
    }

    @Override
    public Double value10() {
        return getResultMean();
    }

    @Override
    public Double value11() {
        return getStandardDev();
    }

    @Override
    public Double value12() {
        return getResultVariance();
    }

    @Override
    public Double value13() {
        return getPct_2_5();
    }

    @Override
    public Double value14() {
        return getPct_97_5();
    }

    @Override
    public Double[] value15() {
        return getPercentiles();
    }

    @Override
    public HifResultRecord value1(Integer value) {
        setHifResultDatasetId(value);
        return this;
    }

    @Override
    public HifResultRecord value2(Integer value) {
        setHifId(value);
        return this;
    }

    @Override
    public HifResultRecord value3(Integer value) {
        setGridCol(value);
        return this;
    }

    @Override
    public HifResultRecord value4(Integer value) {
        setGridRow(value);
        return this;
    }

    @Override
    public HifResultRecord value5(Integer value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public HifResultRecord value6(Double value) {
        setPopulation(value);
        return this;
    }

    @Override
    public HifResultRecord value7(Double value) {
        setDelta(value);
        return this;
    }

    @Override
    public HifResultRecord value8(Double value) {
        setResult(value);
        return this;
    }

    @Override
    public HifResultRecord value9(Double value) {
        setBaseline(value);
        return this;
    }

    @Override
    public HifResultRecord value10(Double value) {
        setResultMean(value);
        return this;
    }

    @Override
    public HifResultRecord value11(Double value) {
        setStandardDev(value);
        return this;
    }

    @Override
    public HifResultRecord value12(Double value) {
        setResultVariance(value);
        return this;
    }

    @Override
    public HifResultRecord value13(Double value) {
        setPct_2_5(value);
        return this;
    }

    @Override
    public HifResultRecord value14(Double value) {
        setPct_97_5(value);
        return this;
    }

    @Override
    public HifResultRecord value15(Double[] value) {
        setPercentiles(value);
        return this;
    }

    @Override
    public HifResultRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Double value6, Double value7, Double value8, Double value9, Double value10, Double value11, Double value12, Double value13, Double value14, Double[] value15) {
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
     * Create a detached HifResultRecord
     */
    public HifResultRecord() {
        super(HifResult.HIF_RESULT);
    }

    /**
     * Create a detached, initialised HifResultRecord
     */
    public HifResultRecord(Integer hifResultDatasetId, Integer hifId, Integer gridCol, Integer gridRow, Integer gridCellId, Double population, Double delta, Double result, Double baseline, Double resultMean, Double standardDev, Double resultVariance, Double pct_2_5, Double pct_97_5, Double[] percentiles) {
        super(HifResult.HIF_RESULT);

        setHifResultDatasetId(hifResultDatasetId);
        setHifId(hifId);
        setGridCol(gridCol);
        setGridRow(gridRow);
        setGridCellId(gridCellId);
        setPopulation(population);
        setDelta(delta);
        setResult(result);
        setBaseline(baseline);
        setResultMean(resultMean);
        setStandardDev(standardDev);
        setResultVariance(resultVariance);
        setPct_2_5(pct_2_5);
        setPct_97_5(pct_97_5);
        setPercentiles(percentiles);
    }
}