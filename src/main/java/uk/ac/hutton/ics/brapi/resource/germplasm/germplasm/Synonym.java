package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

public class Synonym
{
	private String synonym;
	private String type;

	public String getSynonym()
	{
		return synonym;
	}

	public Synonym setSynonym(String synonym)
	{
		this.synonym = synonym;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Synonym setType(String type)
	{
		this.type = type;
		return this;
	}
}
