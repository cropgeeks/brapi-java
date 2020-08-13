package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.*;

public interface BrapiSearchObservationServerResource
{
	@Post
	BaseResult<ArrayResult<Observation>> postObservationSearch(ObservationSearch search);

	@Post
	BaseResult<SearchResult> postObservationSearchAsync(ObservationSearch search);

	@Get
	BaseResult<ArrayResult<Observation>> getObservationSearchAsync();
}
