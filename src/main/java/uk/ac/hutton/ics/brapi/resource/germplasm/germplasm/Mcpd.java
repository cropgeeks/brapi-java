package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
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

	public Mcpd(List<String> accessionNames)
	{
		this.accessionNames = accessionNames;
	}
}
