package uk.ac.hutton.ics.brapi.server.germplasm.germplasm;

import jakarta.ws.rs.*;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.*;

import java.io.IOException;
import java.sql.SQLException;

public interface BrapiGermplasmServerResource
{
	BaseResult<ArrayResult<Germplasm>> getGermplasm(@QueryParam("accessionNumber") String accessionNumber,
													@QueryParam("collection") String collection,
													@QueryParam("binomialName") String binomialName,
													@QueryParam("genus") String genus,
													@QueryParam("species") String species,
													@QueryParam("synonym") String synonym,
													@QueryParam("parentDbId") String parentDbId,
													@QueryParam("progenyDbId") String progenyDbId,
													@QueryParam("commonCropName") String commonCropName,
													@QueryParam("programDbId") String programDbId,
													@QueryParam("trialDbId") String trialDbId,
													@QueryParam("studyDbId") String studyDbId,
													@QueryParam("germplasmDbId") String germplasmDbId,
													@QueryParam("germplasmName") String germplasmName,
													@QueryParam("germplasmPUI") String germplasmPUI,
													@QueryParam("externalReferenceId") String externalReferenceId,
													@QueryParam("externalReferenceSource") String externalReferenceSource
	)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Germplasm>> postGermplasm(Germplasm[] newGermplasm)
		throws IOException, SQLException;

	BaseResult<Germplasm> getGermplasmById(@PathParam("germplasmDbId") String germplasmDbId)
		throws IOException, SQLException;

	BaseResult<Germplasm> putGermplasmById(@PathParam("germplasmDbId") String germplasmDbId, Germplasm germplasm)
		throws IOException, SQLException;

	BaseResult<Mcpd> getGermplasmMcpd(@PathParam("germplasmDbId") String germplasmDbId)
		throws IOException, SQLException;
}
