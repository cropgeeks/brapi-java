package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.util.List;

public class OntologyReference
{
	private List<Link> documentationLinks;
	private String     ontologyDbId;
	private String     ontologyName;
	private String     version;

	public List<Link> getDocumentationLinks()
	{
		return documentationLinks;
	}

	public OntologyReference setDocumentationLinks(List<Link> documentationLinks)
	{
		this.documentationLinks = documentationLinks;
		return this;
	}

	public String getOntologyDbId()
	{
		return ontologyDbId;
	}

	public OntologyReference setOntologyDbId(String ontologyDbId)
	{
		this.ontologyDbId = ontologyDbId;
		return this;
	}

	public String getOntologyName()
	{
		return ontologyName;
	}

	public OntologyReference setOntologyName(String ontologyName)
	{
		this.ontologyName = ontologyName;
		return this;
	}

	public String getVersion()
	{
		return version;
	}

	public OntologyReference setVersion(String version)
	{
		this.version = version;
		return this;
	}
}
