package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class MiniGermplasm
{
	private String germplasmDbId;
	private String germplasmName;
}
