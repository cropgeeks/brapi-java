package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Contact
{
	private String contactDbId;
	private String email;
	private String instituteName;
	private String name;
	private String orcid;
	private String type;
}
