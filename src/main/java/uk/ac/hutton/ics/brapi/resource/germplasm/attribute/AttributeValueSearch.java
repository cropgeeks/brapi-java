package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.util.List;

public class AttributeValueSearch
{
	private List<String> attributeDbIds;
	private List<String> attributeNames;
	private List<String> attributeValueDbIds;
	private List<String> dataTypes;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> methodDbIds;
	private List<String> ontologyDbIds;
	private List<String> scaleDbIds;
	private List<String> traitClasses;
	private List<String> traitDbIds;

	public List<String> getAttributeDbIds()
	{
		return attributeDbIds;
	}

	public AttributeValueSearch setAttributeDbIds(List<String> attributeDbIds)
	{
		this.attributeDbIds = attributeDbIds;
		return this;
	}

	public List<String> getAttributeNames()
	{
		return attributeNames;
	}

	public AttributeValueSearch setAttributeNames(List<String> attributeNames)
	{
		this.attributeNames = attributeNames;
		return this;
	}

	public List<String> getAttributeValueDbIds()
	{
		return attributeValueDbIds;
	}

	public AttributeValueSearch setAttributeValueDbIds(List<String> attributeValueDbIds)
	{
		this.attributeValueDbIds = attributeValueDbIds;
		return this;
	}

	public List<String> getDataTypes()
	{
		return dataTypes;
	}

	public AttributeValueSearch setDataTypes(List<String> dataTypes)
	{
		this.dataTypes = dataTypes;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public AttributeValueSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public AttributeValueSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getGermplasmDbIds()
	{
		return germplasmDbIds;
	}

	public AttributeValueSearch setGermplasmDbIds(List<String> germplasmDbIds)
	{
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public List<String> getGermplasmNames()
	{
		return germplasmNames;
	}

	public AttributeValueSearch setGermplasmNames(List<String> germplasmNames)
	{
		this.germplasmNames = germplasmNames;
		return this;
	}

	public List<String> getMethodDbIds()
	{
		return methodDbIds;
	}

	public AttributeValueSearch setMethodDbIds(List<String> methodDbIds)
	{
		this.methodDbIds = methodDbIds;
		return this;
	}

	public List<String> getOntologyDbIds()
	{
		return ontologyDbIds;
	}

	public AttributeValueSearch setOntologyDbIds(List<String> ontologyDbIds)
	{
		this.ontologyDbIds = ontologyDbIds;
		return this;
	}

	public List<String> getScaleDbIds()
	{
		return scaleDbIds;
	}

	public AttributeValueSearch setScaleDbIds(List<String> scaleDbIds)
	{
		this.scaleDbIds = scaleDbIds;
		return this;
	}

	public List<String> getTraitClasses()
	{
		return traitClasses;
	}

	public AttributeValueSearch setTraitClasses(List<String> traitClasses)
	{
		this.traitClasses = traitClasses;
		return this;
	}

	public List<String> getTraitDbIds()
	{
		return traitDbIds;
	}

	public AttributeValueSearch setTraitDbIds(List<String> traitDbIds)
	{
		this.traitDbIds = traitDbIds;
		return this;
	}
}
