package uk.ac.hutton.ics.brapi.server.core.season;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.season.Season;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiSeasonServerResource
{
	BaseResult<ArrayResult<Season>> getSeasons(@QueryParam("seasonDbId") String seasonDbId,
											   @QueryParam("season") String season,
											   @QueryParam("year") String year)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Season>> postSeasons(Season[] newSeasons)
		throws SQLException, IOException;

	BaseResult<Season> getSeasonById(@PathParam("seasonDbId") String seasonDbId)
		throws SQLException, IOException;

	BaseResult<Season> putSeasonById(@PathParam("seasonDbId") String seasonDbId, Season newSeason)
		throws SQLException, IOException;
}
