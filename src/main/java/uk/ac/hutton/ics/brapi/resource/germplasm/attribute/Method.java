package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class Method extends BrapiObject
{
	private String            bibliographicalReference;
	private String            description;
	private List<Reference>   externalReferences;
	private String            formula;
	private String            methodClass;
	private String            methodDbId;
	private String            methodName;
	private OntologyReference ontologyReference;

	public String getBibliographicalReference()
	{
		return bibliographicalReference;
	}

	public Method setBibliographicalReference(String bibliographicalReference)
	{
		this.bibliographicalReference = bibliographicalReference;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Method setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Method setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getFormula()
	{
		return formula;
	}

	public Method setFormula(String formula)
	{
		this.formula = formula;
		return this;
	}

	public String getMethodClass()
	{
		return methodClass;
	}

	public Method setMethodClass(String methodClass)
	{
		this.methodClass = methodClass;
		return this;
	}

	public String getMethodDbId()
	{
		return methodDbId;
	}

	public Method setMethodDbId(String methodDbId)
	{
		this.methodDbId = methodDbId;
		return this;
	}

	public String getMethodName()
	{
		return methodName;
	}

	public Method setMethodName(String methodName)
	{
		this.methodName = methodName;
		return this;
	}

	public OntologyReference getOntologyReference()
	{
		return ontologyReference;
	}

	public Method setOntologyReference(OntologyReference ontologyReference)
	{
		this.ontologyReference = ontologyReference;
		return this;
	}
}
