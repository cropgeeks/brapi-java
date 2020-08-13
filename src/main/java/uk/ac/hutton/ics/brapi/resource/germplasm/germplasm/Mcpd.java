package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import java.util.*;

public class Mcpd
{
	private List<String>    accessionNames;
	private String          accessionNumber;
	private String          acquisitionDate;
	private String          acquisitionSourceCode;
	private List<String>    alternateIDs;
	private String          ancestralData;
	private String          biologicalStatusOfAccessionCode;
	private List<Institute> breedingInstitutes;
	private Collection      collectingInfo;
	private String          commonCropName;
	private String          countryOfOrigin;
	private McpdDonor       donorInfo;
	private String          genus;
	private String          germplasmDbId;
	private String          germplasmPUI;
	private String          instituteCode;
	private String          mlsStatus;
	private String          remarks;
	private List<Institute> safetyDuplicateInstitutes;
	private String          species;
	private String          speciesAuthority;
	private List<String>    storageTypeCodes;
	private String          subtaxon;
	private String          subtaxonAuthority;

	public List<String> getAccessionNames()
	{
		return accessionNames;
	}

	public Mcpd setAccessionNames(List<String> accessionNames)
	{
		this.accessionNames = accessionNames;
		return this;
	}

	public Mcpd setAccessionNames(String accessionName)
	{
		this.accessionNames = Collections.singletonList(accessionName);
		return this;
	}

	public String getAccessionNumber()
	{
		return accessionNumber;
	}

	public Mcpd setAccessionNumber(String accessionNumber)
	{
		this.accessionNumber = accessionNumber;
		return this;
	}

	public String getAcquisitionDate()
	{
		return acquisitionDate;
	}

	public Mcpd setAcquisitionDate(String acquisitionDate)
	{
		this.acquisitionDate = acquisitionDate;
		return this;
	}

	public String getAcquisitionSourceCode()
	{
		return acquisitionSourceCode;
	}

	public Mcpd setAcquisitionSourceCode(String acquisitionSourceCode)
	{
		this.acquisitionSourceCode = acquisitionSourceCode;
		return this;
	}

	public List<String> getAlternateIDs()
	{
		return alternateIDs;
	}

	public Mcpd setAlternateIDs(List<String> alternateIDs)
	{
		this.alternateIDs = alternateIDs;
		return this;
	}

	public String getAncestralData()
	{
		return ancestralData;
	}

	public Mcpd setAncestralData(String ancestralData)
	{
		this.ancestralData = ancestralData;
		return this;
	}

	public String getBiologicalStatusOfAccessionCode()
	{
		return biologicalStatusOfAccessionCode;
	}

	public Mcpd setBiologicalStatusOfAccessionCode(String biologicalStatusOfAccessionCode)
	{
		this.biologicalStatusOfAccessionCode = biologicalStatusOfAccessionCode;
		return this;
	}

	public List<Institute> getBreedingInstitutes()
	{
		return breedingInstitutes;
	}

	public Mcpd setBreedingInstitutes(List<Institute> breedingInstitutes)
	{
		this.breedingInstitutes = breedingInstitutes;
		return this;
	}

	public Collection getCollectingInfo()
	{
		return collectingInfo;
	}

	public Mcpd setCollectingInfo(Collection collectingInfo)
	{
		this.collectingInfo = collectingInfo;
		return this;
	}

	public String getCommonCropName()
	{
		return commonCropName;
	}

	public Mcpd setCommonCropName(String commonCropName)
	{
		this.commonCropName = commonCropName;
		return this;
	}

	public String getCountryOfOrigin()
	{
		return countryOfOrigin;
	}

	public Mcpd setCountryOfOrigin(String countryOfOrigin)
	{
		this.countryOfOrigin = countryOfOrigin;
		return this;
	}

	public McpdDonor getDonorInfo()
	{
		return donorInfo;
	}

	public Mcpd setDonorInfo(McpdDonor donorInfo)
	{
		this.donorInfo = donorInfo;
		return this;
	}

	public String getGenus()
	{
		return genus;
	}

	public Mcpd setGenus(String genus)
	{
		this.genus = genus;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Mcpd setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getGermplasmPUI()
	{
		return germplasmPUI;
	}

	public Mcpd setGermplasmPUI(String germplasmPUI)
	{
		this.germplasmPUI = germplasmPUI;
		return this;
	}

	public String getInstituteCode()
	{
		return instituteCode;
	}

	public Mcpd setInstituteCode(String instituteCode)
	{
		this.instituteCode = instituteCode;
		return this;
	}

	public String getMlsStatus()
	{
		return mlsStatus;
	}

	public Mcpd setMlsStatus(String mlsStatus)
	{
		this.mlsStatus = mlsStatus;
		return this;
	}

	public String getRemarks()
	{
		return remarks;
	}

	public Mcpd setRemarks(String remarks)
	{
		this.remarks = remarks;
		return this;
	}

	public List<Institute> getSafetyDuplicateInstitutes()
	{
		return safetyDuplicateInstitutes;
	}

	public Mcpd setSafetyDuplicateInstitutes(List<Institute> safetyDuplicateInstitutes)
	{
		this.safetyDuplicateInstitutes = safetyDuplicateInstitutes;
		return this;
	}

	public String getSpecies()
	{
		return species;
	}

	public Mcpd setSpecies(String species)
	{
		this.species = species;
		return this;
	}

	public String getSpeciesAuthority()
	{
		return speciesAuthority;
	}

	public Mcpd setSpeciesAuthority(String speciesAuthority)
	{
		this.speciesAuthority = speciesAuthority;
		return this;
	}

	public List<String> getStorageTypeCodes()
	{
		return storageTypeCodes;
	}

	public Mcpd setStorageTypeCodes(List<String> storageTypeCodes)
	{
		this.storageTypeCodes = storageTypeCodes;
		return this;
	}

	public String getSubtaxon()
	{
		return subtaxon;
	}

	public Mcpd setSubtaxon(String subtaxon)
	{
		this.subtaxon = subtaxon;
		return this;
	}

	public String getSubtaxonAuthority()
	{
		return subtaxonAuthority;
	}

	public Mcpd setSubtaxonAuthority(String subtaxonAuthority)
	{
		this.subtaxonAuthority = subtaxonAuthority;
		return this;
	}
}
