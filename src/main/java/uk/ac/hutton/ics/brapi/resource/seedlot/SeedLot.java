package uk.ac.hutton.ics.brapi.resource.seedlot;

import java.sql.Timestamp;
import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class SeedLot
{
	private Map<String, String> additionalInfo;
	private Integer             amount;
	private Timestamp           createdDate;
	private List<Reference>     externalReferences;
	private String              germplasmDbId;
	private Timestamp           lastUpdated;
	private String              locationDbId;
	private String              programDbId;
	private String              seedLotDbId;
	private String              seedLotDescription;
	private String              seedLotName;
	private String              sourceCollection;
	private String              storageLocation;
	private String              units;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public SeedLot setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Integer getAmount()
	{
		return amount;
	}

	public SeedLot setAmount(Integer amount)
	{
		this.amount = amount;
		return this;
	}

	public Timestamp getCreatedDate()
	{
		return createdDate;
	}

	public SeedLot setCreatedDate(Timestamp createdDate)
	{
		this.createdDate = createdDate;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public SeedLot setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public SeedLot setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public Timestamp getLastUpdated()
	{
		return lastUpdated;
	}

	public SeedLot setLastUpdated(Timestamp lastUpdated)
	{
		this.lastUpdated = lastUpdated;
		return this;
	}

	public String getLocationDbId()
	{
		return locationDbId;
	}

	public SeedLot setLocationDbId(String locationDbId)
	{
		this.locationDbId = locationDbId;
		return this;
	}

	public String getProgramDbId()
	{
		return programDbId;
	}

	public SeedLot setProgramDbId(String programDbId)
	{
		this.programDbId = programDbId;
		return this;
	}

	public String getSeedLotDbId()
	{
		return seedLotDbId;
	}

	public SeedLot setSeedLotDbId(String seedLotDbId)
	{
		this.seedLotDbId = seedLotDbId;
		return this;
	}

	public String getSeedLotDescription()
	{
		return seedLotDescription;
	}

	public SeedLot setSeedLotDescription(String seedLotDescription)
	{
		this.seedLotDescription = seedLotDescription;
		return this;
	}

	public String getSeedLotName()
	{
		return seedLotName;
	}

	public SeedLot setSeedLotName(String seedLotName)
	{
		this.seedLotName = seedLotName;
		return this;
	}

	public String getSourceCollection()
	{
		return sourceCollection;
	}

	public SeedLot setSourceCollection(String sourceCollection)
	{
		this.sourceCollection = sourceCollection;
		return this;
	}

	public String getStorageLocation()
	{
		return storageLocation;
	}

	public SeedLot setStorageLocation(String storageLocation)
	{
		this.storageLocation = storageLocation;
		return this;
	}

	public String getUnits()
	{
		return units;
	}

	public SeedLot setUnits(String units)
	{
		this.units = units;
		return this;
	}
}
