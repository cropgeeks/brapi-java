package uk.ac.hutton.ics.brapi.resource.base;

public class Contact
{
	private String contactDbId;
	private String email;
	private String instituteName;
	private String name;
	private String orcid;
	private String type;

	public String getContactDbId()
	{
		return contactDbId;
	}

	public Contact setContactDbId(String contactDbId)
	{
		this.contactDbId = contactDbId;
		return this;
	}

	public String getEmail()
	{
		return email;
	}

	public Contact setEmail(String email)
	{
		this.email = email;
		return this;
	}

	public String getInstituteName()
	{
		return instituteName;
	}

	public Contact setInstituteName(String instituteName)
	{
		this.instituteName = instituteName;
		return this;
	}

	public String getName()
	{
		return name;
	}

	public Contact setName(String name)
	{
		this.name = name;
		return this;
	}

	public String getOrcid()
	{
		return orcid;
	}

	public Contact setOrcid(String orcid)
	{
		this.orcid = orcid;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Contact setType(String type)
	{
		this.type = type;
		return this;
	}
}
