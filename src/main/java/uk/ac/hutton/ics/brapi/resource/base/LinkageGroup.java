package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class LinkageGroup extends BrapiObject
{
	private String  linkageGroupName;
	private Integer markerCount;
	private Long    maxPosition;
}
