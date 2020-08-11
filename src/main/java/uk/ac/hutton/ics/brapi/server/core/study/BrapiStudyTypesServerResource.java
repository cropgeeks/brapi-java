package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiStudyTypesServerResource
{
	@Get
	BaseResult<ArrayResult<String>> getStudyTypes();
}
