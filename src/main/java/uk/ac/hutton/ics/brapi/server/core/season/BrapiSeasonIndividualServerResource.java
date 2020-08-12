package uk.ac.hutton.ics.brapi.server.core.season;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.season.Season;

public interface BrapiSeasonIndividualServerResource
{
	@Get
	BaseResult<Season> getSeasonById();

	@Put
	BaseResult<Season> putSeasonById(Season newSeason);
}
