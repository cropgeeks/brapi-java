package uk.ac.hutton.ics.brapi.resource.people;

import java.util.List;

public class PeopleSearch
{
	private List<String> emailAddresses;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> firstNames;
	private List<String> lastNames;
	private List<String> mailingAddresses;
	private List<String> middleNames;
	private List<String> personDbIds;
	private List<String> phoneNumbers;
	private List<String> userIDs;

	public List<String> getEmailAddresses()
	{
		return emailAddresses;
	}

	public PeopleSearch setEmailAddresses(List<String> emailAddresses)
	{
		this.emailAddresses = emailAddresses;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public PeopleSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public PeopleSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getFirstNames()
	{
		return firstNames;
	}

	public PeopleSearch setFirstNames(List<String> firstNames)
	{
		this.firstNames = firstNames;
		return this;
	}

	public List<String> getLastNames()
	{
		return lastNames;
	}

	public PeopleSearch setLastNames(List<String> lastNames)
	{
		this.lastNames = lastNames;
		return this;
	}

	public List<String> getMailingAddresses()
	{
		return mailingAddresses;
	}

	public PeopleSearch setMailingAddresses(List<String> mailingAddresses)
	{
		this.mailingAddresses = mailingAddresses;
		return this;
	}

	public List<String> getMiddleNames()
	{
		return middleNames;
	}

	public PeopleSearch setMiddleNames(List<String> middleNames)
	{
		this.middleNames = middleNames;
		return this;
	}

	public List<String> getPersonDbIds()
	{
		return personDbIds;
	}

	public PeopleSearch setPersonDbIds(List<String> personDbIds)
	{
		this.personDbIds = personDbIds;
		return this;
	}

	public List<String> getPhoneNumbers()
	{
		return phoneNumbers;
	}

	public PeopleSearch setPhoneNumbers(List<String> phoneNumbers)
	{
		this.phoneNumbers = phoneNumbers;
		return this;
	}

	public List<String> getUserIDs()
	{
		return userIDs;
	}

	public PeopleSearch setUserIDs(List<String> userIDs)
	{
		this.userIDs = userIDs;
		return this;
	}
}
