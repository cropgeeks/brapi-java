package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.Observation;

public interface BrapiObservationIndividualServerResource
{
	@Get
	BaseResult<Observation> getObservationById();

	@Put
	BaseResult<Observation> putObservationById(Observation observation);
}
