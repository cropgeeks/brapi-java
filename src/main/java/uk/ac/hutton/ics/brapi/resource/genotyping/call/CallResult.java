package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import java.util.List;

public class CallResult<T>
{
	private List<T> data;
	private Boolean expandHomozygotes;
	private String  sepPhased;
	private String  sepUnphased;
	private String  unknownString;

	public List<T> getData()
	{
		return data;
	}

	public CallResult<T> setData(List<T> data)
	{
		this.data = data;
		return this;
	}

	public Boolean getExpandHomozygotes()
	{
		return expandHomozygotes;
	}

	public CallResult<T> setExpandHomozygotes(Boolean expandHomozygotes)
	{
		this.expandHomozygotes = expandHomozygotes;
		return this;
	}

	public String getSepPhased()
	{
		return sepPhased;
	}

	public CallResult<T> setSepPhased(String sepPhased)
	{
		this.sepPhased = sepPhased;
		return this;
	}

	public String getSepUnphased()
	{
		return sepUnphased;
	}

	public CallResult<T> setSepUnphased(String sepUnphased)
	{
		this.sepUnphased = sepUnphased;
		return this;
	}

	public String getUnknownString()
	{
		return unknownString;
	}

	public CallResult<T> setUnknownString(String unknownString)
	{
		this.unknownString = unknownString;
		return this;
	}
}
