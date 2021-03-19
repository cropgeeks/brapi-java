package uk.ac.hutton.ics.brapi.resource.genotyping.map;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class MarkerPosition extends BrapiObject
{
	private String linkageGroupName;
	private String mapDbId;
	private String mapName;
	private Long   position;
	private String variantDbId;
	private String variantName;
}
