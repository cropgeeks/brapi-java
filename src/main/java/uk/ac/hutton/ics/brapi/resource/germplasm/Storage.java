package uk.ac.hutton.ics.brapi.resource.germplasm;

public class Storage
{
	private String code;
	private String description;

	public String getCode()
	{
		return code;
	}

	public Storage setCode(String code)
	{
		this.code = code;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Storage setDescription(String description)
	{
		this.description = description;
		return this;
	}
}
