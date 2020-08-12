package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.attribute.*;
import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiSearchAttributeServerResource
{
	@Post
	BaseResult<ArrayResult<Attribute>> postAttributeSearch(AttributeSearch search);

	@Post
	BaseResult<SearchResult> postAttributeSearchAsync(AttributeSearch search);

	@Get
	BaseResult<ArrayResult<Attribute>> getAttributeSearchAsync();
}
