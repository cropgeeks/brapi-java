package uk.ac.hutton.ics.brapi.server.germplasm.plannedcross;

import org.restlet.resource.*;

import java.util.Map;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.plannedcross.PlannedCross;

public interface BrapiPlannedCrossServerResource
{
	@Get
	BaseResult<ArrayResult<PlannedCross>> getPlannedCrosses();

	@Post
	BaseResult<ArrayResult<PlannedCross>> postPlannedCrosses(PlannedCross[] plannedCrosses);

	@Put
	BaseResult<PlannedCross> putPlannedCross(Map<String, PlannedCross> plannedCrosses);
}
