package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.vendor.*;

public interface BrapiVendorPlateServerResource
{
	@Post
	BaseResult<PlateSubmissionResult> postVendorPlates(PlateSubmission plateSubmission);
}
