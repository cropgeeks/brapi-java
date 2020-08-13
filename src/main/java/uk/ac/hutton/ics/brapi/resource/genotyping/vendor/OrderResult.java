package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.net.URI;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class OrderResult extends BrapiObject
{
	private List<String> clientSampleIds;
	private String       fileName;
	private String       fileType;
	private URI          fileURL;
	private String       md5sum;

	public List<String> getClientSampleIds()
	{
		return clientSampleIds;
	}

	public OrderResult setClientSampleIds(List<String> clientSampleIds)
	{
		this.clientSampleIds = clientSampleIds;
		return this;
	}

	public String getFileName()
	{
		return fileName;
	}

	public OrderResult setFileName(String fileName)
	{
		this.fileName = fileName;
		return this;
	}

	public String getFileType()
	{
		return fileType;
	}

	public OrderResult setFileType(String fileType)
	{
		this.fileType = fileType;
		return this;
	}

	public URI getFileURL()
	{
		return fileURL;
	}

	public OrderResult setFileURL(URI fileURL)
	{
		this.fileURL = fileURL;
		return this;
	}

	public String getMd5sum()
	{
		return md5sum;
	}

	public OrderResult setMd5sum(String md5sum)
	{
		this.md5sum = md5sum;
		return this;
	}
}
