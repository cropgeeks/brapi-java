package uk.ac.hutton.ics.brapi.resource.core.people;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class PeopleSearch
{
	private List<String> commonCropNames;
	private List<String> emailAddresses;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> firstNames;
	private List<String> lastNames;
	private List<String> mailingAddresses;
	private List<String> middleNames;
	private List<String> personDbIds;
	private List<String> phoneNumbers;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> userIDs;
}
