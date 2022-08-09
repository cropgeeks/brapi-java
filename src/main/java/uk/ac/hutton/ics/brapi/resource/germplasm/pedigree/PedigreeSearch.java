package uk.ac.hutton.ics.brapi.resource.germplasm.pedigree;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class PedigreeSearch
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
	private Boolean      includeFullTree;
	private Boolean      includeParents;
	private Boolean      includeProgeny;
	private Boolean      includeSiblings;
	private List<String> instituteCodes;
	private Integer      pedigreeDepth;
	private Integer      progenyDepth;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> species;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> synonyms;
	private List<String> trialDbIds;
	private List<String> trialNames;
}
