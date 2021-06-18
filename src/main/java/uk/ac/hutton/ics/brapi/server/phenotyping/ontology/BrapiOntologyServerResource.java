package uk.ac.hutton.ics.brapi.server.phenotyping.ontology;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.ontology.Ontology;

import javax.ws.rs.QueryParam;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiOntologyServerResource
{
	BaseResult<ArrayResult<Ontology>> getOntologies(@QueryParam("ontologyDbId") String ontologyDbId)
		throws IOException, SQLException;
}
