package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationSearch
{
	private List<String>           commonCropNames;
	private List<String>           externalReferenceIds;
	private List<String>           externalReferenceSources;
	private List<String>           germplasmDbIds;
	private List<String>           germplasmNames;
	private List<String>           locationDbIds;
	private List<String>           locationNames;
	private List<String>           observationDbIds;
	private List<ObservationLevel> observationLevelRelationships;
	private List<ObservationLevel> observationLevels;
	private Timestamp              observationTimeStampRangeEnd;
	private Timestamp              observationTimeStampRangeStart;
	private List<String>           observationUnitDbIds;
	private List<String>           observationVariableDbIds;
	private List<String>           observationVariableNames;
	private List<String>           observationVariablePUIs;
	private List<String>           programDbIds;
	private List<String>           programNames;
	private List<String>           seasonDbIds;
	private List<String>           studyDbIds;
	private List<String>           studyNames;
	private List<String>           trialDbIds;
	private List<String>           trialNames;
}
