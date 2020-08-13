package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.Variant;

public interface BrapiVariantServerResource
{
	@Get
	TokenBaseResult<ArrayResult<Variant>> getAllVariants();
}
