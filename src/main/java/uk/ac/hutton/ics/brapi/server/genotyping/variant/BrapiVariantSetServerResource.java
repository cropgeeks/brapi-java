package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.VariantSet;

public interface BrapiVariantSetServerResource
{
	@Get
	BaseResult<ArrayResult<VariantSet>> getVariantSets();
}
