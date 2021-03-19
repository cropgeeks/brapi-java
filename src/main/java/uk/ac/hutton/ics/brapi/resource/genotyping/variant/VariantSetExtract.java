package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VariantSetExtract
{
	private List<String> callSetDbIds;
	private Boolean      expandHomozygotes;
	private String       sepPhased;
	private String       sepUnphased;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private String       unknownString;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;
}
