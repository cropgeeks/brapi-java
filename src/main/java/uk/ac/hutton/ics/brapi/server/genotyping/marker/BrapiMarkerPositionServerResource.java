package uk.ac.hutton.ics.brapi.server.genotyping.marker;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.map.MarkerPosition;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiMarkerPositionServerResource
{
	BaseResult<ArrayResult<MarkerPosition>> getMarkerPositions(@QueryParam("mapDbId") String mapDbId,
															   @QueryParam("linkageGroupName") String linkageGroupName,
															   @QueryParam("variantDbId") String variantDbId,
															   @QueryParam("minPosition") String minPosition,
															   @QueryParam("maxPosition") String maxPosition)
		throws IOException, SQLException;
}
