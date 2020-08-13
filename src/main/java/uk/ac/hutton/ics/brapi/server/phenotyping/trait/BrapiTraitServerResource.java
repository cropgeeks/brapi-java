package uk.ac.hutton.ics.brapi.server.phenotyping.trait;

import org.restlet.resource.*;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Trait;

public interface BrapiTraitServerResource
{
	@Get
	BaseResult<ArrayResult<Trait>> getTraits();

	@Post
	BaseResult<ArrayResult<Trait>> postTraits(List<Trait> newTraits);
}
