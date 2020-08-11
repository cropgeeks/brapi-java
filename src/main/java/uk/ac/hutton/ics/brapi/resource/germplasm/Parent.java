package uk.ac.hutton.ics.brapi.resource.germplasm;

public class Parent
{
	private String germplasmDbId;
	private String germplasmName;
	private String parentType;

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Parent setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public Parent setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public String getParentType()
	{
		return parentType;
	}

	public Parent setParentType(String parentType)
	{
		this.parentType = parentType;
		return this;
	}
}
