package uk.ac.hutton.ics.brapi.server.core.location;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.location.*;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchLocationServerResource
{
	Response postLocationSearch(LocationSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Location>> getLocationSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
