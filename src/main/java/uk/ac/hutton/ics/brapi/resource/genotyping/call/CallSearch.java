package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CallSearch
{
	private List<String> callSetDbIds;
	private Boolean      expandHomozygotes;
	private String       sepPhased;
	private String       sepUnphased;
	private String       unknownString;
	private List<String> variantDbIds;
	private List<String> variantSetDbIds;
}
