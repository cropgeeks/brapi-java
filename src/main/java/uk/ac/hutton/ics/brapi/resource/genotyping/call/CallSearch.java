package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import java.util.List;

public class CallSearch
{
	private List<String> callSetDbIds;
	private Boolean      expandHomozygotes;
	private String       sepPhased;
	private String       sepUnphased;
	private String       unknownString;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;

	public List<String> getCallSetDbIds()
	{
		return callSetDbIds;
	}

	public CallSearch setCallSetDbIds(List<String> callSetDbIds)
	{
		this.callSetDbIds = callSetDbIds;
		return this;
	}

	public Boolean getExpandHomozygotes()
	{
		return expandHomozygotes;
	}

	public CallSearch setExpandHomozygotes(Boolean expandHomozygotes)
	{
		this.expandHomozygotes = expandHomozygotes;
		return this;
	}

	public String getSepPhased()
	{
		return sepPhased;
	}

	public CallSearch setSepPhased(String sepPhased)
	{
		this.sepPhased = sepPhased;
		return this;
	}

	public String getSepUnphased()
	{
		return sepUnphased;
	}

	public CallSearch setSepUnphased(String sepUnphased)
	{
		this.sepUnphased = sepUnphased;
		return this;
	}

	public String getUnknownString()
	{
		return unknownString;
	}

	public CallSearch setUnknownString(String unknownString)
	{
		this.unknownString = unknownString;
		return this;
	}

	public List<String> getVariantDbIds()
	{
		return variantDbIds;
	}

	public CallSearch setVariantDbIds(List<String> variantDbIds)
	{
		this.variantDbIds = variantDbIds;
		return this;
	}

	public List<String> getVariantSetDbIds()
	{
		return variantSetDbIds;
	}

	public CallSearch setVariantSetDbIds(List<String> variantSetDbIds)
	{
		this.variantSetDbIds = variantSetDbIds;
		return this;
	}
}
