package uk.ac.hutton.ics.brapi.resource.cross;

public class CrossAttribute
{
	private String crossAttributeName;
	private String crossAttributeValue;

	public String getCrossAttributeName()
	{
		return crossAttributeName;
	}

	public CrossAttribute setCrossAttributeName(String crossAttributeName)
	{
		this.crossAttributeName = crossAttributeName;
		return this;
	}

	public String getCrossAttributeValue()
	{
		return crossAttributeValue;
	}

	public CrossAttribute setCrossAttributeValue(String crossAttributeValue)
	{
		this.crossAttributeValue = crossAttributeValue;
		return this;
	}
}
