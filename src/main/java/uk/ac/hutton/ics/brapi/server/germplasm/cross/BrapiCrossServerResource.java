package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.Cross;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface BrapiCrossServerResource
{
	BaseResult<ArrayResult<Cross>> getCrosses(@QueryParam("crossingProjectDbId") String crossingProjectDbId,
											  @QueryParam("crossingProjectName") String crossingProjectName,
											  @QueryParam("crossDbId") String crossDbId,
											  @QueryParam("crossName") String crossName,
											  @QueryParam("commonCropName") String commonCropName,
											  @QueryParam("programDbId") String programDbId,
											  @QueryParam("externalReferenceId") String externalReferenceId,
											  @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Cross>> postCrosses(Cross[] newCrosses)
		throws IOException, SQLException;

	BaseResult<Cross> putCross(Map<String, Cross> crosses)
		throws IOException, SQLException;
}
