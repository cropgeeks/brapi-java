package uk.ac.hutton.ics.brapi.resource.phenotyping.image;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.core.location.GeometryPoint;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ImageDelete
{
	private List<String>  commonCropNames;
	private List<String>  descriptiveOntologyTerms;
	private List<String>  externalReferenceIds;
	private List<String>  externalReferenceSources;
	private List<String>  imageDbIds;
	private List<String>  imageFileNames;
	private Integer       imageFileSizeMax;
	private Integer       imageFileSizeMin;
	private Integer       imageHeightMax;
	private Integer       imageHeightMin;
	private GeometryPoint imageLocation;
	private List<String>  imageNames;
	private String        imageTimeStampRangeEnd;
	private String        imageTimeStampRangeStart;
	private Integer       imageWidthMax;
	private Integer       imageWidthMin;
	private List<String>  mimeTypes;
	private List<String>  observationDbIds;
	private List<String>  observationUnitDbIds;
	private Integer       page;
	private Integer       pageSize;
	private List<String>  programDbIds;
	private List<String>  programNames;
}
