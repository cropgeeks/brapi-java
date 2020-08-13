package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

public class Parent
{
	private String germplasmDbId;
	private String germplasmName;
	private String observationUnitDbId;
	private String observationUnitName;
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

	public String getObservationUnitDbId()
	{
		return observationUnitDbId;
	}

	public Parent setObservationUnitDbId(String observationUnitDbId)
	{
		this.observationUnitDbId = observationUnitDbId;
		return this;
	}

	public String getObservationUnitName()
	{
		return observationUnitName;
	}

	public Parent setObservationUnitName(String observationUnitName)
	{
		this.observationUnitName = observationUnitName;
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
