package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Call extends BrapiObject
{
	private String           callSetDbId;
	private String           callSetName;
	private List<GenotypeMetadata> genotypeMetadata;
	private String           genotypeValue;
	private String           phaseSet;
	private String           variantDbId;
	private String           variantName;
	private String           variantSetDbId;
	private String           variantSetName;
}
