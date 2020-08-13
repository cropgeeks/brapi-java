package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import java.util.List;

public class ReferenceSearch
{
	private List<String> accessions;
	private Boolean      isDerived;
	private Integer      maxLength;
	private List<String> md5checksums;
	private Integer      minLength;
	private List<String> referenceDbIds;
	private List<String> referenceSetDbIds;

	public List<String> getAccessions()
	{
		return accessions;
	}

	public ReferenceSearch setAccessions(List<String> accessions)
	{
		this.accessions = accessions;
		return this;
	}

	public Boolean getDerived()
	{
		return isDerived;
	}

	public ReferenceSearch setDerived(Boolean derived)
	{
		isDerived = derived;
		return this;
	}

	public Integer getMaxLength()
	{
		return maxLength;
	}

	public ReferenceSearch setMaxLength(Integer maxLength)
	{
		this.maxLength = maxLength;
		return this;
	}

	public List<String> getMd5checksums()
	{
		return md5checksums;
	}

	public ReferenceSearch setMd5checksums(List<String> md5checksums)
	{
		this.md5checksums = md5checksums;
		return this;
	}

	public Integer getMinLength()
	{
		return minLength;
	}

	public ReferenceSearch setMinLength(Integer minLength)
	{
		this.minLength = minLength;
		return this;
	}

	public List<String> getReferenceDbIds()
	{
		return referenceDbIds;
	}

	public ReferenceSearch setReferenceDbIds(List<String> referenceDbIds)
	{
		this.referenceDbIds = referenceDbIds;
		return this;
	}

	public List<String> getReferenceSetDbIds()
	{
		return referenceSetDbIds;
	}

	public ReferenceSearch setReferenceSetDbIds(List<String> referenceSetDbIds)
	{
		this.referenceSetDbIds = referenceSetDbIds;
		return this;
	}
}
