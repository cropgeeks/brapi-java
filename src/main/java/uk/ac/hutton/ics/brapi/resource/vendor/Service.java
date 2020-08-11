package uk.ac.hutton.ics.brapi.resource.vendor;

import java.util.List;

public class Service
{
	private String            serviceDescription;
	private String            serviceId;
	private String            serviceName;
	private String            servicePlatformMarkerType;
	private String            servicePlatformName;
	private List<Requirement> specificRequirements;

	public String getServiceDescription()
	{
		return serviceDescription;
	}

	public Service setServiceDescription(String serviceDescription)
	{
		this.serviceDescription = serviceDescription;
		return this;
	}

	public String getServiceId()
	{
		return serviceId;
	}

	public Service setServiceId(String serviceId)
	{
		this.serviceId = serviceId;
		return this;
	}

	public String getServiceName()
	{
		return serviceName;
	}

	public Service setServiceName(String serviceName)
	{
		this.serviceName = serviceName;
		return this;
	}

	public String getServicePlatformMarkerType()
	{
		return servicePlatformMarkerType;
	}

	public Service setServicePlatformMarkerType(String servicePlatformMarkerType)
	{
		this.servicePlatformMarkerType = servicePlatformMarkerType;
		return this;
	}

	public String getServicePlatformName()
	{
		return servicePlatformName;
	}

	public Service setServicePlatformName(String servicePlatformName)
	{
		this.servicePlatformName = servicePlatformName;
		return this;
	}

	public List<Requirement> getSpecificRequirements()
	{
		return specificRequirements;
	}

	public Service setSpecificRequirements(List<Requirement> specificRequirements)
	{
		this.specificRequirements = specificRequirements;
		return this;
	}
}
