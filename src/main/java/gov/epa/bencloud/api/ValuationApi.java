package gov.epa.bencloud.api;

import static gov.epa.bencloud.server.database.jooq.data.Tables.*;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

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
import org.jooq.Record21;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import gov.epa.bencloud.api.model.HIFTaskLog;
import gov.epa.bencloud.api.model.ValuationTaskConfig;
import gov.epa.bencloud.api.model.ValuationTaskLog;
import gov.epa.bencloud.api.util.HIFUtil;
import gov.epa.bencloud.api.util.ValuationUtil;
import gov.epa.bencloud.server.database.JooqUtil;
import gov.epa.bencloud.server.database.jooq.data.tables.records.GetValuationResultsRecord;
import gov.epa.bencloud.server.database.jooq.data.tables.records.ValuationResultDatasetRecord;
import gov.epa.bencloud.server.util.ApplicationUtil;
import gov.epa.bencloud.server.util.ParameterUtil;
import spark.Request;
import spark.Response;

public class ValuationApi {
	private static final Logger log = LoggerFactory.getLogger(ValuationApi.class);
	
	public static void getValuationResultContents(Request request, Response response) {
		
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
		
		String idParam = request.params("id");
		Integer id = idParam.length() == 36 ? ValuationApi.getValuationResultDatasetId(idParam) : Integer.valueOf(idParam);	
		
		String hifIdsParam = request.raw().getParameter("hifId");
		String vfIdsParam = request.raw().getParameter("vfId");
		
		int gridId = ParameterUtil.getParameterValueAsInteger(request.raw().getParameter("gridId"), 0);
		
		int page = ParameterUtil.getParameterValueAsInteger(request.raw().getParameter("page"), 1);
		int rowsPerPage = ParameterUtil.getParameterValueAsInteger(request.raw().getParameter("rowsPerPage"), 1000);
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
		

		Cursor<Record21<Integer, Integer, String, String, String, Integer, String, String, String, String, String, String, String, Integer, Integer, Double, Double, Double, Double, Double, Double>> vfRecords = create.select(
				vfResultRecords.field(GET_VALUATION_RESULTS.GRID_COL).as("column"),
				vfResultRecords.field(GET_VALUATION_RESULTS.GRID_ROW).as("row"),
				ENDPOINT.NAME.as("endpoint"),
				VALUATION_FUNCTION.QUALIFIER.as("name"),
				HEALTH_IMPACT_FUNCTION.AUTHOR,
				HEALTH_IMPACT_FUNCTION.FUNCTION_YEAR.as("year"),
				HEALTH_IMPACT_FUNCTION.QUALIFIER,
				RACE.NAME.as("race"),
				ETHNICITY.NAME.as("ethnicity"),
				GENDER.NAME.as("gender"),
				POLLUTANT_METRIC.NAME.as("metric"),
				SEASONAL_METRIC.NAME.as("seasonal_metric"),
				STATISTIC_TYPE.NAME.as("metric_statistic"),
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
				.join(VALUATION_RESULT_DATASET)
				.on(VALUATION_RESULT_FUNCTION_CONFIG.VALUATION_RESULT_DATASET_ID.eq(VALUATION_RESULT_DATASET.ID))
				.join(HIF_RESULT_FUNCTION_CONFIG)
				.on(VALUATION_RESULT_DATASET.HIF_RESULT_DATASET_ID.eq(HIF_RESULT_FUNCTION_CONFIG.HIF_RESULT_DATASET_ID)
						.and(VALUATION_RESULT_FUNCTION_CONFIG.HIF_ID.eq(HIF_RESULT_FUNCTION_CONFIG.HIF_ID)))
				.join(VALUATION_FUNCTION).on(VALUATION_FUNCTION.ID.eq(vfResultRecords.field(GET_VALUATION_RESULTS.VF_ID)))
				.join(HEALTH_IMPACT_FUNCTION).on(vfResultRecords.field(GET_VALUATION_RESULTS.HIF_ID).eq(HEALTH_IMPACT_FUNCTION.ID))
				.join(ENDPOINT).on(ENDPOINT.ID.eq(VALUATION_FUNCTION.ENDPOINT_ID))
				.join(RACE).on(HIF_RESULT_FUNCTION_CONFIG.RACE_ID.eq(RACE.ID))
				.join(ETHNICITY).on(HIF_RESULT_FUNCTION_CONFIG.ETHNICITY_ID.eq(ETHNICITY.ID))
				.join(GENDER).on(HIF_RESULT_FUNCTION_CONFIG.GENDER_ID.eq(GENDER.ID))
				.join(POLLUTANT_METRIC).on(HIF_RESULT_FUNCTION_CONFIG.METRIC_ID.eq(POLLUTANT_METRIC.ID))
				.leftJoin(SEASONAL_METRIC).on(HIF_RESULT_FUNCTION_CONFIG.SEASONAL_METRIC_ID.eq(SEASONAL_METRIC.ID))
				.join(STATISTIC_TYPE).on(HIF_RESULT_FUNCTION_CONFIG.METRIC_STATISTIC.eq(STATISTIC_TYPE.ID))
				.offset((page * rowsPerPage) - rowsPerPage)
				.limit(rowsPerPage)
				//.fetchSize(100000) //JOOQ doesn't like this when Postgres is in autoCommmit mode
				.fetchLazy();
		
		
		try {
			response.type("application/json");
			vfRecords.formatJSON(response.raw().getWriter(), new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
		} catch (Exception e) {
			log.error("Error in Valuation export", e);
		} finally {
			if(vfRecords != null && !vfRecords.isClosed()) {
				vfRecords.close();
			}
		}
		
	}
	
	public static void getValuationResultExport(Request request, Response response) {
		
		 //*  :id (valuation results dataset id)
		 //*  gridId= (aggregate the results to another grid definition)
		 
		
		String idParam = request.params("id");
		Integer id = idParam.length() == 36 ? ValuationApi.getValuationResultDatasetId(idParam) : Integer.valueOf(idParam);
		
		String gridIdParam = ParameterUtil.getParameterValueAsString(request.raw().getParameter("gridId"), "");
		int[] gridIds = gridIdParam==null ? null : Arrays.stream(gridIdParam.split(","))
			    .mapToInt(Integer::parseInt)
			    .toArray();
		
		// If a gridId wasn't provided, look up the baseline AQ grid grid for this resultset
		if(gridIds == null) {
			gridIds = new int[] {ValuationApi.getBaselineGridForValuationResults(id).intValue()};
		}	
		
		DSLContext create = DSL.using(JooqUtil.getJooqConfiguration());
		response.type("application/zip");
		String taskFileName = ApplicationUtil.replaceNonValidCharacters(ValuationApi.getValuationTaskConfigFromDb(id).name);
		response.header("Content-Disposition", "attachment; filename=" + taskFileName + ".zip");
		response.header("Access-Control-Expose-Headers", "Content-Disposition");

		OutputStream responseOutputStream;
		ZipOutputStream zipStream;
		try {
			// Get response output stream
			responseOutputStream = response.raw().getOutputStream();
			// Stream .ZIP file to response
			zipStream = new ZipOutputStream(responseOutputStream);
		} catch (java.io.IOException e1) {
			log.error("Error getting output stream", e1);
			return;
		}
		
		for(int i=0; i < gridIds.length; i++) {

			Table<GetValuationResultsRecord> vfResultRecords = create.selectFrom(
					GET_VALUATION_RESULTS(
							id, 
							null,
							null ,
							gridIds[i]))
					.asTable("vf_result_records");

			Result<Record21<Integer, Integer, String, String, String, Integer, String, String, String, String, String, String, String, Integer, Integer, Double, Double, Double, Double, Double, Double>> vfRecords = create.select(
					vfResultRecords.field(GET_VALUATION_RESULTS.GRID_COL).as("column"),
					vfResultRecords.field(GET_VALUATION_RESULTS.GRID_ROW).as("row"),
					ENDPOINT.NAME.as("endpoint"),
					VALUATION_FUNCTION.QUALIFIER.as("name"),
					HEALTH_IMPACT_FUNCTION.AUTHOR,
					HEALTH_IMPACT_FUNCTION.FUNCTION_YEAR.as("year"),
					HEALTH_IMPACT_FUNCTION.QUALIFIER,
					RACE.NAME.as("race"),
					ETHNICITY.NAME.as("ethnicity"),
					GENDER.NAME.as("gender"),
					POLLUTANT_METRIC.NAME.as("metric"),
					SEASONAL_METRIC.NAME.as("seasonal_metric"),
					STATISTIC_TYPE.NAME.as("metric_statistic"),
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
					.join(VALUATION_RESULT_DATASET)
					.on(VALUATION_RESULT_FUNCTION_CONFIG.VALUATION_RESULT_DATASET_ID.eq(VALUATION_RESULT_DATASET.ID))
					.join(HIF_RESULT_FUNCTION_CONFIG)
					.on(VALUATION_RESULT_DATASET.HIF_RESULT_DATASET_ID.eq(HIF_RESULT_FUNCTION_CONFIG.HIF_RESULT_DATASET_ID)
							.and(VALUATION_RESULT_FUNCTION_CONFIG.HIF_ID.eq(HIF_RESULT_FUNCTION_CONFIG.HIF_ID)))
					.join(VALUATION_FUNCTION).on(VALUATION_FUNCTION.ID.eq(vfResultRecords.field(GET_VALUATION_RESULTS.VF_ID)))
					.join(HEALTH_IMPACT_FUNCTION).on(vfResultRecords.field(GET_VALUATION_RESULTS.HIF_ID).eq(HEALTH_IMPACT_FUNCTION.ID))
					.join(ENDPOINT).on(ENDPOINT.ID.eq(VALUATION_FUNCTION.ENDPOINT_ID))
					.join(RACE).on(HIF_RESULT_FUNCTION_CONFIG.RACE_ID.eq(RACE.ID))
					.join(ETHNICITY).on(HIF_RESULT_FUNCTION_CONFIG.ETHNICITY_ID.eq(ETHNICITY.ID))
					.join(GENDER).on(HIF_RESULT_FUNCTION_CONFIG.GENDER_ID.eq(GENDER.ID))
					.join(POLLUTANT_METRIC).on(HIF_RESULT_FUNCTION_CONFIG.METRIC_ID.eq(POLLUTANT_METRIC.ID))
					.leftJoin(SEASONAL_METRIC).on(HIF_RESULT_FUNCTION_CONFIG.SEASONAL_METRIC_ID.eq(SEASONAL_METRIC.ID))
					.join(STATISTIC_TYPE).on(HIF_RESULT_FUNCTION_CONFIG.METRIC_STATISTIC.eq(STATISTIC_TYPE.ID))
					.fetch();
			try {
				zipStream.putNextEntry(new ZipEntry(taskFileName + "_" + ApplicationUtil.replaceNonValidCharacters(GridDefinitionApi.getGridDefinitionName(gridIds[i])) + ".csv"));
				vfRecords.formatCSV(zipStream);
			} catch (Exception e) {
				log.error("Error in Valuation export", e);
			} finally {

			}
			
		}
		
		try {
			zipStream.putNextEntry(new ZipEntry(taskFileName + "_TaskLog.txt"));
			
			ValuationTaskLog vfTaskLog = ValuationUtil.getTaskLog(id);
			zipStream.write(vfTaskLog.toString().getBytes());
			
			//Get HifTaskLog and render below valuation log
			zipStream.write("\n".getBytes());
			HIFTaskLog hifTaskLog = HIFUtil.getTaskLog(ValuationUtil.getHifResultDatasetIdForValuationResultDataset(id));
			zipStream.write(hifTaskLog.toString().getBytes());
			
			zipStream.closeEntry();
			
			zipStream.close();
			responseOutputStream.flush();
		} catch (Exception e) {
			log.error("Error writing task log, closing and flushing export", e);
		}
		
	}
	
	public static ValuationTaskConfig getValuationTaskConfigFromDb(Integer valuationResultDatasetId) {
		DSLContext create = DSL.using(JooqUtil.getJooqConfiguration());

		ValuationTaskConfig valuationTaskConfig = new ValuationTaskConfig();
		
		ValuationResultDatasetRecord valuationTaskConfigRecord = create
				.selectFrom(VALUATION_RESULT_DATASET)
				.where(VALUATION_RESULT_DATASET.ID.eq(valuationResultDatasetId))
				.fetchOne();
		
		valuationTaskConfig.name = valuationTaskConfigRecord.getName();
		//TODO: Add code to load the other details
		
		return valuationTaskConfig;
	}
	
	public static Integer getValuationResultDatasetId(String uuid) {

		ValuationResultDatasetRecord valuationResultDataset = DSL.using(JooqUtil.getJooqConfiguration())
		.select(VALUATION_RESULT_DATASET.asterisk())
		.from(VALUATION_RESULT_DATASET)
		.where(VALUATION_RESULT_DATASET.TASK_UUID.eq(uuid))
		.fetchOneInto(VALUATION_RESULT_DATASET);
		
		if(valuationResultDataset == null) {
			return null;
		}
		return valuationResultDataset.getId();
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
			log.error("Error getAllValuationFunctions", e);
		}
		
		response.type("application/json");
		return valuationRecords.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
	}
	
	public static Object getValuationResultDatasets(Request request, Response response) {
		Result<Record> valuationDatasetRecords = DSL.using(JooqUtil.getJooqConfiguration())
				.select(VALUATION_RESULT_DATASET.asterisk())
				.from(VALUATION_RESULT_DATASET)
				.orderBy(VALUATION_RESULT_DATASET.NAME)
				.fetch();
		
		response.type("application/json");
		return valuationDatasetRecords.formatJSON(new JSONFormat().header(false).recordFormat(RecordFormat.OBJECT));
	}
	
	public static Object getValuationResultDatasetFunctions(Request request, Response response) {
		String idParam = request.params("id");
		Integer id = idParam.length() == 36 ? ValuationApi.getValuationResultDatasetId(idParam) : Integer.valueOf(idParam);
		
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
				.where(VALUATION_RESULT_FUNCTION_CONFIG.VALUATION_RESULT_DATASET_ID.eq(id))
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
