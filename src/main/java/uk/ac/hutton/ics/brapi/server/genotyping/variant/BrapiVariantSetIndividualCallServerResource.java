package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.TokenBaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

public interface BrapiVariantSetIndividualCallServerResource
{
	@Get
	TokenBaseResult<CallResult<Call>> getVariantSetByIdCalls();
}
