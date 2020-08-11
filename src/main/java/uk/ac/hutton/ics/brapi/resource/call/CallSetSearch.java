package uk.ac.hutton.ics.brapi.resource.call;

import java.util.List;

public class CallSetSearch
{
	private List<String> callSetDbIds;
	private List<String> callSetNames;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> sampleDbIds;
	private List<String> sampleNames;
	private List<String> variantSetDbIds;

	public List<String> getCallSetDbIds()
	{
		return callSetDbIds;
	}

	public CallSetSearch setCallSetDbIds(List<String> callSetDbIds)
	{
		this.callSetDbIds = callSetDbIds;
		return this;
	}

	public List<String> getCallSetNames()
	{
		return callSetNames;
	}

	public CallSetSearch setCallSetNames(List<String> callSetNames)
	{
		this.callSetNames = callSetNames;
		return this;
	}

	public List<String> getGermplasmDbIds()
	{
		return germplasmDbIds;
	}

	public CallSetSearch setGermplasmDbIds(List<String> germplasmDbIds)
	{
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public List<String> getGermplasmNames()
	{
		return germplasmNames;
	}

	public CallSetSearch setGermplasmNames(List<String> germplasmNames)
	{
		this.germplasmNames = germplasmNames;
		return this;
	}

	public List<String> getSampleDbIds()
	{
		return sampleDbIds;
	}

	public CallSetSearch setSampleDbIds(List<String> sampleDbIds)
	{
		this.sampleDbIds = sampleDbIds;
		return this;
	}

	public List<String> getSampleNames()
	{
		return sampleNames;
	}

	public CallSetSearch setSampleNames(List<String> sampleNames)
	{
		this.sampleNames = sampleNames;
		return this;
	}

	public List<String> getVariantSetDbIds()
	{
		return variantSetDbIds;
	}

	public CallSetSearch setVariantSetDbIds(List<String> variantSetDbIds)
	{
		this.variantSetDbIds = variantSetDbIds;
		return this;
	}
}
