package uk.ac.hutton.ics.brapi.server.germplasm.seedlot;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.seedlot.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSeedLotServerResource
{
	BaseResult<ArrayResult<SeedLot>> getSeedLots(@QueryParam("seedLotDbId") String seedLotDbId,
												 @QueryParam("crossDbId") String crossDbId,
												 @QueryParam("crossName") String crossName,
												 @QueryParam("commonCropName") String commonCropName,
												 @QueryParam("programDbId") String programDbId,
												 @QueryParam("germplasmDbId") String germplasmDbId,
												 @QueryParam("germplasmName") String germplasmName,
												 @QueryParam("externalReferenceId") String externalReferenceId,
												 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<SeedLot>> postSeedLots(SeedLot[] newSeedLots)
		throws IOException, SQLException;

	BaseResult<SeedLot> getSeedLotById(@PathParam("seedLotDbId") String seedLotDbId)
		throws IOException, SQLException;

	BaseResult<SeedLot> putSeedLotById(@PathParam("seedLotDbId") String seedLotDbId, SeedLot seedLot)
		throws IOException, SQLException;

	BaseResult<ArrayResult<SeedLotTransaction>> getSeedLotTransaction(@QueryParam("transactionDbId") String transactionDbId,
																	  @QueryParam("seedLotDbId") String seedLotDbId,
																	  @QueryParam("crossDbId") String crossDbId,
																	  @QueryParam("crossName") String crossName,
																	  @QueryParam("commonCropName") String commonCropName,
																	  @QueryParam("programDbId") String programDbId,
																	  @QueryParam("germplasmDbId") String germplasmDbId,
																	  @QueryParam("germplasmName") String germplasmName,
																	  @QueryParam("externalReferenceId") String externalReferenceId,
																	  @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<SeedLotTransaction>> postSeedLotTransactions(SeedLotTransaction[] newSeedLotTransactions)
		throws IOException, SQLException;

	BaseResult<ArrayResult<SeedLot>> getSeedLotByIdTransactions(@PathParam("seedLotDbId") String seedLotDbId,
																@QueryParam("transactionDbId") String transactionDbId,
																@QueryParam("transactionDirection") String transactionDirection)
		throws IOException, SQLException;
}
