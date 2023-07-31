package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ValidValues
{
	private List<Category> categories;
	private String         maximumValue;
	private String         minimumValue;

	/** @deprecated Deprecated in BrAPI 2.1 */
	@Deprecated
	private Integer        min;
	/** @deprecated Deprecated in BrAPI 2.1 */
	@Deprecated
	private Integer        max;

}
