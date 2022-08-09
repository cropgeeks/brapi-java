package uk.ac.hutton.ics.brapi.resource.core.list;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Lists extends BrapiObject
{
	private List<String>    data;
	private String          dateCreated;
	private String          dateModified;
	private List<Reference> externalReferences;
	private String          listDbId;
	private String          listDescription;
	private String          listName;
	private String          listOwnerName;
	private String          listOwnerPersonDbId;
	private Long            listSize;
	private String          listSource;
	private String          listType;
}
