package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VendorSpec extends BrapiObject
{
	private List<Service> services;
	private VendorContact vendorContact;
}
