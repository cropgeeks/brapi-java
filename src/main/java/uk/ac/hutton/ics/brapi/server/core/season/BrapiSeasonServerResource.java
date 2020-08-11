package uk.ac.hutton.ics.brapi.server.core.season;

import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.season.Season;
import uk.ac.hutton.ics.brapi.server.IBaseServerResource;

public interface BrapiSeasonServerResource extends IBaseServerResource<ArrayResult<Season>>
{
	@Post
	BaseResult<ArrayResult<Season>> postJson(Season newSeason);
}
