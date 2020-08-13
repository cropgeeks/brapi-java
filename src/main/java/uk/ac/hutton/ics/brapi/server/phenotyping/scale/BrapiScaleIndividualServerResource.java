package uk.ac.hutton.ics.brapi.server.phenotyping.scale;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Scale;

public interface BrapiScaleIndividualServerResource
{
	@Get
	BaseResult<Scale> getScaleById();

	@Put
	BaseResult<Scale> putScaleById(Scale scale);
}
