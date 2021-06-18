package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchAttributeServerResource
{
	Response postAttributeSearch(AttributeSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Attribute>> getAttributeSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
