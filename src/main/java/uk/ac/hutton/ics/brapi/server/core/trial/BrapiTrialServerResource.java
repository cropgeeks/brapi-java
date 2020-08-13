package uk.ac.hutton.ics.brapi.server.core.trial;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.trial.Trial;

public interface BrapiTrialServerResource
{
	@Get
	BaseResult<ArrayResult<Trial>> getTrials();

	@Post
	BaseResult<ArrayResult<Trial>> postTrials(Trial[] newTrials);
}
