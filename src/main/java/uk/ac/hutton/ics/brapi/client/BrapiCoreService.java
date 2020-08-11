package uk.ac.hutton.ics.brapi.client;

import retrofit2.Call;
import retrofit2.http.*;
import uk.ac.hutton.ics.brapi.resource.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.*;
import uk.ac.hutton.ics.brapi.resource.location.*;
import uk.ac.hutton.ics.brapi.resource.people.*;
import uk.ac.hutton.ics.brapi.resource.program.*;
import uk.ac.hutton.ics.brapi.resource.season.Season;
import uk.ac.hutton.ics.brapi.resource.study.*;
import uk.ac.hutton.ics.brapi.resource.trial.*;

public interface BrapiCoreService
{
	@GET("commoncropnames")
	Call<BaseResult<ArrayResult<String>>> getCommonCropNames(
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("lists")
	Call<BaseResult<ArrayResult<Lists>>> getLists(
		@Query("listType") String listType,
		@Query("listName") String listName,
		@Query("listSource") String listSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("lists")
	Call<BaseResult<ArrayResult<Lists>>> postLists(@Body Lists[] newLists);

	@GET("lists/{listDbId}")
	Call<BaseResult<ArrayResult<Lists>>> getListsById(
		@Path("listDbId") String listDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@PUT("lists/{listDbId}")
	Call<BaseResult<Lists>> putListById(@Body Lists updatedLists);

	@POST("lists/{listDbId}/items")
	Call<BaseResult<Lists>> postListItems(@Path("listDbId") String listDbId, @Body String[] ids);

	@POST("search/lists")
	Call<BaseResult<ArrayResult<Lists>>> postListSearch(
		@Body ListSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/lists")
	Call<BaseResult<SearchResult>> postListSearchAsync(@Body ListSearch search);

	@GET("search/lists/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Lists>>> getListSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("locations")
	Call<BaseResult<ArrayResult<Location>>> getLocations(
		@Query("locationType") String locationType,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("locations")
	Call<BaseResult<ArrayResult<Location>>> postLocations(@Body Location[] newLocations);

	@GET("locations/{locationDbId}")
	Call<BaseResult<Location>> getLocation(@Path("locationDbId") String locationDbId);

	@PUT("locations/{locationDbId}")
	Call<BaseResult<Location>> putLocationById(@Path("locationDbId") String locationDbId, @Body Location location);

	@POST("search/locations")
	Call<BaseResult<ArrayResult<Location>>> postLocationSearch(
		@Body LocationSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/locations")
	Call<BaseResult<SearchResult>> postLocationSearchAsync(@Body LocationSearch search);

	@GET("search/locations/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Location>>> getLocationSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("people")
	Call<BaseResult<ArrayResult<Person>>> getPeople(
		@Query("firstName") String firstName,
		@Query("lastName") String lastName,
		@Query("personDbId") String personDbId,
		@Query("userID") String userID,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("people")
	Call<BaseResult<ArrayResult<Person>>> postPeople(@Body Person[] newPeople);

	@GET("people/{personDbId}")
	Call<BaseResult<Person>> getPersonById(@Path("personDbId") String personDbId);

	@PUT("people/{personDbId}")
	Call<BaseResult<Person>> putPersonById(@Path("personDbId") String personDbId, @Body Location location);

	@POST("search/people")
	Call<BaseResult<ArrayResult<Person>>> postPeopleSearch(
		@Body PeopleSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/people")
	Call<BaseResult<SearchResult>> postPeopleSearchAsync(@Body PeopleSearch search);

	@GET("search/people/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Person>>> getPeopleSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("programs")
	Call<BaseResult<ArrayResult<Program>>> getPrograms(
		@Query("cropCommonName") String cropCommonName,
		@Query("programDbId") String programDbId,
		@Query("programName") String programName,
		@Query("abbreviation") String abbreviation,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("programs")
	Call<BaseResult<ArrayResult<Program>>> postPrograms(@Body Program[] newPrograms);

	@GET("programs/{programDbId}")
	Call<BaseResult<Program>> getProgramById(@Path("programDbId") String programDbId);

	@PUT("programs/{programDbId}")
	Call<BaseResult<Program>> putProgramById(@Path("programDbId") String programDbId, @Body Program program);

	@POST("search/programs")
	Call<BaseResult<ArrayResult<Program>>> postProgramSearch(
		@Body ProgramSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/programs")
	Call<BaseResult<SearchResult>> postProgramSearchAsync(@Body ProgramSearch search);

	@GET("search/programs/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Program>>> getProgramSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("seasons")
	Call<BaseResult<ArrayResult<Season>>> getSeasons(
		@Query("seasonDbId") String seasonDbId,
		@Query("season") String season,
		@Query("year") String year,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("seasons")
	Call<BaseResult<ArrayResult<Season>>> postSeasons(@Body Season[] newSeasons);

	@GET("seasons/{seasonDbId}")
	Call<BaseResult<Season>> getSeasonById(@Path("seasonDbId") String seasonDbId);

	@PUT("seasons/{seasonDbId}")
	Call<BaseResult<Season>> putSeasonById(@Path("seasonDbId") String seasonDbId, @Body Season season);

	@GET("serverinfo")
	Call<BaseResult<ServerInfo>> getServerInfo(
		@Query("dataType") String dataType,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/studies")
	Call<BaseResult<ArrayResult<Study>>> postStudySearch(
		@Body StudySearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/studies")
	Call<BaseResult<SearchResult>> postStudySearchAsync(@Body StudySearch search);

	@GET("search/studies/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Study>>> getStudySearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("studies")
	Call<BaseResult<ArrayResult<Study>>> getStudies(
		@Query("commonCropName") String commonCropName,
		@Query("studyType") String studyType,
		@Query("programDbId") String programDbId,
		@Query("locationDbId") String locationDbId,
		@Query("seasonDbId") String seasonDbId,
		@Query("trialDbId") String trialDbId,
		@Query("studyDbId") String studyDbId,
		@Query("studyName") String studyName,
		@Query("studyCode") String studyCode,
		@Query("studyPUI") String studyPUI,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("observationVariableDbId") String observationVariableDbId,
		@Query("active") String active,
		@Query("sortBy") String sortBy,
		@Query("sortOrder") String sortOrder,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("studies")
	Call<BaseResult<ArrayResult<Study>>> postStudies(@Body Study[] newStudies);

	@GET("studies/{studyDbId}")
	Call<BaseResult<Study>> getStudyById(@Path("studyDbId") String studyDbId);

	@PUT("studies/{studyDbId}")
	Call<BaseResult<Study>> putStudyById(@Path("studyDbId") String studyDbId, @Body Study study);

	@GET("studytypes")
	Call<BaseResult<ArrayResult<String>>> getStudyTypes(
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/trials")
	Call<BaseResult<ArrayResult<Trial>>> postTrialSearch(
		@Body TrialSearch search,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("search/trials")
	Call<BaseResult<SearchResult>> postTrialSearchAsync(@Body TrialSearch search);

	@GET("search/trials/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Trial>>> getTrialSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@GET("trials")
	Call<BaseResult<ArrayResult<Trial>>> getTrials(
		@Query("active") String active,
		@Query("commonCropName") String commonCropName,
		@Query("contactDbId") String contactDbId,
		@Query("programDbId") String programDbId,
		@Query("locationDbId") String locationDbId,
		@Query("searchDateRangeStart") String searchDateRangeStart,
		@Query("searchDateRangeEnd") String searchDateRangeEnd,
		@Query("studyDbId") String studyDbId,
		@Query("trialDbId") String trialDbId,
		@Query("trialName") String trialName,
		@Query("trialPUI") String trialPUI,
		@Query("sortBy") String sortBy,
		@Query("sortOrder") String sortOrder,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("pageSize") int pageSize,
		@Query("page") int page
	);

	@POST("trials")
	Call<BaseResult<ArrayResult<Trial>>> postTrials(@Body Trial[] newTrials);

	@GET("trials/{trialDbId}")
	Call<BaseResult<Trial>> getTrialById(@Path("trialDbId") String trialDbId);

	@PUT("trials/{trialDbId}")
	Call<BaseResult<Trial>> putTrialById(@Path("trialDbId") String trialDbId, @Body Trial trial);
}
