package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.util.List;

public class PlateSubmission
{
	private String      clientId;
	private Integer     numberOfSamples;
	private List<Plate> plates;
	private String      sampleType;

	public String getClientId()
	{
		return clientId;
	}

	public PlateSubmission setClientId(String clientId)
	{
		this.clientId = clientId;
		return this;
	}

	public Integer getNumberOfSamples()
	{
		return numberOfSamples;
	}

	public PlateSubmission setNumberOfSamples(Integer numberOfSamples)
	{
		this.numberOfSamples = numberOfSamples;
		return this;
	}

	public List<Plate> getPlates()
	{
		return plates;
	}

	public PlateSubmission setPlates(List<Plate> plates)
	{
		this.plates = plates;
		return this;
	}

	public String getSampleType()
	{
		return sampleType;
	}

	public PlateSubmission setSampleType(String sampleType)
	{
		this.sampleType = sampleType;
		return this;
	}
}
