package uk.ac.hutton.ics.brapi.resource.genotyping.map;

import java.sql.Timestamp;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class Map extends BrapiObject
{
	private String    comments;
	private String    commonCropName;
	private String    documentationURL;
	private Integer   linkageGroupCount;
	private String    mapDbId;
	private String    mapName;
	private String    mapPUI;
	private Integer   markerCount;
	private Timestamp publishedDate;
	private String    scientificName;
	private String    type;
	private String    unit;

	public String getComments()
	{
		return comments;
	}

	public Map setComments(String comments)
	{
		this.comments = comments;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Map setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getDocumentationURL()
	{
		return documentationURL;
	}

	public Map setDocumentationURL(String documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public Integer getLinkageGroupCount()
	{
		return linkageGroupCount;
	}

	public Map setLinkageGroupCount(Integer linkageGroupCount)
	{
		this.linkageGroupCount = linkageGroupCount;
		return this;
	}

	public String getMapDbId()
	{
		return mapDbId;
	}

	public Map setMapDbId(String mapDbId)
	{
		this.mapDbId = mapDbId;
		return this;
	}

	public String getMapName()
	{
		return mapName;
	}

	public Map setMapName(String mapName)
	{
		this.mapName = mapName;
		return this;
	}

	public String getMapPUI()
	{
		return mapPUI;
	}

	public Map setMapPUI(String mapPUI)
	{
		this.mapPUI = mapPUI;
		return this;
	}

	public Integer getMarkerCount()
	{
		return markerCount;
	}

	public Map setMarkerCount(Integer markerCount)
	{
		this.markerCount = markerCount;
		return this;
	}

	public Timestamp getPublishedDate()
	{
		return publishedDate;
	}

	public Map setPublishedDate(Timestamp publishedDate)
	{
		this.publishedDate = publishedDate;
		return this;
	}

	public String getScientificName()
	{
		return scientificName;
	}

	public Map setScientificName(String scientificName)
	{
		this.scientificName = scientificName;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Map setType(String type)
	{
		this.type = type;
		return this;
	}

	public String getUnit()
	{
		return unit;
	}

	public Map setUnit(String unit)
	{
		this.unit = unit;
		return this;
	}
}
