package uk.ac.hutton.ics.brapi.resource.core.location;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public abstract class CoordinateElement<T extends GeometryElement<?>>
{
	private String type;
	private T      geometry;
}
