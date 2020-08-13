package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationVariable;

public interface BrapiObservationVariableServerResource
{
	@Get
	BaseResult<ArrayResult<ObservationVariable>> getObservationVariables();

	@Post
	BaseResult<ArrayResult<ObservationVariable>> postObservationVariables(List<ObservationVariable> newObservationVariables);
}
