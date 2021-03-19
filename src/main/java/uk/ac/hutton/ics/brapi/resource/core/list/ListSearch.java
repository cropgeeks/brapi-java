package uk.ac.hutton.ics.brapi.resource.core.list;

import lombok.*;
import lombok.experimental.Accessors;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ListSearch
{
	private Timestamp    dateCreatedRangeEnd;
	private Timestamp    dateCreatedRangeStart;
	private Timestamp    dateModifiedRangeEnd;
	private Timestamp    dateModifiedRangeStart;
	private List<String> externalReferenceIDs;
	private List<String> externalReferenceSources;
	private List<String> listDbIds;
	private List<String> listNames;
	private List<String> listOwnerNames;
	private List<String> listOwnerPersonDbIds;
	private List<String> listSources;
	private String       listType;
}
