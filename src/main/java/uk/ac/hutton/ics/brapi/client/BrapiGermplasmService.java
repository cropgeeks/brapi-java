package uk.ac.hutton.ics.brapi.client;

import java.util.*;

import retrofit2.Call;
import retrofit2.http.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.plannedcross.PlannedCross;
import uk.ac.hutton.ics.brapi.resource.germplasm.seedlot.*;

public interface BrapiGermplasmService
{
	@GET("crosses")
	Call<BaseResult<ArrayResult<Cross>>> getCrosses(
		@Query("crossingProjectDbId") String crossingProjectDbId,
		@Query("crossDbId") String crossDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("crosses")
	Call<BaseResult<ArrayResult<Cross>>> postCrosses(@Body List<Cross> newCrosses);

	@PUT("crosses")
	Call<BaseResult<Cross>> putCross(@Body Map<String, Cross> crosses);

	@GET("crossingprojects")
	Call<BaseResult<ArrayResult<CrossingProject>>> getCrossingProjects(
		@Query("crossingProjectDbId") String crossingProjectDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("crossingprojects")
	Call<BaseResult<ArrayResult<CrossingProject>>> postCrossingProjects(@Body List<CrossingProject> newCrossingProjects);

	@GET("crossingprojects/{crossingProjectDbId}")
	Call<BaseResult<CrossingProject>> getCrossingProjectById(@Path("crossingProjectDbId") String crossingProjectDbId);

	@PUT("crossingprojects/{crossingProjectDbId}")
	Call<BaseResult<CrossingProject>> putCrossingProjectById(@Path("crossingProjectDbId") String crossingProjectDbId, @Body CrossingProject crossingProject);

	@GET("breedingmethods")
	Call<BaseResult<ArrayResult<BreedingMethod>>> getBreedingMethods(
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("breedingmethods/{breedingMethodDbId}")
	Call<BaseResult<BreedingMethod>> getBreedingMethodById(@Path("breedingMethodDbId") String breedingMethodDbId);

	@GET("germplasm")
	Call<BaseResult<ArrayResult<Germplasm>>> getGermplasm(
		@Query("germplasmPUI") String germplasmPUI,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("germplasmName") String germplasmName,
		@Query("commonCropName") String commonCropName,
		@Query("accessionNumber") String accessionNumber,
		@Query("collection") String collection,
		@Query("genus") String genus,
		@Query("species") String species,
		@Query("studyDbId") String studyDbId,
		@Query("synonym") String synonym,
		@Query("parentDbId") String parentDbId,
		@Query("progenyDbId") String progenyDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("germplasm")
	Call<BaseResult<ArrayResult<Germplasm>>> postGermplasm(@Body List<Germplasm> newGermplasm);

	@GET("germplasm/{germplasmDbId}")
	Call<BaseResult<Germplasm>> getGermplasmById(@Path("germplasmDbId") String germplasmDbId);

	@PUT("germplasm/{germplasmDbId}")
	Call<BaseResult<Germplasm>> putGermplasmById(@Path("germplasmDbId") String germplasmDbId, @Body Germplasm germplasm);

	@GET("germplasm/{germplasmDbId}/mcpd")
	Call<BaseResult<Mcpd>> getGermplasmMcpd(@Path("germplasmDbId") String germplasmDbId);

	@GET("germplasm/{germplasmDbId}/pedigree")
	Call<BaseResult<Pedigree>> getGermplasmPedigree(
		@Path("germplasmDbId") String germplasmDbId,
		@Query("notation") String notation,
		@Query("includeSiblings") String includeSiblings
	);

	@GET("germplasm/{germplasmDbId}/progeny")
	Call<BaseResult<Progeny>> getGermplasmProgeny(@Path("germplasmDbId") String germplasmDbId);

	@POST("search/germplasm")
	Call<BaseResult<ArrayResult<Germplasm>>> postGermplasmSearch(
		@Body GermplasmSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/germplasm")
	Call<BaseResult<SearchResult>> postGermplasmSearchAsync(@Body GermplasmSearch search);

	@GET("search/germplasm/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Germplasm>>> getGermplasmSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("attributevalues")
	Call<BaseResult<ArrayResult<AttributeValue>>> getAttributeValues(
		@Query("attributeValueDbId") String attributeValueDbId,
		@Query("attributeDbId") String attributeDbId,
		@Query("attributeName") String attributeName,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("attributevalues")
	Call<BaseResult<ArrayResult<AttributeValue>>> postAttributeValues(@Body List<AttributeValue> newAttributeValues);

	@GET("attributevalues/{attributeValueDbId}")
	Call<BaseResult<AttributeValue>> getAttributeValueById(@Path("attributeValueDbId") String attributeValueDbId);

	@PUT("attributevalues/{attributeValueDbId}")
	Call<BaseResult<AttributeValue>> putAttributeValueById(@Path("attributeValueDbId") String attributeValueDbId, @Body AttributeValue attributeValue);

	@POST("search/attributevalues")
	Call<BaseResult<ArrayResult<AttributeValue>>> postAttributeValueSearch(
		@Body AttributeValueSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/attributevalues")
	Call<BaseResult<SearchResult>> postAttributeValueSearchAsync(@Body AttributeValueSearch search);

	@GET("search/attributevalues/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<AttributeValue>>> getAttributeValueSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("attributes")
	Call<BaseResult<ArrayResult<Attribute>>> getAttributes(
		@Query("attributeCategory") String attributeCategory,
		@Query("attributeDbId") String attributeDbId,
		@Query("attributeName") String attributeName,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("attributes")
	Call<BaseResult<ArrayResult<Attribute>>> postAttributes(@Body List<Attribute> newAttributes);

	@GET("attributes/categories")
	Call<BaseResult<ArrayResult<Category>>> getAttributeCategories(
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("attributes/{attributeDbId}")
	Call<BaseResult<Attribute>> getAttributeById(@Path("attributeDbId") String attributeDbId);

	@PUT("attributes/{attributeDbId}")
	Call<BaseResult<Attribute>> putAttributeById(@Path("attributeDbId") String attributeDbId, @Body Attribute attribute);

	@POST("search/attributes")
	Call<BaseResult<ArrayResult<Attribute>>> postAttributeSearch(
		@Body AttributeSearch search,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("search/attributes")
	Call<BaseResult<SearchResult>> postAttributeSearchAsync(@Body AttributeSearch search);

	@GET("search/attributes/{searchResultsDbId}")
	Call<BaseResult<ArrayResult<Attribute>>> getAttributeSearchAsync(
		@Path("searchResultsDbId") String searchResultsDbId,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@GET("plannedcrosses")
	Call<BaseResult<ArrayResult<PlannedCross>>> getPlannedCrosses(
		@Query("crossingProjectDbId") String crossingProjectDbId,
		@Query("plannedCrossDbId") String plannedCrossDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("plannedcrosses")
	Call<BaseResult<ArrayResult<PlannedCross>>> postPlannedCrosses(@Body List<PlannedCross> plannedCrosses);

	@PUT("plannedcrosses")
	Call<BaseResult<PlannedCross>> putPlannedCross(@Body Map<String, PlannedCross> plannedCrosses);

	@GET("seedlots")
	Call<BaseResult<ArrayResult<SeedLot>>> getSeedLots(
		@Query("seedLotDbId") String seedLotDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("seedlots")
	Call<BaseResult<ArrayResult<SeedLot>>> postSeedLots(@Body List<SeedLot> newSeedLots);

	@GET("seedlots/transactions")
	Call<BaseResult<ArrayResult<SeedLotTransaction>>> getSeedLotTransaction(
		@Query("transactionDbId") String transactionDbId,
		@Query("seedLotDbId") String seedLotDbId,
		@Query("germplasmDbId") String germplasmDbId,
		@Query("externalReferenceID") String externalReferenceID,
		@Query("externalReferenceSource") String externalReferenceSource,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);

	@POST("seedlots/transactions")
	Call<BaseResult<ArrayResult<SeedLotTransaction>>> postSeedLotTransactions(@Body List<SeedLotTransaction> newSeedLotTransactions);

	@GET("seedlots/{seedLotDbId}")
	Call<BaseResult<SeedLot>> getSeedLotById(@Path("seedLotDbId") String seedLotDbId);

	@PUT("seedlots/{seedLotDbId}")
	Call<BaseResult<SeedLot>> putSeedLotById(@Path("seedLotDbId") String seedLotDbId, @Body SeedLot seedlot);

	@GET("seedlots/{seedLotDbId}/transactions")
	Call<BaseResult<ArrayResult<SeedLot>>> getSeedLotByIdTransactions(
		@Path("seedLotDbId") String seedLotDbId,
		@Query("transactionDbId") String transactionDbId,
		@Query("transactionDirection") String transactionDirection,
		@Query("page") int page,
		@Query("pageSize") int pageSize
	);
}
