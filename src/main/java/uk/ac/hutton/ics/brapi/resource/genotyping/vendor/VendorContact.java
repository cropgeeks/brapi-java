package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import lombok.*;
import lombok.experimental.Accessors;

import java.net.URI;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class VendorContact
{
	private String vendorAddress;
	private String vendorCity;
	private String vendorContactName;
	private String vendorCountry;
	private String vendorDescription;
	private String vendorEmail;
	private String vendorName;
	private String vendorPhone;
	private String vendorURL;
}
