package uk.ac.hutton.ics.brapi.resource.vendor;

public class Requirement
{
	private String description;
	private String key;

	public String getDescription()
	{
		return description;
	}

	public Requirement setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public String getKey()
	{
		return key;
	}

	public Requirement setKey(String key)
	{
		this.key = key;
		return this;
	}
}
