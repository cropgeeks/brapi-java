package uk.ac.hutton.ics.brapi.server.core.study;

import uk.ac.hutton.ics.brapi.resource.base.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiStudyTypesServerResource
{
	BaseResult<ArrayResult<String>> getStudyTypes()
		throws SQLException, IOException;
}
