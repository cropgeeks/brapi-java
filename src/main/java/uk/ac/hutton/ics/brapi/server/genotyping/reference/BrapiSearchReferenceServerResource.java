package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.reference.Reference;
import uk.ac.hutton.ics.brapi.resource.reference.*;

public interface BrapiSearchReferenceServerResource
{
	@Post
	BaseResult<ArrayResult<Reference>> postReferenceSearch(ReferenceSearch search);

	@Post
	BaseResult<SearchResult> postReferenceSearchAsync(ReferenceSearch search);

	@Get
	BaseResult<ArrayResult<Reference>> getReferenceSearchAsync();
}
