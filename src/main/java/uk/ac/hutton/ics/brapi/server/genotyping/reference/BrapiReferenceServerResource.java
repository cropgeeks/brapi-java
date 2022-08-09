package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.Reference;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiReferenceServerResource
{
	BaseResult<ArrayResult<Reference>> getReferences(@QueryParam("referenceDbId") String referenceDbId,
													 @QueryParam("referenceSetDbId") String referenceSetDbId,
													 @QueryParam("accession") String accession,
													 @QueryParam("md5checksum") String md5checksum,
													 @QueryParam("isDerived") Boolean isDerived,
													 @QueryParam("minLength") Long minLength,
													 @QueryParam("maxLength") Long maxLength,
													 @QueryParam("commonCropName") String commonCropName,
													 @QueryParam("programDbId") String programDbId,
													 @QueryParam("trialDbId") String trialDbId,
													 @QueryParam("studyDbId") String studyDbId,
													 @QueryParam("externalReferenceId") String externalReferenceId,
													 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<Reference> getReferenceById(@PathParam("referenceDbId") String referenceDbId)
		throws SQLException, IOException;

	BaseResult<Base> getReferenceByIdBase(@PathParam("referenceDbId") String referenceDbId,
										  @QueryParam("pageToken") String pageToken,
										  @QueryParam("start") @DefaultValue("0") Integer start,
										  @QueryParam("end") Integer end)
		throws SQLException, IOException;
}
