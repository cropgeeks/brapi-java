package uk.ac.hutton.ics.brapi.server.core.serverinfo;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.ServerInfo;
import uk.ac.hutton.ics.brapi.resource.base.BaseResult;

public interface BrapiServerInfoResource
{
	@Get
	BaseResult<ServerInfo> getServerInfo();
}
