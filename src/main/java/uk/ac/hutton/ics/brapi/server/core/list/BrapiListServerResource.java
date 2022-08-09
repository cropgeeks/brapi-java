package uk.ac.hutton.ics.brapi.server.core.list;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.list.Lists;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiListServerResource
{
	BaseResult<ArrayResult<Lists>> getLists(@QueryParam("listType") String listType,
											@QueryParam("listName") String listName,
											@QueryParam("listDbId") String listDbId,
											@QueryParam("listSource") String listSource,
											@QueryParam("commonCropName") String commonCropName,
											@QueryParam("programDbId") String programDbId,
											@QueryParam("externalReferenceId") String externalReferenceId,
											@QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Lists>> postLists(Lists[] newLists)
		throws SQLException, IOException;

	BaseResult<Lists> getListsById(@PathParam("listDbId") String listDbId)
		throws SQLException, IOException;

	BaseResult<Lists> putListById(@PathParam("listDbId") String listDbId, Lists updatedLists)
		throws SQLException, IOException;

	BaseResult<Lists> postListByIdData(@PathParam("listDbId") String listDbId, String[] data)
		throws SQLException, IOException;
}
