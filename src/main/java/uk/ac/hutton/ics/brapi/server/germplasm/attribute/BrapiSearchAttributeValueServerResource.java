package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchAttributeValueServerResource
{
	Response postAttributeValueSearch(AttributeValueSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<AttributeValue>> getAttributeValueSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;

}
