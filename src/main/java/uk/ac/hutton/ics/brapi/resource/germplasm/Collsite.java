package uk.ac.hutton.ics.brapi.resource.germplasm;

public class Collsite
{
	private String coordinateUncertainty;
	private String elevation;
	private String georeferencingMethod;
	private String latitudeDecimal;
	private String latitudeDegrees;
	private String locationDescription;
	private String longitudeDecimal;
	private String longitudeDegrees;
	private String spatialReferenceSystem;

	public String getCoordinateUncertainty()
	{
		return coordinateUncertainty;
	}

	public Collsite setCoordinateUncertainty(String coordinateUncertainty)
	{
		this.coordinateUncertainty = coordinateUncertainty;
		return this;
	}

	public String getElevation()
	{
		return elevation;
	}

	public Collsite setElevation(String elevation)
	{
		this.elevation = elevation;
		return this;
	}

	public String getGeoreferencingMethod()
	{
		return georeferencingMethod;
	}

	public Collsite setGeoreferencingMethod(String georeferencingMethod)
	{
		this.georeferencingMethod = georeferencingMethod;
		return this;
	}

	public String getLatitudeDecimal()
	{
		return latitudeDecimal;
	}

	public Collsite setLatitudeDecimal(String latitudeDecimal)
	{
		this.latitudeDecimal = latitudeDecimal;
		return this;
	}

	public String getLatitudeDegrees()
	{
		return latitudeDegrees;
	}

	public Collsite setLatitudeDegrees(String latitudeDegrees)
	{
		this.latitudeDegrees = latitudeDegrees;
		return this;
	}

	public String getLocationDescription()
	{
		return locationDescription;
	}

	public Collsite setLocationDescription(String locationDescription)
	{
		this.locationDescription = locationDescription;
		return this;
	}

	public String getLongitudeDecimal()
	{
		return longitudeDecimal;
	}

	public Collsite setLongitudeDecimal(String longitudeDecimal)
	{
		this.longitudeDecimal = longitudeDecimal;
		return this;
	}

	public String getLongitudeDegrees()
	{
		return longitudeDegrees;
	}

	public Collsite setLongitudeDegrees(String longitudeDegrees)
	{
		this.longitudeDegrees = longitudeDegrees;
		return this;
	}

	public String getSpatialReferenceSystem()
	{
		return spatialReferenceSystem;
	}

	public Collsite setSpatialReferenceSystem(String spatialReferenceSystem)
	{
		this.spatialReferenceSystem = spatialReferenceSystem;
		return this;
	}
}
