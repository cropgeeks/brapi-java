package uk.ac.hutton.ics.brapi.resource.base;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class PuiDescription
{
	@SerializedName("PUI")
	private String pui;
	private String description;
}
