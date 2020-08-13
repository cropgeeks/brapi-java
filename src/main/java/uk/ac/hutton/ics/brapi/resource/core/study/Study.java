package uk.ac.hutton.ics.brapi.resource.core.study;

import java.net.URI;
import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationLevel;

public class Study extends BrapiObject
{
	private Boolean                      active;
	private String                       commonCropName;
	private List<Contact>                contacts;
	private String                       culturalPractices;
	private List<DataLink>               dataLinks;
	private URI                          documentationURL;
	private Timestamp                    endDate;
	private List<EnvironmentalParameter> environmentParameters;
	private PuiDescription               experimentalDesign;
	private List<Reference>              externalReference;
	private PuiDescription               growthFacility;
	private LastUpdate                   lastUpdate;
	private String                       license;
	private String                       locationDbId;
	private String                       locationName;
	private List<ObservationLevel>       observationLevels;
	private String                       observationUnitsDescription;
	private List<String>                 seasons;
	private Timestamp                    startDate;
	private String                       studyCode;
	private String                       studyDbId;
	private String                       studyDescription;
	private String                       studyName;
	private String                       studyPUI;
	private String                       studyType;
	private String                       trialDbId;
	private String                       trialName;

	public Boolean isActive()
	{
		return active;
	}

	public Study setActive(Boolean active)
	{
		this.active = active;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Study setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public List<Contact> getContacts()
	{
		return contacts;
	}

	public Study setContacts(List<Contact> contacts)
	{
		this.contacts = contacts;
		return this;
	}

	public String getCulturalPractices()
	{
		return culturalPractices;
	}

	public Study setCulturalPractices(String culturalPractices)
	{
		this.culturalPractices = culturalPractices;
		return this;
	}

	public List<DataLink> getDataLinks()
	{
		return dataLinks;
	}

	public Study setDataLinks(List<DataLink> dataLinks)
	{
		this.dataLinks = dataLinks;
		return this;
	}

	public URI getDocumentationURL()
	{
		return documentationURL;
	}

	public Study setDocumentationURL(URI documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public Timestamp getEndDate()
	{
		return endDate;
	}

	public Study setEndDate(Timestamp endDate)
	{
		this.endDate = endDate;
		return this;
	}

	public List<EnvironmentalParameter> getEnvironmentParameters()
	{
		return environmentParameters;
	}

	public Study setEnvironmentParameters(List<EnvironmentalParameter> environmentParameters)
	{
		this.environmentParameters = environmentParameters;
		return this;
	}

	public PuiDescription getExperimentalDesign()
	{
		return experimentalDesign;
	}

	public Study setExperimentalDesign(PuiDescription experimentalDesign)
	{
		this.experimentalDesign = experimentalDesign;
		return this;
	}

	public List<Reference> getExternalReference()
	{
		return externalReference;
	}

	public Study setExternalReference(List<Reference> externalReference)
	{
		this.externalReference = externalReference;
		return this;
	}

	public PuiDescription getGrowthFacility()
	{
		return growthFacility;
	}

	public Study setGrowthFacility(PuiDescription growthFacility)
	{
		this.growthFacility = growthFacility;
		return this;
	}

	public LastUpdate getLastUpdate()
	{
		return lastUpdate;
	}

	public Study setLastUpdate(LastUpdate lastUpdate)
	{
		this.lastUpdate = lastUpdate;
		return this;
	}

	public String getLicense()
	{
		return license;
	}

	public Study setLicense(String license)
	{
		this.license = license;
		return this;
	}

	public String getLocationDbId()
	{
		return locationDbId;
	}

	public Study setLocationDbId(String locationDbId)
	{
		this.locationDbId = locationDbId;
		return this;
	}

	public String getLocationName()
	{
		return locationName;
	}

	public Study setLocationName(String locationName)
	{
		this.locationName = locationName;
		return this;
	}

	public List<ObservationLevel> getObservationLevels()
	{
		return observationLevels;
	}

	public Study setObservationLevels(List<ObservationLevel> observationLevels)
	{
		this.observationLevels = observationLevels;
		return this;
	}

	public String getObservationUnitsDescription()
	{
		return observationUnitsDescription;
	}

	public Study setObservationUnitsDescription(String observationUnitsDescription)
	{
		this.observationUnitsDescription = observationUnitsDescription;
		return this;
	}

	public List<String> getSeasons()
	{
		return seasons;
	}

	public Study setSeasons(List<String> seasons)
	{
		this.seasons = seasons;
		return this;
	}

	public Timestamp getStartDate()
	{
		return startDate;
	}

	public Study setStartDate(Timestamp startDate)
	{
		this.startDate = startDate;
		return this;
	}

	public String getStudyCode()
	{
		return studyCode;
	}

	public Study setStudyCode(String studyCode)
	{
		this.studyCode = studyCode;
		return this;
	}

	public String getStudyDbId()
	{
		return studyDbId;
	}

	public Study setStudyDbId(String studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public String getStudyDescription()
	{
		return studyDescription;
	}

	public Study setStudyDescription(String studyDescription)
	{
		this.studyDescription = studyDescription;
		return this;
	}

	public String getStudyName()
	{
		return studyName;
	}

	public Study setStudyName(String studyName)
	{
		this.studyName = studyName;
		return this;
	}

	public String getStudyPUI()
	{
		return studyPUI;
	}

	public Study setStudyPUI(String studyPUI)
	{
		this.studyPUI = studyPUI;
		return this;
	}

	public String getStudyType()
	{
		return studyType;
	}

	public Study setStudyType(String studyType)
	{
		this.studyType = studyType;
		return this;
	}

	public String getTrialDbId()
	{
		return trialDbId;
	}

	public Study setTrialDbId(String trialDbId)
	{
		this.trialDbId = trialDbId;
		return this;
	}

	public String getTrialName()
	{
		return trialName;
	}

	public Study setTrialName(String trialName)
	{
		this.trialName = trialName;
		return this;
	}
}
