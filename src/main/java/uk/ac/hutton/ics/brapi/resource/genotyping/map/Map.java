package uk.ac.hutton.ics.brapi.resource.genotyping.map;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

import java.net.URI;
import java.sql.Timestamp;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Map extends BrapiObject
{
	private String  comments;
	private String  commonCropName;
	private URI     documentationURL;
	private Integer linkageGroupCount;
	private String  mapDbId;
	private String  mapName;
	private String  mapPUI;
	private Integer markerCount;
	private String  publishedDate;
	private String  scientificName;
	private String  type;
	private String  unit;
}
