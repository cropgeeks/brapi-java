package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationLevel;

public interface BrapiObservationLevelServerResource
{
	@Get
	BaseResult<ArrayResult<ObservationLevel>> getObservationLevels();


}
