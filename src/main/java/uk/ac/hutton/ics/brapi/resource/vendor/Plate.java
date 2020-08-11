package uk.ac.hutton.ics.brapi.resource.vendor;

import java.util.List;

public class Plate
{
	private String       clientPlateBarcode;
	private String       clientPlateId;
	private String       sampleSubmissionFormat;
	private List<Sample> samples;

	public String getClientPlateBarcode()
	{
		return clientPlateBarcode;
	}

	public Plate setClientPlateBarcode(String clientPlateBarcode)
	{
		this.clientPlateBarcode = clientPlateBarcode;
		return this;
	}

	public String getClientPlateId()
	{
		return clientPlateId;
	}

	public Plate setClientPlateId(String clientPlateId)
	{
		this.clientPlateId = clientPlateId;
		return this;
	}

	public String getSampleSubmissionFormat()
	{
		return sampleSubmissionFormat;
	}

	public Plate setSampleSubmissionFormat(String sampleSubmissionFormat)
	{
		this.sampleSubmissionFormat = sampleSubmissionFormat;
		return this;
	}

	public List<Sample> getSamples()
	{
		return samples;
	}

	public Plate setSamples(List<Sample> samples)
	{
		this.samples = samples;
		return this;
	}
}
