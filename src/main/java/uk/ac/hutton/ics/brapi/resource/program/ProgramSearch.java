package uk.ac.hutton.ics.brapi.resource.program;

import java.util.List;

public class ProgramSearch
{
	private List<String> abbreviations;
	private List<String> commonCropNames;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> leadPersonDbIds;
	private List<String> leadPersonNames;
	private List<String> objectives;
	private List<String> programDbIds;
	private List<String> programNames;

	public List<String> getAbbreviations()
	{
		return abbreviations;
	}

	public ProgramSearch setAbbreviations(List<String> abbreviations)
	{
		this.abbreviations = abbreviations;
		return this;
	}

	public List<String> getCommonCropNames()
	{
		return commonCropNames;
	}

	public ProgramSearch setCommonCropNames(List<String> commonCropNames)
	{
		this.commonCropNames = commonCropNames;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public ProgramSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public ProgramSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getLeadPersonDbIds()
	{
		return leadPersonDbIds;
	}

	public ProgramSearch setLeadPersonDbIds(List<String> leadPersonDbIds)
	{
		this.leadPersonDbIds = leadPersonDbIds;
		return this;
	}

	public List<String> getLeadPersonNames()
	{
		return leadPersonNames;
	}

	public ProgramSearch setLeadPersonNames(List<String> leadPersonNames)
	{
		this.leadPersonNames = leadPersonNames;
		return this;
	}

	public List<String> getObjectives()
	{
		return objectives;
	}

	public ProgramSearch setObjectives(List<String> objectives)
	{
		this.objectives = objectives;
		return this;
	}

	public List<String> getProgramDbIds()
	{
		return programDbIds;
	}

	public ProgramSearch setProgramDbIds(List<String> programDbIds)
	{
		this.programDbIds = programDbIds;
		return this;
	}

	public List<String> getProgramNames()
	{
		return programNames;
	}

	public ProgramSearch setProgramNames(List<String> programNames)
	{
		this.programNames = programNames;
		return this;
	}
}
