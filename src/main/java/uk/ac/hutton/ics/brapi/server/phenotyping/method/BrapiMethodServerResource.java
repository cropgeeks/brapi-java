package uk.ac.hutton.ics.brapi.server.phenotyping.method;

import org.restlet.resource.*;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Method;

public interface BrapiMethodServerResource
{
	@Get
	BaseResult<ArrayResult<Method>> getMethods();

	@Post
	BaseResult<ArrayResult<Method>> postMethods(List<Method> newMethods);
}
