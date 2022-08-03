package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.CrossingProject;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCrossingProjectServerResource
{
	BaseResult<ArrayResult<CrossingProject>> getCrossingProjects(@QueryParam("crossingProjectDbId") String crossingProjectDbId,
																 @QueryParam("crossingProjectName") String crossingProjectName,
																 @QueryParam("includePotentialParents") Boolean includePotentialParents,
																 @QueryParam("commonCropName") String commonCropName,
																 @QueryParam("programDbId") String programDbId,
																 @QueryParam("externalReferenceId") String externalReferenceId,
																 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<CrossingProject>> postCrossingProjects(CrossingProject[] newCrossingProjects)
		throws IOException, SQLException;

	BaseResult<CrossingProject> getCrossingProjectById(@PathParam("crossingProjectDbId") String crossingProjectDbId)
		throws IOException, SQLException;

	BaseResult<CrossingProject> putCrossingProjectById(@PathParam("crossingProjectDbId") String crossingProjectDbId, CrossingProject crossingProject)
		throws IOException, SQLException;
}
