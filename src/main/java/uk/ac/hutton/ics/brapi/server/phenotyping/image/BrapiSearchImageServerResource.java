package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchImageServerResource
{
	Response postImageSearch(ImageSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Image>> getImageSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
