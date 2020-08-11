package uk.ac.hutton.ics.brapi.resource.base;

public class Reference
{
	private String referenceID;
	private String referenceSource;

	public String getReferenceID()
	{
		return referenceID;
	}

	public Reference setReferenceID(String referenceID)
	{
		this.referenceID = referenceID;
		return this;
	}

	public String getReferenceSource()
	{
		return referenceSource;
	}

	public Reference setReferenceSource(String referenceSource)
	{
		this.referenceSource = referenceSource;
		return this;
	}
}