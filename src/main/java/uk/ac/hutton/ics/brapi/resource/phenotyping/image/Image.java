package uk.ac.hutton.ics.brapi.resource.phenotyping.image;

import java.net.URI;
import java.sql.Timestamp;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;
import uk.ac.hutton.ics.brapi.resource.core.location.GeometryPoint;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Image extends BrapiObject
{
	private String          copyright;
	private String          description;
	private List<String>    descriptiveOntologyTerms;
	private List<Reference> externalReferences;
	private String          imageDbId;
	private String          imageFileName;
	private Integer         imageFileSize;
	private Integer         imageHeight;
	private GeometryPoint   imageLocation;
	private String          imageName;
	private Timestamp       imageTimeStamp;
	private URI             imageURL;
	private Integer         imageWidth;
	private String          mimeType;
	private List<String>    observationDbIds;
	private String          observationUnitDbId;
}
