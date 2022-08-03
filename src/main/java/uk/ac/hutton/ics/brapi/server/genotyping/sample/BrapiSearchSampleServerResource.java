package uk.ac.hutton.ics.brapi.server.genotyping.sample;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.sample.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchSampleServerResource
{
	Response postSampleSearch(SampleSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Sample>> getSampleSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
