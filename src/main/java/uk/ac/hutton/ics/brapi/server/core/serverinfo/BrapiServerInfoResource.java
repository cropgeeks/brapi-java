package uk.ac.hutton.ics.brapi.server.core.serverinfo;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.core.serverinfo.ServerInfo;

import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiServerInfoResource
{
	BaseResult<ServerInfo> getServerinfo(@QueryParam("dataType") String dataType)
		throws SQLException, IOException;
}
