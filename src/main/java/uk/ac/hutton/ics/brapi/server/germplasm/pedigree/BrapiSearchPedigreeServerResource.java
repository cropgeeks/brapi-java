package uk.ac.hutton.ics.brapi.server.germplasm.pedigree;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.Pedigree;
import uk.ac.hutton.ics.brapi.resource.germplasm.pedigree.PedigreeSearch;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchPedigreeServerResource
{
	Response postPedigreeSearch(PedigreeSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Pedigree>> getPedigreeSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
