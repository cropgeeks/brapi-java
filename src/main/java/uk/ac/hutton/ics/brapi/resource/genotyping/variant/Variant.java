package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

public class Variant extends BrapiObject
{
	@SerializedName("alternate_bases")
	private List<String>  alternativeBases;
	private List<Integer> ciend;
	private List<Integer> cipos;
	private Timestamp     created;
	private Long          end;
	private Boolean       filtersApplied;
	private List<String>  filtersFailed;
	private Boolean       filtersPassed;
	private String        referenceBases;
	private String        referenceName;
	private Long          start;
	private Integer       svlen;
	private Timestamp     updated;
	private String        variantDbId;
	private List<String>  variantNames;
	private List<String>  variantSetDbId;
	private String        variantType;

	public List<String> getAlternativeBases()
	{
		return alternativeBases;
	}

	public Variant setAlternativeBases(List<String> alternativeBases)
	{
		this.alternativeBases = alternativeBases;
		return this;
	}

	public List<Integer> getCiend()
	{
		return ciend;
	}

	public Variant setCiend(List<Integer> ciend)
	{
		this.ciend = ciend;
		return this;
	}

	public List<Integer> getCipos()
	{
		return cipos;
	}

	public Variant setCipos(List<Integer> cipos)
	{
		this.cipos = cipos;
		return this;
	}

	public Timestamp getCreated()
	{
		return created;
	}

	public Variant setCreated(Timestamp created)
	{
		this.created = created;
		return this;
	}

	public Long getEnd()
	{
		return end;
	}

	public Variant setEnd(Long end)
	{
		this.end = end;
		return this;
	}

	public Boolean getFiltersApplied()
	{
		return filtersApplied;
	}

	public Variant setFiltersApplied(Boolean filtersApplied)
	{
		this.filtersApplied = filtersApplied;
		return this;
	}

	public List<String> getFiltersFailed()
	{
		return filtersFailed;
	}

	public Variant setFiltersFailed(List<String> filtersFailed)
	{
		this.filtersFailed = filtersFailed;
		return this;
	}

	public Boolean getFiltersPassed()
	{
		return filtersPassed;
	}

	public Variant setFiltersPassed(Boolean filtersPassed)
	{
		this.filtersPassed = filtersPassed;
		return this;
	}

	public String getReferenceBases()
	{
		return referenceBases;
	}

	public Variant setReferenceBases(String referenceBases)
	{
		this.referenceBases = referenceBases;
		return this;
	}

	public String getReferenceName()
	{
		return referenceName;
	}

	public Variant setReferenceName(String referenceName)
	{
		this.referenceName = referenceName;
		return this;
	}

	public Long getStart()
	{
		return start;
	}

	public Variant setStart(Long start)
	{
		this.start = start;
		return this;
	}

	public Integer getSvlen()
	{
		return svlen;
	}

	public Variant setSvlen(Integer svlen)
	{
		this.svlen = svlen;
		return this;
	}

	public Timestamp getUpdated()
	{
		return updated;
	}

	public Variant setUpdated(Timestamp updated)
	{
		this.updated = updated;
		return this;
	}

	public String getVariantDbId()
	{
		return variantDbId;
	}

	public Variant setVariantDbId(String variantDbId)
	{
		this.variantDbId = variantDbId;
		return this;
	}

	public List<String> getVariantNames()
	{
		return variantNames;
	}

	public Variant setVariantNames(List<String> variantNames)
	{
		this.variantNames = variantNames;
		return this;
	}

	public List<String> getVariantSetDbId()
	{
		return variantSetDbId;
	}

	public Variant setVariantSetDbId(List<String> variantSetDbId)
	{
		this.variantSetDbId = variantSetDbId;
		return this;
	}

	public String getVariantType()
	{
		return variantType;
	}

	public Variant setVariantType(String variantType)
	{
		this.variantType = variantType;
		return this;
	}
}
