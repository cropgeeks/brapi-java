package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.OntologyReference;

public class Sample
{
	private String                  clientSampleBarCode;
	private String                  clientSampleId;
	private Integer                 column;
	private String                  comments;
	private Amount                  concentration;
	private String                  organismName;
	private String                  row;
	private String                  speciesName;
	private List<OntologyReference> taxonomyOntologyReference;
	private String                  tissueType;
	private List<OntologyReference> tissueTypeOntologyReference;
	private Amount                  volume;
	private String                  well;

	public String getClientSampleBarCode()
	{
		return clientSampleBarCode;
	}

	public Sample setClientSampleBarCode(String clientSampleBarCode)
	{
		this.clientSampleBarCode = clientSampleBarCode;
		return this;
	}

	public String getClientSampleId()
	{
		return clientSampleId;
	}

	public Sample setClientSampleId(String clientSampleId)
	{
		this.clientSampleId = clientSampleId;
		return this;
	}

	public Integer getColumn()
	{
		return column;
	}

	public Sample setColumn(Integer column)
	{
		this.column = column;
		return this;
	}

	public String getComments()
	{
		return comments;
	}

	public Sample setComments(String comments)
	{
		this.comments = comments;
		return this;
	}

	public Amount getConcentration()
	{
		return concentration;
	}

	public Sample setConcentration(Amount concentration)
	{
		this.concentration = concentration;
		return this;
	}

	public String getOrganismName()
	{
		return organismName;
	}

	public Sample setOrganismName(String organismName)
	{
		this.organismName = organismName;
		return this;
	}

	public String getRow()
	{
		return row;
	}

	public Sample setRow(String row)
	{
		this.row = row;
		return this;
	}

	public String getSpeciesName()
	{
		return speciesName;
	}

	public Sample setSpeciesName(String speciesName)
	{
		this.speciesName = speciesName;
		return this;
	}

	public List<OntologyReference> getTaxonomyOntologyReference()
	{
		return taxonomyOntologyReference;
	}

	public Sample setTaxonomyOntologyReference(List<OntologyReference> taxonomyOntologyReference)
	{
		this.taxonomyOntologyReference = taxonomyOntologyReference;
		return this;
	}

	public String getTissueType()
	{
		return tissueType;
	}

	public Sample setTissueType(String tissueType)
	{
		this.tissueType = tissueType;
		return this;
	}

	public List<OntologyReference> getTissueTypeOntologyReference()
	{
		return tissueTypeOntologyReference;
	}

	public Sample setTissueTypeOntologyReference(List<OntologyReference> tissueTypeOntologyReference)
	{
		this.tissueTypeOntologyReference = tissueTypeOntologyReference;
		return this;
	}

	public Amount getVolume()
	{
		return volume;
	}

	public Sample setVolume(Amount volume)
	{
		this.volume = volume;
		return this;
	}

	public String getWell()
	{
		return well;
	}

	public Sample setWell(String well)
	{
		this.well = well;
		return this;
	}
}
