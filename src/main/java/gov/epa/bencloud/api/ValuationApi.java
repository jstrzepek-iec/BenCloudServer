package gov.epa.bencloud.api;

import static gov.epa.bencloud.server.database.jooq.data.Tables.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jooq.Cursor;
import org.jooq.DSLContext;
import org.jooq.JSONFormat;
import org.jooq.Result;
import org.jooq.Table;
import org.jooq.exception.DataAccessException;
import org.jooq.exception.IOException;
import org.jooq.JSONFormat.RecordFormat;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Record18;
import org.jooq.Record2;
import org.jooq.impl.DSL;
import org.jooq.tools.json.JSONObject;

import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetHifResultsRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetValuationResultsRecord;
import gov.epa.bencloud.server.tasks.TaskComplete;
import gov.epa.bencloud.server.util.ApplicationUtil;
import gov.epa.bencloud.server.util.ParameterUtil;
import spark.Request;
import spark.Response;

public class ValuationApi {
	
	public static void getValuationResultDetails2(Request request, Response response) {
		
		 //*  :id (valuation results dataset id)
		 //*  gridId= (aggregate the results to another grid definition)
		 //*  hifId= (filter results to those from one or more functions via comma delimited list)
		 //*  vfId= (filter results to those from one or more functions via comma delimited list)
		 //*  page=
		 //*  rowsPerPage=
		 //*  sortBy=
		 //*  descending=
		 //*  filter=
		 
		//TODO: Implement sortBy, descending, and filter
		
		int id = ParameterUtil.getParameterValueAsInteger(request.params("id"), 0);
		String hifIdsParam = request.raw().getParameter("hifId");
		String vfIdsParam = request.raw().getParameter("vfId");
		
		int gridId = ParameterUtil.getParameterValueAsInteger(request.raw().getParameter("gridId"), 0);
		
		int page = ParameterUtil.getParameterValueAsInteger(request.raw().getParameter("page"), 1);
		int rowsPerPage = ParameterUtil.getParameterValueAsInteger(request.raw().getParameter("rowsPerPage"), 100);
		String sortBy = ParameterUtil.getParameterValueAsString(request.raw().getParameter("sortBy"), "");
		boolean descending = ParameterUtil.getParameterValueAsBoolean(request.raw().getParameter("descending"), false);
		String filter = ParameterUtil.getParameterValueAsString(request.raw().getParameter("filter"), "");
		
		List<Integer> hifIds = hifIdsParam == null ? null : Stream.of(hifIdsParam.split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		List<Integer> vfIds = vfIdsParam == null ? null : Stream.of(hifIdsParam.split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		
		if(gridId == 0) {
			gridId = ValuationApi.getBaselineGridForValuationResults(id).intValue();
		}
		
		
		DSLContext create = DSL.using(JooqUtil.getJooqConfiguration());

		Table<GetValuationResultsRecord> vfResultRecords = create.selectFrom(
				GET_VALUATION_RESULTS(
						id, 
						hifIds == null ? null : hifIds.toArray(new Integer[0]),
						vfIds == null ? null : vfIds.toArray(new Integer[0]),
								gridId))
				.asTable("vf_result_records");
		

		Cursor<Record12<Integer, Integer, String, String, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal>> vfRecords = create.select(
				vfResultRecords.field(GET_VALUATION_RESULTS.GRID_COL).as("column"),
				vfResultRecords.field(GET_VALUATION_RESULTS.GRID_ROW).as("row"),
				ENDPOINT.NAME.as("endpoint"),
				VALUATION_FUNCTION.QUALIFIER,
				VALUATION_FUNCTION.START_AGE,
				VALUATION_FUNCTION.END_AGE,
				vfResultRecords.field(GET_VALUATION_RESULTS.POINT_ESTIMATE),
				vfResultRecords.field(GET_VALUATION_RESULTS.MEAN),
				vfResultRecords.field(GET_VALUATION_RESULTS.STANDARD_DEV).as("standard_deviation"),
				vfResultRecords.field(GET_VALUATION_RESULTS.VARIANCE).as("variance"),
				vfResultRecords.field(GET_VALUATION_RESULTS.PCT_2_5),
				vfResultRecords.field(GET_VALUATION_RESULTS.PCT_97_5)
				)
				.from(vfResultRecords)
				.join(VALUATION_RESULT_FUNCTION_CONFIG)
				.on(VALUATION_RESULT_FUNCTION_CONFIG.VALUATION_RESULT_DATASET_ID.eq(id)
						.and(VALUATION_RESULT_FUNCTION_CONFIG.HIF_ID.eq(vfResultRecords.field(GET_VALUATION_RESULTS.HIF_ID)))
						.and(VALUATION_RESULT_FUNCTION_CONFIG.VF_ID.eq(vfResultRecords.field(GET_VALUATION_RESULTS.VF_ID))))
				.join(VALUATION_FUNCTION).on(VALUATION_FUNCTION.ID.eq(vfResultRecords.field(GET_VALUATION_RESULTS.VF_ID)))
				.join(ENDPOINT).on(ENDPOINT.ID.eq(VALUATION_FUNCTION.ENDPOINT_ID))
				.offset((page * rowsPerPage) - rowsPerPage)
				.limit(rowsPerPage)
				.fetchSize(100000).fetchLazy();
		
		
		try {
			if (request.headers("Accept").equalsIgnoreCase("text/csv")) {
				response.type("text/csv");
				String taskFileName = "test.csv";
				response.header("Content-Disposition", "attachment; filename=" + taskFileName);
				response.header("Access-Control-Expose-Headers", "Content-Disposition");
				try {
					vfRecords.formatCSV(response.raw().getWriter());
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
					vfRecords.formatJSON(response.raw().getWriter(), new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (java.io.IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(vfRecords != null && !vfRecords.isClosed()) {
				vfRecords.close();
			}
		}
		
	}
	
	
	
	
	public static void getValuationResultDetails(Request request, Response response) {
		String uuid = request.params("uuid");

		DSLContext create = DSL.using(JooqUtil.getJooqConfiguration());

		Record1<Integer> id = create.select(VALUATION_RESULT_DATASET.ID).from(VALUATION_RESULT_DATASET)
				.where(VALUATION_RESULT_DATASET.TASK_UUID.eq(uuid)).fetchOne();


		Cursor<Record12<Integer, Integer, String, String, Integer, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal>> valuationRecords = create.select(
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
				.orderBy(VALUATION_RESULT.GRID_COL, VALUATION_RESULT.GRID_ROW)
				.fetchSize(100000).fetchLazy();

		try {
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
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(valuationRecords != null && !valuationRecords.isClosed()) {
				valuationRecords.close();
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
	
	public static Object getValuationResultDatasets(Request request, Response response) {
		Result<Record2<String, Integer>> valuationDatasetRecords = DSL.using(JooqUtil.getJooqConfiguration())
				.select(VALUATION_RESULT_DATASET.NAME, VALUATION_RESULT_DATASET.ID)
				.from(VALUATION_RESULT_DATASET)
				.orderBy(VALUATION_RESULT_DATASET.NAME)
				.fetch();
		
		response.type("application/json");
		return valuationDatasetRecords.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
	}
	
	public static Object getValuationResultDatasetFunctions(Request request, Response response) {
		String id = request.params("id");
		
		Result<Record> hifRecords = DSL.using(JooqUtil.getJooqConfiguration())
				.select(VALUATION_FUNCTION.asterisk()
						, DSL.jsonObject(
								HEALTH_IMPACT_FUNCTION.ID
								, HEALTH_IMPACT_FUNCTION.AUTHOR
								, HEALTH_IMPACT_FUNCTION.FUNCTION_YEAR
								, HEALTH_IMPACT_FUNCTION.START_AGE
								, HEALTH_IMPACT_FUNCTION.END_AGE
								, HEALTH_IMPACT_FUNCTION.QUALIFIER
								, HEALTH_IMPACT_FUNCTION.LOCATION
								, HEALTH_IMPACT_FUNCTION.REFERENCE
								)
						.as("hif")
						, ENDPOINT_GROUP.NAME.as("endpoint_group_name")
						, ENDPOINT.NAME.as("endpoint_name")
						)
				.from(VALUATION_FUNCTION)
				.join(ENDPOINT_GROUP).on(VALUATION_FUNCTION.ENDPOINT_GROUP_ID.eq(ENDPOINT_GROUP.ID))
				.join(ENDPOINT).on(VALUATION_FUNCTION.ENDPOINT_ID.eq(ENDPOINT.ID))
				.join(VALUATION_RESULT_FUNCTION_CONFIG).on(VALUATION_RESULT_FUNCTION_CONFIG.VF_ID.eq(VALUATION_FUNCTION.ID))
				.join(HEALTH_IMPACT_FUNCTION).on(HEALTH_IMPACT_FUNCTION.ID.eq(VALUATION_RESULT_FUNCTION_CONFIG.HIF_ID))
				.where(VALUATION_RESULT_FUNCTION_CONFIG.VALUATION_RESULT_DATASET_ID.eq(Integer.valueOf(id)))
				.orderBy(ENDPOINT_GROUP.NAME, ENDPOINT.NAME, VALUATION_FUNCTION.REFERENCE)
				.fetch();
		
		response.type("application/json");
		return hifRecords.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
	}

	public static Integer getBaselineGridForValuationResults(int valuationResultDatasetId) {

		DSLContext create = DSL.using(JooqUtil.getJooqConfiguration());
		
		Record1<Integer> aqId = create
				.select(AIR_QUALITY_LAYER.GRID_DEFINITION_ID)
				.from(VALUATION_RESULT_DATASET)
				.join(HIF_RESULT_DATASET).on(VALUATION_RESULT_DATASET.HIF_RESULT_DATASET_ID.eq(HIF_RESULT_DATASET.ID))
				.join(AIR_QUALITY_LAYER).on(AIR_QUALITY_LAYER.ID.eq(HIF_RESULT_DATASET.BASELINE_AQ_LAYER_ID))
				.where(VALUATION_RESULT_DATASET.ID.eq(valuationResultDatasetId))
				.fetchOne();

		if(aqId == null) {
			return null;
		}
		return aqId.value1();
	}
}
