package uk.ac.hutton.ics.brapi.server.core.location;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.*;
import uk.ac.hutton.ics.brapi.resource.location.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchLocationServerResource
{
	@Post
	BaseResult<ArrayResult<Location>> postLocationSearch(LocationSearch search);

	@Post
	BaseResult<SearchResult> postLocationSearchAsync(LocationSearch search);

	@Get
	BaseResult<ArrayResult<Location>> getLocationSearchAsync();
}
