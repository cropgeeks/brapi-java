package uk.ac.hutton.ics.brapi.server.germplasm.breedingmethod;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.BreedingMethod;

public interface BrapiBreedingMethodServerResource
{
	@Get
	BaseResult<ArrayResult<BreedingMethod>> getBreedingMethods();
}
