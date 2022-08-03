package uk.ac.hutton.ics.brapi.server.core.study;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.study.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchStudyServerResource
{
	Response postStudySearch(StudySearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Study>> getStudySearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
