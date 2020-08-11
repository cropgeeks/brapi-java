package uk.ac.hutton.ics.brapi.resource.variant;

import java.util.List;

public class Genotype
{
	private List<String> values;

	public List<String> getValues()
	{
		return values;
	}

	public Genotype setValues(List<String> values)
	{
		this.values = values;
		return this;
	}
}
