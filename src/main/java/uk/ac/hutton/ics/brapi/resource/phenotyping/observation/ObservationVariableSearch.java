package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import java.util.List;

public class ObservationVariableSearch
{
	private List<String> dataTypes;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> methodDbIds;
	private List<String> observationVariableDbIds;
	private List<String> observationVariableNames;
	private List<String> ontologyDbIds;
	private List<String> scaleDbIds;
	private List<String> studyDbId;
	private List<String> traitClasses;
	private List<String> traitDbIds;

	public List<String> getDataTypes()
	{
		return dataTypes;
	}

	public ObservationVariableSearch setDataTypes(List<String> dataTypes)
	{
		this.dataTypes = dataTypes;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public ObservationVariableSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public ObservationVariableSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getMethodDbIds()
	{
		return methodDbIds;
	}

	public ObservationVariableSearch setMethodDbIds(List<String> methodDbIds)
	{
		this.methodDbIds = methodDbIds;
		return this;
	}

	public List<String> getObservationVariableDbIds()
	{
		return observationVariableDbIds;
	}

	public ObservationVariableSearch setObservationVariableDbIds(List<String> observationVariableDbIds)
	{
		this.observationVariableDbIds = observationVariableDbIds;
		return this;
	}

	public List<String> getObservationVariableNames()
	{
		return observationVariableNames;
	}

	public ObservationVariableSearch setObservationVariableNames(List<String> observationVariableNames)
	{
		this.observationVariableNames = observationVariableNames;
		return this;
	}

	public List<String> getOntologyDbIds()
	{
		return ontologyDbIds;
	}

	public ObservationVariableSearch setOntologyDbIds(List<String> ontologyDbIds)
	{
		this.ontologyDbIds = ontologyDbIds;
		return this;
	}

	public List<String> getScaleDbIds()
	{
		return scaleDbIds;
	}

	public ObservationVariableSearch setScaleDbIds(List<String> scaleDbIds)
	{
		this.scaleDbIds = scaleDbIds;
		return this;
	}

	public List<String> getStudyDbId()
	{
		return studyDbId;
	}

	public ObservationVariableSearch setStudyDbId(List<String> studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public List<String> getTraitClasses()
	{
		return traitClasses;
	}

	public ObservationVariableSearch setTraitClasses(List<String> traitClasses)
	{
		this.traitClasses = traitClasses;
		return this;
	}

	public List<String> getTraitDbIds()
	{
		return traitDbIds;
	}

	public ObservationVariableSearch setTraitDbIds(List<String> traitDbIds)
	{
		this.traitDbIds = traitDbIds;
		return this;
	}
}
