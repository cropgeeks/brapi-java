package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.vendor.PlateSubmission;

public interface BrapiVendorPlateIndividualServerResource
{
	@Get
	BaseResult<PlateSubmission> getVendorPlateSubmissionById();
}
