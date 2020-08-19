package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.reference.Base;

public interface BrapiReferenceIndividualBaseServerResource
{
	@Get
	TokenBaseResult<ArrayResult<Base>> getReferenceByIdBases();
}
