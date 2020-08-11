package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.Lists;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiListServerResource
{
	@Get
	BaseResult<ArrayResult<Lists>> getLists();

	@Post
	BaseResult<ArrayResult<Lists>> postLists(Lists[] newLists);
}
