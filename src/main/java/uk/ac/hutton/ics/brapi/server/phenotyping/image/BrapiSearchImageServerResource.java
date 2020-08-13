package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.*;

public interface BrapiSearchImageServerResource
{
	@Post
	BaseResult<ArrayResult<Image>> postImageSearch(ImageSearch search);

	@Post
	BaseResult<SearchResult> postImageSearchAsync(ImageSearch search);

	@Get
	BaseResult<ArrayResult<Image>> getImageSearchAsync();
}
