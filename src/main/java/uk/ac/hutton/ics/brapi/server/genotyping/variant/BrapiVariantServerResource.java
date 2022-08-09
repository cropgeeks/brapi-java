package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.Variant;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVariantServerResource
{
	BaseResult<ArrayResult<Variant>> getVariants(@QueryParam("variantDbId") String variantDbId,
												 @QueryParam("variantSetDbId") String variantSetDbId,
												 @QueryParam("referenceDbId") String referenceDbId,
												 @QueryParam("referenceSetDbId") String referenceSetDbId,
												 @QueryParam("externalReferenceId") String externalReferenceId,
												 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<Variant> getVariantById(@PathParam("variantDbId") String variantDbId)
		throws IOException, SQLException;

	BaseResult<CallResult<Call>> getVariantByIdCalls(@PathParam("variantDbId") String variantDbId,
													 @QueryParam("expandHomozygotes") Boolean expandHomozygotes,
													 @QueryParam("unknownString") String unknownString,
													 @QueryParam("sepPhased") String sepPhased,
													 @QueryParam("sepUnphased") String sepUnphased)
		throws SQLException, IOException;
}
