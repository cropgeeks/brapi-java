package uk.ac.hutton.ics.brapi.resource.base;

public class LinkageGroup extends BrapiObject
{
	private String  linkageGroupName;
	private Integer markerCount;
	private Long    maxPosition;

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
