package uk.ac.hutton.ics.brapi.resource.core.trial;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Publication
{
	private String publicationPUI;
	private String publicationReference;
}
