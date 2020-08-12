package uk.ac.hutton.ics.brapi.client;

import java.util.*;

import okhttp3.*;
import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.*;
import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.attribute.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.event.Event;
import uk.ac.hutton.ics.brapi.resource.image.*;
import uk.ac.hutton.ics.brapi.resource.observation.*;
import uk.ac.hutton.ics.brapi.resource.ontology.Ontology;

public interface BrapiPhenotypingService
{
	@GET("events")
	Call<BaseResult<ArrayResult<Event>>> getEvents(
		@Query("studyDbId") String studyDbId,
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("eventDbId") String eventDbId,
		@Query("eventType") String eventType,
		@Query("dateRangeStart") String dateRangeStart,
		@Query("dateRangeEnd") String dateRangeEnd,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("images")
	Call<BaseResult<ArrayResult<Image>>> getImages(
		@Query("imageDbId") String imageDbId,
		@Query("imageName") String imageName,
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("observationDbId") String observationDbId,
		@Query("descriptiveOntologyTerm") String descriptiveOntologyTerm,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("images")
	Call<BaseResult<ArrayResult<Image>>> postImages(@Body List<Image> newImages);

	@GET("images/{imageDbId}")
	Call<BaseResult<Image>> getImageById(@Path("imageDbId") String imageDbId);

	@PUT("images/{imageDbId}")
	Call<BaseResult<Image>> putImageById(@Path("imageDbId") String imageDbId, @Body Image image);

	@Multipart
	@POST("images/{imageDbId}/imagecontent")
	Call<BaseResult<Image>> postImageByIdContent(@Path("imageDbId") String imageDbId, @Part MultipartBody.Part file);

	@POST("search/images")
	Call<BaseResult<ArrayResult<Image>>> postImageSearch(
		@Body ImageSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/images")
	Call<BaseResult<SearchResult>> postImageSearchAsync(@Body ImageSearch search);

	@GET("search/images/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Image>>> getImageSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("methods")
	Call<BaseResult<ArrayResult<Method>>> getMethods(
		@Query("methodDbId") String methodDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("methods")
	Call<BaseResult<ArrayResult<Method>>> postMethods(@Body List<Method> newMethods);

	@GET("methods/{methodDbId}")
	Call<BaseResult<Method>> getMethodById(@Path("methodDbId") String methodDbId);

	@PUT("methods/{methodDbId}")
	Call<BaseResult<Method>> putMethodById(@Path("methodDbId") String methodDbId, @Body Method method);

	@GET("observationlevels")
	Call<BaseResult<ArrayResult<ObservationLevel>>> getObservationLevels(
		@Query("studyDbId") String studyDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("observationunits")
	Call<BaseResult<ArrayResult<ObservationUnit>>> getObservationUnits(
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("studyDbId") String studyDbId,
		@Query("locationDbId") String locationDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("observationUnitLevelName") String observationUnitLevelName,
		@Query("observationUnitLevelOrder") String observationUnitLevelOrder,
		@Query("observationUnitLevelCode") String observationUnitLevelCode,
		@Query("includeObservations") String includeObservations,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("observationunits")
	Call<BaseResult<ArrayResult<ObservationUnit>>> postObservationUnits(@Body List<ObservationUnit> newObservationUnits);

	@PUT("observationunits")
	Call<BaseResult<ArrayResult<ObservationUnit>>> putObservationUnits(@Body Map<String, ObservationUnit> observationUnits);

	@Headers("Accept: application/json")
	@GET("observationunits/table")
	Call<BaseResult<TableResult<String[][]>>> getObservationUnitTableJson(
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("studyDbId") String studyDbId,
		@Query("locationDbId") String locationDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("observationLevel") String observationLevel
	);

	@Headers("Accept: text/csv, text/tab-separated-values")
	@Streaming
	@GET("observationunits/table")
	Call<ResponseBody> getObservationUnitTableFile(
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("studyDbId") String studyDbId,
		@Query("locationDbId") String locationDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("observationLevel") String observationLevel
	);

	@GET("observationunits/{observationUnitDbId}")
	Call<BaseResult<ObservationUnit>> getObservationUnitById(@Path("observationUnitDbId") String observationUnitDbId);

	@PUT("observationunits/{observationUnitDbId}")
	Call<BaseResult<ObservationUnit>> putObservationUnitById(@Path("observationUnitDbId") String observationUnitDbId, @Body ObservationUnit observationUnit);

	@POST("search/observationunits")
	Call<BaseResult<ArrayResult<ObservationUnit>>> postObservationUnitSearch(
		@Body ObservationUnitSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/observationunits")
	Call<BaseResult<SearchResult>> postObservationUnitSearchAsync(@Body ObservationUnitSearch search);

	@GET("search/observationunits/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<ObservationUnit>>> getObservationUnitSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/variables")
	Call<BaseResult<ArrayResult<ObservationVariable>>> postObservationVariableSearch(
		@Body ObservationVariableSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/variables")
	Call<BaseResult<SearchResult>> postObservationVariableSearchAsync(@Body ObservationVariableSearch search);

	@GET("search/variables/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<ObservationVariable>>> getObservationVariableSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("variables")
	Call<BaseResult<ArrayResult<ObservationVariable>>> getObservationVariables(
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("traitClass") String traitClass,
		@Query("studyDbId") String studyDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("variables")
	Call<BaseResult<ArrayResult<ObservationVariable>>> postObservationVariables(@Body List<ObservationVariable> newObservationVariables);

	@GET("variables/{observationVariableDbId}")
	Call<BaseResult<ObservationVariable>> getObservationVariableById(@Path("observationVariableDbId") String observationVariableDbId);

	@PUT("variables/{observationVariableDbId}")
	Call<BaseResult<ObservationVariable>> putObservationVariableByID(@Path("observationVariableDbId") String observationVariableDbId, @Body ObservationVariable observationVariable);

	@GET("observations")
	Call<BaseResult<ArrayResult<Observation>>> getObservations(
		@Query("observationDbId") String observationDbId,
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("studyDbId") String studyDbId,
		@Query("locationDbId") String locationDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("observationUnitLevelName") String observationUnitLevelName,
		@Query("observationUnitLevelOrder") String observationUnitLevelOrder,
		@Query("observationUnitLevelCode") String observationUnitLevelCode,
		@Query("observationTimeStampRangeStart") String observationTimeStampRangeStart,
		@Query("observationTimeStampRangeEnd") String observationTimeStampRangeEnd,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("observations")
	Call<BaseResult<ArrayResult<Observation>>> postObservations(@Body List<Observation> newObservations);

	@PUT("observations")
	Call<BaseResult<ArrayResult<Observation>>> putOnservations(@Body Map<String, Observation> observations);

	@Headers("Accept: application/json")
	@GET("observation/table")
	Call<BaseResult<TableResult<String[][]>>> getObservationTableJson(
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("studyDbId") String studyDbId,
		@Query("locationDbId") String locationDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("observationLevel") String observationLevel,
		@Query("searchResultsDbId") String searchResultsDbId,
		@Query("observationTimeStampRangeStart") String observationTimeStampRangeStart,
		@Query("observationTimeStampRangeEnd") String observationTimeStampRangeEnd
	);

	@Headers("Accept: text/csv, text/tab-separated-values")
	@Streaming
	@GET("observation/table")
	Call<ResponseBody> getObservationTableFile(
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("studyDbId") String studyDbId,
		@Query("locationDbId") String locationDbId,
		@Query("trialDbId") String trialDbId,
		@Query("programDbId") String programDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("observationLevel") String observationLevel,
		@Query("searchResultsDbId") String searchResultsDbId,
		@Query("observationTimeStampRangeStart") String observationTimeStampRangeStart,
		@Query("observationTimeStampRangeEnd") String observationTimeStampRangeEnd
	);

	@GET("observations/{observationDbId}")
	Call<BaseResult<Observation>> getObservationById(@Path("observationDbId") String observationDbId);

	@PUT("observations/{observationDbId}")
	Call<BaseResult<Observation>> putObservationById(@Path("observationDbId") String observationDbId, @Body Observation observation);

	@POST("search/observations")
	Call<BaseResult<ArrayResult<Observation>>> postObservationSearch(
		@Body ObservationSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/observations")
	Call<BaseResult<SearchResult>> postObservationSearchAsync(@Body ObservationSearch search);

	@GET("search/observations/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Observation>>> getObservationSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("ontologies")
	Call<BaseResult<ArrayResult<Ontology>>> getOntologies(
		@Query("ontologyDbId") String ontologyDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("scales")
	Call<BaseResult<ArrayResult<Scale>>> getScales(
		@Query("scaleDbId") String scaleDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("scales")
	Call<BaseResult<ArrayResult<Scale>>> postScales(@Body List<Scale> newScales);

	@GET("scales/{scaleDbId}")
	Call<BaseResult<Scale>> getScaleById(@Path("scaleDbId") String scaleDbId);

	@PUT("scales/{scaleDbId}")
	Call<BaseResult<Scale>> putScaleById(@Path("scaleDbId") String scaleDbId, @Body Scale scale);

	@GET("traits")
	Call<BaseResult<ArrayResult<Trait>>> getTraits(
		@Query("traitDbId") String traitDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("traits")
	Call<BaseResult<ArrayResult<Trait>>> postTraits(@Body List<Trait> newTraits);

	@GET("traits/{traitDbId}")
	Call<BaseResult<Trait>> getTraitById(@Path("traitDbId") String traitDbId);

	@PUT("traits/{traitDbId}")
	Call<BaseResult<Trait>> putTraitById(@Path("traitDbId") String traitDbId, @Body Trait trait);
}
