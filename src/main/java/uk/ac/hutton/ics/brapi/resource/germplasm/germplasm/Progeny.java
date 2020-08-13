package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import java.util.List;

public class Progeny
{
	private String       germplasmDbId;
	private String       germplasmName;
	private List<Parent> progeny;

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Progeny setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public Progeny setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public List<Parent> getProgeny()
	{
		return progeny;
	}

	public Progeny setProgeny(List<Parent> progeny)
	{
		this.progeny = progeny;
		return this;
	}
}
