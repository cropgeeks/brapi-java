package uk.ac.hutton.ics.brapi.resource.vendor;

import java.util.*;

public class VendorSpec
{
	private Map<String, String> additionalInfo;
	private List<Service>       services;
	private VendorContact       vendorContact;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public VendorSpec setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

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
