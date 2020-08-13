package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

public class Treatment
{
	private String factor;
	private String modality;

	public String getFactor()
	{
		return factor;
	}

	public Treatment setFactor(String factor)
	{
		this.factor = factor;
		return this;
	}

	public String getModality()
	{
		return modality;
	}

	public Treatment setModality(String modality)
	{
		this.modality = modality;
		return this;
	}
}
