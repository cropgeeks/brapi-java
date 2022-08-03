package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchGermplasmServerResource
{
	Response postGermplasmSearch(GermplasmSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Germplasm>> getGermplasmSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
