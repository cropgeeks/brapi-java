package uk.ac.hutton.ics.brapi.server.genotyping.call;

import uk.ac.hutton.ics.brapi.resource.base.TokenBaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;

import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCallServerResource
{
	TokenBaseResult<CallResult<Call>> getCalls(@QueryParam("callSetDbId") String callSetDbId,
											   @QueryParam("variantDbId") String variantDbId,
											   @QueryParam("variantSetDbId") String variantSetDbId,
											   @QueryParam("expandHomozygotes") String expandHomozygotes,
											   @QueryParam("unknownString") String unknownString,
											   @QueryParam("sepPhased") String sepPhased,
											   @QueryParam("sepUnphased") String sepUnphased)
		throws IOException, SQLException;


}
