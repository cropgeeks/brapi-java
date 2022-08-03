package uk.ac.hutton.ics.brapi.server.core.people;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.people.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchPeopleServerResource
{
	Response postPeopleSearch(PeopleSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Person>> getPeopleSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
