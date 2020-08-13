package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

public class Donor
{
	private String donorAccessionNumber;
	private String donorInstituteCode;
	private String germplasmPUI;

	public String getDonorAccessionNumber()
	{
		return donorAccessionNumber;
	}

	public Donor setDonorAccessionNumber(String donorAccessionNumber)
	{
		this.donorAccessionNumber = donorAccessionNumber;
		return this;
	}

	public String getDonorInstituteCode()
	{
		return donorInstituteCode;
	}

	public Donor setDonorInstituteCode(String donorInstituteCode)
	{
		this.donorInstituteCode = donorInstituteCode;
		return this;
	}

	public String getGermplasmPUI()
	{
		return germplasmPUI;
	}

	public Donor setGermplasmPUI(String germplasmPUI)
	{
		this.germplasmPUI = germplasmPUI;
		return this;
	}
}
