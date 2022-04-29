package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.*;

import jakarta.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;

public interface BrapiGermplasmServerResource
{
	BaseResult<ArrayResult<Germplasm>> getGermplasm(@QueryParam("germplasmPUI") String germplasmPUI,
													@QueryParam("germplasmDbId") String germplasmDbId,
													@QueryParam("germplasmName") String germplasmName,
													@QueryParam("commonCropName") String commonCropName,
													@QueryParam("accessionNumber") String accessionNumber,
													@QueryParam("collection") String collection,
													@QueryParam("genus") String genus,
													@QueryParam("species") String species,
													@QueryParam("studyDbId") String studyDbId,
													@QueryParam("synonym") String synonym,
													@QueryParam("parentDbId") String parentDbId,
													@QueryParam("progenyDbId") String progenyDbId,
													@QueryParam("externalReferenceID") String externalReferenceID,
													@QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Germplasm>> postGermplasm(Germplasm[] newGermplasm)
		throws IOException, SQLException;

	BaseResult<Germplasm> getGermplasmById(@PathParam("germplasmDbId") String germplasmDbId)
		throws IOException, SQLException;

	BaseResult<Germplasm> putGermplasmById(@PathParam("germplasmDbId") String germplasmDbId, Germplasm germplasm)
		throws IOException, SQLException;

	BaseResult<Mcpd> getGermplasmMcpd(@PathParam("germplasmDbId") String germplasmDbId)
		throws IOException, SQLException;

	BaseResult<Pedigree> getGermplasmByIdPedigree(@PathParam("germplasmDbId") String germplasmDbId,
												  @QueryParam("notation") String notation,
												  @QueryParam("includeSiblings") String includeSiblings)
		throws IOException, SQLException;

	BaseResult<Progeny> getGermplasmByIdProgeny(@PathParam("germplasmDbId") String germplasmDbId)
		throws IOException, SQLException;
}
