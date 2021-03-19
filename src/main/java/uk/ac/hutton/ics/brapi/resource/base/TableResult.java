package uk.ac.hutton.ics.brapi.resource.base;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.phenotyping.observation.ObservationVariable;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class TableResult<T>
{
	private List<T>                   data;
	private List<String>              headerRow;
	private List<ObservationVariable> observationVariables;
}
