package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.*;

public interface BrapiSearchGermplasmServerResource
{
	@Post
	BaseResult<ArrayResult<Germplasm>> postGermplasmSearch(GermplasmSearch search);

	@Post
	BaseResult<SearchResult> postGermplasmSearchAsync(GermplasmSearch search);

	@Get
	BaseResult<ArrayResult<Germplasm>> getGermplasmSearchAsync();
}
