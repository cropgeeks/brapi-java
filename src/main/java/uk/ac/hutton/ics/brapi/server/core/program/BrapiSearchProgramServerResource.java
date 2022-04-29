package uk.ac.hutton.ics.brapi.server.core.program;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.program.*;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchProgramServerResource
{
	Response postProgramSearch(ProgramSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Program>> getProgramSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
