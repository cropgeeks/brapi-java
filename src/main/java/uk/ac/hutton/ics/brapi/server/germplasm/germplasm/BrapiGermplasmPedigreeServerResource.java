package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.Pedigree;

public interface BrapiGermplasmPedigreeServerResource
{
	@Get
	BaseResult<Pedigree> getGermplasmPedigree();
}
