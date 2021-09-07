package gov.epa.bencloud.api;

import static gov.epa.bencloud.server.database.jooq.data.Tables.*;

import java.math.BigDecimal;

import org.jooq.DSLContext;
import org.jooq.JSONFormat;
import org.jooq.Result;
import org.jooq.exception.DataAccessException;
import org.jooq.exception.IOException;
import org.jooq.JSONFormat.RecordFormat;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.impl.DSL;

import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.tasks.TaskComplete;
import gov.epa.bencloud.server.util.ApplicationUtil;
import spark.Request;
import spark.Response;

public class ValuationApi {
	
	public static void getValuationResultDetails(Request request, Response response) {
		String uuid = request.params("uuid");

		DSLContext create = DSL.using(JooqUtil.getJooqConfiguration());

		Record1<Integer> id = create.select(VALUATION_RESULT_DATASET.ID).from(VALUATION_RESULT_DATASET)
				.where(VALUATION_RESULT_DATASET.TASK_UUID.eq(uuid)).fetchOne();


		Result<Record12<Integer, Integer, String, String, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal>> valuationRecords = create.select(
				VALUATION_RESULT.GRID_COL.as("column"),
				VALUATION_RESULT.GRID_ROW.as("row"),
				ENDPOINT.NAME.as("endpoint"),
				VALUATION_FUNCTION.QUALIFIER,
				VALUATION_FUNCTION.START_AGE,
				VALUATION_FUNCTION.END_AGE,
				VALUATION_RESULT.RESULT.as("point_estimate"),
				VALUATION_RESULT.RESULT_MEAN.as("mean"),
				VALUATION_RESULT.STANDARD_DEV.as("standard_deviation"),
				VALUATION_RESULT.RESULT_VARIANCE.as("variance"),
				VALUATION_RESULT.PCT_2_5,
				VALUATION_RESULT.PCT_97_5
				)
				.from(VALUATION_RESULT)
				.join(VALUATION_RESULT_FUNCTION_CONFIG)
				.on(VALUATION_RESULT_FUNCTION_CONFIG.VALUATION_RESULT_DATASET_ID.eq(VALUATION_RESULT.VALUATION_RESULT_DATASET_ID)
						.and(VALUATION_RESULT_FUNCTION_CONFIG.HIF_ID.eq(VALUATION_RESULT.HIF_ID))
						.and(VALUATION_RESULT_FUNCTION_CONFIG.VF_ID.eq(VALUATION_RESULT.VF_ID)))
				.join(VALUATION_FUNCTION).on(VALUATION_FUNCTION.ID.eq(VALUATION_RESULT.VF_ID))
				.join(ENDPOINT).on(ENDPOINT.ID.eq(VALUATION_FUNCTION.ENDPOINT_ID))
				.where(VALUATION_RESULT.VALUATION_RESULT_DATASET_ID.eq(id.value1()))
				.orderBy(VALUATION_RESULT.GRID_COL, VALUATION_RESULT.GRID_ROW).fetch();

		if (request.headers("Accept").equalsIgnoreCase("text/csv")) {
			response.type("text/csv");
			String taskFileName = ApplicationUtil.replaceNonValidCharacters(TaskComplete.getTaskFromCompleteRecord(uuid).getName()) + ".csv";
			response.header("Content-Disposition", "attachment; filename=" + taskFileName);
			response.header("Access-Control-Expose-Headers", "Content-Disposition");
			
			try {
				valuationRecords.formatCSV(response.raw().getWriter());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			response.type("application/json");
			try {
				valuationRecords.formatJSON(response.raw().getWriter(), new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (java.io.IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static Object getAllValuationFunctions(Request request, Response response) {

		Result<Record> valuationRecords = null;
		try {
			valuationRecords = DSL.using(JooqUtil.getJooqConfiguration())
					.select(VALUATION_FUNCTION.asterisk()
							, ENDPOINT_GROUP.NAME.as("endpoint_group_name")
							, ENDPOINT.NAME.as("endpoint_name")
							)
					.from(VALUATION_FUNCTION)
					.join(ENDPOINT_GROUP).on(VALUATION_FUNCTION.ENDPOINT_GROUP_ID.eq(ENDPOINT_GROUP.ID))
					.join(ENDPOINT).on(VALUATION_FUNCTION.ENDPOINT_ID.eq(ENDPOINT.ID))
					.orderBy(ENDPOINT_GROUP.NAME, ENDPOINT.NAME, VALUATION_FUNCTION.QUALIFIER)
					.fetch();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.type("application/json");
		return valuationRecords.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
	}

}
