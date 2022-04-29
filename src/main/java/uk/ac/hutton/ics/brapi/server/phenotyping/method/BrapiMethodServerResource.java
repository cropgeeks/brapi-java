package uk.ac.hutton.ics.brapi.server.phenotyping.method;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Method;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiMethodServerResource
{
	BaseResult<ArrayResult<Method>> getMethods(@QueryParam("methodDbId") String methodDbId,
											   @QueryParam("observationVariableDbId") String observationVariableDbId,
											   @QueryParam("externalReferenceID") String externalReferenceID,
											   @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Method>> postMethods(List<Method> newMethods)
		throws IOException, SQLException;

	BaseResult<Method> getMethodById(@PathParam("methodDbId") String methodDbId)
		throws IOException, SQLException;

	BaseResult<Method> putMethodById(@PathParam("methodDbId") String methodDbId, Method method)
		throws IOException, SQLException;
}
