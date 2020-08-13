package uk.ac.hutton.ics.brapi.server.genotyping.sample;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.sample.*;

public interface BrapiSearchSampleServerResource
{
	@Post
	BaseResult<ArrayResult<Sample>> postSampleSearch(SampleSearch search);

	@Post
	BaseResult<SearchResult> postSampleSearchAsync(SampleSearch search);

	@Get
	BaseResult<ArrayResult<Sample>> getSampleSearchAsync();
}
