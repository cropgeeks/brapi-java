package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VariantSearch
{
	private List<String> callSetDbIds;
	private Long         end;
	private String       referenceDbId;
	private Long         start;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;
}
