package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.TokenBaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

public interface BrapiCallServerResource
{
	@Get
	TokenBaseResult<CallResult<Call>> getCalls();
}
