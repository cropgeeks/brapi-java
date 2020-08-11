package uk.ac.hutton.ics.brapi.server.core.location;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.location.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchLocationServerResource extends IBaseServerResource<ArrayResult<Location>>
{
	@Post
	BaseResult<ArrayResult<Location>> postJson(LocationSearch search);
}
