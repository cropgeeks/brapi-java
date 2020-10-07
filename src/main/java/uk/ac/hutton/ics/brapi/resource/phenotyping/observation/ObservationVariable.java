package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

import java.net.URI;
import java.sql.Timestamp;
import java.util.List;

public class ObservationVariable extends BrapiObject
{
	private String            observationVariableDbId;
	private String            observationVariableName;
	private String            commonCropName;
	private String            contextOfUse;
	private String            defaultValue;
	private URI               documentationURL;
	private List<Reference>   externalReferences;
	private String            growthStage;
	private String            institution;
	private String            language;
	private Method            method;
	private OntologyReference ontologyReference;
	private Scale             scale;
	private String            scientist;
	private String            status;
	private Timestamp         submissionTimestamp;
	private List<String>      synonyms;
	private Trait             trait;

	public String getObservationVariableDbId()
	{
		return observationVariableDbId;
	}

	public ObservationVariable setObservationVariableDbId(String observationVariableDbId)
	{
		this.observationVariableDbId = observationVariableDbId;
		return this;
	}

	public String getObservationVariableName()
	{
		return observationVariableName;
	}

	public ObservationVariable setObservationVariableName(String observationVariableName)
	{
		this.observationVariableName = observationVariableName;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public ObservationVariable setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getContextOfUse()
	{
		return contextOfUse;
	}

	public ObservationVariable setContextOfUse(String contextOfUse)
	{
		this.contextOfUse = contextOfUse;
		return this;
	}

	public String getDefaultValue()
	{
		return defaultValue;
	}

	public ObservationVariable setDefaultValue(String defaultValue)
	{
		this.defaultValue = defaultValue;
		return this;
	}

	public URI getDocumentationURL()
	{
		return documentationURL;
	}

	public ObservationVariable setDocumentationURL(URI documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public ObservationVariable setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGrowthStage()
	{
		return growthStage;
	}

	public ObservationVariable setGrowthStage(String growthStage)
	{
		this.growthStage = growthStage;
		return this;
	}

	public String getInstitution()
	{
		return institution;
	}

	public ObservationVariable setInstitution(String institution)
	{
		this.institution = institution;
		return this;
	}

	public String getLanguage()
	{
		return language;
	}

	public ObservationVariable setLanguage(String language)
	{
		this.language = language;
		return this;
	}

	public Method getMethod()
	{
		return method;
	}

	public ObservationVariable setMethod(Method method)
	{
		this.method = method;
		return this;
	}

	public OntologyReference getOntologyReference()
	{
		return ontologyReference;
	}

	public ObservationVariable setOntologyReference(OntologyReference ontologyReference)
	{
		this.ontologyReference = ontologyReference;
		return this;
	}

	public Scale getScale()
	{
		return scale;
	}

	public ObservationVariable setScale(Scale scale)
	{
		this.scale = scale;
		return this;
	}

	public String getScientist()
	{
		return scientist;
	}

	public ObservationVariable setScientist(String scientist)
	{
		this.scientist = scientist;
		return this;
	}

	public String getStatus()
	{
		return status;
	}

	public ObservationVariable setStatus(String status)
	{
		this.status = status;
		return this;
	}

	public Timestamp getSubmissionTimestamp()
	{
		return submissionTimestamp;
	}

	public ObservationVariable setSubmissionTimestamp(Timestamp submissionTimestamp)
	{
		this.submissionTimestamp = submissionTimestamp;
		return this;
	}

	public List<String> getSynonyms()
	{
		return synonyms;
	}

	public ObservationVariable setSynonyms(List<String> synonyms)
	{
		this.synonyms = synonyms;
		return this;
	}

	public Trait getTrait()
	{
		return trait;
	}

	public ObservationVariable setTrait(Trait trait)
	{
		this.trait = trait;
		return this;
	}
}
