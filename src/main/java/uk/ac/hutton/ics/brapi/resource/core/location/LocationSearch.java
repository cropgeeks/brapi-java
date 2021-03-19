package uk.ac.hutton.ics.brapi.resource.core.location;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class LocationSearch
{
	private List<String>       abbreviations;
	private Double             altitudeMax;
	private Double             altitudeMin;
	private CoordinatesPolygon coordinates;
	private List<String>       countryCodes;
	private List<String>       countryNames;
	private List<String>       externalReferenceIDs;
	private List<String>       externalReferenceSources;
	private List<String>       instituteAddresses;
	private List<String>       instituteNames;
	private List<String>       locationDbIds;
	private List<String>       locationNames;
	private List<String>       locationTypes;
}
