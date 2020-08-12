package uk.ac.hutton.ics.brapi.server.genotyping.map;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.map.Map;

public interface BrapiMapServerResource
{
	@Get
	BaseResult<ArrayResult<Map>> getMaps();
}
