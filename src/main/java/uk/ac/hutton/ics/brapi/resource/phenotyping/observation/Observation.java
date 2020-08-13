package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.season.Season;

public class Observation extends BrapiObject
{
	private String          collector;
	private List<Reference> externalReferences;
	private String          germplasmDbId;
	private String          germplasmName;
	private String          observationDbId;
	private Timestamp       observationTimeStamp;
	private String          observationUnitDbId;
	private String          observationUnitName;
	private String          observationVariableDbId;
	private String          observationVariableName;
	private Season          season;
	private String          studyDbId;
	private String          uploadedBy;
	private String          value;

	public String getCollector()
	{
		return collector;
	}

	public Observation setCollector(String collector)
	{
		this.collector = collector;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Observation setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Observation setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public Observation setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public String getObservationDbId()
	{
		return observationDbId;
	}

	public Observation setObservationDbId(String observationDbId)
	{
		this.observationDbId = observationDbId;
		return this;
	}

	public Timestamp getObservationTimeStamp()
	{
		return observationTimeStamp;
	}

	public Observation setObservationTimeStamp(Timestamp observationTimeStamp)
	{
		this.observationTimeStamp = observationTimeStamp;
		return this;
	}

	public String getObservationUnitDbId()
	{
		return observationUnitDbId;
	}

	public Observation setObservationUnitDbId(String observationUnitDbId)
	{
		this.observationUnitDbId = observationUnitDbId;
		return this;
	}

	public String getObservationUnitName()
	{
		return observationUnitName;
	}

	public Observation setObservationUnitName(String observationUnitName)
	{
		this.observationUnitName = observationUnitName;
		return this;
	}

	public String getObservationVariableDbId()
	{
		return observationVariableDbId;
	}

	public Observation setObservationVariableDbId(String observationVariableDbId)
	{
		this.observationVariableDbId = observationVariableDbId;
		return this;
	}

	public String getObservationVariableName()
	{
		return observationVariableName;
	}

	public Observation setObservationVariableName(String observationVariableName)
	{
		this.observationVariableName = observationVariableName;
		return this;
	}

	public Season getSeason()
	{
		return season;
	}

	public Observation setSeason(Season season)
	{
		this.season = season;
		return this;
	}

	public String getStudyDbId()
	{
		return studyDbId;
	}

	public Observation setStudyDbId(String studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public String getUploadedBy()
	{
		return uploadedBy;
	}

	public Observation setUploadedBy(String uploadedBy)
	{
		this.uploadedBy = uploadedBy;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public Observation setValue(String value)
	{
		this.value = value;
		return this;
	}
}
