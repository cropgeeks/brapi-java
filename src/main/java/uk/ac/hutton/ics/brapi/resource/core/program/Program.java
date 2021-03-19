package uk.ac.hutton.ics.brapi.resource.core.program;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

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
