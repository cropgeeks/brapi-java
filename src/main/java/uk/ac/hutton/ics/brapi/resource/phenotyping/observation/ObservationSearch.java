package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import java.sql.Timestamp;
import java.util.List;

public class ObservationSearch
{
	private List<String>           externalReferenceIDs;
	private List<String>           externalReferenceSources;
	private List<String>           germplasmDbIds;
	private List<String>           germplasmNames;
	private List<String>           locationDbIds;
	private List<String>           locationNames;
	private List<String>           observationDbIds;
	private List<ObservationLevel> observationLevelRelationships;
	private List<ObservationLevel> observationLevels;
	private Timestamp              observationTimeStampRangeEnd;
	private Timestamp              observationTimeStampRangeStart;
	private List<String>           observationUnitDbIds;
	private List<String>           observationVariableDbIds;
	private List<String>           observationVariableNames;
	private List<String>           programDbIds;
	private List<String>           programNames;
	private List<String>           seasonDbIds;
	private List<String>           studyDbIds;
	private List<String>           studyNames;
	private List<String>           trialDbIds;
	private List<String>           trialNames;

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public ObservationSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public ObservationSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getGermplasmDbIds()
	{
		return germplasmDbIds;
	}

	public ObservationSearch setGermplasmDbIds(List<String> germplasmDbIds)
	{
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public List<String> getGermplasmNames()
	{
		return germplasmNames;
	}

	public ObservationSearch setGermplasmNames(List<String> germplasmNames)
	{
		this.germplasmNames = germplasmNames;
		return this;
	}

	public List<String> getLocationDbIds()
	{
		return locationDbIds;
	}

	public ObservationSearch setLocationDbIds(List<String> locationDbIds)
	{
		this.locationDbIds = locationDbIds;
		return this;
	}

	public List<String> getLocationNames()
	{
		return locationNames;
	}

	public ObservationSearch setLocationNames(List<String> locationNames)
	{
		this.locationNames = locationNames;
		return this;
	}

	public List<String> getObservationDbIds()
	{
		return observationDbIds;
	}

	public ObservationSearch setObservationDbIds(List<String> observationDbIds)
	{
		this.observationDbIds = observationDbIds;
		return this;
	}

	public List<ObservationLevel> getObservationLevelRelationships()
	{
		return observationLevelRelationships;
	}

	public ObservationSearch setObservationLevelRelationships(List<ObservationLevel> observationLevelRelationships)
	{
		this.observationLevelRelationships = observationLevelRelationships;
		return this;
	}

	public List<ObservationLevel> getObservationLevels()
	{
		return observationLevels;
	}

	public ObservationSearch setObservationLevels(List<ObservationLevel> observationLevels)
	{
		this.observationLevels = observationLevels;
		return this;
	}

	public Timestamp getObservationTimeStampRangeEnd()
	{
		return observationTimeStampRangeEnd;
	}

	public ObservationSearch setObservationTimeStampRangeEnd(Timestamp observationTimeStampRangeEnd)
	{
		this.observationTimeStampRangeEnd = observationTimeStampRangeEnd;
		return this;
	}

	public Timestamp getObservationTimeStampRangeStart()
	{
		return observationTimeStampRangeStart;
	}

	public ObservationSearch setObservationTimeStampRangeStart(Timestamp observationTimeStampRangeStart)
	{
		this.observationTimeStampRangeStart = observationTimeStampRangeStart;
		return this;
	}

	public List<String> getObservationUnitDbIds()
	{
		return observationUnitDbIds;
	}

	public ObservationSearch setObservationUnitDbIds(List<String> observationUnitDbIds)
	{
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public List<String> getObservationVariableDbIds()
	{
		return observationVariableDbIds;
	}

	public ObservationSearch setObservationVariableDbIds(List<String> observationVariableDbIds)
	{
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public List<String> getObservationVariableNames()
	{
		return observationVariableNames;
	}

	public ObservationSearch setObservationVariableNames(List<String> observationVariableNames)
	{
		this.observationVariableNames = observationVariableNames;
		return this;
	}

	public List<String> getProgramDbIds()
	{
		return programDbIds;
	}

	public ObservationSearch setProgramDbIds(List<String> programDbIds)
	{
		this.programDbIds = programDbIds;
		return this;
	}

	public List<String> getProgramNames()
	{
		return programNames;
	}

	public ObservationSearch setProgramNames(List<String> programNames)
	{
		this.programNames = programNames;
		return this;
	}

	public List<String> getSeasonDbIds()
	{
		return seasonDbIds;
	}

	public ObservationSearch setSeasonDbIds(List<String> seasonDbIds)
	{
		this.seasonDbIds = seasonDbIds;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public ObservationSearch setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public ObservationSearch setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}

	public List<String> getTrialDbIds()
	{
		return trialDbIds;
	}

	public ObservationSearch setTrialDbIds(List<String> trialDbIds)
	{
		this.trialDbIds = trialDbIds;
		return this;
	}

	public List<String> getTrialNames()
	{
		return trialNames;
	}

	public ObservationSearch setTrialNames(List<String> trialNames)
	{
		this.trialNames = trialNames;
		return this;
	}
}
