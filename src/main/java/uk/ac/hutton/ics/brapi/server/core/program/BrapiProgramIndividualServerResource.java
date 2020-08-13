package uk.ac.hutton.ics.brapi.server.core.program;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.core.program.Program;

public interface BrapiProgramIndividualServerResource
{
	@Get
	BaseResult<Program> getProgramById();

	@Put
	BaseResult<Program> putProgramById(Program program);
}
