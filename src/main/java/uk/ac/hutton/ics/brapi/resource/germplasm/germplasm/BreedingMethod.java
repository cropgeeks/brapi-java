package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class BreedingMethod
{
	private String abbreviation;
	private String breedingMethodDbId;
	private String breedingMethodName;
	private String description;
}
