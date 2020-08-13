package uk.ac.hutton.ics.brapi.resource.base;

import com.google.gson.annotations.SerializedName;

public class PuiDescription
{
	@SerializedName("PUI")
	private String pui;
	private String description;

	public String getPui()
	{
		return pui;
	}

	public PuiDescription setPui(String pui)
	{
		this.pui = pui;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public PuiDescription setDescription(String description)
	{
		this.description = description;
		return this;
	}
}
