package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchImageServerResource
{
	Response postImageSearch(ImageSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Image>> getImageSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
