package uk.ac.hutton.ics.brapi.server.genotyping.call;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchCallServerResource
{
	Response postCallSearch(CallSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Call>> getCallSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
