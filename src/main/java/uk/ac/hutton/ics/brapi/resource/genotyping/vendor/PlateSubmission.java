package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class PlateSubmission
{
	private String      clientId;
	private Integer     numberOfSamples;
	private List<Plate> plates;
	private String      sampleType;
}
