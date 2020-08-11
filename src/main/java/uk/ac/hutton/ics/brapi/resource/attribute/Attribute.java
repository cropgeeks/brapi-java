package uk.ac.hutton.ics.brapi.resource.attribute;

import java.net.URI;
import java.sql.Timestamp;
import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class Attribute
{
	private Map<String, String> additionalInfo;
	private String              attributeCategory;
	private String              attributeDbId;
	private String              attributeDescription;
	private String              attributeName;
	private String              commonCropName;
	private String              contextOfUse;
	private String              defaultValue;
	private URI                 documentationURL;
	private List<Reference>     externalReferences;
	private String              growthStage;
	private String              institution;
	private String              language;
	private Method              method;
	private Ontology            ontologyReference;
	private Scale               scale;
	private String              scientist;
	private String              status;
	private Timestamp           submissionTimestamp;
	private List<String>        synonyms;
	private Trait               trait;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public Attribute setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getAttributeCategory()
	{
		return attributeCategory;
	}

	public Attribute setAttributeCategory(String attributeCategory)
	{
		this.attributeCategory = attributeCategory;
		return this;
	}

	public String getAttributeDbId()
	{
		return attributeDbId;
	}

	public Attribute setAttributeDbId(String attributeDbId)
	{
		this.attributeDbId = attributeDbId;
		return this;
	}

	public String getAttributeDescription()
	{
		return attributeDescription;
	}

	public Attribute setAttributeDescription(String attributeDescription)
	{
		this.attributeDescription = attributeDescription;
		return this;
	}

	public String getAttributeName()
	{
		return attributeName;
	}

	public Attribute setAttributeName(String attributeName)
	{
		this.attributeName = attributeName;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Attribute setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getContextOfUse()
	{
		return contextOfUse;
	}

	public Attribute setContextOfUse(String contextOfUse)
	{
		this.contextOfUse = contextOfUse;
		return this;
	}

	public String getDefaultValue()
	{
		return defaultValue;
	}

	public Attribute setDefaultValue(String defaultValue)
	{
		this.defaultValue = defaultValue;
		return this;
	}

	public URI getDocumentationURL()
	{
		return documentationURL;
	}

	public Attribute setDocumentationURL(URI documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Attribute setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGrowthStage()
	{
		return growthStage;
	}

	public Attribute setGrowthStage(String growthStage)
	{
		this.growthStage = growthStage;
		return this;
	}

	public String getInstitution()
	{
		return institution;
	}

	public Attribute setInstitution(String institution)
	{
		this.institution = institution;
		return this;
	}

	public String getLanguage()
	{
		return language;
	}

	public Attribute setLanguage(String language)
	{
		this.language = language;
		return this;
	}

	public Method getMethod()
	{
		return method;
	}

	public Attribute setMethod(Method method)
	{
		this.method = method;
		return this;
	}

	public Ontology getOntologyReference()
	{
		return ontologyReference;
	}

	public Attribute setOntologyReference(Ontology ontologyReference)
	{
		this.ontologyReference = ontologyReference;
		return this;
	}

	public Scale getScale()
	{
		return scale;
	}

	public Attribute setScale(Scale scale)
	{
		this.scale = scale;
		return this;
	}

	public String getScientist()
	{
		return scientist;
	}

	public Attribute setScientist(String scientist)
	{
		this.scientist = scientist;
		return this;
	}

	public String getStatus()
	{
		return status;
	}

	public Attribute setStatus(String status)
	{
		this.status = status;
		return this;
	}

	public Timestamp getSubmissionTimestamp()
	{
		return submissionTimestamp;
	}

	public Attribute setSubmissionTimestamp(Timestamp submissionTimestamp)
	{
		this.submissionTimestamp = submissionTimestamp;
		return this;
	}

	public List<String> getSynonyms()
	{
		return synonyms;
	}

	public Attribute setSynonyms(List<String> synonyms)
	{
		this.synonyms = synonyms;
		return this;
	}

	public Trait getTrait()
	{
		return trait;
	}

	public Attribute setTrait(Trait trait)
	{
		this.trait = trait;
		return this;
	}
}
