package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Plate
{
	private String       clientPlateBarcode;
	private String       clientPlateId;
	private String       sampleSubmissionFormat;
	private List<Sample> samples;
}
