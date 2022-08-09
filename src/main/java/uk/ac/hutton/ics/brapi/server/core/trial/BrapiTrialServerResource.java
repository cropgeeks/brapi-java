package uk.ac.hutton.ics.brapi.server.core.trial;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.trial.Trial;

import java.io.IOException;
import java.sql.SQLException;

@Path("trials")
public interface BrapiTrialServerResource
{
	BaseResult<ArrayResult<Trial>> getTrials(@QueryParam("active") String active,
											 @QueryParam("contactDbId") String contactDbId,
											 @QueryParam("locationDbId") String locationDbId,
											 @QueryParam("searchDateRangeStart") String searchDateRangeStart,
											 @QueryParam("searchDateRangeEnd") String searchDateRangeEnd,
											 @QueryParam("trialPUI") String trialPUI,
											 @QueryParam("sortBy") String sortBy,
											 @QueryParam("sortOrder") String sortOrder,
											 @QueryParam("commonCropName") String commonCropName,
											 @QueryParam("programDbId") String programDbId,
											 @QueryParam("trialDbId") String trialDbId,
											 @QueryParam("trialName") String trialName,
											 @QueryParam("studyDbId") String studyDbId,
											 @QueryParam("externalReferenceId") String externalReferenceId,
											 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws SQLException, IOException;

	BaseResult<ArrayResult<Trial>> postTrials(Trial[] newTrials)
		throws SQLException, IOException;

	BaseResult<Trial> getTrialById(@QueryParam("trialsDbId") String trialsDbId)
		throws SQLException, IOException;

	BaseResult<Trial> putTrialById(@QueryParam("trialsDbId") String trialsDbId, Trial trial)
		throws SQLException, IOException;
}
