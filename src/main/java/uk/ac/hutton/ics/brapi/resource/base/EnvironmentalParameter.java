package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class EnvironmentalParameter
{
	private String description;
	private String parameterName;
	private String parameterPUI;
	private String unit;
	private String unitPUI;
	private String value;
	private String valuePUI;
}
