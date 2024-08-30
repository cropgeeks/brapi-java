package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.core.location.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationUnitPosition
{
	private String                                          entryType;
	private CoordinateElement<? extends GeometryElement<?>> geoCoordinates;
	private ObservationLevel                                observationLevel;
	private List<ObservationLevel>                          observationLevelRelationships;
	private String                                          positionCoordinateX;
	private String                                          positionCoordinateXType;
	private String                                          positionCoordinateY;
	private String                                          positionCoordinateYType;
}
