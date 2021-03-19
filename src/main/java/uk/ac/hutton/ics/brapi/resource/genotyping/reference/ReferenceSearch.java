package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ReferenceSearch
{
	private List<String> accessions;
	private Boolean      isDerived;
	private Integer      maxLength;
	private List<String> md5checksums;
	private Integer      minLength;
	private List<String> referenceDbIds;
	private List<String> referenceSetDbIds;
}
