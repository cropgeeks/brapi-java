package uk.ac.hutton.ics.brapi.server.core.program;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.program.Program;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiProgramServerResource
{
	BaseResult<ArrayResult<Program>> getPrograms(@QueryParam("abbreviation") String abbreviation,
												 @QueryParam("commonCropName") String commonCropName,
												 @QueryParam("programDbId") String programDbId,
												 @QueryParam("programName") String programName,
												 @QueryParam("programType") String programType,
												 @QueryParam("externalReferenceId") String externalReferenceId,
												 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Program>> postPrograms(Program[] newPrograms)
		throws SQLException, IOException;

	BaseResult<Program> getProgramById(@PathParam("programDbId") String programDbId)
		throws SQLException, IOException;

	BaseResult<Program> putProgramById(@PathParam("programDbId") String programDbId, Program program)
		throws SQLException, IOException;
}
