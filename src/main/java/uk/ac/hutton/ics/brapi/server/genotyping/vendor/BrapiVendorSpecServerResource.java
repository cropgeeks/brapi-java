package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.VendorSpec;

public interface BrapiVendorSpecServerResource
{
	@Get
	BaseResult<VendorSpec> getVendorSpec();
}
