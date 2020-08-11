package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.list.Lists;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiListIndividualServerResource
{
	@Get
	BaseResult<ArrayResult<Lists>> getListsById();

	@Put
	BaseResult<Lists> putListById(Lists updatedLists);

	@Post
	BaseResult<Lists> postJson(String[] ids);
}
