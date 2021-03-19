package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class LastUpdate
{
	private Timestamp timestamp;
	private String    version;
}
