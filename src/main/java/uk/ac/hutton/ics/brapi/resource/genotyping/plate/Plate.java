package uk.ac.hutton.ics.brapi.resource.genotyping.plate;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Plate extends BrapiObject
{
	private List<Reference> externalReferences;
	private String          plateBarcode;
	private String          plateDbId;
	private String          plateFormat;
	private String          plateName;
	private String          programDbId;
	private String          sampleType;
	private String          studyDbId;
	private String          trialDbId;
}
