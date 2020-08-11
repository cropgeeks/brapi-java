package uk.ac.hutton.ics.brapi.server.genotyping.call;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.call.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchCallServerResource extends IBaseServerResource<ArrayResult<Call>>
{
	@Post
	TokenBaseResult<ArrayResult<Call>> postJson(CallSearch search);
}
