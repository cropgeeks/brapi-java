package uk.ac.hutton.ics.brapi.server.genotyping.sample;

import org.restlet.resource.*;

import uk.ac.hutton.ics.brapi.resource.base.BaseResult;
import uk.ac.hutton.ics.brapi.resource.sample.Sample;

public interface BrapiSampleIndividualServerResource
{
	@Get
	BaseResult<Sample> getSampleById();

	@Put
	BaseResult<Sample> putSampleById(Sample sample);
}
