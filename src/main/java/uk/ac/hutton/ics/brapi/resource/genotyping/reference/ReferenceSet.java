package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import java.net.URI;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class ReferenceSet extends BrapiObject
{
	private String       assemblyPUI;
	private String       description;
	private Boolean      isDerived;
	private String       md5checksum;
	private String       referenceSetDbId;
	private String       referenceSetName;
	private List<String> sourceAccessions;
	private URI          sourceURI;
	private Species      species;

	public String getAssemblyPUI()
	{
		return assemblyPUI;
	}

	public ReferenceSet setAssemblyPUI(String assemblyPUI)
	{
		this.assemblyPUI = assemblyPUI;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public ReferenceSet setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public Boolean getDerived()
	{
		return isDerived;
	}

	public ReferenceSet setDerived(Boolean derived)
	{
		isDerived = derived;
		return this;
	}

	public String getMd5checksum()
	{
		return md5checksum;
	}

	public ReferenceSet setMd5checksum(String md5checksum)
	{
		this.md5checksum = md5checksum;
		return this;
	}

	public String getReferenceSetDbId()
	{
		return referenceSetDbId;
	}

	public ReferenceSet setReferenceSetDbId(String referenceSetDbId)
	{
		this.referenceSetDbId = referenceSetDbId;
		return this;
	}

	public String getReferenceSetName()
	{
		return referenceSetName;
	}

	public ReferenceSet setReferenceSetName(String referenceSetName)
	{
		this.referenceSetName = referenceSetName;
		return this;
	}

	public List<String> getSourceAccessions()
	{
		return sourceAccessions;
	}

	public ReferenceSet setSourceAccessions(List<String> sourceAccessions)
	{
		this.sourceAccessions = sourceAccessions;
		return this;
	}

	public URI getSourceURI()
	{
		return sourceURI;
	}

	public ReferenceSet setSourceURI(URI sourceURI)
	{
		this.sourceURI = sourceURI;
		return this;
	}

	public Species getSpecies()
	{
		return species;
	}

	public ReferenceSet setSpecies(Species species)
	{
		this.species = species;
		return this;
	}
}
