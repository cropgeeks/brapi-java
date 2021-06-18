package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.Image;

import javax.ws.rs.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface BrapiImageServerResource
{
	BaseResult<ArrayResult<Image>> getImages(@QueryParam("imageDbId") String imageDbId,
											 @QueryParam("imageName") String imageName,
											 @QueryParam("observationUnitDbId") String observationUnitDbId,
											 @QueryParam("observationDbId") String observationDbId,
											 @QueryParam("descriptiveOntologyTerm") String descriptiveOntologyTerm,
											 @QueryParam("externalReferenceID") String externalReferenceID,
											 @QueryParam("externalReferenceSource") String externalReferenceSource)
		throws IOException, SQLException;

	BaseResult<ArrayResult<Image>> postImages(List<Image> newImages)
		throws IOException, SQLException;

	BaseResult<Image> getImageById(@PathParam("imageDbId") String imageDbId)
		throws IOException, SQLException;

	BaseResult<Image> putImageById(@PathParam("imageDbId") String imageDbId, Image image)
		throws IOException, SQLException;

	BaseResult<Image> postImageByIdContent(@PathParam("imageDbId") String imageDbId)
		throws IOException, SQLException;
}
