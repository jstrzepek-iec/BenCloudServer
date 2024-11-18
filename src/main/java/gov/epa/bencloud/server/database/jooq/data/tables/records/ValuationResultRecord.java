/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.data.tables.records;


import gov.epa.bencloud.server.database.jooq.data.tables.ValuationResult;

import org.jooq.Field;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ValuationResultRecord extends TableRecordImpl<ValuationResultRecord> implements Record16<Integer, Integer, Integer, Integer, Integer, Long, Double, Double, Double, Double, Double, Double, Double, Double[], Integer, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>data.valuation_result.valuation_result_dataset_id</code>.
     */
    public void setValuationResultDatasetId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>data.valuation_result.valuation_result_dataset_id</code>.
     */
    public Integer getValuationResultDatasetId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>data.valuation_result.vf_id</code>.
     */
    public void setVfId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>data.valuation_result.vf_id</code>.
     */
    public Integer getVfId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>data.valuation_result.hif_id</code>.
     */
    public void setHifId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>data.valuation_result.hif_id</code>.
     */
    public Integer getHifId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>data.valuation_result.grid_col</code>.
     */
    public void setGridCol(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>data.valuation_result.grid_col</code>.
     */
    public Integer getGridCol() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>data.valuation_result.grid_row</code>.
     */
    public void setGridRow(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>data.valuation_result.grid_row</code>.
     */
    public Integer getGridRow() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>data.valuation_result.grid_cell_id</code>.
     */
    public void setGridCellId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>data.valuation_result.grid_cell_id</code>.
     */
    public Long getGridCellId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>data.valuation_result.population</code>.
     */
    public void setPopulation(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>data.valuation_result.population</code>.
     */
    public Double getPopulation() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>data.valuation_result.result</code>.
     */
    public void setResult(Double value) {
        set(7, value);
    }

    /**
     * Getter for <code>data.valuation_result.result</code>.
     */
    public Double getResult() {
        return (Double) get(7);
    }

    /**
     * Setter for <code>data.valuation_result.result_mean</code>.
     */
    public void setResultMean(Double value) {
        set(8, value);
    }

    /**
     * Getter for <code>data.valuation_result.result_mean</code>.
     */
    public Double getResultMean() {
        return (Double) get(8);
    }

    /**
     * Setter for <code>data.valuation_result.standard_dev</code>.
     */
    public void setStandardDev(Double value) {
        set(9, value);
    }

    /**
     * Getter for <code>data.valuation_result.standard_dev</code>.
     */
    public Double getStandardDev() {
        return (Double) get(9);
    }

    /**
     * Setter for <code>data.valuation_result.result_variance</code>.
     */
    public void setResultVariance(Double value) {
        set(10, value);
    }

    /**
     * Getter for <code>data.valuation_result.result_variance</code>.
     */
    public Double getResultVariance() {
        return (Double) get(10);
    }

    /**
     * Setter for <code>data.valuation_result.pct_2_5</code>.
     */
    public void setPct_2_5(Double value) {
        set(11, value);
    }

    /**
     * Getter for <code>data.valuation_result.pct_2_5</code>.
     */
    public Double getPct_2_5() {
        return (Double) get(11);
    }

    /**
     * Setter for <code>data.valuation_result.pct_97_5</code>.
     */
    public void setPct_97_5(Double value) {
        set(12, value);
    }

    /**
     * Getter for <code>data.valuation_result.pct_97_5</code>.
     */
    public Double getPct_97_5() {
        return (Double) get(12);
    }

    /**
     * Setter for <code>data.valuation_result.percentiles</code>.
     */
    public void setPercentiles(Double[] value) {
        set(13, value);
    }

    /**
     * Getter for <code>data.valuation_result.percentiles</code>.
     */
    public Double[] getPercentiles() {
        return (Double[]) get(13);
    }

    /**
     * Setter for <code>data.valuation_result.hif_instance_id</code>.
     */
    public void setHifInstanceId(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>data.valuation_result.hif_instance_id</code>.
     */
    public Integer getHifInstanceId() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>data.valuation_result.vf_instance_id</code>.
     */
    public void setVfInstanceId(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>data.valuation_result.vf_instance_id</code>.
     */
    public Integer getVfInstanceId() {
        return (Integer) get(15);
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Integer, Integer, Integer, Integer, Integer, Long, Double, Double, Double, Double, Double, Double, Double, Double[], Integer, Integer> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Integer, Integer, Integer, Integer, Integer, Long, Double, Double, Double, Double, Double, Double, Double, Double[], Integer, Integer> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return ValuationResult.VALUATION_RESULT.VALUATION_RESULT_DATASET_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ValuationResult.VALUATION_RESULT.VF_ID;
    }

    @Override
    public Field<Integer> field3() {
        return ValuationResult.VALUATION_RESULT.HIF_ID;
    }

    @Override
    public Field<Integer> field4() {
        return ValuationResult.VALUATION_RESULT.GRID_COL;
    }

    @Override
    public Field<Integer> field5() {
        return ValuationResult.VALUATION_RESULT.GRID_ROW;
    }

    @Override
    public Field<Long> field6() {
        return ValuationResult.VALUATION_RESULT.GRID_CELL_ID;
    }

    @Override
    public Field<Double> field7() {
        return ValuationResult.VALUATION_RESULT.POPULATION;
    }

    @Override
    public Field<Double> field8() {
        return ValuationResult.VALUATION_RESULT.RESULT;
    }

    @Override
    public Field<Double> field9() {
        return ValuationResult.VALUATION_RESULT.RESULT_MEAN;
    }

    @Override
    public Field<Double> field10() {
        return ValuationResult.VALUATION_RESULT.STANDARD_DEV;
    }

    @Override
    public Field<Double> field11() {
        return ValuationResult.VALUATION_RESULT.RESULT_VARIANCE;
    }

    @Override
    public Field<Double> field12() {
        return ValuationResult.VALUATION_RESULT.PCT_2_5;
    }

    @Override
    public Field<Double> field13() {
        return ValuationResult.VALUATION_RESULT.PCT_97_5;
    }

    @Override
    public Field<Double[]> field14() {
        return ValuationResult.VALUATION_RESULT.PERCENTILES;
    }

    @Override
    public Field<Integer> field15() {
        return ValuationResult.VALUATION_RESULT.HIF_INSTANCE_ID;
    }

    @Override
    public Field<Integer> field16() {
        return ValuationResult.VALUATION_RESULT.VF_INSTANCE_ID;
    }

    @Override
    public Integer component1() {
        return getValuationResultDatasetId();
    }

    @Override
    public Integer component2() {
        return getVfId();
    }

    @Override
    public Integer component3() {
        return getHifId();
    }

    @Override
    public Integer component4() {
        return getGridCol();
    }

    @Override
    public Integer component5() {
        return getGridRow();
    }

    @Override
    public Long component6() {
        return getGridCellId();
    }

    @Override
    public Double component7() {
        return getPopulation();
    }

    @Override
    public Double component8() {
        return getResult();
    }

    @Override
    public Double component9() {
        return getResultMean();
    }

    @Override
    public Double component10() {
        return getStandardDev();
    }

    @Override
    public Double component11() {
        return getResultVariance();
    }

    @Override
    public Double component12() {
        return getPct_2_5();
    }

    @Override
    public Double component13() {
        return getPct_97_5();
    }

    @Override
    public Double[] component14() {
        return getPercentiles();
    }

    @Override
    public Integer component15() {
        return getHifInstanceId();
    }

    @Override
    public Integer component16() {
        return getVfInstanceId();
    }

    @Override
    public Integer value1() {
        return getValuationResultDatasetId();
    }

    @Override
    public Integer value2() {
        return getVfId();
    }

    @Override
    public Integer value3() {
        return getHifId();
    }

    @Override
    public Integer value4() {
        return getGridCol();
    }

    @Override
    public Integer value5() {
        return getGridRow();
    }

    @Override
    public Long value6() {
        return getGridCellId();
    }

    @Override
    public Double value7() {
        return getPopulation();
    }

    @Override
    public Double value8() {
        return getResult();
    }

    @Override
    public Double value9() {
        return getResultMean();
    }

    @Override
    public Double value10() {
        return getStandardDev();
    }

    @Override
    public Double value11() {
        return getResultVariance();
    }

    @Override
    public Double value12() {
        return getPct_2_5();
    }

    @Override
    public Double value13() {
        return getPct_97_5();
    }

    @Override
    public Double[] value14() {
        return getPercentiles();
    }

    @Override
    public Integer value15() {
        return getHifInstanceId();
    }

    @Override
    public Integer value16() {
        return getVfInstanceId();
    }

    @Override
    public ValuationResultRecord value1(Integer value) {
        setValuationResultDatasetId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value2(Integer value) {
        setVfId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value3(Integer value) {
        setHifId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value4(Integer value) {
        setGridCol(value);
        return this;
    }

    @Override
    public ValuationResultRecord value5(Integer value) {
        setGridRow(value);
        return this;
    }

    @Override
    public ValuationResultRecord value6(Long value) {
        setGridCellId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value7(Double value) {
        setPopulation(value);
        return this;
    }

    @Override
    public ValuationResultRecord value8(Double value) {
        setResult(value);
        return this;
    }

    @Override
    public ValuationResultRecord value9(Double value) {
        setResultMean(value);
        return this;
    }

    @Override
    public ValuationResultRecord value10(Double value) {
        setStandardDev(value);
        return this;
    }

    @Override
    public ValuationResultRecord value11(Double value) {
        setResultVariance(value);
        return this;
    }

    @Override
    public ValuationResultRecord value12(Double value) {
        setPct_2_5(value);
        return this;
    }

    @Override
    public ValuationResultRecord value13(Double value) {
        setPct_97_5(value);
        return this;
    }

    @Override
    public ValuationResultRecord value14(Double[] value) {
        setPercentiles(value);
        return this;
    }

    @Override
    public ValuationResultRecord value15(Integer value) {
        setHifInstanceId(value);
        return this;
    }

    @Override
    public ValuationResultRecord value16(Integer value) {
        setVfInstanceId(value);
        return this;
    }

    @Override
    public ValuationResultRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Integer value5, Long value6, Double value7, Double value8, Double value9, Double value10, Double value11, Double value12, Double value13, Double[] value14, Integer value15, Integer value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ValuationResultRecord
     */
    public ValuationResultRecord() {
        super(ValuationResult.VALUATION_RESULT);
    }

    /**
     * Create a detached, initialised ValuationResultRecord
     */
    public ValuationResultRecord(Integer valuationResultDatasetId, Integer vfId, Integer hifId, Integer gridCol, Integer gridRow, Long gridCellId, Double population, Double result, Double resultMean, Double standardDev, Double resultVariance, Double pct_2_5, Double pct_97_5, Double[] percentiles, Integer hifInstanceId, Integer vfInstanceId) {
        super(ValuationResult.VALUATION_RESULT);

        setValuationResultDatasetId(valuationResultDatasetId);
        setVfId(vfId);
        setHifId(hifId);
        setGridCol(gridCol);
        setGridRow(gridRow);
        setGridCellId(gridCellId);
        setPopulation(population);
        setResult(result);
        setResultMean(resultMean);
        setStandardDev(standardDev);
        setResultVariance(resultVariance);
        setPct_2_5(pct_2_5);
        setPct_97_5(pct_97_5);
        setPercentiles(percentiles);
        setHifInstanceId(hifInstanceId);
        setVfInstanceId(vfInstanceId);
    }
}
