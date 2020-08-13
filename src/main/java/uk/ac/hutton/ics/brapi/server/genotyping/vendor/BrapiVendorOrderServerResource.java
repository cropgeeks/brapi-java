package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.VendorOrder;

public interface BrapiVendorOrderServerResource
{
	@Get
	BaseResult<ArrayResult<VendorOrder>> getVendorOrder();

	@Post
	BaseResult<ArrayResult<VendorOrder>> postVerndorOrders(VendorOrder[] newVendorOrders);
}
