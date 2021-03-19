package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class DataFile
{
	private String fileDescription;
	private String fileMD5Hash;
	private String fileName;
	private long   fileSize;
	private String fileType;
	private String fileURL;
}
