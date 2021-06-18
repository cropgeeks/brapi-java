package uk.ac.hutton.ics.brapi.server.germplasm.plannedcross;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.plannedcross.PlannedCross;

import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface BrapiPlannedCrossServerResource
{
	BaseResult<ArrayResult<PlannedCross>> getPlannedCrosses(@QueryParam("crossingProjectDbId") String crossingProjectDbId,
															@QueryParam("plannedCrossDbId") String plannedCrossDbId,
															@QueryParam("externalReferenceID") String externalReferenceID,
															@QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<PlannedCross>> postPlannedCrosses(PlannedCross[] plannedCrosses)
		throws IOException, SQLException;

	BaseResult<PlannedCross> putPlannedCross(Map<String, PlannedCross> plannedCrosses)
		throws IOException, SQLException;
}
