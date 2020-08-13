package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

public interface BrapiSearchCallSetServerResource
{
	@Post
	BaseResult<ArrayResult<CallSet>> postCallSetSearch(CallSetSearch search);

	@Post
	BaseResult<SearchResult> postCallSetSearchAsync(CallSetSearch search);

	@Get
	BaseResult<ArrayResult<CallSet>> getCallSetSearchAsync();
}
