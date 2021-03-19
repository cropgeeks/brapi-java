package uk.ac.hutton.ics.brapi.resource.genotyping.sample;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class SampleSearch
{
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> observationUnitDbIds;
	private List<String> plateDbIds;
	private List<String> sampleDbIds;
	private List<String> studyDbIds;
	private List<String> studyNames;
}
