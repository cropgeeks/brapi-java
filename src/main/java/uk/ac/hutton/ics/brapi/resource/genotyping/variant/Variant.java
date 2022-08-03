package uk.ac.hutton.ics.brapi.resource.genotyping.variant;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Variant extends BrapiObject
{
	@SerializedName("alternate_bases")
	private List<String>  alternativeBases;
	private List<Integer> ciend;
	private List<Integer> cipos;
	private Timestamp     created;
	private Long          end;
	private Boolean       filtersApplied;
	private List<String>  filtersFailed;
	private Boolean       filtersPassed;
	private String        referenceBases;
	private String        referenceName;
	private Long          start;
	private Integer       svlen;
	private Timestamp     updated;
	private String        variantDbId;
	private List<String>  variantNames;
	private List<String>  variantSetDbId;
	private String        variantType;
}
