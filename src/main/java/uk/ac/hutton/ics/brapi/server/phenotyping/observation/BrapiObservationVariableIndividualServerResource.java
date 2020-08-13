package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationVariable;

public interface BrapiObservationVariableIndividualServerResource
{
	@Get
	BaseResult<ObservationVariable> getObservationVariableById();

	@Put
	BaseResult<ObservationVariable> putObservationVariableById(ObservationVariable observationVariable);
}
