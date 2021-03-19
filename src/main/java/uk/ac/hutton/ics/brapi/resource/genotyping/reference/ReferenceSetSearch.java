package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ReferenceSetSearch
{
	private List<String> accessions;
	private List<String> assemblyPUIs;
	private List<String> md5checksums;
	private List<String> referenceSetDbIds;
}
