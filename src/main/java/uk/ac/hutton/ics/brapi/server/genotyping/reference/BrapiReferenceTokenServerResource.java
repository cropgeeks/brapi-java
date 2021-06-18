package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.Base;

import javax.ws.rs.PathParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiReferenceTokenServerResource
{
	TokenBaseResult<ArrayResult<Base>> getReferenceByIdBases(@PathParam("referenceDbId") String referenceDbId)
		throws SQLException, IOException;
}
