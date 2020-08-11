package uk.ac.hutton.ics.brapi.resource.vendor;

import java.net.URI;

public class VendorContact
{
	private String vendorAddress;
	private String vendorCity;
	private String vendorContactName;
	private String vendorCountry;
	private String vendorDescription;
	private String vendorEmail;
	private String vendorName;
	private String vendorPhone;
	private URI    vendorURL;

	public String getVendorAddress()
	{
		return vendorAddress;
	}

	public VendorContact setVendorAddress(String vendorAddress)
	{
		this.vendorAddress = vendorAddress;
		return this;
	}

	public String getVendorCity()
	{
		return vendorCity;
	}

	public VendorContact setVendorCity(String vendorCity)
	{
		this.vendorCity = vendorCity;
		return this;
	}

	public String getVendorContactName()
	{
		return vendorContactName;
	}

	public VendorContact setVendorContactName(String vendorContactName)
	{
		this.vendorContactName = vendorContactName;
		return this;
	}

	public String getVendorCountry()
	{
		return vendorCountry;
	}

	public VendorContact setVendorCountry(String vendorCountry)
	{
		this.vendorCountry = vendorCountry;
		return this;
	}

	public String getVendorDescription()
	{
		return vendorDescription;
	}

	public VendorContact setVendorDescription(String vendorDescription)
	{
		this.vendorDescription = vendorDescription;
		return this;
	}

	public String getVendorEmail()
	{
		return vendorEmail;
	}

	public VendorContact setVendorEmail(String vendorEmail)
	{
		this.vendorEmail = vendorEmail;
		return this;
	}

	public String getVendorName()
	{
		return vendorName;
	}

	public VendorContact setVendorName(String vendorName)
	{
		this.vendorName = vendorName;
		return this;
	}

	public String getVendorPhone()
	{
		return vendorPhone;
	}

	public VendorContact setVendorPhone(String vendorPhone)
	{
		this.vendorPhone = vendorPhone;
		return this;
	}

	public URI getVendorURL()
	{
		return vendorURL;
	}

	public VendorContact setVendorURL(URI vendorURL)
	{
		this.vendorURL = vendorURL;
		return this;
	}
}
