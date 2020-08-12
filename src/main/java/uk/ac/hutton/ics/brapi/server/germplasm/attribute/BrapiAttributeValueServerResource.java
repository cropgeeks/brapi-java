package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.attribute.AttributeValue;
import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiAttributeValueServerResource
{
	@Get
	BaseResult<ArrayResult<AttributeValue>> getAttributeValues();

	@Post
	BaseResult<ArrayResult<AttributeValue>> postAttributeValues(AttributeValue[] newAttributeValues);
}
