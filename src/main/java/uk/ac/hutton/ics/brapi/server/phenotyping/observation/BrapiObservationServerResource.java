package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.Observation;

public interface BrapiObservationServerResource
{
	@Get
	BaseResult<ArrayResult<Observation>> getObservations();

	@Post
	BaseResult<ArrayResult<Observation>> postObservations(List<Observation> newObservations);

	@Put
	BaseResult<ArrayResult<Observation>> putObservations(Map<String, Observation> observations);
}
