package uk.ac.hutton.ics.brapi.resource.germplasm.pedigree;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class Sibling
{
	private String germplasmDbId;
	private String germplasmName;
}
