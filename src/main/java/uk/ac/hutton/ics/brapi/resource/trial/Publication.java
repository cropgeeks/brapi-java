package uk.ac.hutton.ics.brapi.resource.trial;

public class Publication
{
	private String publicationPUI;
	private String publicationReference;

	public String getPublicationPUI()
	{
		return publicationPUI;
	}

	public Publication setPublicationPUI(String publicationPUI)
	{
		this.publicationPUI = publicationPUI;
		return this;
	}

	public String getPublicationReference()
	{
		return publicationReference;
	}

	public Publication setPublicationReference(String publicationReference)
	{
		this.publicationReference = publicationReference;
		return this;
	}
}
