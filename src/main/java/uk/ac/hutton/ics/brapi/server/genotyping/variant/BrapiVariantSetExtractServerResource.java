package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.*;

public interface BrapiVariantSetExtractServerResource
{
	@Post
	BaseResult<VariantSet> postVariantSetExtract(VariantSetExtract extract);
}
