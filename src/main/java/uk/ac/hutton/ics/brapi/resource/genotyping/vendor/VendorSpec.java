package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class VendorSpec extends BrapiObject
{
	private List<Service> services;
	private VendorContact vendorContact;

	public List<Service> getServices()
	{
		return services;
	}

	public VendorSpec setServices(List<Service> services)
	{
		this.services = services;
		return this;
	}

	public VendorContact getVendorContact()
	{
		return vendorContact;
	}

	public VendorSpec setVendorContact(VendorContact vendorContact)
	{
		this.vendorContact = vendorContact;
		return this;
	}
}
