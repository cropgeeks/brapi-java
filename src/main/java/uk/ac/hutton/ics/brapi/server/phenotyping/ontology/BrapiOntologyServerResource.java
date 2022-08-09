package uk.ac.hutton.ics.brapi.server.phenotyping.ontology;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.Image;
import uk.ac.hutton.ics.brapi.resource.phenotyping.ontology.Ontology;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiOntologyServerResource
{
	BaseResult<ArrayResult<Ontology>> getOntologies(@QueryParam("ontologyName") String ontologyName,
													@QueryParam("ontologyDbId") String ontologyDbId)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Ontology>> postOntologies(List<Ontology> newOntologies)
		throws IOException, SQLException;

	BaseResult<Ontology> getOntologyById(@PathParam("ontologyDbId") String ontologyDbId)
		throws IOException, SQLException;

	BaseResult<Ontology> putOntologyById(@PathParam("ontologyDbId") String ontologyDbId, Ontology ontology)
		throws IOException, SQLException;
}
