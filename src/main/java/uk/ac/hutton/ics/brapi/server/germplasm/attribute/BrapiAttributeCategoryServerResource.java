package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.attribute.Category;
import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiAttributeCategoryServerResource
{
	@Get
	BaseResult<ArrayResult<Category>> getAttributeCategories();
}
