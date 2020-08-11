package uk.ac.hutton.ics.brapi.resource.attribute;

import java.util.List;

public class AttributeSearch
{
	private List<String> attributeDbIds;
	private List<String> attributeNames;
	private List<String> dataTypes;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> methodDbIds;
	private List<String> ontologyDbIds;
	private List<String> scaleDbIds;
	private List<String> studyDbId;
	private List<String> traitClasses;
	private List<String> traitDbIds;

	public List<String> getAttributeDbIds()
	{
		return attributeDbIds;
	}

	public AttributeSearch setAttributeDbIds(List<String> attributeDbIds)
	{
		this.attributeDbIds = attributeDbIds;
		return this;
	}

	public List<String> getAttributeNames()
	{
		return attributeNames;
	}

	public AttributeSearch setAttributeNames(List<String> attributeNames)
	{
		this.attributeNames = attributeNames;
		return this;
	}

	public List<String> getDataTypes()
	{
		return dataTypes;
	}

	public AttributeSearch setDataTypes(List<String> dataTypes)
	{
		this.dataTypes = dataTypes;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public AttributeSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public AttributeSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getMethodDbIds()
	{
		return methodDbIds;
	}

	public AttributeSearch setMethodDbIds(List<String> methodDbIds)
	{
		this.methodDbIds = methodDbIds;
		return this;
	}

	public List<String> getOntologyDbIds()
	{
		return ontologyDbIds;
	}

	public AttributeSearch setOntologyDbIds(List<String> ontologyDbIds)
	{
		this.ontologyDbIds = ontologyDbIds;
		return this;
	}

	public List<String> getScaleDbIds()
	{
		return scaleDbIds;
	}

	public AttributeSearch setScaleDbIds(List<String> scaleDbIds)
	{
		this.scaleDbIds = scaleDbIds;
		return this;
	}

	public List<String> getStudyDbId()
	{
		return studyDbId;
	}

	public AttributeSearch setStudyDbId(List<String> studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public List<String> getTraitClasses()
	{
		return traitClasses;
	}

	public AttributeSearch setTraitClasses(List<String> traitClasses)
	{
		this.traitClasses = traitClasses;
		return this;
	}

	public List<String> getTraitDbIds()
	{
		return traitDbIds;
	}

	public AttributeSearch setTraitDbIds(List<String> traitDbIds)
	{
		this.traitDbIds = traitDbIds;
		return this;
	}
}
