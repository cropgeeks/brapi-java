package uk.ac.hutton.ics.brapi.resource.core.serverinfo;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiCall;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ServerInfo
{
	private List<BrapiCall> calls;
	private String          contactEmail;
	private String          documentationURL;
	private String          location;
	private String          organizationName;
	private String          organizationURL;
	private String          serverDescription;
	private String          serverName;
}
