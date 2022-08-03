package uk.ac.hutton.ics.brapi.server.germplasm.breedingmethod;

import jakarta.ws.rs.PathParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.BreedingMethod;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiBreedingMethodServerResource
{
	BaseResult<ArrayResult<BreedingMethod>> getBreedingMethods()
		throws IOException, SQLException;

	BaseResult<BreedingMethod> getBreedingMethodById(@PathParam("breedingMethodDbId") String breedingMethodDbId)
		throws IOException, SQLException;
}
