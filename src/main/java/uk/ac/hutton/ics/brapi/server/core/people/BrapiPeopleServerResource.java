package uk.ac.hutton.ics.brapi.server.core.people;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.people.Person;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiPeopleServerResource
{
	BaseResult<ArrayResult<Person>> getPeople(@QueryParam("firstName") String firstName,
											  @QueryParam("lastName") String lastName,
											  @QueryParam("personDbId") String personDbId,
											  @QueryParam("userID") String userID,
											  @QueryParam("externalReferenceID") String externalReferenceID,
											  @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Person>> postPeople(Person[] newPeople)
		throws SQLException, IOException;

	BaseResult<Person> getPersonById(@PathParam("personDbId") String personDbId)
		throws SQLException, IOException;

	BaseResult<Person> putPersonById(@PathParam("personDbId") String personDbId, Person person)
		throws SQLException, IOException;
}
