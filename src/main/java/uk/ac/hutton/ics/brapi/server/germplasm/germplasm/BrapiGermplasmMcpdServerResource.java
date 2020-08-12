package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.germplasm.Mcpd;

public interface BrapiGermplasmMcpdServerResource
{
	@Get
	BaseResult<Mcpd> getGermplasmMcpd();
}
