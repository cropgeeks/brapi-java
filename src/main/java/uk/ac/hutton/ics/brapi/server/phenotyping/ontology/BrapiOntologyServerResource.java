package uk.ac.hutton.ics.brapi.server.phenotyping.ontology;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.ontology.Ontology;

public interface BrapiOntologyServerResource
{
	@Get
	BaseResult<ArrayResult<Ontology>> getOntologies();
}
