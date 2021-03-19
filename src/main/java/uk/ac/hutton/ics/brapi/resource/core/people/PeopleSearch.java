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
	private List<String> emailAddresses;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> firstNames;
	private List<String> lastNames;
	private List<String> mailingAddresses;
	private List<String> middleNames;
	private List<String> personDbIds;
	private List<String> phoneNumbers;
	private List<String> userIDs;
}
