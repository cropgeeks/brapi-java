package uk.ac.hutton.ics.brapi.server.germplasm.pedigree;

import jakarta.ws.rs.QueryParam;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.germplasm.pedigree.Pedigree;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

public interface BrapiPedigreeServerResource
{
	BaseResult<ArrayResult<Pedigree>> getPedigree(@QueryParam("accessionNumber") String accessionNumber,
												  @QueryParam("collection") String collection,
												  @QueryParam("familyCode") String familyCode,
												  @QueryParam("binomialName") String binomialName,
												  @QueryParam("genus") String genus,
												  @QueryParam("species") String species,
												  @QueryParam("synonym") String synonym,
												  @QueryParam("includeParents") Boolean includeParents,
												  @QueryParam("includeSiblings") Boolean includeSiblings,
												  @QueryParam("includeProgeny") Boolean includeProgeny,
												  @QueryParam("includeFullTree") Boolean includeFullTree,
												  @QueryParam("pedigreeDepth") Integer pedigreeDepth,
												  @QueryParam("progenyDepth") Integer progenyDepth,
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

	BaseResult<ArrayResult<Pedigree>> postPedigree(Pedigree[] newPedigree)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Pedigree>> putPedigree(Map<String, Pedigree> newPedigree)
		throws IOException, SQLException;
}
