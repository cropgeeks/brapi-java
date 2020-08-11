package uk.ac.hutton.ics.brapi.resource.reference;

public class Base
{
	private String  nextPageToken;
	private Integer offset;
	private String  sequence;

	public String getNextPageToken()
	{
		return nextPageToken;
	}

	public Base setNextPageToken(String nextPageToken)
	{
		this.nextPageToken = nextPageToken;
		return this;
	}

	public Integer getOffset()
	{
		return offset;
	}

	public Base setOffset(Integer offset)
	{
		this.offset = offset;
		return this;
	}

	public String getSequence()
	{
		return sequence;
	}

	public Base setSequence(String sequence)
	{
		this.sequence = sequence;
		return this;
	}
}
