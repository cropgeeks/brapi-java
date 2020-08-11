package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.study.*;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSearchStudyServerResource extends IBaseServerResource<ArrayResult<Study>>
{
	@Post
	BaseResult<ArrayResult<Study>> postJson(StudySearch search);
}
