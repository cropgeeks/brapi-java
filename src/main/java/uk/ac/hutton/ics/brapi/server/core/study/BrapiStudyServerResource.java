package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.study.Study;

public interface BrapiStudyServerResource
{
	@Get
	BaseResult<ArrayResult<Study>> getStudies();

	@Post
	BaseResult<ArrayResult<Study>> postStudies(Study[] newStudies);
}
