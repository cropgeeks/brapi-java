package uk.ac.hutton.ics.brapi.resource.trial;

import java.net.URI;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.Contact;
import uk.ac.hutton.ics.brapi.resource.base.*;

public class Trial extends BrapiObject
{
	private Boolean           active;
	private String            commonCropName;
	private List<Contact>     contacts;
	private List<Authorship>  datasetAuthorships;
	private URI               documentationURL;
	private String            endDate;
	private List<Reference>   externalReferences;
	private String            programDbId;
	private String            programName;
	private List<Publication> publications;
	private String            startDate;
	private String            trialDbId;
	private String            trialDescription;
	private String            trialName;
	private String            trialPUI;

	public Boolean getActive()
	{
		return active;
	}

	public Trial setActive(Boolean active)
	{
		this.active = active;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Trial setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public List<Contact> getContacts()
	{
		return contacts;
	}

	public Trial setContacts(List<Contact> contacts)
	{
		this.contacts = contacts;
		return this;
	}

	public List<Authorship> getDatasetAuthorships()
	{
		return datasetAuthorships;
	}

	public Trial setDatasetAuthorships(List<Authorship> datasetAuthorships)
	{
		this.datasetAuthorships = datasetAuthorships;
		return this;
	}

	public URI getDocumentationURL()
	{
		return documentationURL;
	}

	public Trial setDocumentationURL(URI documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public String getEndDate()
	{
		return endDate;
	}

	public Trial setEndDate(String endDate)
	{
		this.endDate = endDate;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Trial setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getProgramDbId()
	{
		return programDbId;
	}

	public Trial setProgramDbId(String programDbId)
	{
		this.programDbId = programDbId;
		return this;
	}

	public String getProgramName()
	{
		return programName;
	}

	public Trial setProgramName(String programName)
	{
		this.programName = programName;
		return this;
	}

	public List<Publication> getPublications()
	{
		return publications;
	}

	public Trial setPublications(List<Publication> publications)
	{
		this.publications = publications;
		return this;
	}

	public String getStartDate()
	{
		return startDate;
	}

	public Trial setStartDate(String startDate)
	{
		this.startDate = startDate;
		return this;
	}

	public String getTrialDbId()
	{
		return trialDbId;
	}

	public Trial setTrialDbId(String trialDbId)
	{
		this.trialDbId = trialDbId;
		return this;
	}

	public String getTrialDescription()
	{
		return trialDescription;
	}

	public Trial setTrialDescription(String trialDescription)
	{
		this.trialDescription = trialDescription;
		return this;
	}

	public String getTrialName()
	{
		return trialName;
	}

	public Trial setTrialName(String trialName)
	{
		this.trialName = trialName;
		return this;
	}

	public String getTrialPUI()
	{
		return trialPUI;
	}

	public Trial setTrialPUI(String trialPUI)
	{
		this.trialPUI = trialPUI;
		return this;
	}
}
