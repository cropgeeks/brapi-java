package uk.ac.hutton.ics.brapi.resource.base;

import java.util.Map;

public class BrapiObject
{
	protected Map<String, String> additionalInfo;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public BrapiObject setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}
}
