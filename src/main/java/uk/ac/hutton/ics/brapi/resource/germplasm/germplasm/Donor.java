package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Donor
{
	private String donorAccessionNumber;
	private String donorInstituteCode;
	private String germplasmPUI;
}
