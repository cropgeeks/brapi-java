package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import java.sql.Timestamp;
import java.util.List;

public class Analysis
{
	private String       analysisDbId;
	private String       analysisName;
	private Timestamp    created;
	private String       description;
	private List<String> software;
	private String       type;
	private Timestamp    updated;

	public String getAnalysisDbId()
	{
		return analysisDbId;
	}

	public Analysis setAnalysisDbId(String analysisDbId)
	{
		this.analysisDbId = analysisDbId;
		return this;
	}

	public String getAnalysisName()
	{
		return analysisName;
	}

	public Analysis setAnalysisName(String analysisName)
	{
		this.analysisName = analysisName;
		return this;
	}

	public Timestamp getCreated()
	{
		return created;
	}

	public Analysis setCreated(Timestamp created)
	{
		this.created = created;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Analysis setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public List<String> getSoftware()
	{
		return software;
	}

	public Analysis setSoftware(List<String> software)
	{
		this.software = software;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Analysis setType(String type)
	{
		this.type = type;
		return this;
	}

	public Timestamp getUpdated()
	{
		return updated;
	}

	public Analysis setUpdated(Timestamp updated)
	{
		this.updated = updated;
		return this;
	}
}
