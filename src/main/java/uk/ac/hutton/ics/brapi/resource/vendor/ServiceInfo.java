package uk.ac.hutton.ics.brapi.resource.vendor;

public class ServiceInfo
{
	private String extractDNA;
	private String genus;
	private String species;
	private String volumePerWell;

	public String getExtractDNA()
	{
		return extractDNA;
	}

	public ServiceInfo setExtractDNA(String extractDNA)
	{
		this.extractDNA = extractDNA;
		return this;
	}

	public String getGenus()
	{
		return genus;
	}

	public ServiceInfo setGenus(String genus)
	{
		this.genus = genus;
		return this;
	}

	public String getSpecies()
	{
		return species;
	}

	public ServiceInfo setSpecies(String species)
	{
		this.species = species;
		return this;
	}

	public String getVolumePerWell()
	{
		return volumePerWell;
	}

	public ServiceInfo setVolumePerWell(String volumePerWell)
	{
		this.volumePerWell = volumePerWell;
		return this;
	}
}
