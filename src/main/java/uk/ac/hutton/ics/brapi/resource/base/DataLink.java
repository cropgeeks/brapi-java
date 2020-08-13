package uk.ac.hutton.ics.brapi.resource.base;

import java.net.URI;

public class DataLink
{
	private String dataFormat;
	private String description;
	private String fileFormat;
	private String name;
	private String provenance;
	private String scientificType;
	private URI    url;
	private String version;

	public String getDataFormat()
	{
		return dataFormat;
	}

	public DataLink setDataFormat(String dataFormat)
	{
		this.dataFormat = dataFormat;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public DataLink setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public String getFileFormat()
	{
		return fileFormat;
	}

	public DataLink setFileFormat(String fileFormat)
	{
		this.fileFormat = fileFormat;
		return this;
	}

	public String getName()
	{
		return name;
	}

	public DataLink setName(String name)
	{
		this.name = name;
		return this;
	}

	public String getProvenance()
	{
		return provenance;
	}

	public DataLink setProvenance(String provenance)
	{
		this.provenance = provenance;
		return this;
	}

	public String getScientificType()
	{
		return scientificType;
	}

	public DataLink setScientificType(String scientificType)
	{
		this.scientificType = scientificType;
		return this;
	}

	public URI getUrl()
	{
		return url;
	}

	public DataLink setUrl(URI url)
	{
		this.url = url;
		return this;
	}

	public String getVersion()
	{
		return version;
	}

	public DataLink setVersion(String version)
	{
		this.version = version;
		return this;
	}
}
