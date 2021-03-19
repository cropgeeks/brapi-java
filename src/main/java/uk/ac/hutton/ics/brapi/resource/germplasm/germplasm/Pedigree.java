package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Pedigree
{
	private String        crossingProjectDbId;
	private Integer       crossingYear;
	private String        familyCode;
	private String        germplasmDbId;
	private String        germplasmName;
	private List<Parent>  parents;
	private String        pedigree;
	private List<Sibling> siblings;
}
