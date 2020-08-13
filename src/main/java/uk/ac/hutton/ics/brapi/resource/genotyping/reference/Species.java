package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

public class Species
{
	private String term;
	private String termURI;

	public String getTerm()
	{
		return term;
	}

	public Species setTerm(String term)
	{
		this.term = term;
		return this;
	}

	public String getTermURI()
	{
		return termURI;
	}

	public Species setTermURI(String termURI)
	{
		this.termURI = termURI;
		return this;
	}
}
