package uk.ac.hutton.ics.brapi.server.core.location;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.location.Location;

public interface BrapiLocationIndividualServerResource
{
	@Get
	BaseResult<Location> getLocationById();

	@Put
	BaseResult<Location> putLocationById(Location newLocation);
}
