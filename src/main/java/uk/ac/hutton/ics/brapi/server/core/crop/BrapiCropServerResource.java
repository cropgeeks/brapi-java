package uk.ac.hutton.ics.brapi.server.core.crop;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiCropServerResource
{
	@Get
	BaseResult<ArrayResult<String>> getCommonCropNames();
}
