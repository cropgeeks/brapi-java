package uk.ac.hutton.ics.brapi.server.core.trial;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.trial.Trial;

public interface BrapiTrialIndividualServerResource
{
	@Get
	BaseResult<Trial> getTrialById();

	@Put
	BaseResult<Trial> putTrialById(Trial trial);
}
