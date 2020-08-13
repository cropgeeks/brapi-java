package uk.ac.hutton.ics.brapi.server.germplasm.seedlot;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.seedlot.SeedLot;

public interface BrapiSeedLotServerResource
{
	@Get
	BaseResult<ArrayResult<SeedLot>> getSeedLots();

	@Post
	BaseResult<ArrayResult<SeedLot>> postSeedLots(SeedLot[] newSeedLots);
}
