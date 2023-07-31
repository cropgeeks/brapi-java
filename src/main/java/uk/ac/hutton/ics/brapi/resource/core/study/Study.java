package uk.ac.hutton.ics.brapi.resource.core.study;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationLevel;

import java.net.URI;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Study extends BrapiObject
{
	private Boolean                      active;
	private String                       commonCropName;
	private List<Contact>                contacts;
	private String                       culturalPractices;
	private List<DataLink>               dataLinks;
	private URI                          documentationURL;
	private String                       endDate;
	private List<EnvironmentalParameter> environmentParameters;
	private PuiDescription               experimentalDesign;
	private List<Reference>              externalReference;
	private PuiDescription               growthFacility;
	private LastUpdate                   lastUpdate;
	private String                       license;
	private String                       locationDbId;
	private String                       locationName;
	private List<ObservationLevel>       observationLevels;
	private String                       observationUnitsDescription;
	private List<String>                 observationVariableDbIds;
	private List<String>                 seasons;
	private String                       startDate;
	private String                       studyCode;
	private String                       studyDbId;
	private String                       studyDescription;
	private String                       studyName;
	private String                       studyPUI;
	private String                       studyType;
	private String                       trialDbId;
	private String                       trialName;
}
