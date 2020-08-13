package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

public class ObservationVariable
{
	private String observationVariableDbId;
	private String observationVariableName;

	public String getObservationVariableDbId()
	{
		return observationVariableDbId;
	}

	public ObservationVariable setObservationVariableDbId(String observationVariableDbId)
	{
		this.observationVariableDbId = observationVariableDbId;
		return this;
	}

	public String getObservationVariableName()
	{
		return observationVariableName;
	}

	public ObservationVariable setObservationVariableName(String observationVariableName)
	{
		this.observationVariableName = observationVariableName;
		return this;
	}
}
