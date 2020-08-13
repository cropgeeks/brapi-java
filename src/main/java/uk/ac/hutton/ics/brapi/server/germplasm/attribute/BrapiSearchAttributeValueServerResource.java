package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

public interface BrapiSearchAttributeValueServerResource
{
	@Post
	BaseResult<ArrayResult<AttributeValue>> postAttributeValueSearch(AttributeValueSearch search);

	@Post
	BaseResult<SearchResult> postAttributeValueSearchAsync(AttributeValueSearch search);

	@Get
	BaseResult<ArrayResult<AttributeValue>> getAttributeValueSearchAsync();
}
