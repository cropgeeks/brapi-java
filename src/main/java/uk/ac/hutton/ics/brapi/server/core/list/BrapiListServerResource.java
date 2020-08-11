package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.Lists;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiListServerResource extends IBaseServerResource<ArrayResult<Lists>>
{
	@Post
	BaseResult<ArrayResult<Lists>> postJson(Lists[] newLists);
}
