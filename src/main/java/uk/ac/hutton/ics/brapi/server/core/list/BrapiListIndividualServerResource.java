package uk.ac.hutton.ics.brapi.server.core.list;

import org.restlet.resource.Put;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.list.Lists;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiListIndividualServerResource extends IBaseServerResource<Lists>
{
	@Put
	BaseResult<Lists> putJson(Lists updatedLists);
}
