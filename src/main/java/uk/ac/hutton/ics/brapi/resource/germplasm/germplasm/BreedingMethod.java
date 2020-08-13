package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

public class BreedingMethod
{
	private String abbreviation;
	private String breedingMethodDbId;
	private String breedingMethodName;
	private String description;

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public BreedingMethod setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
		return this;
	}

	public String getBreedingMethodDbId()
	{
		return breedingMethodDbId;
	}

	public BreedingMethod setBreedingMethodDbId(String breedingMethodDbId)
	{
		this.breedingMethodDbId = breedingMethodDbId;
		return this;
	}

	public String getBreedingMethodName()
	{
		return breedingMethodName;
	}

	public BreedingMethod setBreedingMethodName(String breedingMethodName)
	{
		this.breedingMethodName = breedingMethodName;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public BreedingMethod setDescription(String description)
	{
		this.description = description;
		return this;
	}
}
