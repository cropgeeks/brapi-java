package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.util.List;

public class VendorOrder
{
	private String       clientId;
	private Integer      numberOfSamples;
	private String       orderId;
	private ServiceInfo  requiredServiceInfo;
	private List<String> serviceIds;

	public String getClientId()
	{
		return clientId;
	}

	public VendorOrder setClientId(String clientId)
	{
		this.clientId = clientId;
		return this;
	}

	public Integer getNumberOfSamples()
	{
		return numberOfSamples;
	}

	public VendorOrder setNumberOfSamples(Integer numberOfSamples)
	{
		this.numberOfSamples = numberOfSamples;
		return this;
	}

	public String getOrderId()
	{
		return orderId;
	}

	public VendorOrder setOrderId(String orderId)
	{
		this.orderId = orderId;
		return this;
	}

	public ServiceInfo getRequiredServiceInfo()
	{
		return requiredServiceInfo;
	}

	public VendorOrder setRequiredServiceInfo(ServiceInfo requiredServiceInfo)
	{
		this.requiredServiceInfo = requiredServiceInfo;
		return this;
	}

	public List<String> getServiceIds()
	{
		return serviceIds;
	}

	public VendorOrder setServiceIds(List<String> serviceIds)
	{
		this.serviceIds = serviceIds;
		return this;
	}
}
