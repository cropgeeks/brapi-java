package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import jakarta.ws.rs.PathParam;
import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.Variant;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVariantServerResource
{
	BaseResult<Variant> getVariantById(@PathParam("variantDbId") String variantDbId)
		throws IOException, SQLException;
}
