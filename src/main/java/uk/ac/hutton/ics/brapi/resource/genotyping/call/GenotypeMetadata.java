package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class GenotypeMetadata
{
	private String dataType;
	private String fieldAbbreviation;
	private String fieldName;
	private String fieldValue;
}
