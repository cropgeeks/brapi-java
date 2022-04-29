package uk.ac.hutton.ics.brapi.server.phenotyping.scale;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Scale;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiScaleServerResource
{
	BaseResult<ArrayResult<Scale>> getScales(@QueryParam("scaleDbId") String scaleDbId,
											 @QueryParam("observationVariableDbId") String observationVariableDbId,
											 @QueryParam("externalReferenceID") String externalReferenceID,
											 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Scale>> postScales(List<Scale> newScales)
		throws IOException, SQLException;

	BaseResult<Scale> getScaleById(@PathParam("scaleDbId") String scaleDbId)
		throws IOException, SQLException;

	BaseResult<Scale> putScaleById(@PathParam("scaleDbId") String scaleDbId, Scale scale)
		throws IOException, SQLException;
}
