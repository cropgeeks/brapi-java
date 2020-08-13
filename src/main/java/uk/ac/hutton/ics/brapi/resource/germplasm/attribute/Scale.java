package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class Scale extends BrapiObject
{
	private String            dataType;
	private Integer           decimalPlaces;
	private List<Reference>   externalReferences;
	private OntologyReference ontologyReference;
	private String            scaleDbId;
	private String            scaleName;
	private ValidValues       validValues;

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

	public OntologyReference getOntologyReference()
	{
		return ontologyReference;
	}

	public Scale setOntologyReference(OntologyReference ontologyReference)
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
