package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchGermplasmServerResource
{
	Response postGermplasmSearch(GermplasmSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Germplasm>> getGermplasmSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
