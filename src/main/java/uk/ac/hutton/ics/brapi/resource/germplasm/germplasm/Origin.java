package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.core.location.CoordinatesPoint;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Origin
{
	private String           coordinateUncertainty;
	private CoordinatesPoint coordinates;
}
