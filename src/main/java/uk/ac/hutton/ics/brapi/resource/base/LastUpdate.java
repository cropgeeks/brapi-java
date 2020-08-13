package uk.ac.hutton.ics.brapi.resource.base;

import java.sql.Timestamp;

public class LastUpdate
{
	private Timestamp timestamp;
	private String    version;

	public Timestamp getTimestamp()
	{
		return timestamp;
	}

	public LastUpdate setTimestamp(Timestamp timestamp)
	{
		this.timestamp = timestamp;
		return this;
	}

	public String getVersion()
	{
		return version;
	}

	public LastUpdate setVersion(String version)
	{
		this.version = version;
		return this;
	}
}
