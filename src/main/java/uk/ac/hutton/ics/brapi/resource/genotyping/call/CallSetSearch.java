package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CallSetSearch
{
	private List<String> callSetDbIds;
	private List<String> callSetNames;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> sampleDbIds;
	private List<String> sampleNames;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;
	private List<String> variantSetDbIds;
}
