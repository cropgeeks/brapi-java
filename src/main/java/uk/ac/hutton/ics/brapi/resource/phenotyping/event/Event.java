package uk.ac.hutton.ics.brapi.resource.phenotyping.event;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

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

	public List<String> getDate()
	{
		return date;
	}

	public Event setDate(List<String> date)
	{
		this.date = date;
		return this;
	}

	public String getEventDbId()
	{
		return eventDbId;
	}

	public Event setEventDbId(String eventDbId)
	{
		this.eventDbId = eventDbId;
		return this;
	}

	public String getEventDescription()
	{
		return eventDescription;
	}

	public Event setEventDescription(String eventDescription)
	{
		this.eventDescription = eventDescription;
		return this;
	}

	public List<EventParameter> getEventParameters()
	{
		return eventParameters;
	}

	public Event setEventParameters(List<EventParameter> eventParameters)
	{
		this.eventParameters = eventParameters;
		return this;
	}

	public String getEventType()
	{
		return eventType;
	}

	public Event setEventType(String eventType)
	{
		this.eventType = eventType;
		return this;
	}

	public String getEventTypeDbId()
	{
		return eventTypeDbId;
	}

	public Event setEventTypeDbId(String eventTypeDbId)
	{
		this.eventTypeDbId = eventTypeDbId;
		return this;
	}

	public List<String> getObservationUnitDbIds()
	{
		return observationUnitDbIds;
	}

	public Event setObservationUnitDbIds(List<String> observationUnitDbIds)
	{
		this.observationUnitDbIds = observationUnitDbIds;
		return this;
	}

	public String getStudyDbId()
	{
		return studyDbId;
	}

	public Event setStudyDbId(String studyDbId)
	{
		this.studyDbId = studyDbId;
		return this;
	}
}
