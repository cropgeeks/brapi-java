package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import java.net.URI;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class Reference extends BrapiObject
{
	private Boolean      isDerived;
	private Integer      length;
	private String       md5checksum;
	private String       referenceDbId;
	private String       referenceName;
	private String       referenceSetDbId;
	private List<String> sourceAccessions;
	private Float        sourceDivergence;
	private URI          sourceURI;
	private Species      species;

	public Boolean getDerived()
	{
		return isDerived;
	}

	public Reference setDerived(Boolean derived)
	{
		isDerived = derived;
		return this;
	}

	public Integer getLength()
	{
		return length;
	}

	public Reference setLength(Integer length)
	{
		this.length = length;
		return this;
	}

	public String getMd5checksum()
	{
		return md5checksum;
	}

	public Reference setMd5checksum(String md5checksum)
	{
		this.md5checksum = md5checksum;
		return this;
	}

	public String getReferenceDbId()
	{
		return referenceDbId;
	}

	public Reference setReferenceDbId(String referenceDbId)
	{
		this.referenceDbId = referenceDbId;
		return this;
	}

	public String getReferenceName()
	{
		return referenceName;
	}

	public Reference setReferenceName(String referenceName)
	{
		this.referenceName = referenceName;
		return this;
	}

	public String getReferenceSetDbId()
	{
		return referenceSetDbId;
	}

	public Reference setReferenceSetDbId(String referenceSetDbId)
	{
		this.referenceSetDbId = referenceSetDbId;
		return this;
	}

	public List<String> getSourceAccessions()
	{
		return sourceAccessions;
	}

	public Reference setSourceAccessions(List<String> sourceAccessions)
	{
		this.sourceAccessions = sourceAccessions;
		return this;
	}

	public Float getSourceDivergence()
	{
		return sourceDivergence;
	}

	public Reference setSourceDivergence(Float sourceDivergence)
	{
		this.sourceDivergence = sourceDivergence;
		return this;
	}

	public URI getSourceURI()
	{
		return sourceURI;
	}

	public Reference setSourceURI(URI sourceURI)
	{
		this.sourceURI = sourceURI;
		return this;
	}

	public Species getSpecies()
	{
		return species;
	}

	public Reference setSpecies(Species species)
	{
		this.species = species;
		return this;
	}
}
