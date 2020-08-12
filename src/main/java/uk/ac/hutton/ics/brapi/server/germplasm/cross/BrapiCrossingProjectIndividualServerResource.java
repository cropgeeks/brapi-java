package uk.ac.hutton.ics.brapi.server.germplasm.cross;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.cross.CrossingProject;

public interface BrapiCrossingProjectIndividualServerResource
{
	@Get
	BaseResult<CrossingProject> getCrossingProjectById();

	@Put
	BaseResult<CrossingProject> putCrossingProjectById(CrossingProject crossingProject);
}
