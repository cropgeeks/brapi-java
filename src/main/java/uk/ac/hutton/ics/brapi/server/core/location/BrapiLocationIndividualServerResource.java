package uk.ac.hutton.ics.brapi.server.core.location;

import org.restlet.resource.Put;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.location.Location;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiLocationIndividualServerResource extends IBaseServerResource<Location>
{
	@Put
	BaseResult<Location> postJson(Location newLocation);
}
