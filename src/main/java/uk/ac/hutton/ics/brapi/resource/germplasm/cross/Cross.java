package uk.ac.hutton.ics.brapi.resource.germplasm.cross;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.sql.Timestamp;
import java.util.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Cross extends BrapiObject
{
	private List<CrossAttribute> crossAttributes;
	private String               crossDbId;
	private String               crossName;
	private String               crossType;
	private String               crossingProjectDbId;
	private String               crossingProjectName;
	private List<Reference>      externalReferences;
	private Parent               parent1;
	private Parent               parent2;
	private String               plannedCrossDbId;
	private String               plannedCrossName;
	private List<Pollination>    pollinationEvents;
}
