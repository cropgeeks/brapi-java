package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.Observation;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public interface BrapiObservationServerResource
{
	BaseResult<ArrayResult<Observation>> getObservations(@QueryParam("observationDbId") String observationDbId,
														 @QueryParam("observationUnitDbId") String observationUnitDbId,
														 @QueryParam("germplasmDbId") String germplasmDbId,
														 @QueryParam("observationVariableDbId") String observationVariableDbId,
														 @QueryParam("studyDbId") String studyDbId,
														 @QueryParam("locationDbId") String locationDbId,
														 @QueryParam("trialDbId") String trialDbId,
														 @QueryParam("programDbId") String programDbId,
														 @QueryParam("seasonDbId") String seasonDbId,
														 @QueryParam("observationUnitLevelName") String observationUnitLevelName,
														 @QueryParam("observationUnitLevelOrder") String observationUnitLevelOrder,
														 @QueryParam("observationUnitLevelCode") String observationUnitLevelCode,
														 @QueryParam("observationTimeStampRangeStart") String observationTimeStampRangeStart,
														 @QueryParam("observationTimeStampRangeEnd") String observationTimeStampRangeEnd,
														 @QueryParam("externalReferenceID") String externalReferenceID,
														 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Observation>> postObservations(List<Observation> newObservations)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Observation>> putObservations(Map<String, Observation> observations)
		throws IOException, SQLException;

	Response getObservationTable(@QueryParam("observationUnitDbId") String observationUnitDbId,
								 @QueryParam("germplasmDbId") String germplasmDbId,
								 @QueryParam("observationVariableDbId") String observationVariableDbId,
								 @QueryParam("studyDbId") String studyDbId,
								 @QueryParam("locationDbId") String locationDbId,
								 @QueryParam("trialDbId") String trialDbId,
								 @QueryParam("programDbId") String programDbId,
								 @QueryParam("seasonDbId") String seasonDbId,
								 @QueryParam("observationLevel") String observationLevel,
								 @QueryParam("searchResultsDbId") String searchResultsDbId,
								 @QueryParam("observationTimeStampRangeStart") String observationTimeStampRangeStart,
								 @QueryParam("observationTimeStampRangeEnd") String observationTimeStampRangeEnd)
		throws IOException, SQLException;

	BaseResult<Observation> getObservationById(@PathParam("observationDbId") String observationDbId)
		throws IOException, SQLException;

	BaseResult<Observation> putObservationById(@PathParam("observationDbId") String observationDbId, Observation observation)
		throws IOException, SQLException;


}
