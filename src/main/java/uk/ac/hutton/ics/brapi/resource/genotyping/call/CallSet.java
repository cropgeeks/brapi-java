package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import java.sql.Timestamp;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class CallSet extends BrapiObject
{
	private String       callSetDbId;
	private String       callSetName;
	private Timestamp    created;
	private String       sampleDbId;
	private String       studyDbId;
	private Timestamp    updated;
	private List<String> variantSetDbIds;
}
