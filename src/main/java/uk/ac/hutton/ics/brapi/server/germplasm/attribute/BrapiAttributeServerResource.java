package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

import jakarta.ws.rs.QueryParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiAttributeServerResource
{
	BaseResult<ArrayResult<Attribute>> getAttributes(@QueryParam("attributeCategory") String attributeCategory,
													 @QueryParam("attributeDbId") String attributeDbId,
													 @QueryParam("attributeName") String attributeName,
													 @QueryParam("germplasmDbId") String germplasmDbId,
													 @QueryParam("externalReferenceID") String externalReferenceID,
													 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Attribute>> postAttributes(Attribute[] newAttributes)
		throws IOException, SQLException;

	BaseResult<Attribute> getAttributeById(@QueryParam("attributeDbId") String attributeDbId)
		throws IOException, SQLException;

	BaseResult<Attribute> putAttributeById(@QueryParam("attributeDbId") String attributeDbId, Attribute attribute)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Category>> getAttributeCategories()
		throws IOException, SQLException;
}
