package uk.ac.hutton.ics.brapi.server.genotyping.marker;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.map.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchMarkerPositionServerResource extends IBaseServerResource<ArrayResult<MarkerPosition>>
{
	@Post
	BaseResult<ArrayResult<MarkerPosition>> postJson(MarkerPositionSearch search);
}
