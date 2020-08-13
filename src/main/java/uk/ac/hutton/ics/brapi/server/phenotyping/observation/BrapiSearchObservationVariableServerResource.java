package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.*;

public interface BrapiSearchObservationVariableServerResource
{
	@Post
	BaseResult<ArrayResult<ObservationVariable>> postObservationVariableSearch(ObservationVariableSearch search);

	@Post
	BaseResult<SearchResult> postObservationVariableSearchAsync(ObservationVariableSearch search);

	@Get
	BaseResult<ArrayResult<ObservationVariable>> getObservationVariableSearchAsync();
}
