package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import org.restlet.resource.*;

import java.util.List;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.Image;

public interface BrapiImageServerResource
{
	@Get
	BaseResult<ArrayResult<Image>> getImages();

	@Post
	BaseResult<ArrayResult<Image>> postImages(List<Image> newImages);
}
