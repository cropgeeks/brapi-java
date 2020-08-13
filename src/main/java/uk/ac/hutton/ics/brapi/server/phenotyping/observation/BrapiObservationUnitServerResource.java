package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationUnit;

public interface BrapiObservationUnitServerResource
{
	@Get
	BaseResult<ArrayResult<ObservationUnit>> getObservationUnits();

	@Post
	BaseResult<ArrayResult<ObservationUnit>> postObservationUnits(List<ObservationUnit> newObservationUnits);

	@Put
	BaseResult<ArrayResult<ObservationUnit>> putObservationUnits(ObservationUnit observationUnit);
}
