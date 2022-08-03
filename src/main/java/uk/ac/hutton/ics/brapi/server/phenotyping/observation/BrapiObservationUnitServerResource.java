package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationUnit;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiObservationUnitServerResource
{
	BaseResult<ArrayResult<ObservationUnit>> getObservationUnits(@QueryParam("observationUnitDbId") String observationUnitDbId,
																 @QueryParam("observationUnitName") String observationUnitName,
																 @QueryParam("germplasmDbId") String germplasmDbId,
																 @QueryParam("studyDbId") String studyDbId,
																 @QueryParam("locationDbId") String locationDbId,
																 @QueryParam("trialDbId") String trialDbId,
																 @QueryParam("programDbId") String programDbId,
																 @QueryParam("seasonDbId") String seasonDbId,
																 @QueryParam("observationUnitLevelName") String observationUnitLevelName,
																 @QueryParam("observationUnitLevelOrder") String observationUnitLevelOrder,
																 @QueryParam("observationUnitLevelCode") String observationUnitLevelCode,
																 @QueryParam("observationUnitLevelRelationshipName") String observationUnitLevelRelationshipName,
																 @QueryParam("observationUnitLevelRelationshipOrder") String observationUnitLevelRelationshipOrder,
																 @QueryParam("observationUnitLevelRelationshipCode") String observationUnitLevelRelationshipCode,
																 @QueryParam("observationUnitLevelRelationshipDbId") String observationUnitLevelRelationshipDbId,
																 @QueryParam("commonCropName") String commonCropName,
																 @QueryParam("includeObservations") String includeObservations,
																 @QueryParam("externalReferenceId") String externalReferenceId,
																 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<ObservationUnit>> postObservationUnits(List<ObservationUnit> newObservationUnits)
		throws IOException, SQLException;

	BaseResult<ArrayResult<ObservationUnit>> putObservationUnits(ObservationUnit observationUnit)
		throws IOException, SQLException;

	Response getObservationUnitTable(@QueryParam("observationUnitDbId") String observationUnitDbId,
									 @QueryParam("germplasmDbId") String germplasmDbId,
									 @QueryParam("observationVariableDbId") String observationVariableDbId,
									 @QueryParam("studyDbId") String studyDbId,
									 @QueryParam("locationDbId") String locationDbId,
									 @QueryParam("trialDbId") String trialDbId,
									 @QueryParam("programDbId") String programDbId,
									 @QueryParam("seasonDbId") String seasonDbId,
									 @QueryParam("observationLevel") String observationLevel)
		throws IOException, SQLException;

	BaseResult<ObservationUnit> getObservationUnitById(@PathParam("observationUnitDbId") String observationUnitDbId)
		throws IOException, SQLException;

	BaseResult<ObservationUnit> putObservationUnitById(@PathParam("observationUnitDbId") String observationUnitDbId, ObservationUnit observationUnit)
		throws IOException, SQLException;
}
