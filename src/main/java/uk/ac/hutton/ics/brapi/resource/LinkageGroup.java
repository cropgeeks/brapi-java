package uk.ac.hutton.ics.brapi.resource;

import java.util.Map;

public class LinkageGroup
{
	private Map<String, String> additionalInfo;
	private String              linkageGroupName;
	private Integer             markerCount;
	private Long                maxPosition;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public LinkageGroup setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getLinkageGroupName()
	{
		return linkageGroupName;
	}

	public LinkageGroup setLinkageGroupName(String linkageGroupName)
	{
		this.linkageGroupName = linkageGroupName;
		return this;
	}

	public Integer getMarkerCount()
	{
		return markerCount;
	}

	public LinkageGroup setMarkerCount(Integer markerCount)
	{
		this.markerCount = markerCount;
		return this;
	}

	public Long getMaxPosition()
	{
		return maxPosition;
	}

	public LinkageGroup setMaxPosition(Long maxPosition)
	{
		this.maxPosition = maxPosition;
		return this;
	}
}
