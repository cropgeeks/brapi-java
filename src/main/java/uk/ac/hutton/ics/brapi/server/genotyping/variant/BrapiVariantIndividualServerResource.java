package uk.ac.hutton.ics.brapi.server.genotyping.variant;

import org.restlet.resource.Get;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.variant.Variant;

public interface BrapiVariantIndividualServerResource
{
	@Get
	BaseResult<Variant> getVariantById();
}
