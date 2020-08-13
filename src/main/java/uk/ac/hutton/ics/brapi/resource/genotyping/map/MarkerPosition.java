package uk.ac.hutton.ics.brapi.resource.genotyping.map;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class MarkerPosition extends BrapiObject
{
	private String linkageGroupName;
	private String mapDbId;
	private String mapName;
	private Long   position;
	private String variantDbId;
	private String variantName;

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
