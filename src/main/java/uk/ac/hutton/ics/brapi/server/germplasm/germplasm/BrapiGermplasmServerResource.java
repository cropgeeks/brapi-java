package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.Germplasm;

public interface BrapiGermplasmServerResource
{
	@Get
	BaseResult<ArrayResult<Germplasm>> getGermplasm();

	@Post
	BaseResult<ArrayResult<Germplasm>> postGermplasm(Germplasm[] newGermplasm);
}
