package uk.ac.hutton.ics.brapi.resource.reference;

import java.util.List;

public class ReferenceSetSearch
{
	private List<String> accessions;
	private List<String> assemblyPUIs;
	private List<String> md5checksums;
	private List<String> referenceSetDbIds;

	public List<String> getAccessions()
	{
		return accessions;
	}

	public ReferenceSetSearch setAccessions(List<String> accessions)
	{
		this.accessions = accessions;
		return this;
	}

	public List<String> getAssemblyPUIs()
	{
		return assemblyPUIs;
	}

	public ReferenceSetSearch setAssemblyPUIs(List<String> assemblyPUIs)
	{
		this.assemblyPUIs = assemblyPUIs;
		return this;
	}

	public List<String> getMd5checksums()
	{
		return md5checksums;
	}

	public ReferenceSetSearch setMd5checksums(List<String> md5checksums)
	{
		this.md5checksums = md5checksums;
		return this;
	}

	public List<String> getReferenceSetDbIds()
	{
		return referenceSetDbIds;
	}

	public ReferenceSetSearch setReferenceSetDbIds(List<String> referenceSetDbIds)
	{
		this.referenceSetDbIds = referenceSetDbIds;
		return this;
	}
}
