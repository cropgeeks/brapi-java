package uk.ac.hutton.ics.brapi.resource.core.location;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public abstract class GeometryElement<T>
{
	private String type;
	private T      coordinates;
}
