package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Analysis
{
	private String       analysisDbId;
	private String       analysisName;
	private String       created;
	private String       description;
	private List<String> software;
	private String       type;
	private String       updated;
}
