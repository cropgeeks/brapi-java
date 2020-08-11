package uk.ac.hutton.ics.brapi.resource.germplasm;

public class Sibling
{
	private String germplasmDbId;
	private String germplasmName;

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Sibling setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public Sibling setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}
}
