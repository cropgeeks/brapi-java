package uk.ac.hutton.ics.brapi.server.core.program;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.program.Program;

public interface BrapiProgramServerResource
{
	@Get
	BaseResult<ArrayResult<Program>> getPrograms();

	@Post
	BaseResult<ArrayResult<Program>> postPrograms(Program[] newPrograms);
}
