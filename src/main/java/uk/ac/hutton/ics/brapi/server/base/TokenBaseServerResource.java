package uk.ac.hutton.ics.brapi.server.base;

import jakarta.ws.rs.*;

public abstract class TokenBaseServerResource extends ContextResource
{
	@DefaultValue("2147483647")
	@QueryParam("pageSize")
	protected int pageSize = Integer.MAX_VALUE;

	@DefaultValue("0")
	@QueryParam("pageToken")
	protected int page;
}
