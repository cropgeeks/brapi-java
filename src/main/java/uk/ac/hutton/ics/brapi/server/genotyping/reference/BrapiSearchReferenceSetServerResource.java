package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchReferenceSetServerResource
{
	Response postReferenceSetSearch(ReferenceSetSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<ReferenceSet>> getReferenceSetSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
