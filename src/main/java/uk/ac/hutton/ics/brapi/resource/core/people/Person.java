package uk.ac.hutton.ics.brapi.resource.core.people;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Person extends BrapiObject
{
	private String          description;
	private String          emailAddress;
	private List<Reference> externalReferences;
	private String          firstName;
	private String          lastName;
	private String          mailingAddress;
	private String          middleName;
	private String          personDbId;
	private String          phoneNumber;
	private String          userID;
}
