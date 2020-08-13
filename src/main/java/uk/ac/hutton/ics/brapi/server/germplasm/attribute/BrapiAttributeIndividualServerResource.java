package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Attribute;

public interface BrapiAttributeIndividualServerResource
{
	@Get
	BaseResult<Attribute> getAttributeById();

	@Put
	BaseResult<Attribute> putAttributeById(Attribute attribute);
}
