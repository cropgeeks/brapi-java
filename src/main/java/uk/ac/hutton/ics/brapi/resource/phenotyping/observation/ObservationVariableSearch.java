package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationVariableSearch
{
	private List<String> dataTypes;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> methodDbIds;
	private List<String> observationVariableDbIds;
	private List<String> observationVariableNames;
	private List<String> ontologyDbIds;
	private List<String> scaleDbIds;
	private List<String> studyDbId;
	private List<String> traitClasses;
	private List<String> traitDbIds;
}
