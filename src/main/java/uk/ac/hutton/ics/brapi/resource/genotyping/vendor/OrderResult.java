package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.net.URI;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class OrderResult extends BrapiObject
{
	private List<String> clientSampleIds;
	private String       fileName;
	private String       fileType;
	private URI          fileURL;
	private String       md5sum;
}
