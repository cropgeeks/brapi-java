package uk.ac.hutton.ics.brapi.resource.list;

import java.sql.Timestamp;
import java.util.List;

public class ListSearch
{
	private Timestamp    dateCreatedRangeEnd;
	private Timestamp    dateCreatedRangeStart;
	private Timestamp    dateModifiedRangeEnd;
	private Timestamp    dateModifiedRangeStart;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> listDbIds;
	private List<String> listNames;
	private List<String> listOwnerNames;
	private List<String> listOwnerPersonDbIds;
	private List<String> listSources;
	private String       listType;

	public Timestamp getDateCreatedRangeEnd()
	{
		return dateCreatedRangeEnd;
	}

	public ListSearch setDateCreatedRangeEnd(Timestamp dateCreatedRangeEnd)
	{
		this.dateCreatedRangeEnd = dateCreatedRangeEnd;
		return this;
	}

	public Timestamp getDateCreatedRangeStart()
	{
		return dateCreatedRangeStart;
	}

	public ListSearch setDateCreatedRangeStart(Timestamp dateCreatedRangeStart)
	{
		this.dateCreatedRangeStart = dateCreatedRangeStart;
		return this;
	}

	public Timestamp getDateModifiedRangeEnd()
	{
		return dateModifiedRangeEnd;
	}

	public ListSearch setDateModifiedRangeEnd(Timestamp dateModifiedRangeEnd)
	{
		this.dateModifiedRangeEnd = dateModifiedRangeEnd;
		return this;
	}

	public Timestamp getDateModifiedRangeStart()
	{
		return dateModifiedRangeStart;
	}

	public ListSearch setDateModifiedRangeStart(Timestamp dateModifiedRangeStart)
	{
		this.dateModifiedRangeStart = dateModifiedRangeStart;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public ListSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public ListSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getListDbIds()
	{
		return listDbIds;
	}

	public ListSearch setListDbIds(List<String> listDbIds)
	{
		this.listDbIds = listDbIds;
		return this;
	}

	public List<String> getListNames()
	{
		return listNames;
	}

	public ListSearch setListNames(List<String> listNames)
	{
		this.listNames = listNames;
		return this;
	}

	public List<String> getListOwnerNames()
	{
		return listOwnerNames;
	}

	public ListSearch setListOwnerNames(List<String> listOwnerNames)
	{
		this.listOwnerNames = listOwnerNames;
		return this;
	}

	public List<String> getListOwnerPersonDbIds()
	{
		return listOwnerPersonDbIds;
	}

	public ListSearch setListOwnerPersonDbIds(List<String> listOwnerPersonDbIds)
	{
		this.listOwnerPersonDbIds = listOwnerPersonDbIds;
		return this;
	}

	public List<String> getListSources()
	{
		return listSources;
	}

	public ListSearch setListSources(List<String> listSources)
	{
		this.listSources = listSources;
		return this;
	}

	public String getListType()
	{
		return listType;
	}

	public ListSearch setListType(String listType)
	{
		this.listType = listType;
		return this;
	}
}
