package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Service
{
	private String            serviceDescription;
	private String            serviceId;
	private String            serviceName;
	private String            servicePlatformMarkerType;
	private String            servicePlatformName;
	private List<Requirement> specificRequirements;
}
