package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.Variant;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVariantSetTokenServerResource
{
	TokenBaseResult<CallResult<Call>> getVariantSetByIdCalls(@PathParam("variantSetDbId") String variantSetDbId,
															 @QueryParam("expandHomozygotes") String expandHomozygotes,
															 @QueryParam("unknownString") String unknownString,
															 @QueryParam("sepPhased") String sepPhased,
															 @QueryParam("sepUnphased") String sepUnphased)
		throws SQLException, IOException;

	TokenBaseResult<BaseResult<Variant>> getVariantSetByIdVariants(@PathParam("variantSetDbId") String variantSetDbId,
																   @QueryParam("variantDbId") String variantDbId)
		throws IOException, SQLException;
}
