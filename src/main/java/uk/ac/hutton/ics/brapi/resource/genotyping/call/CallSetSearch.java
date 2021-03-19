package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CallSetSearch
{
	private List<String> callSetDbIds;
	private List<String> callSetNames;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> sampleDbIds;
	private List<String> sampleNames;
	private List<String> variantSetDbIds;
}
