package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Metadata
{
	private List<DataFile> datafiles;
	private Pagination     pagination;
	private List<Status>   status;
}
