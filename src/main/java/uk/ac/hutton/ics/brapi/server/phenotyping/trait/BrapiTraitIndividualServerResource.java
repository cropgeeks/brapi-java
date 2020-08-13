package uk.ac.hutton.ics.brapi.server.phenotyping.trait;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Trait;

public interface BrapiTraitIndividualServerResource
{
	@Get
	BaseResult<Trait> getTraitById();

	@Put
	BaseResult<Trait> putTraitById(Trait trait);
}
