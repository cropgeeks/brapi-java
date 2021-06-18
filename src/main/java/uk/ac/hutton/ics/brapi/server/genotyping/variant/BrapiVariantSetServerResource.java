package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.*;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVariantSetServerResource
{
	BaseResult<ArrayResult<VariantSet>> getVariantSets(@QueryParam("variantSetDbId") String variantSetDbId,
													   @QueryParam("variantDbId") String variantDbId,
													   @QueryParam("callSetDbId") String callSetDbId,
													   @QueryParam("studyDbId") String studyDbId,
													   @QueryParam("studyName") String studyName)
		throws SQLException, IOException;

	BaseResult<VariantSet> getVariantSetById(@PathParam("variantSetDbId") String variantSetDbId)
		throws SQLException, IOException;



	BaseResult<ArrayResult<CallSet>> getVariantSetByIdCallSet(@PathParam("variantSetDbId") String variantSetDbId,
															  @QueryParam("callSetDbId") String callSetDbId,
															  @QueryParam("callSetName") String callSetName)
		throws SQLException, IOException;

	BaseResult<VariantSet> postVariantSetExtract(VariantSetExtract extract)
		throws SQLException, IOException;
}
