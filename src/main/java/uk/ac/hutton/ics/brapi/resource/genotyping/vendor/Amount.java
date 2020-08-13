package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

public class Amount
{
	private String units;
	private Float  value;

	public String getUnits()
	{
		return units;
	}

	public Amount setUnits(String units)
	{
		this.units = units;
		return this;
	}

	public Float getValue()
	{
		return value;
	}

	public Amount setValue(Float value)
	{
		this.value = value;
		return this;
	}
}
