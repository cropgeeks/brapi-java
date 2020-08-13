package uk.ac.hutton.ics.brapi.server.core.season;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.season.Season;

public interface BrapiSeasonServerResource
{
	@Get
	BaseResult<ArrayResult<Season>> getSeasons();

	@Post
	BaseResult<ArrayResult<Season>> postSeason(Season[] newSeasons);
}
