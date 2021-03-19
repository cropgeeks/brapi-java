package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Base
{
	private String  nextPageToken;
	private Integer offset;
	private String  sequence;
}
