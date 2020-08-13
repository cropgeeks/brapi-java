package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.*;

public interface BrapiSearchObservationUnitServerResource
{
	@Post
	BaseResult<ArrayResult<ObservationUnit>> postObservationUnitSearch(ObservationUnitSearch search);

	@Post
	BaseResult<SearchResult> postObservationUnitSearchAsync(ObservationUnitSearch search);

	@Get
	BaseResult<ArrayResult<ObservationUnit>> getObservationUnitSearchAsync();
}
