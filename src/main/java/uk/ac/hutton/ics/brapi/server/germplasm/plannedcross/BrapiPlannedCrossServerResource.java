package uk.ac.hutton.ics.brapi.server.germplasm.plannedcross;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.plannedcross.PlannedCross;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface BrapiPlannedCrossServerResource
{
	BaseResult<ArrayResult<PlannedCross>> getPlannedCrosses(@QueryParam("crossingProjectDbId") String crossingProjectDbId,
															@QueryParam("crossingProjectName") String crossingProjectName,
															@QueryParam("plannedCrossDbId") String plannedCrossDbId,
															@QueryParam("plannedCrossName") String plannedCrossName,
															@QueryParam("status") String status,
															@QueryParam("commonCropName") String commonCropName,
															@QueryParam("programDbId") String programDbId,
															@QueryParam("externalReferenceId") String externalReferenceId,
															@QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<PlannedCross>> postPlannedCrosses(PlannedCross[] plannedCrosses)
		throws IOException, SQLException;

	BaseResult<PlannedCross> putPlannedCross(Map<String, PlannedCross> plannedCrosses)
		throws IOException, SQLException;
}
