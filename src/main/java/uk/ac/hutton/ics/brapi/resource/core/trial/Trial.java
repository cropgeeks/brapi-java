package uk.ac.hutton.ics.brapi.resource.core.trial;

import java.net.URI;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Trial extends BrapiObject
{
	private Boolean           active;
	private String            commonCropName;
	private List<Contact>     contacts;
	private List<Authorship>  datasetAuthorships;
	private URI               documentationURL;
	private String            endDate;
	private List<Reference>   externalReferences;
	private String            programDbId;
	private String            programName;
	private List<Publication> publications;
	private String            startDate;
	private String            trialDbId;
	private String            trialDescription;
	private String            trialName;
	private String            trialPUI;
}
