package uk.ac.hutton.ics.brapi.server.germplasm.breedingmethod;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.BreedingMethod;

public interface BrapiBreedingMethodIndividualServerResource
{
	@Get
	BaseResult<BreedingMethod> getBreedingMethodById();
}
