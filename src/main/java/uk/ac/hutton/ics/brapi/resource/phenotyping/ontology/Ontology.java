package uk.ac.hutton.ics.brapi.resource.phenotyping.ontology;

import java.net.URI;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Ontology extends BrapiObject
{
	private String authors;
	private String copyright;
	private String description;
	private URI    documentationURL;
	private String licence;
	private String ontologyDbId;
	private String ontologyName;
	private String version;
}
