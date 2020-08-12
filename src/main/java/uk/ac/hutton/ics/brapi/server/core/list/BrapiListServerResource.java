package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.Lists;

public interface BrapiListServerResource
{
	@Get
	BaseResult<ArrayResult<Lists>> getLists();

	@Post
	BaseResult<ArrayResult<Lists>> postLists(Lists[] newLists);
}
