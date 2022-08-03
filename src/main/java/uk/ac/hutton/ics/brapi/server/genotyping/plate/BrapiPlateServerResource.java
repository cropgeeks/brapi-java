package uk.ac.hutton.ics.brapi.server.genotyping.plate;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.plate.Plate;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface BrapiPlateServerResource
{
	BaseResult<ArrayResult<Plate>> getPlates(@QueryParam("sampleDbId") String sampleDbId,
											 @QueryParam("sampleName") String sampleName,
											 @QueryParam("sampleGroupDbId") String sampleGroupDbId,
											 @QueryParam("observationUnitDbId") String observationUnitDbId,
											 @QueryParam("plateDbId") String plateDbId,
											 @QueryParam("plateName") String plateName,
											 @QueryParam("commonCropName") String commonCropName,
											 @QueryParam("programDbId") String programDbId,
											 @QueryParam("trialDbId") String trialDbId,
											 @QueryParam("studyDbId") String studyDbId,
											 @QueryParam("germplasmDbId") String germplasmDbId,
											 @QueryParam("externalReferenceId") String externalReferenceId,
											 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<Plate> getPlateById(@PathParam("plateDbId") String plateDbId)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Plate>> postPlates(Plate[] newPlates)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Plate>> putPlates(Map<String, Plate> newPlates)
		throws IOException, SQLException;
}
