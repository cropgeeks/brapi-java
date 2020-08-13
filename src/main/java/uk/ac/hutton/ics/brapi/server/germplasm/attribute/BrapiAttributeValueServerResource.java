package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.AttributeValue;

public interface BrapiAttributeValueServerResource
{
	@Get
	BaseResult<ArrayResult<AttributeValue>> getAttributeValues();

	@Post
	BaseResult<ArrayResult<AttributeValue>> postAttributeValues(AttributeValue[] newAttributeValues);
}
