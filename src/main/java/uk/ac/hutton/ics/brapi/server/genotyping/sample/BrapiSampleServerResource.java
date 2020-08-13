package uk.ac.hutton.ics.brapi.server.genotyping.sample;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.genotyping.sample.Sample;

public interface BrapiSampleServerResource
{
	@Get
	BaseResult<ArrayResult<Sample>> getSamples();

	@Post
	BaseResult<ArrayResult<Sample>> postSamples(Sample[] newSamples);
}
