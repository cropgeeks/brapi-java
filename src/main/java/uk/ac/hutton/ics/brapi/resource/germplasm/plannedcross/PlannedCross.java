package uk.ac.hutton.ics.brapi.resource.germplasm.plannedcross;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.Parent;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class PlannedCross extends BrapiObject
{
	private String          crossType;
	private String          crossingProjectDbId;
	private String          crossingProjectName;
	private List<Reference> externalReferences;
	private Parent          parent1;
	private Parent          parent2;
	private String          plannedCrossDbId;
	private String          plannedCrossName;
}
