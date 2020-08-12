package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.call.CallSet;

public interface BrapiCallSetIndividualServerResource
{
	@Get
	BaseResult<CallSet> getCallSetById();
}
