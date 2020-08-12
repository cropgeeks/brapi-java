package uk.ac.hutton.ics.brapi.server.germplasm.seedlot;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.seedlot.SeedLotTransaction;

public interface BrapiSeedLotTransactionServerResource
{
	@Get
	BaseResult<ArrayResult<SeedLotTransaction>> getSeedLotTransaction();

	@Post
	BaseResult<ArrayResult<SeedLotTransaction>> postSeedLotTransactions(SeedLotTransaction[] newSeedLotTransactions);
}
