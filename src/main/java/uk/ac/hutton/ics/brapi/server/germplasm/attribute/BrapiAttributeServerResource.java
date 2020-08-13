package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Attribute;

public interface BrapiAttributeServerResource
{
	@Get
	BaseResult<ArrayResult<Attribute>> getAttributes();

	@Post
	BaseResult<ArrayResult<Attribute>> postAttributes(Attribute[] newAttributes);
}
