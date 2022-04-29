package uk.ac.hutton.ics.brapi.server.phenotyping.trait;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.Trait;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiTraitServerResource
{
	BaseResult<ArrayResult<Trait>> getTraits(@QueryParam("traitDbId") String traitDbId,
											 @QueryParam("observationVariableDbId") String observationVariableDbId,
											 @QueryParam("externalReferenceID") String externalReferenceID,
											 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Trait>> postTraits(List<Trait> newTraits)
		throws IOException, SQLException;

	BaseResult<Trait> getTraitById(@PathParam("traitDbId") String traitDbId)
		throws IOException, SQLException;

	BaseResult<Trait> putTraitById(@PathParam("traitDbId") String traitDbId, Trait trait)
		throws IOException, SQLException;
}
