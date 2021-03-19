package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Collection
{
	private String          collectingDate;
	private List<Institute> collectingInstitutes;
	private String          collectingMissionIdentifier;
	private String          collectingNumber;
	private Collsite        collectingSite;
}
