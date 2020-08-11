package uk.ac.hutton.ics.brapi.resource.call;

import com.google.gson.annotations.SerializedName;

import java.util.*;

import uk.ac.hutton.ics.brapi.resource.variant.Genotype;

public class Call
{
	private Map<String, String> additionalInfo;
	private String              callSetDbId;
	private String              callSetName;
	private Genotype            genotype;
	@SerializedName("genotype_likelihood")
	private List<Double>        genotypeLikelihood;
	private String              phaseSet;
	private String              variantDbId;
	private String              variantName;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public Call setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getCallSetDbId()
	{
		return callSetDbId;
	}

	public Call setCallSetDbId(String callSetDbId)
	{
		this.callSetDbId = callSetDbId;
		return this;
	}

	public String getCallSetName()
	{
		return callSetName;
	}

	public Call setCallSetName(String callSetName)
	{
		this.callSetName = callSetName;
		return this;
	}

	public Genotype getGenotype()
	{
		return genotype;
	}

	public Call setGenotype(Genotype genotype)
	{
		this.genotype = genotype;
		return this;
	}

	public List<Double> getGenotypeLikelihood()
	{
		return genotypeLikelihood;
	}

	public Call setGenotypeLikelihood(List<Double> genotypeLikelihood)
	{
		this.genotypeLikelihood = genotypeLikelihood;
		return this;
	}

	public String getPhaseSet()
	{
		return phaseSet;
	}

	public Call setPhaseSet(String phaseSet)
	{
		this.phaseSet = phaseSet;
		return this;
	}

	public String getVariantDbId()
	{
		return variantDbId;
	}

	public Call setVariantDbId(String variantDbId)
	{
		this.variantDbId = variantDbId;
		return this;
	}

	public String getVariantName()
	{
		return variantName;
	}

	public Call setVariantName(String variantName)
	{
		this.variantName = variantName;
		return this;
	}
}
