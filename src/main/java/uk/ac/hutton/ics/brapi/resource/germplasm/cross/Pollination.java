package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Pollination
{
	private String  pollinationNumber;
	private Boolean pollinationSuccessful;
	private String  pollinationTimeStamp;
}
