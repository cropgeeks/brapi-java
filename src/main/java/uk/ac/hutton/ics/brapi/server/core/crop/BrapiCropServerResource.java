package uk.ac.hutton.ics.brapi.server.core.crop;

import uk.ac.hutton.ics.brapi.resource.base.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiCropServerResource
{
	BaseResult<ArrayResult<String>> getCommonCropNames()
		throws SQLException, IOException;
}
