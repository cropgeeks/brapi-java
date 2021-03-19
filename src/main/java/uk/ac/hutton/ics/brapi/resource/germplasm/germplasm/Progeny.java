package uk.ac.hutton.ics.brapi.resource.germplasm.germplasm;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Progeny
{
	private String       germplasmDbId;
	private String       germplasmName;
	private List<Parent> progeny;
}
