package uk.ac.hutton.ics.brapi.server.genotyping.sample;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.sample.Sample;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSampleServerResource
{
	BaseResult<ArrayResult<Sample>> getSamples(@QueryParam("sampleDbId") String sampleDbId,
											   @QueryParam("observationUnitDbId") String observationUnitDbId,
											   @QueryParam("plateDbId") String plateDbId,
											   @QueryParam("germplasmDbId") String germplasmDbId,
											   @QueryParam("studyDbId") String studyDbId,
											   @QueryParam("externalReferenceID") String externalReferenceID,
											   @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<Sample> getSampleById(@PathParam("sampleDbId") String sampleDbId)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Sample>> postSamples(Sample[] newSamples)
		throws SQLException, IOException;

	BaseResult<Sample> putSampleById(@PathParam("sampleDbId") String sampleDbId, Sample sample)
		throws SQLException, IOException;
}
