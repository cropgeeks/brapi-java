package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;

import java.net.URI;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Format
{
	private String  dataFormat;
	private Boolean expandHomozygotes;
	private String  fileFormat;
	private URI     fileURL;
	private String  sepPhased;
	private String  sepUnphased;
	private String  unknownString;
}
