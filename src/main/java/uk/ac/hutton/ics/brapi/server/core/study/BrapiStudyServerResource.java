package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.study.Study;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiStudyServerResource extends IBaseServerResource<ArrayResult<Study>>
{
	@Post
	BaseResult<ArrayResult<Study>> postJson(Study[] newStudies);
}
