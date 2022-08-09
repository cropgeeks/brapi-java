package uk.ac.hutton.ics.brapi.server.core.serverinfo;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.core.serverinfo.ServerInfo;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiServerInfoResource
{
	BaseResult<ServerInfo> getServerinfo(@QueryParam("contentType") String contentType)
		throws SQLException, IOException;
}
