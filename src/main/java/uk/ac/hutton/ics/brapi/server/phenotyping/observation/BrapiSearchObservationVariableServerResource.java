package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchObservationVariableServerResource
{
	Response postObservationVariableSearch(ObservationVariableSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<ObservationVariable>> getObservationVariableSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
