package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

import java.net.URI;
import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationVariable extends BrapiObject
{
	private String            observationVariableDbId;
	private String            observationVariableName;
	private String            commonCropName;
	private String            contextOfUse;
	private String            defaultValue;
	private URI               documentationURL;
	private List<Reference>   externalReferences;
	private String            growthStage;
	private String            institution;
	private String            language;
	private Method            method;
	private OntologyReference ontologyReference;
	private Scale             scale;
	private String            scientist;
	private String            status;
	private Timestamp         submissionTimestamp;
	private List<String>      synonyms;
	private Trait             trait;
}
