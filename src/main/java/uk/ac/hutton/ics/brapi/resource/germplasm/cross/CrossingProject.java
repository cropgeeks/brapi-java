package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CrossingProject extends BrapiObject
{
	private String          commonCropName;
	private String          crossingProjectDbId;
	private String          crossingProjectDescription;
	private String          crossingProjectName;
	private List<Reference> externalReferences;
	private List<Parent>    potentialParents;
	private String          programDbId;
	private String          programName;
}
