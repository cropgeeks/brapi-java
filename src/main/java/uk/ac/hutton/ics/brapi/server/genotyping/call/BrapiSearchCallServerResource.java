package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

public interface BrapiSearchCallServerResource
{
	@Post
	TokenBaseResult<CallResult<Call>> postCallSearch(CallSearch search);

	@Post
	BaseResult<SearchResult> postCallSearchAsync(CallSearch search);

	@Get
	TokenBaseResult<CallResult<Call>> getCallSearchAsync();
}
