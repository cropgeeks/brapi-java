package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationLevel;

import jakarta.ws.rs.QueryParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiObservationLevelServerResource
{
	BaseResult<ArrayResult<ObservationLevel>> getObservationLevels(@QueryParam("studyDbId") String studyDbId,
																   @QueryParam("trialDbId") String trialDbId,
																   @QueryParam("programDbId") String programDbId)
		throws IOException, SQLException;
}
