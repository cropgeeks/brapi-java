package uk.ac.hutton.ics.brapi.server.core.study;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.study.Study;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiStudyServerResource
{
	BaseResult<ArrayResult<Study>> getStudies(@QueryParam("studyType") String studyType,
											  @QueryParam("locationDbId") String locationDbId,
											  @QueryParam("seasonDbId") String seasonDbId,
											  @QueryParam("studyCode") String studyCode,
											  @QueryParam("studyPUI") String studyPUI,
											  @QueryParam("observationVariableDbId") String observationVariableDbId,
											  @QueryParam("active") String active,
											  @QueryParam("sortBy") String sortBy,
											  @QueryParam("sortOrder") String sortOrder,
											  @QueryParam("commonCropName") String commonCropName,
											  @QueryParam("programDbId") String programDbId,
											  @QueryParam("trialDbId") String trialDbId,
											  @QueryParam("studyDbId") String studyDbId,
											  @QueryParam("studyName") String studyName,
											  @QueryParam("germplasmDbId") String germplasmDbId,
											  @QueryParam("externalReferenceId") String externalReferenceId,
											  @QueryParam("externalReferenceSource") String externalReferenceSource)
	throws SQLException, IOException;

	BaseResult<ArrayResult<Study>> postStudies(Study[] newStudies)
		throws SQLException, IOException;

	BaseResult<Study> getStudyById(@PathParam("studyDbId") String studyDbId)
		throws SQLException, IOException;

	BaseResult<Study> putStudyById(@PathParam("studyDbId") String studyDbId, Study newStudy)
		throws SQLException, IOException;
}
