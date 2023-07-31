package uk.ac.hutton.ics.brapi.resource.core.list;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ListSearch
{
	private List<String> commonCropNames;
	private String       dateCreatedRangeEnd;
	private String       dateCreatedRangeStart;
	private String       dateModifiedRangeEnd;
	private String       dateModifiedRangeStart;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> listDbIds;
	private List<String> listNames;
	private List<String> listOwnerNames;
	private List<String> listOwnerPersonDbIds;
	private List<String> listSources;
	private String       listType;
	private List<String> programDbIds;
	private List<String> programNames;
}
