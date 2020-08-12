package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.cross.CrossingProject;

public interface BrapiCrossingProjectServerResource
{
	@Get
	BaseResult<ArrayResult<CrossingProject>> getCrossingProjects();

	@Post
	BaseResult<ArrayResult<CrossingProject>> postCrossingProjects(CrossingProject[] newCrossingProjects);
}
