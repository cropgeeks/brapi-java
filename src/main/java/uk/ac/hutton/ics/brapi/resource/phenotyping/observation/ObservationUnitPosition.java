package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.core.location.CoordinatesPoint;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationUnitPosition
{
	private String                 entryType;
	private CoordinatesPoint       geoCoordinates;
	private ObservationLevel       observationLevel;
	private List<ObservationLevel> observationLevelRelationships;
	private String                 positionCoordinateX;
	private String                 positionCoordinateXType;
	private String                 positionCoordinateY;
	private String                 positionCoordinateYType;
}
