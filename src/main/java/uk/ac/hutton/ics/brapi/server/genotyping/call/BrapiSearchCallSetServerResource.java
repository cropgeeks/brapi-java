package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.call.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchCallSetServerResource extends IBaseServerResource<ArrayResult<CallSet>>
{
	@Post
	BaseResult<ArrayResult<CallSet>> postJson(CallSetSearch search);
}
