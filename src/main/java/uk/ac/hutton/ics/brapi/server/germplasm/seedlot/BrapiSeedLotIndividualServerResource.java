package uk.ac.hutton.ics.brapi.server.germplasm.seedlot;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.seedlot.SeedLot;

public interface BrapiSeedLotIndividualServerResource
{
	@Get
	BaseResult<SeedLot> getSeedLotById();

	@Put
	BaseResult<SeedLot> putSeedLotById(SeedLot seedLot);
}
