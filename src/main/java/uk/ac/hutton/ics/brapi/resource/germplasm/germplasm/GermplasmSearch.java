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
}
