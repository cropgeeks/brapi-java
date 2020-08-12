package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.variant.*;

public interface BrapiSearchVariantSetServerResource
{
	@Post
	BaseResult<ArrayResult<VariantSet>> postVariantSetSearch(VariantSetSearch search);

	@Post
	BaseResult<SearchResult> postVariantSetSearchAsync(VariantSetSearch search);

	@Get
	BaseResult<ArrayResult<VariantSet>> getVariantSetSearchAsync();
}
