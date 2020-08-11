package uk.ac.hutton.ics.brapi.resource.location;

public class CoordinatesPoint
{
	private GeometryPoint geometry;
	private String        type;

	public GeometryPoint getGeometry()
	{
		return geometry;
	}

	public CoordinatesPoint setGeometry(GeometryPoint geometry)
	{
		this.geometry = geometry;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public CoordinatesPoint setType(String type)
	{
		this.type = type;
		return this;
	}
}