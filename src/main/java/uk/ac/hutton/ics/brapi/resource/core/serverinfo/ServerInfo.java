package uk.ac.hutton.ics.brapi.resource.core.serverinfo;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiCall;

public class ServerInfo
{
	private List<BrapiCall> calls;
	private String          contactEmail;
	private String          documentationURL;
	private String          location;
	private String          organizationName;
	private String          organizationURL;
	private String          serverDescription;
	private String          serverName;

	public List<BrapiCall> getCalls()
	{
		return calls;
	}

	public ServerInfo setCalls(List<BrapiCall> calls)
	{
		this.calls = calls;
		return this;
	}

	public String getContactEmail()
	{
		return contactEmail;
	}

	public ServerInfo setContactEmail(String contactEmail)
	{
		this.contactEmail = contactEmail;
		return this;
	}

	public String getDocumentationURL()
	{
		return documentationURL;
	}

	public ServerInfo setDocumentationURL(String documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public String getLocation()
	{
		return location;
	}

	public ServerInfo setLocation(String location)
	{
		this.location = location;
		return this;
	}

	public String getOrganizationName()
	{
		return organizationName;
	}

	public ServerInfo setOrganizationName(String organizationName)
	{
		this.organizationName = organizationName;
		return this;
	}

	public String getOrganizationURL()
	{
		return organizationURL;
	}

	public ServerInfo setOrganizationURL(String organizationURL)
	{
		this.organizationURL = organizationURL;
		return this;
	}

	public String getServerDescription()
	{
		return serverDescription;
	}

	public ServerInfo setServerDescription(String serverDescription)
	{
		this.serverDescription = serverDescription;
		return this;
	}

	public String getServerName()
	{
		return serverName;
	}

	public ServerInfo setServerName(String serverName)
	{
		this.serverName = serverName;
		return this;
	}
}
