package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.Get;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;

public interface BrapiVendorOrderStatusServerResource
{
	@Get
	BaseResult<List<String>> getVendorOrderByIdStatus();
}
