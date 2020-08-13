package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import java.util.List;

public class Collection
{
	private String          collectingDate;
	private List<Institute> collectingInstitutes;
	private String          collectingMissionIdentifier;
	private String          collectingNumber;
	private Collsite        collectingSite;

	public String getCollectingDate()
	{
		return collectingDate;
	}

	public Collection setCollectingDate(String collectingDate)
	{
		this.collectingDate = collectingDate;
		return this;
	}

	public List<Institute> getCollectingInstitutes()
	{
		return collectingInstitutes;
	}

	public Collection setCollectingInstitutes(List<Institute> collectingInstitutes)
	{
		this.collectingInstitutes = collectingInstitutes;
		return this;
	}

	public String getCollectingMissionIdentifier()
	{
		return collectingMissionIdentifier;
	}

	public Collection setCollectingMissionIdentifier(String collectingMissionIdentifier)
	{
		this.collectingMissionIdentifier = collectingMissionIdentifier;
		return this;
	}

	public String getCollectingNumber()
	{
		return collectingNumber;
	}

	public Collection setCollectingNumber(String collectingNumber)
	{
		this.collectingNumber = collectingNumber;
		return this;
	}

	public Collsite getCollectingSite()
	{
		return collectingSite;
	}

	public Collection setCollectingSite(Collsite collectingSite)
	{
		this.collectingSite = collectingSite;
		return this;
	}
}
