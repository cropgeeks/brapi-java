package uk.ac.hutton.ics.brapi.resource.core.season;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Season
{
	private String seasonDbId;
	private String seasonName;
	private int    year;
}
