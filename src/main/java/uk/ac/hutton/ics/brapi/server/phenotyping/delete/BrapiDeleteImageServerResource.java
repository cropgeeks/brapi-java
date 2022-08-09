package uk.ac.hutton.ics.brapi.server.phenotyping.delete;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.delete.ImageDeleteResult;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.ImageDelete;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiDeleteImageServerResource
{
	BaseResult<ImageDeleteResult> deleteImages(ImageDelete deleteRequest)
		throws IOException, SQLException;
}
