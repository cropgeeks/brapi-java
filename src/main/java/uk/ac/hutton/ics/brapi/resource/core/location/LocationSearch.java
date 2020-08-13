package uk.ac.hutton.ics.brapi.resource.core.location;

import java.util.List;

public class LocationSearch
{
	private List<String>       abbreviations;
	private Double             altitudeMax;
	private Double             altitudeMin;
	private CoordinatesPolygon coordinates;
	private List<String>       countryCodes;
	private List<String>       countryNames;
	private List<String>       externalReferenceIDs;
	private List<String>       externalReferenceSources;
	private List<String>       instituteAddresses;
	private List<String>       instituteNames;
	private List<String>       locationDbIds;
	private List<String>       locationNames;
	private List<String>       locationTypes;

	public List<String> getAbbreviations()
	{
		return abbreviations;
	}

	public LocationSearch setAbbreviations(List<String> abbreviations)
	{
		this.abbreviations = abbreviations;
		return this;
	}

	public Double getAltitudeMax()
	{
		return altitudeMax;
	}

	public LocationSearch setAltitudeMax(Double altitudeMax)
	{
		this.altitudeMax = altitudeMax;
		return this;
	}

	public Double getAltitudeMin()
	{
		return altitudeMin;
	}

	public LocationSearch setAltitudeMin(Double altitudeMin)
	{
		this.altitudeMin = altitudeMin;
		return this;
	}

	public CoordinatesPolygon getCoordinates()
	{
		return coordinates;
	}

	public LocationSearch setCoordinates(CoordinatesPolygon coordinates)
	{
		this.coordinates = coordinates;
		return this;
	}

	public List<String> getCountryCodes()
	{
		return countryCodes;
	}

	public LocationSearch setCountryCodes(List<String> countryCodes)
	{
		this.countryCodes = countryCodes;
		return this;
	}

	public List<String> getCountryNames()
	{
		return countryNames;
	}

	public LocationSearch setCountryNames(List<String> countryNames)
	{
		this.countryNames = countryNames;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public LocationSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public LocationSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getInstituteAddresses()
	{
		return instituteAddresses;
	}

	public LocationSearch setInstituteAddresses(List<String> instituteAddresses)
	{
		this.instituteAddresses = instituteAddresses;
		return this;
	}

	public List<String> getInstituteNames()
	{
		return instituteNames;
	}

	public LocationSearch setInstituteNames(List<String> instituteNames)
	{
		this.instituteNames = instituteNames;
		return this;
	}

	public List<String> getLocationDbIds()
	{
		return locationDbIds;
	}

	public LocationSearch setLocationDbIds(List<String> locationDbIds)
	{
		this.locationDbIds = locationDbIds;
		return this;
	}

	public List<String> getLocationNames()
	{
		return locationNames;
	}

	public LocationSearch setLocationNames(List<String> locationNames)
	{
		this.locationNames = locationNames;
		return this;
	}

	public List<String> getLocationTypes()
	{
		return locationTypes;
	}

	public LocationSearch setLocationTypes(List<String> locationTypes)
	{
		this.locationTypes = locationTypes;
		return this;
	}
}
