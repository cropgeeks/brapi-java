package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.study.Study;

public interface BrapiStudyIndividualServerResource
{
	@Get
	BaseResult<Study> getStudyById();

	@Put
	BaseResult<Study> putStudyById(Study newStudy);
}
