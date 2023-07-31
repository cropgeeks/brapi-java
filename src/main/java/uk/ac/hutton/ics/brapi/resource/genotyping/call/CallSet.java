package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CallSet extends BrapiObject
{
	private String       callSetDbId;
	private String       callSetName;
	private String       created;
	private String       sampleDbId;
	private String       studyDbId;
	private String       updated;
	private List<String> variantSetDbIds;
}
