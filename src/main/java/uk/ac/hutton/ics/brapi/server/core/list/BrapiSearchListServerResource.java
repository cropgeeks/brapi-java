package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchListServerResource extends IBaseServerResource<ArrayResult<Lists>>
{
	@Post
	BaseResult<ArrayResult<Lists>> postJson(ListSearch search);
}
