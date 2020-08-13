package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

public class McpdDonor
{
	private String    donorAccessionNumber;
	private String    donorAccessionPui;
	private Institute donorInstitute;

	public String getDonorAccessionNumber()
	{
		return donorAccessionNumber;
	}

	public McpdDonor setDonorAccessionNumber(String donorAccessionNumber)
	{
		this.donorAccessionNumber = donorAccessionNumber;
		return this;
	}

	public String getDonorAccessionPui()
	{
		return donorAccessionPui;
	}

	public McpdDonor setDonorAccessionPui(String donorAccessionPui)
	{
		this.donorAccessionPui = donorAccessionPui;
		return this;
	}

	public Institute getDonorInstitute()
	{
		return donorInstitute;
	}

	public McpdDonor setDonorInstitute(Institute donorInstitute)
	{
		this.donorInstitute = donorInstitute;
		return this;
	}
}
