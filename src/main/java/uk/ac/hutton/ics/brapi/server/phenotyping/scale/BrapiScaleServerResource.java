package uk.ac.hutton.ics.brapi.server.phenotyping.scale;

import org.restlet.resource.*;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Scale;

public interface BrapiScaleServerResource
{
	@Get
	BaseResult<ArrayResult<Scale>> getScales();

	@Post
	BaseResult<ArrayResult<Scale>> postScales(List<Scale> newScales);
}
