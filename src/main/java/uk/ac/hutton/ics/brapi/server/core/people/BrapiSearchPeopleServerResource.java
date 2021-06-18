package uk.ac.hutton.ics.brapi.server.core.people;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.people.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSearchPeopleServerResource
{
	Response postPeopleSearch(PeopleSearch search)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Person>> getPeopleSearchAsync(@PathParam("searchResultsDbId") String searchResultsDbId)
		throws SQLException, IOException;
}
