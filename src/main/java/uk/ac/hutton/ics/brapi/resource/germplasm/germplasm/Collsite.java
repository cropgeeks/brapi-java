package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Collsite
{
	private String coordinateUncertainty;
	private String elevation;
	private String georeferencingMethod;
	private String latitudeDecimal;
	private String latitudeDegrees;
	private String locationDescription;
	private String longitudeDecimal;
	private String longitudeDegrees;
	private String spatialReferenceSystem;
}
