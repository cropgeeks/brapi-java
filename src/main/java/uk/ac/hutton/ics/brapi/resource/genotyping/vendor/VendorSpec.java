package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VendorSpec extends BrapiObject
{
	private List<Service> services;
	private VendorContact vendorContact;
}
