package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Map;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class BrapiObject
{
	protected Map<String, String> additionalInfo;
}
