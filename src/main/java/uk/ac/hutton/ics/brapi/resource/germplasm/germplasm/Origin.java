package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import uk.ac.hutton.ics.brapi.resource.core.location.CoordinatesPoint;

public class Origin
{
	private String           coordinateUncertainty;
	private CoordinatesPoint coordinates;

	public String getCoordinateUncertainty()
	{
		return coordinateUncertainty;
	}

	public Origin setCoordinateUncertainty(String coordinateUncertainty)
	{
		this.coordinateUncertainty = coordinateUncertainty;
		return this;
	}

	public CoordinatesPoint getCoordinates()
	{
		return coordinates;
	}

	public Origin setCoordinates(CoordinatesPoint coordinates)
	{
		this.coordinates = coordinates;
		return this;
	}
}
