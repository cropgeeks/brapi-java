package uk.ac.hutton.ics.brapi.server.core.trial;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.trial.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchTrialServerResource
{
	Response postTrialSearch(TrialSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Trial>> getTrialSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
