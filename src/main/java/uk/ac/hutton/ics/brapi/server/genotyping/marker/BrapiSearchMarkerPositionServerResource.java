package uk.ac.hutton.ics.brapi.server.genotyping.marker;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.map.*;

public interface BrapiSearchMarkerPositionServerResource
{
	@Post
	BaseResult<ArrayResult<MarkerPosition>> postMarkerPositionSearch(MarkerPositionSearch search);

	@Post
	BaseResult<SearchResult> postMarkerPositionSearchAsync(MarkerPositionSearch search);

	@Get
	BaseResult<ArrayResult<MarkerPosition>> getMarkerPositionSearchAsync();
}
