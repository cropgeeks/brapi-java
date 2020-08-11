package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.Put;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.study.Study;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiStudyIndividualServerResource extends IBaseServerResource<Study>
{
	@Put
	BaseResult<Study> putJson(Study newStudy);
}
