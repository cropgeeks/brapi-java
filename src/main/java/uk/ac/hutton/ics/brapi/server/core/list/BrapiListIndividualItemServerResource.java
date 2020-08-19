package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.core.list.Lists;

public interface BrapiListIndividualItemServerResource
{
	@Post
	BaseResult<Lists> postListByIdItems(String[] ids);
}
