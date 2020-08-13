package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import org.restlet.representation.Representation;
import org.restlet.resource.Post;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.Image;

public interface BrapiImageIndividualContentServerResource
{
	@Post
	BaseResult<Image> postImageByIdContent(Representation file);
}
