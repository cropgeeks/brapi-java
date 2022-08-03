package uk.ac.hutton.ics.brapi.resource.core.study;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class StudySearch
{
	private Boolean      active;
	private List<String> commonCropNames;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> locationDbIds;
	private List<String> locationNames;
	private List<String> observationVariableDbIds;
	private List<String> observationVariableNames;
	private List<String> observationVariablePUIs;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> seasonDbIds;
	private String       sortBy;
	private String       sortOrder;
	private List<String> studyCodes;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> studyPUIs;
	private List<String> studyTypes;
	private List<String> trialDbIds;
	private List<String> trialNames;
}
