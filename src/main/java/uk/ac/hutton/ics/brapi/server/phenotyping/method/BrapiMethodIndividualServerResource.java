package uk.ac.hutton.ics.brapi.server.phenotyping.method;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Method;

public interface BrapiMethodIndividualServerResource
{
	@Get
	BaseResult<Method> getMethodById();

	@Put
	BaseResult<Method> putMethodById();
}
