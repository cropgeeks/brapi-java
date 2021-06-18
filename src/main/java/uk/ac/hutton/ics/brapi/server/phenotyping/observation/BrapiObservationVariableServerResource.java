package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationVariable;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiObservationVariableServerResource
{
	BaseResult<ArrayResult<ObservationVariable>> getObservationVariables(@QueryParam("observationVariableDbId") String observationVariableDbId,
																		 @QueryParam("traitClass") String traitClass,
																		 @QueryParam("studyDbId") String studyDbId,
																		 @QueryParam("externalReferenceID") String externalReferenceID,
																		 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<ObservationVariable>> postObservationVariables(List<ObservationVariable> newObservationVariables)
		throws IOException, SQLException;

	BaseResult<ObservationVariable> getObservationVariableById(@PathParam("observationVariableDbId") String observationVariableDbId)
		throws IOException, SQLException;

	BaseResult<ObservationVariable> putObservationVariableById(@PathParam("observationVariableDbId") String observationVariableDbId, ObservationVariable observationVariable)
		throws IOException, SQLException;
}
