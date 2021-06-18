package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.Variant;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVariantTokenServerResource
{
	TokenBaseResult<ArrayResult<Variant>> getAllVariants(@QueryParam("variantDbId") String variantDbId,
														 @QueryParam("variantSetDbId") String variantSetDbId)
		throws IOException, SQLException;

	TokenBaseResult<CallResult<Call>> getVariantByIdCalls(@PathParam("variantDbId") String variantDbId,
														  @QueryParam("expandHomozygotes") String expandHomozygotes,
														  @QueryParam("unknownString") String unknownString,
														  @QueryParam("sepPhased") String sepPhased,
														  @QueryParam("sepUnphased") String sepUnphased)
		throws SQLException, IOException;
}
