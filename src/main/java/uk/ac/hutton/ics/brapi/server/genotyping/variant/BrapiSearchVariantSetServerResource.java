package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchVariantSetServerResource
{
	Response postVariantSetSearch(VariantSetSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<VariantSet>> getVariantSetSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
