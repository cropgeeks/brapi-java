package uk.ac.hutton.ics.brapi.client;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.map.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.Reference;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.sample.Sample;
import uk.ac.hutton.ics.brapi.resource.genotyping.sample.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.*;

public interface BrapiGenotypingService
{
	@GET("callsets")
	Call<BaseResult<ArrayResult<CallSet>>> getCallsets(
		@Query("callSetDbId") String callSetDbId,
		@Query("callSetName") String callSetName,
		@Query("variantSetDbId") String variantSetDbId,
		@Query("sampleDbId") String sampleDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("callsets/{callSetDbId}")
	Call<BaseResult<CallSet>> getCallSetById(@Path("callSetDbId") String callSetDbId);

	@GET("callsets/{callSetDbId}/calls")
	Call<TokenBaseResult<CallResult<uk.ac.hutton.ics.brapi.resource.genotyping.call.Call>>> getCallSetCalls(
		@Path("callSetDbId") String callSetDbId,
		@Query("expandHomozygotes") String expandHomozygotes,
		@Query("unknownString") String unknownString,
		@Query("sepPhased") String sepPhased,
		@Query("sepUnphased") String sepUnphased,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@POST("search/callsets")
	Call<BaseResult<ArrayResult<CallSet>>> postCallSetSearch(
		@Body CallSetSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/callsets")
	Call<BaseResult<SearchResult>> postCallSetSearchAsync(@Body CallSetSearch search);

	@GET("search/callsets/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<CallSet>>> getCallSetSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("calls")
	Call<TokenBaseResult<CallResult<uk.ac.hutton.ics.brapi.resource.genotyping.call.Call>>> getCalls(
		@Query("callSetDbId") String callSetDbId,
		@Query("variantDbId") String variantDbId,
		@Query("variantSetDbId") String variantSetDbId,
		@Query("expandHomozygotes") String expandHomozygotes,
		@Query("unknownString") String unknownString,
		@Query("sepPhased") String sepPhased,
		@Query("sepUnphased") String sepUnphased,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@POST("search/calls")
	Call<TokenBaseResult<CallResult<uk.ac.hutton.ics.brapi.resource.genotyping.call.Call>>> postCallSearch(
		@Body CallSearch search,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@POST("search/calls")
	Call<BaseResult<SearchResult>> postCallSearchAsync(@Body CallSearch search);

	@GET("search/calls/{searchResultsDbId}")
	Call<TokenBaseResult<CallResult<uk.ac.hutton.ics.brapi.resource.genotyping.call.Call>>> getCallSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@GET("maps")
	Call<BaseResult<ArrayResult<Map>>> getMaps(
		@Query("commonCropName") String commonCropName,
		@Query("mapDbId") String mapDbId,
		@Query("mapPUI") String mapPUI,
		@Query("scientificName") String scientificName,
		@Query("type") String type,
		@Query("programDbId") String programDbId,
		@Query("trialDbId") String trialDbId,
		@Query("studyDbId") String studyDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("maps/{mapDbId}")
	Call<BaseResult<Map>> getMapById(@Path("mapDbId") String mapDbId);

	@GET("maps/{mapDbId}/linkagegroups")
	Call<BaseResult<ArrayResult<LinkageGroup>>> getMapLinkageGroups(
		@Path("mapDbId") String mapDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("markerpositions")
	Call<BaseResult<ArrayResult<MarkerPosition>>> getMarkerPositions(
		@Query("mapDbId") String mapDbId,
		@Query("linkageGroupName") String linkageGroupName,
		@Query("variantDbId") String variantDbId,
		@Query("minPosition") String minPosition,
		@Query("maxPosition") String maxPosition,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/markerpositions")
	Call<BaseResult<ArrayResult<MarkerPosition>>> postMarkerPositionsSearch(
		@Body MarkerPositionSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/markerpositions")
	Call<BaseResult<SearchResult>> postMarkerPositionsSearchAsync(@Body MarkerPositionSearch search);

	@GET("search/markerpositions/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<MarkerPosition>>> getMarkerPositionSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("referencesets")
	Call<BaseResult<ArrayResult<ReferenceSet>>> getReferenceSets(
		@Query("referenceSetDbId") String referenceSetDbId,
		@Query("accession") String accession,
		@Query("assemblyPUI") String assemblyPUI,
		@Query("md5checksum") String md5checksum,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("referencesets/{referenceSetDbId}")
	Call<BaseResult<ReferenceSet>> getReferenceSetById(@Path("referenceSetDbId") String referenceSetDbId);

	@POST("search/referencesets")
	Call<BaseResult<ArrayResult<ReferenceSet>>> postReferenceSetsSearch(
		@Body ReferenceSetSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/referencesets")
	Call<BaseResult<SearchResult>> postReferenceSetsSearchAsync(@Body ReferenceSetSearch search);

	@GET("search/referencesets/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<MarkerPosition>>> getReferenceSetsSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("reference")
	Call<BaseResult<ArrayResult<Reference>>> getReferences(
		@Query("referenceDbId") String referenceDbId,
		@Query("referenceSetDbId") String referenceSetDbId,
		@Query("accession") String accession,
		@Query("md5checksum") String md5checksum,
		@Query("isDerived") String isDerived,
		@Query("minLength") String minLength,
		@Query("maxLength") String maxLength,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("references/{referenceDbId}")
	Call<BaseResult<Reference>> getReferenceById(@Path("referenceDbId") String referenceDbId);

	@GET("references/{referenceDbId}/bases")
	Call<TokenBaseResult<ArrayResult<Base>>> getReferenceBases(
		@Path("referenceDbId") String referenceDbId,
		@Query("start") String start,
		@Query("end") String end,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@POST("search/references")
	Call<BaseResult<ArrayResult<Reference>>> postReferenceSearch(
		@Body ReferenceSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/references")
	Call<BaseResult<SearchResult>> postReferenceSearchAsync(@Body ReferenceSearch search);

	@GET("search/references/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Reference>>> getReferenceSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("samples")
	Call<BaseResult<ArrayResult<Sample>>> getSamples(
		@Query("sampleDbId") String sampleDbId,
		@Query("observationUnitDbId") String observationUnitDbId,
		@Query("plateDbId") String plateDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("studyDbId") String studyDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("samples")
	Call<BaseResult<ArrayResult<Sample>>> postSamples(@Body List<Sample> newSamples);

	@GET("samples/{sampleDbId}")
	Call<BaseResult<Sample>> getSampleById(@Path("sampleDbId") String sampleDbId);

	@PUT("samples/{sampleDbId}")
	Call<BaseResult<Sample>> putSampleById(@Path("sampleDbId") String sampleDbId, @Body Sample sample);

	@POST("search/samples")
	Call<BaseResult<ArrayResult<Sample>>> postSampleSearch(
		@Body SampleSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/samples")
	Call<BaseResult<SearchResult>> postSampleSearchAsync(@Body SampleSearch search);

	@GET("search/samples/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Sample>>> getSampleSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/variantsets")
	Call<BaseResult<ArrayResult<VariantSet>>> postVariantSetSearch(
		@Body VariantSetSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/variantsets")
	Call<BaseResult<SearchResult>> postVariantSetSearchAsync(@Body VariantSetSearch search);

	@GET("search/variantsets/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<VariantSet>>> getVariantSetSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("variantsets")
	Call<BaseResult<ArrayResult<VariantSet>>> getVariantSets(
		@Query("variantSetDbId") String variantSetDbId,
		@Query("variantDbId") String variantDbId,
		@Query("callSetDbId") String callSetDbId,
		@Query("studyDbId") String studyDbId,
		@Query("studyName") String studyName,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("variantsets/extract")
	Call<BaseResult<VariantSet>> postVariantSetExtract(@Body VariantSetExtract extract);

	@GET("variantsets/{variantSetDbId}")
	Call<BaseResult<VariantSet>> getVariantSetById(@Path("variantSetDbId") String variantSetDbId);

	@GET("variantsets/{variantSetDbId}/calls")
	Call<TokenBaseResult<CallResult<uk.ac.hutton.ics.brapi.resource.genotyping.call.Call>>> getVariantSetByIdCalls(
		@Path("variantSetDbId") String variantSetDbId,
		@Query("expandHomozygotes") String expandHomozygotes,
		@Query("unknownString") String unknownString,
		@Query("sepPhased") String sepPhased,
		@Query("sepUnphased") String sepUnphased,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@GET("variantsets/{variantSetDbId}/callsets")
	Call<BaseResult<ArrayResult<CallSet>>> getVariantSetByIdCallSet(
		@Path("variantSetDbId") String variantSetDbId,
		@Query("callSetDbId") String callSetDbId,
		@Query("callSetName") String callSetName,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("variantsets/{variantSetDbId}/variants")
	Call<TokenBaseResult<BaseResult<Variant>>> getVariantSetByIdVariants(
		@Path("variantSetDbId") String variantSetDbId,
		@Query("variantDbId") String variantDbId,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@POST("search/variants")
	Call<TokenBaseResult<CallResult<Variant>>> postVariantSearch(
		@Body VariantSearch search,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@POST("search/variants")
	Call<BaseResult<SearchResult>> postVariantSearchAsync(@Body VariantSearch search);

	@GET("search/variants/{searchResultsDbId}")
	Call<TokenBaseResult<ArrayResult<Variant>>> getVariantSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@GET("variants")
	Call<TokenBaseResult<ArrayResult<Variant>>> getVariants(
		@Query("variantDbId") String variantDbId,
		@Query("variantSetDbId") String variantSetDbId,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@GET("variants/{variantDbId}")
	Call<BaseResult<Variant>> getVariantById(@Path("variantDbId") String variantDbId);

	@GET("variants/{variantDbId}/calls")
	Call<TokenBaseResult<CallResult<uk.ac.hutton.ics.brapi.resource.genotyping.call.Call>>> getVariantByIdCalls(
		@Path("variantDbId") String variantDbId,
		@Query("expandHomozygotes") String expandHomozygotes,
		@Query("unknownString") String unknownString,
		@Query("sepPhased") String sepPhased,
		@Query("sepUnphased") String sepUnphased,
		@Query("pageToken") String pageToken,
		@Query("pageSize") int pageSize
	);

	@GET("vendor/orders")
	Call<BaseResult<ArrayResult<VendorOrder>>> getVendorOrder(
		@Query("orderId") String orderId,
		@Query("submissionId") String submissionId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("vendor/orders")
	Call<BaseResult<ArrayResult<VendorOrder>>> postVerndorOrders(@Body List<VendorOrder> newVendorOrders);

	@GET("vendor/orders/{orderId}/plates")
	Call<BaseResult<ArrayResult<Plate>>> getVendorOrderByIdPlates(
		@Path("orderId") String orderId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("vendor/orders/{orderId}/results")
	Call<BaseResult<ArrayResult<OrderResult>>> getVendorOrderByIdResults(
		@Path("orderId") String orderId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("vendor/orders/{orderId}/status")
	Call<BaseResult<List<String>>> getVendorOrderByIdStatus(@Path("orderId") String orderId);

	@POST("vendor/plates")
	Call<BaseResult<PlateSubmissionResult>> postVendorPlates(@Body PlateSubmission plateSubmission);

	@GET("vendor/plates/{submissionId}")
	Call<BaseResult<PlateSubmission>> getVendorPlateSubmissionById(@Path("submissionId") String submissionId);

	@GET("vendor/specifications")
	Call<BaseResult<VendorSpec>> getVendorSpec();
}
