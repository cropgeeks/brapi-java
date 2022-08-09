package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Metadata
{
	private String dataType;
	private String fieldAbbreviation;
	private String fieldName;
}
