package uk.ac.hutton.ics.brapi.server.phenotyping.image;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.phenotyping.image.Image;

public interface BrapiImageIndividualServerResource
{
	@Get
	BaseResult<Image> getImageById();

	@Put
	BaseResult<Image> putImageById(Image image);
}
