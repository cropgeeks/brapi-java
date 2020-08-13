package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import java.sql.Timestamp;
import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class Cross
{
	private Map<String, String>  additionalData;
	private List<CrossAttribute> crossAttributes;
	private String               crossDbId;
	private String               crossName;
	private String               crossType;
	private String               crossingProjectDbId;
	private String               crossingProjectName;
	private List<Reference>      externalReferences;
	private Parent               parent1;
	private Parent               parent2;
	private Timestamp            pollinationTimeStamp;

	public Map<String, String> getAdditionalData()
	{
		return additionalData;
	}

	public Cross setAdditionalData(Map<String, String> additionalData)
	{
		this.additionalData = additionalData;
		return this;
	}

	public List<CrossAttribute> getCrossAttributes()
	{
		return crossAttributes;
	}

	public Cross setCrossAttributes(List<CrossAttribute> crossAttributes)
	{
		this.crossAttributes = crossAttributes;
		return this;
	}

	public String getCrossDbId()
	{
		return crossDbId;
	}

	public Cross setCrossDbId(String crossDbId)
	{
		this.crossDbId = crossDbId;
		return this;
	}

	public String getCrossName()
	{
		return crossName;
	}

	public Cross setCrossName(String crossName)
	{
		this.crossName = crossName;
		return this;
	}

	public String getCrossType()
	{
		return crossType;
	}

	public Cross setCrossType(String crossType)
	{
		this.crossType = crossType;
		return this;
	}

	public String getCrossingProjectDbId()
	{
		return crossingProjectDbId;
	}

	public Cross setCrossingProjectDbId(String crossingProjectDbId)
	{
		this.crossingProjectDbId = crossingProjectDbId;
		return this;
	}

	public String getCrossingProjectName()
	{
		return crossingProjectName;
	}

	public Cross setCrossingProjectName(String crossingProjectName)
	{
		this.crossingProjectName = crossingProjectName;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Cross setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public Parent getParent1()
	{
		return parent1;
	}

	public Cross setParent1(Parent parent1)
	{
		this.parent1 = parent1;
		return this;
	}

	public Parent getParent2()
	{
		return parent2;
	}

	public Cross setParent2(Parent parent2)
	{
		this.parent2 = parent2;
		return this;
	}

	public Timestamp getPollinationTimeStamp()
	{
		return pollinationTimeStamp;
	}

	public Cross setPollinationTimeStamp(Timestamp pollinationTimeStamp)
	{
		this.pollinationTimeStamp = pollinationTimeStamp;
		return this;
	}
}
