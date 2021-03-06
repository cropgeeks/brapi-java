package uk.ac.hutton.ics.brapi.server.core.study;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.study.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchStudyServerResource
{
	Response postStudySearch(StudySearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Study>> getStudySearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
