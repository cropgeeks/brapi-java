package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import java.util.List;

public class VariantSetSearch
{
	private List<String> callSetDbIds;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;

	public List<String> getCallSetDbIds()
	{
		return callSetDbIds;
	}

	public VariantSetSearch setCallSetDbIds(List<String> callSetDbIds)
	{
		this.callSetDbIds = callSetDbIds;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public VariantSetSearch setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public VariantSetSearch setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}

	public List<String> getVariantDbIds()
	{
		return variantDbIds;
	}

	public VariantSetSearch setVariantDbIds(List<String> variantDbIds)
	{
		this.variantDbIds = variantDbIds;
		return this;
	}

	public List<String> getVariantSetDbIds()
	{
		return variantSetDbIds;
	}

	public VariantSetSearch setVariantSetDbIds(List<String> variantSetDbIds)
	{
		this.variantSetDbIds = variantSetDbIds;
		return this;
	}
}
