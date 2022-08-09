package uk.ac.hutton.ics.brapi.resource.germplasm.seedlot;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Mixture
{
	private String  crossDbId;
	private String  crossName;
	private String  germplasmDbId;
	private String  germplasmName;
	private Integer mixturePercentage;
}
