package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ReferenceSetSearch
{
	private List<String> accessions;
	private List<String> assemblyPUIs;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> md5checksums;
	private List<String> programNames;
	private List<String> referenceSetDbIds;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;
}
