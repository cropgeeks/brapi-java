package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.Reference;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiReferenceServerResource
{
	BaseResult<ArrayResult<Reference>> getReferences(@QueryParam("referenceDbId") String referenceDbId,
													 @QueryParam("referenceSetDbId") String referenceSetDbId,
													 @QueryParam("accession") String accession,
													 @QueryParam("md5checksum") String md5checksum,
													 @QueryParam("isDerived") String isDerived,
													 @QueryParam("minLength") String minLength,
													 @QueryParam("maxLength") String maxLength)
		throws SQLException, IOException;

	BaseResult<Reference> getReferenceById(@PathParam("referenceDbId") String referenceDbId)
		throws SQLException, IOException;
}
