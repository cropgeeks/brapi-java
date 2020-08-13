package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import org.restlet.resource.*;

import java.util.Map;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.Cross;

public interface BrapiCrossServerResource
{
	@Get
	BaseResult<ArrayResult<Cross>> getCrosses();

	@Post
	BaseResult<ArrayResult<Cross>> postCrosses(Cross[] newCrosses);

	@Put
	BaseResult<Cross> putCross(Map<String, Cross> crosses);
}
