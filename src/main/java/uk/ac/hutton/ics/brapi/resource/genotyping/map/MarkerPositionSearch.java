package uk.ac.hutton.ics.brapi.resource.genotyping.map;

import java.util.List;

public class MarkerPositionSearch
{
	private List<String> linkageGroupNames;
	private List<String> mapDbIds;
	private Double       maxPosition;
	private Double       minPosition;
	private List<String> variantDbIds;

	public List<String> getLinkageGroupNames()
	{
		return linkageGroupNames;
	}

	public MarkerPositionSearch setLinkageGroupNames(List<String> linkageGroupNames)
	{
		this.linkageGroupNames = linkageGroupNames;
		return this;
	}

	public List<String> getMapDbIds()
	{
		return mapDbIds;
	}

	public MarkerPositionSearch setMapDbIds(List<String> mapDbIds)
	{
		this.mapDbIds = mapDbIds;
		return this;
	}

	public Double getMaxPosition()
	{
		return maxPosition;
	}

	public MarkerPositionSearch setMaxPosition(Double maxPosition)
	{
		this.maxPosition = maxPosition;
		return this;
	}

	public Double getMinPosition()
	{
		return minPosition;
	}

	public MarkerPositionSearch setMinPosition(Double minPosition)
	{
		this.minPosition = minPosition;
		return this;
	}

	public List<String> getVariantDbIds()
	{
		return variantDbIds;
	}

	public MarkerPositionSearch setVariantDbIds(List<String> variantDbIds)
	{
		this.variantDbIds = variantDbIds;
		return this;
	}
}
