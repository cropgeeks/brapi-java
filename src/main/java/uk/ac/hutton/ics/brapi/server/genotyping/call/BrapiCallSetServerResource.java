package uk.ac.hutton.ics.brapi.server.genotyping.call;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCallSetServerResource
{
	BaseResult<ArrayResult<CallSet>> getCallsets(@QueryParam("callSetDbId") String callSetDbId,
												 @QueryParam("callSetName") String callSetName,
												 @QueryParam("variantSetDbId") String variantSetDbId,
												 @QueryParam("sampleDbId") String sampleDbId,
												 @QueryParam("germplasmDbId") String germplasmDbId,
												 @QueryParam("externalReferenceId") String externalReferenceId,
												 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<CallSet> getCallSetById(@PathParam("callSetDbId") String callSetDbId)
		throws IOException, SQLException;

	BaseResult<CallResult<Call>> getCallSetByIdCalls(@PathParam("callSetDbId") String callSetDbId,
													 @QueryParam("expandHomozygotes") Boolean expandHomozygotes,
													 @QueryParam("unknownString") String unknownString,
													 @QueryParam("sepPhased") String sepPhased,
													 @QueryParam("sepUnphased") String sepUnphased)
		throws IOException, SQLException;
}
