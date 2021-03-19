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
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;
}
