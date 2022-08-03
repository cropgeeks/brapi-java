package uk.ac.hutton.ics.brapi.server.germplasm.attribute;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiAttributeServerResource
{
	BaseResult<ArrayResult<Attribute>> getAttributes(@QueryParam("attributeCategory") String attributeCategory,
													 @QueryParam("attributeDbId") String attributeDbId,
													 @QueryParam("attributeName") String attributeName,
													 @QueryParam("attributePUI") String attributePUI,
													 @QueryParam("methodDbId") String methodDbId,
													 @QueryParam("methodName") String methodName,
													 @QueryParam("methodPUI") String methodPUI,
													 @QueryParam("scaleDbId") String scaleDbId,
													 @QueryParam("scaleName") String scaleName,
													 @QueryParam("scalePUI") String scalePUI,
													 @QueryParam("traitDbId") String traitDbId,
													 @QueryParam("traitName") String traitName,
													 @QueryParam("traitPUI") String traitPUI,
													 @QueryParam("commonCropName") String commonCropName,
													 @QueryParam("programDbId") String programDbId,
													 @QueryParam("germplasmDbId") String germplasmDbId,
													 @QueryParam("externalReferenceId") String externalReferenceId,
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
