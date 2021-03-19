package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import java.sql.Timestamp;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AttributeValue extends BrapiObject
{
	private String          attributeDbId;
	private String          attributeName;
	private String          attributeValueDbId;
	private Timestamp       determinedDate;
	private List<Reference> externalReferences;
	private String          germplasmDbId;
	private String          germplasmName;
	private String          value;
}
