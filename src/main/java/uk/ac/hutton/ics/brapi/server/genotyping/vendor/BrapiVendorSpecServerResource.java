package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.VendorSpec;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVendorSpecServerResource
{
	BaseResult<VendorSpec> getVendorSpec()
		throws IOException, SQLException;
}
