package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VariantSet extends BrapiObject
{
	private List<Analysis>        analysis;
	private List<Format>    availableFormats;
	private Long            callSetCount;
	private List<Reference> externalReferences;
	private List<Metadata>  metadataFields;
	private String          referenceSetDbId;
	private String          studyDbId;
	private Long            variantCount;
	private String          variantSetDbId;
	private String          variantSetName;
}
