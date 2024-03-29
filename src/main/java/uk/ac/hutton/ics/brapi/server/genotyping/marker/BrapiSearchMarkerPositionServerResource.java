package uk.ac.hutton.ics.brapi.server.genotyping.marker;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.map.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchMarkerPositionServerResource
{
	Response postMarkerPositionSearch(MarkerPositionSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<MarkerPosition>> getMarkerPositionSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
