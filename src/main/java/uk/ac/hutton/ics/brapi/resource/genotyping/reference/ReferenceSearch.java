package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ReferenceSearch
{
	private List<String> accessions;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private Boolean      isDerived;
	private Long         maxLength;
	private List<String> md5checksums;
	private Long         minLength;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> referenceDbIds;
	private List<String> referenceSetDbIds;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;
}
