package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import java.net.URI;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ReferenceSet extends BrapiObject
{
	private String       assemblyPUI;
	private String       description;
	private Boolean      isDerived;
	private String       md5checksum;
	private String       referenceSetDbId;
	private String       referenceSetName;
	private List<String> sourceAccessions;
	private URI          sourceURI;
	private Species      species;
}
