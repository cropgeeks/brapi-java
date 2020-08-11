package uk.ac.hutton.ics.brapi.resource.germplasm;

import java.net.URI;
import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class Germplasm
{
	private String              accessionNumber;
	private String              acquisitionDate;
	private Map<String, String> additionalInfo;
	private String              biologicalStatusOfAccessionCode;
	private String              biologicalStatusOfAccessionDescription;
	private String              breedingMethodDbId;
	private String              collection;
	private String              commonCropName;
	private String              countryOfOriginCode;
	private String              defaultDisplayName;
	private URI                 documentationURL;
	private List<Donor>         donors;
	private List<Reference>     externalReferences;
	private String              genus;
	private String              germplasmDbId;
	private String              germplasmName;
	private List<Origin>        germplasmOrigin;
	private String              germplasmPUI;
	private String              germplasmPreprocessing;
	private String              instituteCode;
	private String              instituteName;
	private String              pedigree;
	private String              seedSource;
	private String              seedSourceDescription;
	private String              species;
	private String              speciesAuthority;
	private List<Storage>       storageTypes;
	private String              subtaxa;
	private String              subtaxaAuthority;
	private List<Synonym>       synonyms;
	private List<TaxonId>       taxonIds;

	public String getAccessionNumber()
	{
		return accessionNumber;
	}

	public Germplasm setAccessionNumber(String accessionNumber)
	{
		this.accessionNumber = accessionNumber;
		return this;
	}

	public String getAcquisitionDate()
	{
		return acquisitionDate;
	}

	public Germplasm setAcquisitionDate(String acquisitionDate)
	{
		this.acquisitionDate = acquisitionDate;
		return this;
	}

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public Germplasm setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public String getBiologicalStatusOfAccessionCode()
	{
		return biologicalStatusOfAccessionCode;
	}

	public Germplasm setBiologicalStatusOfAccessionCode(String biologicalStatusOfAccessionCode)
	{
		this.biologicalStatusOfAccessionCode = biologicalStatusOfAccessionCode;
		return this;
	}

	public String getBiologicalStatusOfAccessionDescription()
	{
		return biologicalStatusOfAccessionDescription;
	}

	public Germplasm setBiologicalStatusOfAccessionDescription(String biologicalStatusOfAccessionDescription)
	{
		this.biologicalStatusOfAccessionDescription = biologicalStatusOfAccessionDescription;
		return this;
	}

	public String getBreedingMethodDbId()
	{
		return breedingMethodDbId;
	}

	public Germplasm setBreedingMethodDbId(String breedingMethodDbId)
	{
		this.breedingMethodDbId = breedingMethodDbId;
		return this;
	}

	public String getCollection()
	{
		return collection;
	}

	public Germplasm setCollection(String collection)
	{
		this.collection = collection;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Germplasm setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getCountryOfOriginCode()
	{
		return countryOfOriginCode;
	}

	public Germplasm setCountryOfOriginCode(String countryOfOriginCode)
	{
		this.countryOfOriginCode = countryOfOriginCode;
		return this;
	}

	public String getDefaultDisplayName()
	{
		return defaultDisplayName;
	}

	public Germplasm setDefaultDisplayName(String defaultDisplayName)
	{
		this.defaultDisplayName = defaultDisplayName;
		return this;
	}

	public URI getDocumentationURL()
	{
		return documentationURL;
	}

	public Germplasm setDocumentationURL(URI documentationURL)
	{
		this.documentationURL = documentationURL;
		return this;
	}

	public List<Donor> getDonors()
	{
		return donors;
	}

	public Germplasm setDonors(List<Donor> donors)
	{
		this.donors = donors;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Germplasm setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGenus()
	{
		return genus;
	}

	public Germplasm setGenus(String genus)
	{
		this.genus = genus;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Germplasm setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmName()
	{
		return germplasmName;
	}

	public Germplasm setGermplasmName(String germplasmName)
	{
		this.germplasmName = germplasmName;
		return this;
	}

	public List<Origin> getGermplasmOrigin()
	{
		return germplasmOrigin;
	}

	public Germplasm setGermplasmOrigin(List<Origin> germplasmOrigin)
	{
		this.germplasmOrigin = germplasmOrigin;
		return this;
	}

	public String getGermplasmPUI()
	{
		return germplasmPUI;
	}

	public Germplasm setGermplasmPUI(String germplasmPUI)
	{
		this.germplasmPUI = germplasmPUI;
		return this;
	}

	public String getGermplasmPreprocessing()
	{
		return germplasmPreprocessing;
	}

	public Germplasm setGermplasmPreprocessing(String germplasmPreprocessing)
	{
		this.germplasmPreprocessing = germplasmPreprocessing;
		return this;
	}

	public String getInstituteCode()
	{
		return instituteCode;
	}

	public Germplasm setInstituteCode(String instituteCode)
	{
		this.instituteCode = instituteCode;
		return this;
	}

	public String getInstituteName()
	{
		return instituteName;
	}

	public Germplasm setInstituteName(String instituteName)
	{
		this.instituteName = instituteName;
		return this;
	}

	public String getPedigree()
	{
		return pedigree;
	}

	public Germplasm setPedigree(String pedigree)
	{
		this.pedigree = pedigree;
		return this;
	}

	public String getSeedSource()
	{
		return seedSource;
	}

	public Germplasm setSeedSource(String seedSource)
	{
		this.seedSource = seedSource;
		return this;
	}

	public String getSeedSourceDescription()
	{
		return seedSourceDescription;
	}

	public Germplasm setSeedSourceDescription(String seedSourceDescription)
	{
		this.seedSourceDescription = seedSourceDescription;
		return this;
	}

	public String getSpecies()
	{
		return species;
	}

	public Germplasm setSpecies(String species)
	{
		this.species = species;
		return this;
	}

	public String getSpeciesAuthority()
	{
		return speciesAuthority;
	}

	public Germplasm setSpeciesAuthority(String speciesAuthority)
	{
		this.speciesAuthority = speciesAuthority;
		return this;
	}

	public List<Storage> getStorageTypes()
	{
		return storageTypes;
	}

	public Germplasm setStorageTypes(List<Storage> storageTypes)
	{
		this.storageTypes = storageTypes;
		return this;
	}

	public String getSubtaxa()
	{
		return subtaxa;
	}

	public Germplasm setSubtaxa(String subtaxa)
	{
		this.subtaxa = subtaxa;
		return this;
	}

	public String getSubtaxaAuthority()
	{
		return subtaxaAuthority;
	}

	public Germplasm setSubtaxaAuthority(String subtaxaAuthority)
	{
		this.subtaxaAuthority = subtaxaAuthority;
		return this;
	}

	public List<Synonym> getSynonyms()
	{
		return synonyms;
	}

	public Germplasm setSynonyms(List<Synonym> synonyms)
	{
		this.synonyms = synonyms;
		return this;
	}

	public List<TaxonId> getTaxonIds()
	{
		return taxonIds;
	}

	public Germplasm setTaxonIds(List<TaxonId> taxonIds)
	{
		this.taxonIds = taxonIds;
		return this;
	}
}
