package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.call.CallSet;

public interface BrapiVariantSetCallSetServerResource
{
	@Get
	BaseResult<ArrayResult<CallSet>> getVariantSetByIdCallSet();
}
