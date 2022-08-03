package uk.ac.hutton.ics.brapi.resource.genotyping.plate;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class PlateSearch
{
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> observationUnitDbIds;
	private List<String> plateBarcodes;
	private List<String> plateDbIds;
	private List<String> plateNames;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> sampleDbIds;
	private List<String> sampleGroupDbIds;
	private List<String> sampleNames;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;

}
