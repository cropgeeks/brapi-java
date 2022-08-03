package uk.ac.hutton.ics.brapi.server.phenotyping.method;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Method;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiMethodServerResource
{
	BaseResult<ArrayResult<Method>> getMethods(@QueryParam("methodDbId") String methodDbId,
											   @QueryParam("observationVariableDbId") String observationVariableDbId,
											   @QueryParam("ontologyDbId") String ontologyDbId,
											   @QueryParam("commonCropName") String commonCropName,
											   @QueryParam("programDbId") String programDbId,
											   @QueryParam("externalReferenceId") String externalReferenceId,
											   @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Method>> postMethods(List<Method> newMethods)
		throws IOException, SQLException;

	BaseResult<Method> getMethodById(@PathParam("methodDbId") String methodDbId)
		throws IOException, SQLException;

	BaseResult<Method> putMethodById(@PathParam("methodDbId") String methodDbId, Method method)
		throws IOException, SQLException;
}
