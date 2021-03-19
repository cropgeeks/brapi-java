package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class OntologyReference
{
	private List<Link> documentationLinks;
	private String     ontologyDbId;
	private String     ontologyName;
	private String     version;
}
