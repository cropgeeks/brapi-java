package uk.ac.hutton.ics.brapi.resource.core.serverinfo;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiCall;

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
