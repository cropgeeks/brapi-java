package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import java.util.List;

public class GermplasmSearch
{
	private List<String> accessionNumbers;
	private List<String> collections;
	private List<String> commonCropNames;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> genus;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> germplasmPUIs;
	private List<String> parentDbIds;
	private List<String> progenyDbIds;
	private List<String> species;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> synonyms;

	public List<String> getAccessionNumbers()
	{
		return accessionNumbers;
	}

	public GermplasmSearch setAccessionNumbers(List<String> accessionNumbers)
	{
		this.accessionNumbers = accessionNumbers;
		return this;
	}

	public List<String> getCollections()
	{
		return collections;
	}

	public GermplasmSearch setCollections(List<String> collections)
	{
		this.collections = collections;
		return this;
	}

	public List<String> getCommonCropNames()
	{
		return commonCropNames;
	}

	public GermplasmSearch setCommonCropNames(List<String> commonCropNames)
	{
		this.commonCropNames = commonCropNames;
		return this;
	}

	public List<String> getExternalReferenceIDs()
	{
		return externalReferenceIDs;
	}

	public GermplasmSearch setExternalReferenceIDs(List<String> externalReferenceIDs)
	{
		this.externalReferenceIDs = externalReferenceIDs;
		return this;
	}

	public List<String> getExternalReferenceSources()
	{
		return externalReferenceSources;
	}

	public GermplasmSearch setExternalReferenceSources(List<String> externalReferenceSources)
	{
		this.externalReferenceSources = externalReferenceSources;
		return this;
	}

	public List<String> getGenus()
	{
		return genus;
	}

	public GermplasmSearch setGenus(List<String> genus)
	{
		this.genus = genus;
		return this;
	}

	public List<String> getGermplasmDbIds()
	{
		return germplasmDbIds;
	}

	public GermplasmSearch setGermplasmDbIds(List<String> germplasmDbIds)
	{
		this.germplasmDbIds = germplasmDbIds;
		return this;
	}

	public List<String> getGermplasmNames()
	{
		return germplasmNames;
	}

	public GermplasmSearch setGermplasmNames(List<String> germplasmNames)
	{
		this.germplasmNames = germplasmNames;
		return this;
	}

	public List<String> getGermplasmPUIs()
	{
		return germplasmPUIs;
	}

	public GermplasmSearch setGermplasmPUIs(List<String> germplasmPUIs)
	{
		this.germplasmPUIs = germplasmPUIs;
		return this;
	}

	public List<String> getParentDbIds()
	{
		return parentDbIds;
	}

	public GermplasmSearch setParentDbIds(List<String> parentDbIds)
	{
		this.parentDbIds = parentDbIds;
		return this;
	}

	public List<String> getProgenyDbIds()
	{
		return progenyDbIds;
	}

	public GermplasmSearch setProgenyDbIds(List<String> progenyDbIds)
	{
		this.progenyDbIds = progenyDbIds;
		return this;
	}

	public List<String> getSpecies()
	{
		return species;
	}

	public GermplasmSearch setSpecies(List<String> species)
	{
		this.species = species;
		return this;
	}

	public List<String> getStudyDbIds()
	{
		return studyDbIds;
	}

	public GermplasmSearch setStudyDbIds(List<String> studyDbIds)
	{
		this.studyDbIds = studyDbIds;
		return this;
	}

	public List<String> getStudyNames()
	{
		return studyNames;
	}

	public GermplasmSearch setStudyNames(List<String> studyNames)
	{
		this.studyNames = studyNames;
		return this;
	}

	public List<String> getSynonyms()
	{
		return synonyms;
	}

	public GermplasmSearch setSynonyms(List<String> synonyms)
	{
		this.synonyms = synonyms;
		return this;
	}
}
