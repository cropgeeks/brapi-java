package uk.ac.hutton.ics.brapi.server.core.season;

import org.restlet.resource.Put;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.season.Season;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSeasonIndividualServerResource extends IBaseServerResource<Season>
{
	@Put
	BaseResult<Season> putJson(Season newSeason);
}
