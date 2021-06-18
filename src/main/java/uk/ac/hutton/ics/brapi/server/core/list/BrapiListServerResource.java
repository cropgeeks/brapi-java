package uk.ac.hutton.ics.brapi.server.core.list;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.list.Lists;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiListServerResource
{
	BaseResult<ArrayResult<Lists>> getLists(@QueryParam("listType") String listType,
											@QueryParam("listName") String listName,
											@QueryParam("listDbId") String listDbId,
											@QueryParam("listSource") String listSource,
											@QueryParam("externalReferenceID") String externalReferenceID,
											@QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Lists>> postLists(Lists[] newLists)
		throws SQLException, IOException;

	BaseResult<Lists> getListsById(@PathParam("listDbId") String listDbId)
		throws SQLException, IOException;

	BaseResult<Lists> putListById(@PathParam("listDbId") String listDbId, Lists updatedLists)
		throws SQLException, IOException;

	BaseResult<Lists> postListByIdItems(@PathParam("listDbId") String listDbId, String[] ids)
		throws SQLException, IOException;
}
