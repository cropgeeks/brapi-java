package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class GermplasmSearch
{
	private List<String> accessionNumbers;
	private List<String> binomialNames;
	private List<String> collections;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> familyCodes;
	private List<String> genus;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> germplasmPUIs;
	private List<String> instituteCodes;
	private List<String> parentDbIds;
	private List<String> progenyDbIds;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> species;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> synonyms;
	private List<String> trialDbIds;
	private List<String> trialNames;
}
