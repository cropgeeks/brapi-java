package uk.ac.hutton.ics.brapi.server.core.location;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.location.Location;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiLocationServerResource
{
	BaseResult<ArrayResult<Location>> getLocations(@QueryParam("locationType") String locationType,
												   @QueryParam("locationDbId") String locationDbId,
												   @QueryParam("externalReferenceID") String externalReferenceID,
												   @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Location>> postLocations(Location[] newLocations)
		throws SQLException, IOException;

	BaseResult<Location> putLocationById(@PathParam("locationDbId") String locationDbId, Location newLocation)
		throws SQLException, IOException;

	BaseResult<Location> getLocationById(@PathParam("locationDbId") String locationDbId)
		throws SQLException, IOException;
}
