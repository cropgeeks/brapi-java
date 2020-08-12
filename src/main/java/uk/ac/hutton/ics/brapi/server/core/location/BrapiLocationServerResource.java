package uk.ac.hutton.ics.brapi.server.core.location;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.location.Location;

public interface BrapiLocationServerResource
{
	@Get
	BaseResult<ArrayResult<Location>> getLocations();

	@Post
	BaseResult<ArrayResult<Location>> postLocations(Location[] newLocations);
}
