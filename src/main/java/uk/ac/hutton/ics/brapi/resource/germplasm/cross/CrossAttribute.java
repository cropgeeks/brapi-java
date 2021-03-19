package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CrossAttribute
{
	private String crossAttributeName;
	private String crossAttributeValue;
}
