package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.Plate;

public interface BrapiVendorOrderIndividualPlateServerResource
{
	@Get
	BaseResult<ArrayResult<Plate>> getVendorOrderByIdPlates();
}
