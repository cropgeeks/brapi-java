package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchObservationUnitServerResource
{
	Response postObservationUnitSearch(ObservationUnitSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Observation>> getObservationUnitSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
