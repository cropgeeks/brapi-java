package uk.ac.hutton.ics.brapi.resource.phenotyping.delete;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ObservationDeleteResult
{
	private List<String> observationDbIds;
}
