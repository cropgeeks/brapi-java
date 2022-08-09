package uk.ac.hutton.ics.brapi.server.genotyping.call;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCallServerResource
{
	BaseResult<CallResult<Call>> getCalls(@QueryParam("callSetDbId") String callSetDbId,
										  @QueryParam("variantDbId") String variantDbId,
										  @QueryParam("variantSetDbId") String variantSetDbId,
										  @QueryParam("expandHomozygotes") Boolean expandHomozygotes,
										  @QueryParam("unknownString") String unknownString,
										  @QueryParam("sepPhased") String sepPhased,
										  @QueryParam("sepUnphased") String sepUnphased)
		throws IOException, SQLException;

	BaseResult<CallResult<Call>> putCalls(Call[] callsToUpdate)
		throws IOException, SQLException;
}
