package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import java.util.List;

public class VariantSearch
{
	private List<String> callSetDbIds;
	private Long         end;
	private String       referenceDbId;
	private Long         start;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;

	public List<String> getCallSetDbIds()
	{
		return callSetDbIds;
	}

	public VariantSearch setCallSetDbIds(List<String> callSetDbIds)
	{
		this.callSetDbIds = callSetDbIds;
		return this;
	}

	public Long getEnd()
	{
		return end;
	}

	public VariantSearch setEnd(Long end)
	{
		this.end = end;
		return this;
	}

	public String getReferenceDbId()
	{
		return referenceDbId;
	}

	public VariantSearch setReferenceDbId(String referenceDbId)
	{
		this.referenceDbId = referenceDbId;
		return this;
	}

	public Long getStart()
	{
		return start;
	}

	public VariantSearch setStart(Long start)
	{
		this.start = start;
		return this;
	}

	public List<String> getVariantDbIds()
	{
		return variantDbIds;
	}

	public VariantSearch setVariantDbIds(List<String> variantDbIds)
	{
		this.variantDbIds = variantDbIds;
		return this;
	}

	public List<String> getVariantSetDbIds()
	{
		return variantSetDbIds;
	}

	public VariantSearch setVariantSetDbIds(List<String> variantSetDbIds)
	{
		this.variantSetDbIds = variantSetDbIds;
		return this;
	}
}
