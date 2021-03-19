package uk.ac.hutton.ics.brapi.resource.core.location;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Location extends BrapiObject
{
	private String           abbreviation;
	private String           coordinateDescription;
	private String           coordinateUncertainty;
	private CoordinatesPoint coordinatesPoint;
	private String           countryCode;
	private String           countryName;
	private String           documentationURL;
	private String           environmentType;
	private String           exposure;
	private List<Reference>  externalReferences;
	private String           instituteAddress;
	private String           instituteName;
	private String           locationDbId;
	private String           locationName;
	private String           locationType;
	private String           siteStatus;
	private String           slope;
	private String           topography;
}
