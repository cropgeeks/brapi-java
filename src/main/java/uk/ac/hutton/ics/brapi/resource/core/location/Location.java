package uk.ac.hutton.ics.brapi.resource.core.location;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Location extends BrapiObject
{
	private String           abbreviation;
	private String           coordinateDescription;
	private String           coordinateUncertainty;
	private CoordinatesPoint coordinates;
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
	private String           parentLocationDbId;
	private String           parentLocationName;
	private String           siteStatus;
	private String           slope;
	private String           topography;
}
