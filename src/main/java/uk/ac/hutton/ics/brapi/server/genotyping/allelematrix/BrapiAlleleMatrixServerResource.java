package uk.ac.hutton.ics.brapi.server.genotyping.allelematrix;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix.AlleleMatrix;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiAlleleMatrixServerResource
{
	BaseResult<AlleleMatrix> getAlleleMatrix(@QueryParam("dimensionVariantPage") Integer dimensionVariantPage,
											 @QueryParam("dimensionVariantPageSize") Integer dimensionVariantPageSize,
											 @QueryParam("dimensionCallSetPage") Integer dimensionCallSetPage,
											 @QueryParam("dimensionCallSetPageSize") Integer dimensionCallSetPageSize,
											 @QueryParam("preview") @DefaultValue("false") Boolean preview,
											 @QueryParam("dataMatrixNames") String dataMatrixNames,
											 @QueryParam("dataMatrixAbbreviations") String dataMatrixAbbreviations,
											 @QueryParam("positionRange") String positionRange,
											 @QueryParam("germplasmDbId") String germplasmDbId,
											 @QueryParam("germplasmName") String germplasmName,
											 @QueryParam("germplasmPUI") String germplasmPUI,
											 @QueryParam("callSetDbId") String callSetDbId,
											 @QueryParam("variantDbId") String variantDbId,
											 @QueryParam("variantSetDbId") String variantSetDbId,
											 @QueryParam("expandHomozygotes") Boolean expandHomozygotes,
											 @QueryParam("unknownString") String unknownString,
											 @QueryParam("sepPhased") String sepPhased,
											 @QueryParam("sepUnphased") String sepUnphased)
		throws IOException, SQLException;
}
