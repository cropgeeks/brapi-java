package uk.ac.hutton.ics.brapi.resource.phenotyping.event;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Event extends BrapiObject
{
	private DateRange            eventDateRange;
	private String               eventDbId;
	private String               eventDescription;
	private List<EventParameter> eventParameters;
	private String               eventType;
	private String               eventTypeDbId;
	private List<String>         observationUnitDbIds;
	private String               studyDbId;
	private String               studyName;
}
