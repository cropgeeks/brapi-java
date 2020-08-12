package uk.ac.hutton.ics.brapi.resource.people;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class Person extends BrapiObject
{
	private String          description;
	private String          emailAddress;
	private List<Reference> externalReferences;
	private String          firstName;
	private String          lastName;
	private String          mailingAddress;
	private String          middleName;
	private String          personDbId;
	private String          phoneNumber;
	private String          userID;

	public String getDescription()
	{
		return description;
	}

	public Person setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	public Person setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Person setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public Person setFirstName(String firstName)
	{
		this.firstName = firstName;
		return this;
	}

	public String getLastName()
	{
		return lastName;
	}

	public Person setLastName(String lastName)
	{
		this.lastName = lastName;
		return this;
	}

	public String getMailingAddress()
	{
		return mailingAddress;
	}

	public Person setMailingAddress(String mailingAddress)
	{
		this.mailingAddress = mailingAddress;
		return this;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public Person setMiddleName(String middleName)
	{
		this.middleName = middleName;
		return this;
	}

	public String getPersonDbId()
	{
		return personDbId;
	}

	public Person setPersonDbId(String personDbId)
	{
		this.personDbId = personDbId;
		return this;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public Person setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
		return this;
	}

	public String getUserID()
	{
		return userID;
	}

	public Person setUserID(String userID)
	{
		this.userID = userID;
		return this;
	}
}
