package uk.ac.hutton.ics.brapi.server.base;

import jakarta.ws.rs.*;

public abstract class BaseServerResource extends ContextResource
{
	@DefaultValue("2147483647")
	@QueryParam("pageSize")
	protected int pageSize;

	@DefaultValue("0")
	@QueryParam("page")
	protected int page;
}
