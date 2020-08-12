package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import org.restlet.resource.*;

import java.util.Map;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.plannedcross.PlannedCross;

public interface BrapiPlannedCrossServerResource
{
	@Get
	BaseResult<ArrayResult<PlannedCross>> getPlannedCrosses();

	@Post
	BaseResult<ArrayResult<PlannedCross>> postPlannedCrosses(PlannedCross[] plannedCrosses);

	@Put
	BaseResult<PlannedCross> putPlannedCross(Map<String, PlannedCross> plannedCrosses);
}
