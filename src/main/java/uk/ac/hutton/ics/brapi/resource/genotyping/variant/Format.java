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
	private String dataFormat;
	private String fileFormat;
	private URI    fileURL;
}
