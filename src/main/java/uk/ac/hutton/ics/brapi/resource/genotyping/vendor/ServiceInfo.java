package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ServiceInfo
{
	private String extractDNA;
	private String genus;
	private String species;
	private String volumePerWell;
}
