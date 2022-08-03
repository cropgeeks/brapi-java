package uk.ac.hutton.ics.brapi.resource.phenotyping.observation;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.location.GeometryPoint;
import uk.ac.hutton.ics.brapi.resource.core.season.Season;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Observation extends BrapiObject
{
	private String          collector;
	private List<Reference> externalReferences;
	private GeometryPoint   geoCoordinates;
	private String          germplasmDbId;
	private String          germplasmName;
	private String          observationDbId;
	private Timestamp       observationTimeStamp;
	private String          observationUnitDbId;
	private String          observationUnitName;
	private String          observationVariableDbId;
	private String          observationVariableName;
	private Season          season;
	private String          studyDbId;
	private String          uploadedBy;
	private String          value;
}
