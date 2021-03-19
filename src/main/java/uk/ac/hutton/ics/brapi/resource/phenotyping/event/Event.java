package uk.ac.hutton.ics.brapi.resource.phenotyping.event;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Event extends BrapiObject
{
	private List<String>         date;
	private String               eventDbId;
	private String               eventDescription;
	private List<EventParameter> eventParameters;
	private String               eventType;
	private String               eventTypeDbId;
	private List<String>         observationUnitDbIds;
	private String               studyDbId;
}
