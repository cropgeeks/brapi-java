package uk.ac.hutton.ics.brapi.server.genotyping.plate;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.plate.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchPlateServerResource
{
	Response postPlateSearch(PlateSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Plate>> getPlateSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
