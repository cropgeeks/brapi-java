package uk.ac.hutton.ics.brapi.resource.trial;

import java.util.List;

public class TrialSearch
{
	private Boolean      active;
	private List<String> commonCropNames;
	private List<String> contactDbIds;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> locationDbIds;
	private List<String> locationNames;
	private List<String> programDbIds;
	private List<String> programNames;
	private String       searchDateRangeEnd;
	private String       searchDateRangeStart;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;
	private List<String> trialPUIs;

	public Boolean getActive()
	{
		return active;
	}

	public TrialSearch setActive(Boolean active)
	{
		this.active = active;
		return this;
	}

	public List<String> getCommonCropNames()
	{
		return commonCropNames;
	}

	public TrialSearch setCommonCropNames(List<String> commonCropNames)
	{
		this.commonCropNames = commonCropNames;
		return this;
	}

	public List<String> getContactDbIds()
	{
		return contactDbIds;
	}

	public TrialSearch setContactDbIds(List<String> contactDbIds)
	{
		this.contactDbIds = contactDbIds;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public TrialSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public TrialSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getLocationDbIds()
	{
		return locationDbIds;
	}

	public TrialSearch setLocationDbIds(List<String> locationDbIds)
	{
		this.locationDbIds = locationDbIds;
		return this;
	}

	public List<String> getLocationNames()
	{
		return locationNames;
	}

	public TrialSearch setLocationNames(List<String> locationNames)
	{
		this.locationNames = locationNames;
		return this;
	}

	public List<String> getProgramDbIds()
	{
		return programDbIds;
	}

	public TrialSearch setProgramDbIds(List<String> programDbIds)
	{
		this.programDbIds = programDbIds;
		return this;
	}

	public List<String> getProgramNames()
	{
		return programNames;
	}

	public TrialSearch setProgramNames(List<String> programNames)
	{
		this.programNames = programNames;
		return this;
	}

	public String getSearchDateRangeEnd()
	{
		return searchDateRangeEnd;
	}

	public TrialSearch setSearchDateRangeEnd(String searchDateRangeEnd)
	{
		this.searchDateRangeEnd = searchDateRangeEnd;
		return this;
	}

	public String getSearchDateRangeStart()
	{
		return searchDateRangeStart;
	}

	public TrialSearch setSearchDateRangeStart(String searchDateRangeStart)
	{
		this.searchDateRangeStart = searchDateRangeStart;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public TrialSearch setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public TrialSearch setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}

	public List<String> getTrialDbIds()
	{
		return trialDbIds;
	}

	public TrialSearch setTrialDbIds(List<String> trialDbIds)
	{
		this.trialDbIds = trialDbIds;
		return this;
	}

	public List<String> getTrialNames()
	{
		return trialNames;
	}

	public TrialSearch setTrialNames(List<String> trialNames)
	{
		this.trialNames = trialNames;
		return this;
	}

	public List<String> getTrialPUIs()
	{
		return trialPUIs;
	}

	public TrialSearch setTrialPUIs(List<String> trialPUIs)
	{
		this.trialPUIs = trialPUIs;
		return this;
	}
}
