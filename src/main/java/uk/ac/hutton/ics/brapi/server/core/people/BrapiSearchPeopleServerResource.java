package uk.ac.hutton.ics.brapi.server.core.people;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.SearchResult;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.people.*;

public interface BrapiSearchPeopleServerResource
{
	@Post
	BaseResult<ArrayResult<Person>> postPeopleSearch(PeopleSearch search);

	@Post
	BaseResult<SearchResult> postPeopleSearchAsync(PeopleSearch search);

	@Get
	BaseResult<ArrayResult<Person>> getPeopleSearchAsync();
}
