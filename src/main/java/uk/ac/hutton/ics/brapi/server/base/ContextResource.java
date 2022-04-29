package uk.ac.hutton.ics.brapi.server.base;

import jakarta.servlet.http.*;
import jakarta.ws.rs.core.*;

public abstract class ContextResource
{
	@Context
	protected SecurityContext     securityContext;
	@Context
	protected HttpServletRequest  req;
	@Context
	protected HttpServletResponse resp;
}
