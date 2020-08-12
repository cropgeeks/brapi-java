package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.call.CallSet;

public interface BrapiCallSetServerResource
{
	@Get
	BaseResult<ArrayResult<CallSet>> getCallsets();
}
