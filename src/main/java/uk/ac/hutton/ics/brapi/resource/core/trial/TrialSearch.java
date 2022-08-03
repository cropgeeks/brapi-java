package uk.ac.hutton.ics.brapi.resource.core.trial;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class TrialSearch
{
	private Boolean      active;
	private List<String> commonCropNames;
	private List<String> contactDbIds;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> locationDbIds;
	private List<String> locationNames;
	private List<String> programDbIds;
	private List<String> programNames;
	private String       searchDateRangeEnd;
	private String       searchDateRangeStart;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> trialDbIds;
	private List<String> trialNames;
	private List<String> trialPUIs;
}
