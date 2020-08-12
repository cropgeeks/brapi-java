package uk.ac.hutton.ics.brapi.server.genotyping.marker;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.map.MarkerPosition;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiMarkerPositionServerResource
{
	@Get
	BaseResult<ArrayResult<MarkerPosition>> getMarkerPositions();
}
