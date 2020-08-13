package uk.ac.hutton.ics.brapi.resource.phenotyping.event;

public class EventParameter
{
	private String key;
	private String rdfValue;
	private String value;

	public String getKey()
	{
		return key;
	}

	public EventParameter setKey(String key)
	{
		this.key = key;
		return this;
	}

	public String getRdfValue()
	{
		return rdfValue;
	}

	public EventParameter setRdfValue(String rdfValue)
	{
		this.rdfValue = rdfValue;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public EventParameter setValue(String value)
	{
		this.value = value;
		return this;
	}
}
