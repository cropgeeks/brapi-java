package uk.ac.hutton.ics.brapi.resource.map;

import java.util.Map;

public class MarkerPosition
{
	private Map<String, String> additionalInfo;
	private String              linkageGroupName;
	private String              mapDbId;
	private String              mapName;
	private Long                position;
	private String              variantDbId;
	private String              variantName;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public MarkerPosition setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getLinkageGroupName()
	{
		return linkageGroupName;
	}

	public MarkerPosition setLinkageGroupName(String linkageGroupName)
	{
		this.linkageGroupName = linkageGroupName;
		return this;
	}

	public String getMapDbId()
	{
		return mapDbId;
	}

	public MarkerPosition setMapDbId(String mapDbId)
	{
		this.mapDbId = mapDbId;
		return this;
	}

	public String getMapName()
	{
		return mapName;
	}

	public MarkerPosition setMapName(String mapName)
	{
		this.mapName = mapName;
		return this;
	}

	public Long getPosition()
	{
		return position;
	}

	public MarkerPosition setPosition(Long position)
	{
		this.position = position;
		return this;
	}

	public String getVariantDbId()
	{
		return variantDbId;
	}

	public MarkerPosition setVariantDbId(String variantDbId)
	{
		this.variantDbId = variantDbId;
		return this;
	}

	public String getVariantName()
	{
		return variantName;
	}

	public MarkerPosition setVariantName(String variantName)
	{
		this.variantName = variantName;
		return this;
	}
}
