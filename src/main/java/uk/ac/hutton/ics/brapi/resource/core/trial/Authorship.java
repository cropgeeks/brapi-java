package uk.ac.hutton.ics.brapi.resource.core.trial;

import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Date;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Authorship
{
	private String datasetPUI;
	private String license;
	private Date   publicReleaseDate;
	private Date   submissionDate;
}
