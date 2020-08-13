package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Category;

public interface BrapiAttributeCategoryServerResource
{
	@Get
	BaseResult<ArrayResult<Category>> getAttributeCategories();
}
