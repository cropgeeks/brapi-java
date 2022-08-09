package uk.ac.hutton.ics.brapi.server.phenotyping.event;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.event.Event;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiEventServerResource
{
	BaseResult<ArrayResult<Event>> getEvents(@QueryParam("observationUnitDbId") String observationUnitDbId,
											 @QueryParam("eventDbId") String eventDbId,
											 @QueryParam("eventType") String eventType,
											 @QueryParam("dateRangeStart") String dateRangeStart,
											 @QueryParam("dateRangeEnd") String dateRangeEnd,
											 @QueryParam("studyDbId") String studyDbId)
		throws IOException, SQLException;
}
