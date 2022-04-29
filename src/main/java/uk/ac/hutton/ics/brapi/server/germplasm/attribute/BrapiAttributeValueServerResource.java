package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.AttributeValue;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiAttributeValueServerResource
{
	BaseResult<ArrayResult<AttributeValue>> getAttributeValues(@QueryParam("attributeValueDbId") String attributeValueDbId,
															   @QueryParam("attributeDbId") String attributeDbId,
															   @QueryParam("attributeName") String attributeName,
															   @QueryParam("germplasmDbId") String germplasmDbId,
															   @QueryParam("externalReferenceID") String externalReferenceID,
															   @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<AttributeValue>> postAttributeValues(AttributeValue[] newAttributeValues)
		throws IOException, SQLException;

	BaseResult<AttributeValue> getAttributeValueById(@PathParam("attributeValueDbId") String attributeValueDbId)
		throws IOException, SQLException;

	BaseResult<AttributeValue> putAttributeValueById(@PathParam("attributeValueDbId") String attributeValueDbId, AttributeValue attributeValue)
		throws IOException, SQLException;
}
