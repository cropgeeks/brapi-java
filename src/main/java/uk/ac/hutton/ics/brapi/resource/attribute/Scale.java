package uk.ac.hutton.ics.brapi.resource.attribute;

import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class Scale
{
	private Map<String, String> additionalInfo;
	private String              dataType;
	private Integer             decimalPlaces;
	private List<Reference>     externalReferences;
	private Ontology            ontologyReference;
	private String              scaleDbId;
	private String              scaleName;
	private ValidValues         validValues;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public Scale setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getDataType()
	{
		return dataType;
	}

	public Scale setDataType(String dataType)
	{
		this.dataType = dataType;
		return this;
	}

	public Integer getDecimalPlaces()
	{
		return decimalPlaces;
	}

	public Scale setDecimalPlaces(Integer decimalPlaces)
	{
		this.decimalPlaces = decimalPlaces;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Scale setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public Ontology getOntologyReference()
	{
		return ontologyReference;
	}

	public Scale setOntologyReference(Ontology ontologyReference)
	{
		this.ontologyReference = ontologyReference;
		return this;
	}

	public String getScaleDbId()
	{
		return scaleDbId;
	}

	public Scale setScaleDbId(String scaleDbId)
	{
		this.scaleDbId = scaleDbId;
		return this;
	}

	public String getScaleName()
	{
		return scaleName;
	}

	public Scale setScaleName(String scaleName)
	{
		this.scaleName = scaleName;
		return this;
	}

	public ValidValues getValidValues()
	{
		return validValues;
	}

	public Scale setValidValues(ValidValues validValues)
	{
		this.validValues = validValues;
		return this;
	}
}
