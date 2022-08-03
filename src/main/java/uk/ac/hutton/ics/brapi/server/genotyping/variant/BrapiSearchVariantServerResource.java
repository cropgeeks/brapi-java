package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchVariantServerResource
{
	Response postVariantSearch(VariantSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Variant>> getVariantSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
