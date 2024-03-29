package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationLevelRelationship
{
	private String  levelCode;
	private String  levelName;
	private Integer levelOrder;
	private String  observationUnitDbId;

}
