package uk.ac.hutton.ics.brapi.server.core.program;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.program.*;

public interface BrapiSearchProgramServerResource
{
	@Post
	BaseResult<ArrayResult<Program>> postProgramSearch(ProgramSearch search);

	@Post
	BaseResult<SearchResult> postProgramSearchAsync(ProgramSearch search);

	@Get
	BaseResult<ArrayResult<Program>> getProgramSearchAsync();
}
