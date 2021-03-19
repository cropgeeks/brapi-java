package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Parent
{
	private String germplasmDbId;
	private String germplasmName;
	private String observationUnitDbId;
	private String observationUnitName;
	private String parentType;
}
