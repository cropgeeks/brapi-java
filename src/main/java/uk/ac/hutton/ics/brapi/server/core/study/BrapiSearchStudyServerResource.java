package uk.ac.hutton.ics.brapi.server.core.study;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.study.*;

public interface BrapiSearchStudyServerResource
{
	@Post
	BaseResult<ArrayResult<Study>> postStudySearch(StudySearch search);

	@Post
	BaseResult<SearchResult> postStudySearchAsync(StudySearch search);

	@Get
	BaseResult<ArrayResult<Study>> getStudySearchAsync();
}
