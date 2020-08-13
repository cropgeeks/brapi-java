package uk.ac.hutton.ics.brapi.server.core.serverinfo;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.core.serverinfo.ServerInfo;

public interface BrapiServerInfoResource
{
	@Get
	BaseResult<ServerInfo> getServerinfo();
}
