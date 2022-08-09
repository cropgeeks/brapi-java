package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VariantSetSearch
{
	private List<String> callSetDbIds;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> referenceDbIds;
	private List<String> referenceSetDbIds;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;
}
