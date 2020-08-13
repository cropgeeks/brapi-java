package uk.ac.hutton.ics.brapi.resource.genotyping.sample;

import java.util.List;

public class SampleSearch
{
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> observationUnitDbIds;
	private List<String> plateDbIds;
	private List<String> sampleDbIds;
	private List<String> studyDbIds;
	private List<String> studyNames;

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public SampleSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public SampleSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getGermplasmDbIds()
	{
		return germplasmDbIds;
	}

	public SampleSearch setGermplasmDbIds(List<String> germplasmDbIds)
	{
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public List<String> getGermplasmNames()
	{
		return germplasmNames;
	}

	public SampleSearch setGermplasmNames(List<String> germplasmNames)
	{
		this.germplasmNames = germplasmNames;
		return this;
	}

	public List<String> getObservationUnitDbIds()
	{
		return observationUnitDbIds;
	}

	public SampleSearch setObservationUnitDbIds(List<String> observationUnitDbIds)
	{
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public List<String> getPlateDbIds()
	{
		return plateDbIds;
	}

	public SampleSearch setPlateDbIds(List<String> plateDbIds)
	{
		this.plateDbIds = plateDbIds;
		return this;
	}

	public List<String> getSampleDbIds()
	{
		return sampleDbIds;
	}

	public SampleSearch setSampleDbIds(List<String> sampleDbIds)
	{
		this.sampleDbIds = sampleDbIds;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public SampleSearch setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public SampleSearch setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}
}
