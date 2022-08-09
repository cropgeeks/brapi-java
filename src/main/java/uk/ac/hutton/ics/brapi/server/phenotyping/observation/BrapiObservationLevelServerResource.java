package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationLevel;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiObservationLevelServerResource
{
	BaseResult<ArrayResult<ObservationLevel>> getObservationLevels(@QueryParam("programDbId") String programDbId,
																   @QueryParam("trialDbId") String trialDbId,
																   @QueryParam("studyDbId") String studyDbId)
		throws IOException, SQLException;
}
