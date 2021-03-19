package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Scale extends BrapiObject
{
	private String            dataType;
	private Integer           decimalPlaces;
	private List<Reference>   externalReferences;
	private OntologyReference ontologyReference;
	private String            scaleDbId;
	private String            scaleName;
	private ValidValues       validValues;
}
