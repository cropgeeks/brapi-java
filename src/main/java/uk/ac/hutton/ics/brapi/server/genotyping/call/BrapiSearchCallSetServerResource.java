package uk.ac.hutton.ics.brapi.server.genotyping.call;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchCallSetServerResource
{
	Response postCallSetSearch(CallSetSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<CallSet>> getCallSetSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
