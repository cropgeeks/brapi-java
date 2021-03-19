package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.net.URI;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class DataLink
{
	private String dataFormat;
	private String description;
	private String fileFormat;
	private String name;
	private String provenance;
	private String scientificType;
	private URI    url;
	private String version;
}
