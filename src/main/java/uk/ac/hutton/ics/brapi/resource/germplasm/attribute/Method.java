package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Method extends BrapiObject
{
	private String            bibliographicalReference;
	private String            description;
	private List<Reference>   externalReferences;
	private String            formula;
	private String            methodClass;
	private String            methodDbId;
	private String            methodName;
	private OntologyReference ontologyReference;
}
