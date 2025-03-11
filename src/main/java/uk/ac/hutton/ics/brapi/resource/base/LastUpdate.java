package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;


@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class LastUpdate
{
	private String timestamp;
	private String version;
}
