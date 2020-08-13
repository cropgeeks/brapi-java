package uk.ac.hutton.ics.brapi.resource.genotyping.sample;

import java.sql.Timestamp;
import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;

public class Sample extends BrapiObject
{
	private Integer         column;
	private List<Reference> externalReferences;
	private String          germplasmDbId;
	private String          observationUnitDbId;
	private String          plateDbId;
	private String          plateName;
	private String          programDbId;
	private String          row;
	private String          sampleBarcode;
	private String          sampleDbId;
	private String          sampleDescription;
	private String          sampleGroupDbId;
	private String          sampleName;
	private String          samplePUI;
	private Timestamp       sampleTimestamp;
	private String          sampleType;
	private String          studyDbId;
	private String          takenBy;
	private String          tissueType;
	private String          trialDbId;
	private String          well;

	public Integer getColumn()
	{
		return column;
	}

	public Sample setColumn(Integer column)
	{
		this.column = column;
		return this;
	}

	public List<Reference> getExternalReferences()
	{
		return externalReferences;
	}

	public Sample setExternalReferences(List<Reference> externalReferences)
	{
		this.externalReferences = externalReferences;
		return this;
	}

	public String getGermplasmDbId()
	{
		return germplasmDbId;
	}

	public Sample setGermplasmDbId(String germplasmDbId)
	{
		this.germplasmDbId = germplasmDbId;
		return this;
	}

	public String getObservationUnitDbId()
	{
		return observationUnitDbId;
	}

	public Sample setObservationUnitDbId(String observationUnitDbId)
	{
		this.observationUnitDbId = observationUnitDbId;
		return this;
	}

	public String getPlateDbId()
	{
		return plateDbId;
	}

	public Sample setPlateDbId(String plateDbId)
	{
		this.plateDbId = plateDbId;
		return this;
	}

	public String getPlateName()
	{
		return plateName;
	}

	public Sample setPlateName(String plateName)
	{
		this.plateName = plateName;
		return this;
	}

	public String getProgramDbId()
	{
		return programDbId;
	}

	public Sample setProgramDbId(String programDbId)
	{
		this.programDbId = programDbId;
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

	public String getSampleBarcode()
	{
		return sampleBarcode;
	}

	public Sample setSampleBarcode(String sampleBarcode)
	{
		this.sampleBarcode = sampleBarcode;
		return this;
	}

	public String getSampleDbId()
	{
		return sampleDbId;
	}

	public Sample setSampleDbId(String sampleDbId)
	{
		this.sampleDbId = sampleDbId;
		return this;
	}

	public String getSampleDescription()
	{
		return sampleDescription;
	}

	public Sample setSampleDescription(String sampleDescription)
	{
		this.sampleDescription = sampleDescription;
		return this;
	}

	public String getSampleGroupDbId()
	{
		return sampleGroupDbId;
	}

	public Sample setSampleGroupDbId(String sampleGroupDbId)
	{
		this.sampleGroupDbId = sampleGroupDbId;
		return this;
	}

	public String getSampleName()
	{
		return sampleName;
	}

	public Sample setSampleName(String sampleName)
	{
		this.sampleName = sampleName;
		return this;
	}

	public String getSamplePUI()
	{
		return samplePUI;
	}

	public Sample setSamplePUI(String samplePUI)
	{
		this.samplePUI = samplePUI;
		return this;
	}

	public Timestamp getSampleTimestamp()
	{
		return sampleTimestamp;
	}

	public Sample setSampleTimestamp(Timestamp sampleTimestamp)
	{
		this.sampleTimestamp = sampleTimestamp;
		return this;
	}

	public String getSampleType()
	{
		return sampleType;
	}

	public Sample setSampleType(String sampleType)
	{
		this.sampleType = sampleType;
		return this;
	}

	public String getStudyDbId()
	{
		return studyDbId;
	}

	public Sample setStudyDbId(String studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}

	public String getTakenBy()
	{
		return takenBy;
	}

	public Sample setTakenBy(String takenBy)
	{
		this.takenBy = takenBy;
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

	public String getTrialDbId()
	{
		return trialDbId;
	}

	public Sample setTrialDbId(String trialDbId)
	{
		this.trialDbId = trialDbId;
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
