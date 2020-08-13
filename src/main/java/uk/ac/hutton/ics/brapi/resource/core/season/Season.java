package uk.ac.hutton.ics.brapi.resource.core.season;

public class Season
{
	private String seasonDbId;
	private String seasonName;
	private int    year;

	public String getSeasonDbId()
	{
		return seasonDbId;
	}

	public Season setSeasonDbId(String seasonDbId)
	{
		this.seasonDbId = seasonDbId;
		return this;
	}

	public String getSeasonName()
	{
		return seasonName;
	}

	public Season setSeasonName(String seasonName)
	{
		this.seasonName = seasonName;
		return this;
	}

	public int getYear()
	{
		return year;
	}

	public Season setYear(int year)
	{
		this.year = year;
		return this;
	}
}
