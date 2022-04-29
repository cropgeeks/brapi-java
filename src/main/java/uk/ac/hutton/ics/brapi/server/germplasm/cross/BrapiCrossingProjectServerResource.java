package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.cross.CrossingProject;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCrossingProjectServerResource
{
	BaseResult<ArrayResult<CrossingProject>> getCrossingProjects(@QueryParam("crossingProjectDbId") String crossingProjectDbId,
																 @QueryParam("externalReferenceID") String externalReferenceID,
																 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<CrossingProject>> postCrossingProjects(CrossingProject[] newCrossingProjects)
		throws IOException, SQLException;

	BaseResult<CrossingProject> getCrossingProjectById(@PathParam("crossingProjectDbId") String crossingProjectDbId)
		throws IOException, SQLException;

	BaseResult<CrossingProject> putCrossingProjectById(@PathParam("crossingProjectDbId") String crossingProjectDbId, CrossingProject crossingProject)
		throws IOException, SQLException;
}
