package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.*;

public interface BrapiSearchListServerResource
{
	@Post
	BaseResult<ArrayResult<Lists>> postListSearch(ListSearch search);

	@Post
	BaseResult<SearchResult> postListSearchAsync(ListSearch search);

	@Get
	BaseResult<ArrayResult<Lists>> getListSearchAsync();
}
