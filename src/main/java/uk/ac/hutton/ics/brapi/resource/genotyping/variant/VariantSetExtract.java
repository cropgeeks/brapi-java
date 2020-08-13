package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import java.util.List;

public class VariantSetExtract
{
	private List<String> callSetDbIds;
	private Boolean      expandHomozygotes;
	private String       sepPhased;
	private String       sepUnphased;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private String       unknownString;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;

	public List<String> getCallSetDbIds()
	{
		return callSetDbIds;
	}

	public VariantSetExtract setCallSetDbIds(List<String> callSetDbIds)
	{
		this.callSetDbIds = callSetDbIds;
		return this;
	}

	public Boolean getExpandHomozygotes()
	{
		return expandHomozygotes;
	}

	public VariantSetExtract setExpandHomozygotes(Boolean expandHomozygotes)
	{
		this.expandHomozygotes = expandHomozygotes;
		return this;
	}

	public String getSepPhased()
	{
		return sepPhased;
	}

	public VariantSetExtract setSepPhased(String sepPhased)
	{
		this.sepPhased = sepPhased;
		return this;
	}

	public String getSepUnphased()
	{
		return sepUnphased;
	}

	public VariantSetExtract setSepUnphased(String sepUnphased)
	{
		this.sepUnphased = sepUnphased;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public VariantSetExtract setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public VariantSetExtract setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}

	public String getUnknownString()
	{
		return unknownString;
	}

	public VariantSetExtract setUnknownString(String unknownString)
	{
		this.unknownString = unknownString;
		return this;
	}

	public List<String> getVariantDbIds()
	{
		return variantDbIds;
	}

	public VariantSetExtract setVariantDbIds(List<String> variantDbIds)
	{
		this.variantDbIds = variantDbIds;
		return this;
	}

	public List<String> getVariantSetDbIds()
	{
		return variantSetDbIds;
	}

	public VariantSetExtract setVariantSetDbIds(List<String> variantSetDbIds)
	{
		this.variantSetDbIds = variantSetDbIds;
		return this;
	}
}
