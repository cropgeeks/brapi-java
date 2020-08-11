package uk.ac.hutton.ics.brapi.resource.germplasm;

import java.util.List;

public class Pedigree
{
	private String        crossingProjectDbId;
	private Integer       crossingYear;
	private String        familyCode;
	private String        germplasmDbId;
	private String        germplasmName;
	private List<Parent>  parents;
	private String        pedigree;
	private List<Sibling> siblings;

	public String getCrossingProjectDbId()
	{
		return crossingProjectDbId;
	}

	public Pedigree setCrossingProjectDbId(String crossingProjectDbId)
	{
		this.crossingProjectDbId = crossingProjectDbId;
		return this;
	}

	public Integer getCrossingYear()
	{
		return crossingYear;
	}

	public Pedigree setCrossingYear(Integer crossingYear)
	{
		this.crossingYear = crossingYear;
		return this;
	}

	public String getFamilyCode()
	{
		return familyCode;
	}

	public Pedigree setFamilyCode(String familyCode)
	{
		this.familyCode = familyCode;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Pedigree setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public Pedigree setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public List<Parent> getParents()
	{
		return parents;
	}

	public Pedigree setParents(List<Parent> parents)
	{
		this.parents = parents;
		return this;
	}

	public String getPedigree()
	{
		return pedigree;
	}

	public Pedigree setPedigree(String pedigree)
	{
		this.pedigree = pedigree;
		return this;
	}

	public List<Sibling> getSiblings()
	{
		return siblings;
	}

	public Pedigree setSiblings(List<Sibling> siblings)
	{
		this.siblings = siblings;
		return this;
	}
}
