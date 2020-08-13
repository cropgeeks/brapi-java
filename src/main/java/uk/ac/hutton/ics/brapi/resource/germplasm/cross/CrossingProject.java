package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class CrossingProject extends BrapiObject
{
	private String          commonCropName;
	private String          crossingProjectDbId;
	private String          crossingProjectDescription;
	private String          crossingProjectName;
	private List<Reference> externalReferences;
	private String          programDbId;
	private String          programName;

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public CrossingProject setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getCrossingProjectDbId()
	{
		return crossingProjectDbId;
	}

	public CrossingProject setCrossingProjectDbId(String crossingProjectDbId)
	{
		this.crossingProjectDbId = crossingProjectDbId;
		return this;
	}

	public String getCrossingProjectDescription()
	{
		return crossingProjectDescription;
	}

	public CrossingProject setCrossingProjectDescription(String crossingProjectDescription)
	{
		this.crossingProjectDescription = crossingProjectDescription;
		return this;
	}

	public String getCrossingProjectName()
	{
		return crossingProjectName;
	}

	public CrossingProject setCrossingProjectName(String crossingProjectName)
	{
		this.crossingProjectName = crossingProjectName;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public CrossingProject setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getProgramDbId()
	{
		return programDbId;
	}

	public CrossingProject setProgramDbId(String programDbId)
	{
		this.programDbId = programDbId;
		return this;
	}

	public String getProgramName()
	{
		return programName;
	}

	public CrossingProject setProgramName(String programName)
	{
		this.programName = programName;
		return this;
	}
}
