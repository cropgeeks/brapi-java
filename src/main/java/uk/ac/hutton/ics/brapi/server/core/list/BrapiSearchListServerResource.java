package uk.ac.hutton.ics.brapi.server.core.list;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.list.*;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchListServerResource
{
	Response postListSearch(ListSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Lists>> getListSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
