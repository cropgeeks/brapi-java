package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

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
	private String          programDbId;
	private String          programName;
}
