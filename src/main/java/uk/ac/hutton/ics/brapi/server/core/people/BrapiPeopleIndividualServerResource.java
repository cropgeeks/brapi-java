package uk.ac.hutton.ics.brapi.server.core.people;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.people.Person;

public interface BrapiPeopleIndividualServerResource
{
	@Get
	BaseResult<Person> getPersonById();

	@Put
	BaseResult<Person> putPersonById(Person person);
}
