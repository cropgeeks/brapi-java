package uk.ac.hutton.ics.brapi.server.germplasm.seedlot;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.seedlot.SeedLot;

public interface BrapiSeedLotIndividualTransactionServerResource
{
	@Get
	BaseResult<ArrayResult<SeedLot>> getSeedLotByIdTransactions();
}
