package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.Observation;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

public interface BrapiObservationServerResource
{
	BaseResult<ArrayResult<Observation>> getObservations(@QueryParam("observationDbId") String observationDbId,
														 @QueryParam("observationUnitDbId") String observationUnitDbId,
														 @QueryParam("observationVariableDbId") String observationVariableDbId,
														 @QueryParam("locationDbId") String locationDbId,
														 @QueryParam("seasonDbId") String seasonDbId,
														 @QueryParam("observationTimeStampRangeStart") String observationTimeStampRangeStart,
														 @QueryParam("observationTimeStampRangeEnd") String observationTimeStampRangeEnd,
														 @QueryParam("observationUnitLevelName") String observationUnitLevelName,
														 @QueryParam("observationUnitLevelOrder") String observationUnitLevelOrder,
														 @QueryParam("observationUnitLevelCode") String observationUnitLevelCode,
														 @QueryParam("observationUnitLevelRelationshipName") String observationUnitLevelRelationshipName,
														 @QueryParam("observationUnitLevelRelationshipOrder") String observationUnitLevelRelationshipOrder,
														 @QueryParam("observationUnitLevelRelationshipCode") String observationUnitLevelRelationshipCode,
														 @QueryParam("observationUnitLevelRelationshipDbId") String observationUnitLevelRelationshipDbId,
														 @QueryParam("commonCropName") String commonCropName,
														 @QueryParam("programDbId") String programDbId,
														 @QueryParam("trialDbId") String trialDbId,
														 @QueryParam("studyDbId") String studyDbId,
														 @QueryParam("germplasmDbId") String germplasmDbId,
														 @QueryParam("externalReferenceId") String externalReferenceId,
														 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Observation>> postObservations(List<Observation> newObservations)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Observation>> putObservations(Map<String, Observation> observations)
		throws IOException, SQLException;

	Response getObservationTable(@QueryParam("observationUnitDbId") String observationUnitDbId,
								 @QueryParam("observationVariableDbId") String observationVariableDbId,
								 @QueryParam("locationDbId") String locationDbId,
								 @QueryParam("seasonDbId") String seasonDbId,
								 @QueryParam("searchResultsDbId") String searchResultsDbId,
								 @QueryParam("observationTimeStampRangeStart") String observationTimeStampRangeStart,
								 @QueryParam("observationTimeStampRangeEnd") String observationTimeStampRangeEnd,
								 @QueryParam("programDbId") String programDbId,
								 @QueryParam("trialDbId") String trialDbId,
								 @QueryParam("studyDbId") String studyDbId,
								 @QueryParam("germplasmDbId") String germplasmDbId,
								 @QueryParam("observationUnitLevelName") String observationUnitLevelName,
								 @QueryParam("observationUnitLevelOrder") String observationUnitLevelOrder,
								 @QueryParam("observationUnitLevelCode") String observationUnitLevelCode,
								 @QueryParam("observationUnitLevelRelationshipName") String observationUnitLevelRelationshipName,
								 @QueryParam("observationUnitLevelRelationshipOrder") String observationUnitLevelRelationshipOrder,
								 @QueryParam("observationUnitLevelRelationshipCode") String observationUnitLevelRelationshipCode,
								 @QueryParam("observationUnitLevelRelationshipDbId") String observationUnitLevelRelationshipDbId)
		throws IOException, SQLException;

	BaseResult<Observation> getObservationById(@PathParam("observationDbId") String observationDbId)
		throws IOException, SQLException;

	BaseResult<Observation> putObservationById(@PathParam("observationDbId") String observationDbId, Observation observation)
		throws IOException, SQLException;


}
