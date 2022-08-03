package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.net.URI;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Germplasm extends BrapiObject
{
	private String          accessionNumber;
	private String          acquisitionDate;
	private String          biologicalStatusOfAccessionCode;
	private String          biologicalStatusOfAccessionDescription;
	private String          breedingMethodDbId;
	private String          collection;
	private String          commonCropName;
	private String          countryOfOriginCode;
	private String          defaultDisplayName;
	private URI             documentationURL;
	private List<Donor>     donors;
	private List<Reference> externalReferences;
	private String          genus;
	private String          germplasmDbId;
	private String          germplasmName;
	private List<Origin>    germplasmOrigin;
	private String          germplasmPUI;
	private String          germplasmPreprocessing;
	private String          instituteCode;
	private String          instituteName;
	private String          pedigree;
	private String          seedSource;
	private String          seedSourceDescription;
	private String          species;
	private String          speciesAuthority;
	private List<Storage>   storageTypes;
	private String          subtaxa;
	private String          subtaxaAuthority;
	private List<Synonym>   synonyms;
	private List<TaxonId>   taxonIds;
}
