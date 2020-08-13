package uk.ac.hutton.ics.brapi.resource.core.trial;

import java.sql.Date;

public class Authorship
{
	private String datasetPUI;
	private String license;
	private Date   publicReleaseDate;
	private Date   submissionDate;

	public String getDatasetPUI()
	{
		return datasetPUI;
	}

	public Authorship setDatasetPUI(String datasetPUI)
	{
		this.datasetPUI = datasetPUI;
		return this;
	}

	public String getLicense()
	{
		return license;
	}

	public Authorship setLicense(String license)
	{
		this.license = license;
		return this;
	}

	public Date getPublicReleaseDate()
	{
		return publicReleaseDate;
	}

	public Authorship setPublicReleaseDate(Date publicReleaseDate)
	{
		this.publicReleaseDate = publicReleaseDate;
		return this;
	}

	public Date getSubmissionDate()
	{
		return submissionDate;
	}

	public Authorship setSubmissionDate(Date submissionDate)
	{
		this.submissionDate = submissionDate;
		return this;
	}
}
