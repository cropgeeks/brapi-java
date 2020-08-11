package uk.ac.hutton.ics.brapi.resource.attribute;

import java.util.List;

public class Ontology
{
	private List<Link> documentationLinks;
	private String     ontologyDbId;
	private String     ontologyName;
	private String     version;

	public List<Link> getDocumentationLinks()
	{
		return documentationLinks;
	}

	public Ontology setDocumentationLinks(List<Link> documentationLinks)
	{
		this.documentationLinks = documentationLinks;
		return this;
	}

	public String getOntologyDbId()
	{
		return ontologyDbId;
	}

	public Ontology setOntologyDbId(String ontologyDbId)
	{
		this.ontologyDbId = ontologyDbId;
		return this;
	}

	public String getOntologyName()
	{
		return ontologyName;
	}

	public Ontology setOntologyName(String ontologyName)
	{
		this.ontologyName = ontologyName;
		return this;
	}

	public String getVersion()
	{
		return version;
	}

	public Ontology setVersion(String version)
	{
		this.version = version;
		return this;
	}
}
