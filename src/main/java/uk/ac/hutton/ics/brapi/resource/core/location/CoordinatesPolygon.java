package uk.ac.hutton.ics.brapi.resource.core.location;

public class CoordinatesPolygon
{
	private GeometryPolygon geometry;
	private String          type;

	public GeometryPolygon getGeometry()
	{
		return geometry;
	}

	public CoordinatesPolygon setGeometry(GeometryPolygon geometry)
	{
		this.geometry = geometry;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public CoordinatesPolygon setType(String type)
	{
		this.type = type;
		return this;
	}
}