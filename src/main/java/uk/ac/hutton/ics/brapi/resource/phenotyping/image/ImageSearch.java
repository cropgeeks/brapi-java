package uk.ac.hutton.ics.brapi.resource.phenotyping.image;

import java.sql.Timestamp;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.core.location.CoordinatesPoint;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ImageSearch
{
	private List<String>     descriptiveOntologyTerms;
	private List<String>     externalReferenceIDs;
	private List<String>     externalReferenceSources;
	private List<String>     imageDbIds;
	private List<String>     imageFileNames;
	private Integer          imageFileSizeMax;
	private Integer          imageFileSizeMin;
	private Integer          imageHeightMax;
	private Integer          imageHeightMin;
	private CoordinatesPoint imageLocation;
	private List<String>     imageNames;
	private Timestamp        imageTimeStampRangeEnd;
	private Timestamp        imageTimeStampRangeStart;
	private Integer          imageWidthMax;
	private Integer          imageWidthMin;
	private List<String>     mimeTypes;
	private List<String>     observationDbIds;
	private List<String>     observationUnitDbIds;
}
