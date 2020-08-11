package uk.ac.hutton.ics.brapi.resource.variant;

import java.util.*;

public class VariantSet
{
	private Map<String, String> additionalInfo;
	private Analysis            analysis;
	private List<Format>        availableFormats;
	private Long                callSetCount;
	private String              referenceSetDbId;
	private String              studyDbId;
	private Long                variantCount;
	private String              variantSetDbId;
	private String              variantSetName;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public VariantSet setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Analysis getAnalysis()
	{
		return analysis;
	}

	public VariantSet setAnalysis(Analysis analysis)
	{
		this.analysis = analysis;
		return this;
	}

	public List<Format> getAvailableFormats()
	{
		return availableFormats;
	}

	public VariantSet setAvailableFormats(List<Format> availableFormats)
	{
		this.availableFormats = availableFormats;
		return this;
	}

	public Long getCallSetCount()
	{
		return callSetCount;
	}

	public VariantSet setCallSetCount(Long callSetCount)
	{
		this.callSetCount = callSetCount;
		return this;
	}

	public String getReferenceSetDbId()
	{
		return referenceSetDbId;
	}

	public VariantSet setReferenceSetDbId(String referenceSetDbId)
	{
		this.referenceSetDbId = referenceSetDbId;
		return this;
	}

	public String getStudyDbId()
	{
		return studyDbId;
	}

	public VariantSet setStudyDbId(String studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public Long getVariantCount()
	{
		return variantCount;
	}

	public VariantSet setVariantCount(Long variantCount)
	{
		this.variantCount = variantCount;
		return this;
	}

	public String getVariantSetDbId()
	{
		return variantSetDbId;
	}

	public VariantSet setVariantSetDbId(String variantSetDbId)
	{
		this.variantSetDbId = variantSetDbId;
		return this;
	}

	public String getVariantSetName()
	{
		return variantSetName;
	}

	public VariantSet setVariantSetName(String variantSetName)
	{
		this.variantSetName = variantSetName;
		return this;
	}
}
