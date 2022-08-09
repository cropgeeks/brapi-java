package uk.ac.hutton.ics.brapi.resource.genotyping.map;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class MarkerPositionSearch
{
	private List<String> linkageGroupNames;
	private List<String> mapDbIds;
	private Long         maxPosition;
	private Long         minPosition;
	private List<String> variantDbIds;
}
