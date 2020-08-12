package uk.ac.hutton.ics.brapi.server.genotyping.reference;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.reference.ReferenceSet;

public interface BrapiReferenceSetServerResource
{
	@Get
	BaseResult<ArrayResult<ReferenceSet>> getReferenceSets();
}
