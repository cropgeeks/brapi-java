package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.Germplasm;

public interface BrapiGermplasmIndividualServerResource
{
	@Get
	BaseResult<Germplasm> getGermplasmById();

	@Put
	BaseResult<Germplasm> putGermplasmById(Germplasm germplasm);
}
