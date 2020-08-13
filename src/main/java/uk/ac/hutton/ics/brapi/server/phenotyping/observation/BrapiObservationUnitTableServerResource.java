package uk.ac.hutton.ics.brapi.server.phenotyping.observation;

import org.restlet.representation.Representation;
import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;

public interface BrapiObservationUnitTableServerResource
{
	@Get("json")
	BaseResult<TableResult<String[][]>> getObservationUnitTableJson();

	@Get("csv|tsv")
	Representation getObservationUnitTableFile();
}
