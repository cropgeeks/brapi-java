package uk.ac.hutton.ics.brapi.resource.phenotyping.event;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class EventParameter
{
	private String key;
	private String rdfValue;
	private String value;
}
