package uk.ac.hutton.ics.brapi.resource.location;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class Location extends BrapiObject
{
	private String           abbreviation;
	private String           coordinateDescription;
	private String           coordinateUncertainty;
	private CoordinatesPoint coordinatesPoint;
	private String           countryCode;
	private String           countryName;
	private String           documentationURL;
	private String           environmentType;
	private String           exposure;
	private List<Reference>  externalReferences;
	private String           instituteAddress;
	private String           instituteName;
	private String           locationDbId;
	private String           locationName;
	private String           locationType;
	private String           siteStatus;
	private String           slope;
	private String           topography;

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public Location setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
		return this;
	}

	public String getCoordinateDescription()
	{
		return coordinateDescription;
	}

	public Location setCoordinateDescription(String coordinateDescription)
	{
		this.coordinateDescription = coordinateDescription;
		return this;
	}

	public String getCoordinateUncertainty()
	{
		return coordinateUncertainty;
	}

	public Location setCoordinateUncertainty(String coordinateUncertainty)
	{
		this.coordinateUncertainty = coordinateUncertainty;
		return this;
	}

	public CoordinatesPoint getCoordinatesPoint()
	{
		return coordinatesPoint;
	}

	public Location setCoordinatesPoint(CoordinatesPoint coordinatesPoint)
	{
		this.coordinatesPoint = coordinatesPoint;
		return this;
	}

	public String getCountryCode()
	{
		return countryCode;
	}

	public Location setCountryCode(String countryCode)
	{
		this.countryCode = countryCode;
		return this;
	}

	public String getCountryName()
	{
		return countryName;
	}

	public Location setCountryName(String countryName)
	{
		this.countryName = countryName;
		return this;
	}

	public String getDocumentationURL()
	{
		return documentationURL;
	}

	public Location setDocumentationURL(String documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public String getEnvironmentType()
	{
		return environmentType;
	}

	public Location setEnvironmentType(String environmentType)
	{
		this.environmentType = environmentType;
		return this;
	}

	public String getExposure()
	{
		return exposure;
	}

	public Location setExposure(String exposure)
	{
		this.exposure = exposure;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Location setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getInstituteAddress()
	{
		return instituteAddress;
	}

	public Location setInstituteAddress(String instituteAddress)
	{
		this.instituteAddress = instituteAddress;
		return this;
	}

	public String getInstituteName()
	{
		return instituteName;
	}

	public Location setInstituteName(String instituteName)
	{
		this.instituteName = instituteName;
		return this;
	}

	public String getLocationDbId()
	{
		return locationDbId;
	}

	public Location setLocationDbId(String locationDbId)
	{
		this.locationDbId = locationDbId;
		return this;
	}

	public String getLocationName()
	{
		return locationName;
	}

	public Location setLocationName(String locationName)
	{
		this.locationName = locationName;
		return this;
	}

	public String getLocationType()
	{
		return locationType;
	}

	public Location setLocationType(String locationType)
	{
		this.locationType = locationType;
		return this;
	}

	public String getSiteStatus()
	{
		return siteStatus;
	}

	public Location setSiteStatus(String siteStatus)
	{
		this.siteStatus = siteStatus;
		return this;
	}

	public String getSlope()
	{
		return slope;
	}

	public Location setSlope(String slope)
	{
		this.slope = slope;
		return this;
	}

	public String getTopography()
	{
		return topography;
	}

	public Location setTopography(String topography)
	{
		this.topography = topography;
		return this;
	}
}
