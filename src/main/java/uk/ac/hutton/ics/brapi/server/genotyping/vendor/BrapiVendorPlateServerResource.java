package uk.ac.hutton.ics.brapi.server.genotyping.vendor;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.genotyping.vendor.*;

import javax.ws.rs.PathParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiVendorPlateServerResource
{
	BaseResult<PlateSubmissionResult> postVendorPlates(PlateSubmission plateSubmission);

	BaseResult<PlateSubmission> getVendorPlateSubmissionById(@PathParam("submissionId") String submissionId)
		throws SQLException, IOException;
}
