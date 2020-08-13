package uk.ac.hutton.ics.brapi.server.core.people;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.people.Person;

public interface BrapiPeopleServerResource
{
	@Get
	BaseResult<ArrayResult<Person>> getPeople();

	@Post
	BaseResult<ArrayResult<Person>> postPeople(Person[] newPeople);
}
