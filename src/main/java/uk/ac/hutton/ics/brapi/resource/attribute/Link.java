package uk.ac.hutton.ics.brapi.resource.attribute;

public class Link
{
	private String URL;
	private String type;

	public String getURL()
	{
		return URL;
	}

	public Link setURL(String URL)
	{
		this.URL = URL;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Link setType(String type)
	{
		this.type = type;
		return this;
	}
}
