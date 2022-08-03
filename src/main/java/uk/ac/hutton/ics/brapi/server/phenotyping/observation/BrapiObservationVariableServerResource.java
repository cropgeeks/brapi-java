package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationVariable;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiObservationVariableServerResource
{
	BaseResult<ArrayResult<ObservationVariable>> getObservationVariables(@QueryParam("observationVariableDbId") String observationVariableDbId,
																		 @QueryParam("observationVariableName") String observationVariableName,
																		 @QueryParam("observationVariablePUI") String observationVariablePUI,
																		 @QueryParam("traitClass") String traitClass,
																		 @QueryParam("methodDbId") String methodDbId,
																		 @QueryParam("methodName") String methodName,
																		 @QueryParam("methodPUI") String methodPUI,
																		 @QueryParam("scaleDbId") String scaleDbId,
																		 @QueryParam("scaleName") String scaleName,
																		 @QueryParam("scalePUI") String scalePUI,
																		 @QueryParam("traitDbId") String traitDbId,
																		 @QueryParam("traitName") String traitName,
																		 @QueryParam("traitPUI") String traitPUI,
																		 @QueryParam("ontologyDbId") String ontologyDbId,
																		 @QueryParam("commonCropName") String commonCropName,
																		 @QueryParam("programDbId") String programDbId,
																		 @QueryParam("trialDbId") String trialDbId,
																		 @QueryParam("studyDbId") String studyDbId,
																		 @QueryParam("externalReferenceId") String externalReferenceId,
																		 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<ObservationVariable>> postObservationVariables(List<ObservationVariable> newObservationVariables)
		throws IOException, SQLException;

	BaseResult<ObservationVariable> getObservationVariableById(@PathParam("observationVariableDbId") String observationVariableDbId)
		throws IOException, SQLException;

	BaseResult<ObservationVariable> putObservationVariableById(@PathParam("observationVariableDbId") String observationVariableDbId, ObservationVariable observationVariable)
		throws IOException, SQLException;
}
