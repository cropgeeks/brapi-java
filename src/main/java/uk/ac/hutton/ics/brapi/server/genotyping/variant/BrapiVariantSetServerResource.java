package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.call.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVariantSetServerResource
{
	BaseResult<ArrayResult<VariantSet>> getVariantSets(@QueryParam("variantSetDbId") String variantSetDbId,
													   @QueryParam("variantDbId") String variantDbId,
													   @QueryParam("callSetDbId") String callSetDbId,
													   @QueryParam("referenceSetDbId") String referenceSetDbId,
													   @QueryParam("commonCropName") String commonCropName,
													   @QueryParam("programDbId") String programDbId,
													   @QueryParam("studyDbId") String studyDbId,
													   @QueryParam("studyName") String studyName,
													   @QueryParam("externalReferenceId") String externalReferenceId,
													   @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<VariantSet> getVariantSetById(@PathParam("variantSetDbId") String variantSetDbId)
		throws SQLException, IOException;


	BaseResult<ArrayResult<CallSet>> getVariantSetByIdCallSet(@PathParam("variantSetDbId") String variantSetDbId,
															  @QueryParam("callSetDbId") String callSetDbId,
															  @QueryParam("callSetName") String callSetName)
		throws SQLException, IOException;

	BaseResult<CallResult<Call>> getVariantSetByIdCalls(@PathParam("variantSetDbId") String variantSetDbId,
														 @QueryParam("expandHomozygotes") Boolean expandHomozygotes,
														 @QueryParam("unknownString") String unknownString,
														 @QueryParam("sepPhased") String sepPhased,
														 @QueryParam("sepUnphased") String sepUnphased)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Variant>> getVariantSetByIdVariant(@PathParam("variantSetDbId") String variantSetDbId,
															  @QueryParam("variantDbId") String variantDbId)
		throws SQLException, IOException;

	BaseResult<VariantSet> postVariantSetExtract(VariantSetExtract extract)
		throws SQLException, IOException;
}
