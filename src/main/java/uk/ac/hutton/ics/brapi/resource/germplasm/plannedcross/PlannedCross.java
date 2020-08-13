package uk.ac.hutton.ics.brapi.resource.germplasm.plannedcross;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.Parent;

public class PlannedCross extends BrapiObject
{
	private String          crossType;
	private String          crossingProjectDbId;
	private String          crossingProjectName;
	private List<Reference> externalReferences;
	private Parent          parent1;
	private Parent          parent2;
	private String          plannedCrossDbId;
	private String          plannedCrossName;

	public String getCrossType()
	{
		return crossType;
	}

	public PlannedCross setCrossType(String crossType)
	{
		this.crossType = crossType;
		return this;
	}

	public String getCrossingProjectDbId()
	{
		return crossingProjectDbId;
	}

	public PlannedCross setCrossingProjectDbId(String crossingProjectDbId)
	{
		this.crossingProjectDbId = crossingProjectDbId;
		return this;
	}

	public String getCrossingProjectName()
	{
		return crossingProjectName;
	}

	public PlannedCross setCrossingProjectName(String crossingProjectName)
	{
		this.crossingProjectName = crossingProjectName;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public PlannedCross setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public Parent getParent1()
	{
		return parent1;
	}

	public PlannedCross setParent1(Parent parent1)
	{
		this.parent1 = parent1;
		return this;
	}

	public Parent getParent2()
	{
		return parent2;
	}

	public PlannedCross setParent2(Parent parent2)
	{
		this.parent2 = parent2;
		return this;
	}

	public String getPlannedCrossDbId()
	{
		return plannedCrossDbId;
	}

	public PlannedCross setPlannedCrossDbId(String plannedCrossDbId)
	{
		this.plannedCrossDbId = plannedCrossDbId;
		return this;
	}

	public String getPlannedCrossName()
	{
		return plannedCrossName;
	}

	public PlannedCross setPlannedCrossName(String plannedCrossName)
	{
		this.plannedCrossName = plannedCrossName;
		return this;
	}
}
