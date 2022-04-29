package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.ReferenceSet;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiReferenceSetServerResoure
{
	BaseResult<ArrayResult<ReferenceSet>> getReferenceSets(@QueryParam("referenceSetDbId") String referenceSetDbId,
														   @QueryParam("accession") String accession,
														   @QueryParam("assemblyPUI") String assemblyPUI,
														   @QueryParam("md5checksum") String md5checksum)
		throws SQLException, IOException;

	BaseResult<ReferenceSet> getReferenceSetById(@PathParam("referenceSetDbId") String referenceSetDbId)
		throws SQLException, IOException;
}
