package uk.ac.hutton.ics.brapi.server.genotyping.call;

import uk.ac.hutton.ics.brapi.resource.base.TokenBaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCallSetTokenServerResource
{
	TokenBaseResult<CallResult<Call>> getCallSetByIdCalls(@PathParam("callSetDbId") String callSetDbId,
														  @QueryParam("expandHomozygotes") String expandHomozygotes,
														  @QueryParam("unknownString") String unknownString,
														  @QueryParam("sepPhased") String sepPhased,
														  @QueryParam("sepUnphased") String sepUnphased)
		throws IOException, SQLException;
}
