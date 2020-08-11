package uk.ac.hutton.ics.brapi.resource.program;

import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class Program
{
	private String              abbreviation;
	private Map<String, String> additionalInfo;
	private String              commonCropName;
	private String              documentationURL;
	private List<Reference>     externalReferences;
	private String              leadPersonDbId;
	private String              leadPersonName;
	private String              objective;
	private String              programDbId;
	private String              programName;

	public String getAbbreviation()
	{
		return abbreviation;
	}

	public Program setAbbreviation(String abbreviation)
	{
		this.abbreviation = abbreviation;
		return this;
	}

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public Program setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Program setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getDocumentationURL()
	{
		return documentationURL;
	}

	public Program setDocumentationURL(String documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Program setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getLeadPersonDbId()
	{
		return leadPersonDbId;
	}

	public Program setLeadPersonDbId(String leadPersonDbId)
	{
		this.leadPersonDbId = leadPersonDbId;
		return this;
	}

	public String getLeadPersonName()
	{
		return leadPersonName;
	}

	public Program setLeadPersonName(String leadPersonName)
	{
		this.leadPersonName = leadPersonName;
		return this;
	}

	public String getObjective()
	{
		return objective;
	}

	public Program setObjective(String objective)
	{
		this.objective = objective;
		return this;
	}

	public String getProgramDbId()
	{
		return programDbId;
	}

	public Program setProgramDbId(String programDbId)
	{
		this.programDbId = programDbId;
		return this;
	}

	public String getProgramName()
	{
		return programName;
	}

	public Program setProgramName(String programName)
	{
		this.programName = programName;
		return this;
	}
}
