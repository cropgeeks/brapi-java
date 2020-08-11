package uk.ac.hutton.ics.brapi.resource.seedlot;

import java.sql.Timestamp;
import java.util.*;

import uk.ac.hutton.ics.brapi.resource.base.Reference;

public class SeedLotTransaction
{
	private Map<String, String> additionalInfo;
	private Integer             amount;
	private List<Reference>     externalReferences;
	private String              fromSeedLotDbId;
	private String              toSeedLotDbId;
	private String              transactionDbId;
	private String              transactionDescription;
	private Timestamp           transactionTimestamp;
	private String              units;

	public Map<String, String> getAdditionalInfo()
	{
		return additionalInfo;
	}

	public SeedLotTransaction setAdditionalInfo(Map<String, String> additionalInfo)
	{
		this.additionalInfo = additionalInfo;
		return this;
	}

	public Integer getAmount()
	{
		return amount;
	}

	public SeedLotTransaction setAmount(Integer amount)
	{
		this.amount = amount;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public SeedLotTransaction setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getFromSeedLotDbId()
	{
		return fromSeedLotDbId;
	}

	public SeedLotTransaction setFromSeedLotDbId(String fromSeedLotDbId)
	{
		this.fromSeedLotDbId = fromSeedLotDbId;
		return this;
	}

	public String getToSeedLotDbId()
	{
		return toSeedLotDbId;
	}

	public SeedLotTransaction setToSeedLotDbId(String toSeedLotDbId)
	{
		this.toSeedLotDbId = toSeedLotDbId;
		return this;
	}

	public String getTransactionDbId()
	{
		return transactionDbId;
	}

	public SeedLotTransaction setTransactionDbId(String transactionDbId)
	{
		this.transactionDbId = transactionDbId;
		return this;
	}

	public String getTransactionDescription()
	{
		return transactionDescription;
	}

	public SeedLotTransaction setTransactionDescription(String transactionDescription)
	{
		this.transactionDescription = transactionDescription;
		return this;
	}

	public Timestamp getTransactionTimestamp()
	{
		return transactionTimestamp;
	}

	public SeedLotTransaction setTransactionTimestamp(Timestamp transactionTimestamp)
	{
		this.transactionTimestamp = transactionTimestamp;
		return this;
	}

	public String getUnits()
	{
		return units;
	}

	public SeedLotTransaction setUnits(String units)
	{
		this.units = units;
		return this;
	}
}
