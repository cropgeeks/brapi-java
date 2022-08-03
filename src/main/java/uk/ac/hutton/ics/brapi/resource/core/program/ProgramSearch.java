package uk.ac.hutton.ics.brapi.resource.core.program;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ProgramSearch
{
	private List<String> abbreviations;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> leadPersonDbIds;
	private List<String> leadPersonNames;
	private List<String> objectives;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> programTypes;
}
