package uk.ac.hutton.ics.brapi.resource.observation;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class ObservationUnit extends BrapiObject
{
	private List<Reference>         externalReferences;
	private String                  germplasmDbId;
	private String                  germplasmName;
	private String                  locationDbId;
	private String                  locationName;
	private String                  observationUnitDbId;
	private String                  observationUnitName;
	private String                  observationUnitPUI;
	private ObservationUnitPosition observationUnitPosition;
	private List<Observation>       observations;
	private String                  programDbId;
	private String                  programName;
	private String                  seedLotDbId;
	private String                  studyDbId;
	private String                  studyName;
	private List<Treatment>         treatments;
	private String                  trialDbId;
	private String                  trialName;

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public ObservationUnit setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public ObservationUnit setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public ObservationUnit setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public String getLocationDbId()
	{
		return locationDbId;
	}

	public ObservationUnit setLocationDbId(String locationDbId)
	{
		this.locationDbId = locationDbId;
		return this;
	}

	public String getLocationName()
	{
		return locationName;
	}

	public ObservationUnit setLocationName(String locationName)
	{
		this.locationName = locationName;
		return this;
	}

	public String getObservationUnitDbId()
	{
		return observationUnitDbId;
	}

	public ObservationUnit setObservationUnitDbId(String observationUnitDbId)
	{
		this.observationUnitDbId = observationUnitDbId;
		return this;
	}

	public String getObservationUnitName()
	{
		return observationUnitName;
	}

	public ObservationUnit setObservationUnitName(String observationUnitName)
	{
		this.observationUnitName = observationUnitName;
		return this;
	}

	public String getObservationUnitPUI()
	{
		return observationUnitPUI;
	}

	public ObservationUnit setObservationUnitPUI(String observationUnitPUI)
	{
		this.observationUnitPUI = observationUnitPUI;
		return this;
	}

	public ObservationUnitPosition getObservationUnitPosition()
	{
		return observationUnitPosition;
	}

	public ObservationUnit setObservationUnitPosition(ObservationUnitPosition observationUnitPosition)
	{
		this.observationUnitPosition = observationUnitPosition;
		return this;
	}

	public List<Observation> getObservations()
	{
		return observations;
	}

	public ObservationUnit setObservations(List<Observation> observations)
	{
		this.observations = observations;
		return this;
	}

	public String getProgramDbId()
	{
		return programDbId;
	}

	public ObservationUnit setProgramDbId(String programDbId)
	{
		this.programDbId = programDbId;
		return this;
	}

	public String getProgramName()
	{
		return programName;
	}

	public ObservationUnit setProgramName(String programName)
	{
		this.programName = programName;
		return this;
	}

	public String getSeedLotDbId()
	{
		return seedLotDbId;
	}

	public ObservationUnit setSeedLotDbId(String seedLotDbId)
	{
		this.seedLotDbId = seedLotDbId;
		return this;
	}

	public String getStudyDbId()
	{
		return studyDbId;
	}

	public ObservationUnit setStudyDbId(String studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public String getStudyName()
	{
		return studyName;
	}

	public ObservationUnit setStudyName(String studyName)
	{
		this.studyName = studyName;
		return this;
	}

	public List<Treatment> getTreatments()
	{
		return treatments;
	}

	public ObservationUnit setTreatments(List<Treatment> treatments)
	{
		this.treatments = treatments;
		return this;
	}

	public String getTrialDbId()
	{
		return trialDbId;
	}

	public ObservationUnit setTrialDbId(String trialDbId)
	{
		this.trialDbId = trialDbId;
		return this;
	}

	public String getTrialName()
	{
		return trialName;
	}

	public ObservationUnit setTrialName(String trialName)
	{
		this.trialName = trialName;
		return this;
	}
}
