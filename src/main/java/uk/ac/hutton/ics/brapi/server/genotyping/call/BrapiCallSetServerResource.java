package uk.ac.hutton.ics.brapi.server.genotyping.call;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCallSetServerResource
{
	BaseResult<ArrayResult<CallSet>> getCallsets(@QueryParam("callSetDbId") String callSetDbId,
												 @QueryParam("callSetName") String callSetName,
												 @QueryParam("variantSetDbId") String variantSetDbId,
												 @QueryParam("sampleDbId") String sampleDbId,
												 @QueryParam("germplasmDbId") String germplasmDbId)
		throws IOException, SQLException;

	BaseResult<CallSet> getCallSetById(@PathParam("callSetDbId") String callSetDbId)
		throws IOException, SQLException;
}
