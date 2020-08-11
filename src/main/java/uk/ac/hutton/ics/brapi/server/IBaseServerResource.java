package uk.ac.hutton.ics.brapi.server;

import org.restlet.data.Status;
import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;

public interface IBaseServerResource<T>
{
	@Get("json")
	default BaseResult<T> getJson()
	{
		throw new ResourceException(Status.SERVER_ERROR_NOT_IMPLEMENTED);
	}
}
