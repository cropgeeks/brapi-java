package uk.ac.hutton.ics.brapi.server.core.trial;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.trial.*;

public interface BrapiSearchTrialServerResource
{
	@Post
	BaseResult<ArrayResult<Trial>> postTrialSearch(TrialSearch search);

	@Post
	BaseResult<SearchResult> postTrialSearchAsync(TrialSearch search);

	@Get
	BaseResult<ArrayResult<Trial>> getTrialSearchAsync();
}
