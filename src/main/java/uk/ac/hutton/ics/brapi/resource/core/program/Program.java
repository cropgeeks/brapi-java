package uk.ac.hutton.ics.brapi.resource.core.program;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Program extends BrapiObject
{
	private String          abbreviation;
	private String          commonCropName;
	private String          documentationURL;
	private List<Reference> externalReferences;
	private String          leadPersonDbId;
	private String          leadPersonName;
	private String          objective;
	private String          programDbId;
	private String          programName;
}
