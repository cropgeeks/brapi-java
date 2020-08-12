package uk.ac.hutton.ics.brapi.resource.ontology;

import java.net.URI;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class Ontology extends BrapiObject
{
	private String authors;
	private String copyright;
	private String description;
	private URI    documentationURL;
	private String licence;
	private String ontologyDbId;
	private String ontologyName;
	private String version;

	public String getAuthors()
	{
		return authors;
	}

	public Ontology setAuthors(String authors)
	{
		this.authors = authors;
		return this;
	}

	public String getCopyright()
	{
		return copyright;
	}

	public Ontology setCopyright(String copyright)
	{
		this.copyright = copyright;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Ontology setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public URI getDocumentationURL()
	{
		return documentationURL;
	}

	public Ontology setDocumentationURL(URI documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public String getLicence()
	{
		return licence;
	}

	public Ontology setLicence(String licence)
	{
		this.licence = licence;
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
