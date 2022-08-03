package uk.ac.hutton.ics.brapi.resource.genotyping.call;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;
import uk.ac.hutton.ics.brapi.resource.genotyping.variant.Genotype;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Call extends BrapiObject
{
	private String       callSetDbId;
	private String       callSetName;
	private Genotype     genotype;
	@SerializedName("genotype_likelihood")
	private List<Double> genotypeLikelihood;
	private String       phaseSet;
	private String       variantDbId;
	private String       variantName;
}
