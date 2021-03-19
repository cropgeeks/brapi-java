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
public class Reference extends BrapiObject
{
	private Boolean      isDerived;
	private Integer      length;
	private String       md5checksum;
	private String       referenceDbId;
	private String       referenceName;
	private String       referenceSetDbId;
	private List<String> sourceAccessions;
	private Float        sourceDivergence;
	private URI          sourceURI;
	private Species      species;
}
