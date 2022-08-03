package uk.ac.hutton.ics.brapi.server.genotyping.allelematrix;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchAlleleMatrixServerResource
{
	Response postAlleleMatrixSearch(AlleleMatrixSearch search)
		throws SQLException, IOException;

	BaseResult<BaseResult<AlleleMatrix>> getAlleleMatrixSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
