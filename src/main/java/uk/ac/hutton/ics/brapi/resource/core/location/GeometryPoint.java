package uk.ac.hutton.ics.brapi.resource.core.location;

public class GeometryPoint
{
	private double[] coordinates;
	private String   type;

	public double[] getCoordinates()
	{
		return coordinates;
	}

	public GeometryPoint setCoordinates(double[] coordinates)
	{
		this.coordinates = coordinates;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public GeometryPoint setType(String type)
	{
		this.type = type;
		return this;
	}
}