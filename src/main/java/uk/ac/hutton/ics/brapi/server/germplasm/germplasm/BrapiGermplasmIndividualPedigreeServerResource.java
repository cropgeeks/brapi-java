package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.Pedigree;

public interface BrapiGermplasmIndividualPedigreeServerResource
{
	@Get
	BaseResult<Pedigree> getGermplasmPedigree();
}
