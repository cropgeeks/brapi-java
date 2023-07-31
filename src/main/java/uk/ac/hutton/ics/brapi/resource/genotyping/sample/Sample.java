package uk.ac.hutton.ics.brapi.resource.genotyping.sample;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Sample extends BrapiObject
{
	private Integer         column;
	private List<Reference> externalReferences;
	private String          germplasmDbId;
	private String          observationUnitDbId;
	private String          plateDbId;
	private String          plateName;
	private String          programDbId;
	private String          row;
	private String          sampleBarcode;
	private String          sampleDbId;
	private String          sampleDescription;
	private String          sampleGroupDbId;
	private String          sampleName;
	private String          samplePUI;
	private String          sampleTimestamp;
	private String          sampleType;
	private String          studyDbId;
	private String          takenBy;
	private String          tissueType;
	private String          trialDbId;
	private String          well;
}
