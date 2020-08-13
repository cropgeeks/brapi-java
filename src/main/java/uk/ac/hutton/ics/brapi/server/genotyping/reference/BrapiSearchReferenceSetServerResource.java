package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.*;

public interface BrapiSearchReferenceSetServerResource
{
	@Post
	BaseResult<ArrayResult<ReferenceSet>> postReferenceSetSearch(ReferenceSetSearch search);

	@Post
	BaseResult<SearchResult> postReferenceSetSearchAsync(ReferenceSetSearch search);

	@Get
	BaseResult<ArrayResult<ReferenceSet>> getReferenceSetSearchAsync();
}
