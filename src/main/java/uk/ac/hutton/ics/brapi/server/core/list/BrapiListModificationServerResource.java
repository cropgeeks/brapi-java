package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.list.Lists;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiListModificationServerResource extends IBaseServerResource<Lists>
{
	@Put
	BaseResult<Lists> putJson(Lists updatedLists);

	@Post
	BaseResult<Lists> postJson(String[] ids);
}
