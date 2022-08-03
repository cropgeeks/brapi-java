package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationUnit extends BrapiObject
{
	private List<Reference>         externalReferences;
	private String                  germplasmDbId;
	private String                  germplasmName;
	private String                  locationDbId;
	private String                  locationName;
	private String                  observationUnitDbId;
	private String                  observationUnitName;
	private String                  observationUnitPUI;
	private ObservationUnitPosition observationUnitPosition;
	private List<Observation>       observations;
	private String                  programDbId;
	private String                  programName;
	private String                  seedLotDbId;
	private String                  studyDbId;
	private String                  studyName;
	private List<Treatment>         treatments;
	private String                  trialDbId;
	private String                  trialName;
}
