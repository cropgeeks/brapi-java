package uk.ac.hutton.ics.brapi.server.phenotyping.event;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.event.Event;

public interface BrapiEventServerResource
{
	@Get
	BaseResult<ArrayResult<Event>> getEvents();
}
