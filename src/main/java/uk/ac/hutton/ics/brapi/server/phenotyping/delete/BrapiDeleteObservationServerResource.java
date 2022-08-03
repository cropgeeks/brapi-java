package uk.ac.hutton.ics.brapi.server.phenotyping.delete;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationDelete;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiDeleteObservationServerResource
{
	BaseResult<ArrayResult<String>> deleteObservations(ObservationDelete deleteRequest)
		throws IOException, SQLException;
}
