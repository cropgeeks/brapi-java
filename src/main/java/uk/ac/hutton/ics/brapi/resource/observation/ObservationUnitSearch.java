package uk.ac.hutton.ics.brapi.resource.observation;

import java.util.List;

public class ObservationUnitSearch
{
	private List<String>           externalReferenceIDs;
	private List<String>           externalReferenceSources;
	private List<String>           germplasmDbIds;
	private List<String>           germplasmNames;
	private Boolean                includeObservations;
	private List<String>           locationDbIds;
	private List<String>           locationNames;
	private List<ObservationLevel> observationLevelRelationships;
	private List<ObservationLevel> observationLevels;
	private List<String>           observationUnitDbIds;
	private List<String>           observationVariableDbIds;
	private List<String>           observationVariableNames;
	private List<String>           programDbIds;
	private List<String>           programNames;
	private List<String>           studyDbIds;
	private List<String>           studyNames;
	private List<String>           trialDbIds;
	private List<String>           trialNames;

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public ObservationUnitSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public ObservationUnitSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getGermplasmDbIds()
	{
		return germplasmDbIds;
	}

	public ObservationUnitSearch setGermplasmDbIds(List<String> germplasmDbIds)
	{
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public List<String> getGermplasmNames()
	{
		return germplasmNames;
	}

	public ObservationUnitSearch setGermplasmNames(List<String> germplasmNames)
	{
		this.germplasmNames = germplasmNames;
		return this;
	}

	public Boolean getIncludeObservations()
	{
		return includeObservations;
	}

	public ObservationUnitSearch setIncludeObservations(Boolean includeObservations)
	{
		this.includeObservations = includeObservations;
		return this;
	}

	public List<String> getLocationDbIds()
	{
		return locationDbIds;
	}

	public ObservationUnitSearch setLocationDbIds(List<String> locationDbIds)
	{
		this.locationDbIds = locationDbIds;
		return this;
	}

	public List<String> getLocationNames()
	{
		return locationNames;
	}

	public ObservationUnitSearch setLocationNames(List<String> locationNames)
	{
		this.locationNames = locationNames;
		return this;
	}

	public List<ObservationLevel> getObservationLevelRelationships()
	{
		return observationLevelRelationships;
	}

	public ObservationUnitSearch setObservationLevelRelationships(List<ObservationLevel> observationLevelRelationships)
	{
		this.observationLevelRelationships = observationLevelRelationships;
		return this;
	}

	public List<ObservationLevel> getObservationLevels()
	{
		return observationLevels;
	}

	public ObservationUnitSearch setObservationLevels(List<ObservationLevel> observationLevels)
	{
		this.observationLevels = observationLevels;
		return this;
	}

	public List<String> getObservationUnitDbIds()
	{
		return observationUnitDbIds;
	}

	public ObservationUnitSearch setObservationUnitDbIds(List<String> observationUnitDbIds)
	{
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public List<String> getObservationVariableDbIds()
	{
		return observationVariableDbIds;
	}

	public ObservationUnitSearch setObservationVariableDbIds(List<String> observationVariableDbIds)
	{
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public List<String> getObservationVariableNames()
	{
		return observationVariableNames;
	}

	public ObservationUnitSearch setObservationVariableNames(List<String> observationVariableNames)
	{
		this.observationVariableNames = observationVariableNames;
		return this;
	}

	public List<String> getProgramDbIds()
	{
		return programDbIds;
	}

	public ObservationUnitSearch setProgramDbIds(List<String> programDbIds)
	{
		this.programDbIds = programDbIds;
		return this;
	}

	public List<String> getProgramNames()
	{
		return programNames;
	}

	public ObservationUnitSearch setProgramNames(List<String> programNames)
	{
		this.programNames = programNames;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public ObservationUnitSearch setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public ObservationUnitSearch setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}

	public List<String> getTrialDbIds()
	{
		return trialDbIds;
	}

	public ObservationUnitSearch setTrialDbIds(List<String> trialDbIds)
	{
		this.trialDbIds = trialDbIds;
		return this;
	}

	public List<String> getTrialNames()
	{
		return trialNames;
	}

	public ObservationUnitSearch setTrialNames(List<String> trialNames)
	{
		this.trialNames = trialNames;
		return this;
	}
}
