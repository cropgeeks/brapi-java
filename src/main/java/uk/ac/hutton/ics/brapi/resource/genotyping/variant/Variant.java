package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Variant extends BrapiObject
{
	private List<String>    alternativeBases;
	private List<Integer>   ciend;
	private List<Integer>   cipos;
	private String          created;
	private Long            end;
	private List<Reference> externalReferences;
	private Boolean         filtersApplied;
	private List<String>    filtersFailed;
	private Boolean         filtersPassed;
	private String          referenceBases;
	private String          referenceDbId;
	private String          referenceName;
	private String          referenceSetDbId;
	private String          referenceSetName;
	private Long            start;
	private Integer         svlen;
	private String          updated;
	private String          variantDbId;
	private List<String>    variantNames;
	private List<String>    variantSetDbId;
	private String          variantType;
}
