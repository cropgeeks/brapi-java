package uk.ac.hutton.ics.brapi.resource.phenotyping.event;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class EventParameter
{
	private String       code;
	private String       description;
	private String       key;
	private String       name;
	private String       rdfValue;
	private String       units;
	private String       value;
	private String       valueDescription;
	private List<String> valuesByDate;
}
