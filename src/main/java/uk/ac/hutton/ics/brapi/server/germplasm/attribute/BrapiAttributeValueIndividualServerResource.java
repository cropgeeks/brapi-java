package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.AttributeValue;

public interface BrapiAttributeValueIndividualServerResource
{
	@Get
	BaseResult<AttributeValue> getAttributeValueById();

	@Put
	BaseResult<AttributeValue> putAttributeValueById(AttributeValue attributeValue);
}
