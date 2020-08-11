package uk.ac.hutton.ics.brapi.server.core.crop;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiCoreServerResource extends IBaseServerResource<ArrayResult<String>>
{
	BaseResult<ArrayResult<String>> getJson();
}
