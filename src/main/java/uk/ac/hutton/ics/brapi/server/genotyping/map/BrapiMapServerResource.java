package uk.ac.hutton.ics.brapi.server.genotyping.map;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.map.Map;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiMapServerResource
{
	BaseResult<ArrayResult<Map>> getMaps(@QueryParam("commonCropName") String commonCropName,
										 @QueryParam("mapDbId") String mapDbId,
										 @QueryParam("mapPUI") String mapPUI,
										 @QueryParam("scientificName") String scientificName,
										 @QueryParam("type") String type,
										 @QueryParam("programDbId") String programDbId,
										 @QueryParam("trialDbId") String trialDbId,
										 @QueryParam("studyDbId") String studyDbId)
		throws IOException, SQLException;

	BaseResult<Map> getMapById(@PathParam("mapDbId") String mapDbId)
		throws IOException, SQLException;

	BaseResult<ArrayResult<LinkageGroup>> getMapByIdLinkageGroups(@PathParam("mapDbId") String mapDbId)
		throws IOException, SQLException;
}
