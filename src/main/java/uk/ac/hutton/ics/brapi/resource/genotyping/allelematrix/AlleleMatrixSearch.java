package uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AlleleMatrixSearch
{
	private List<String>           callSetDbIds;
	private List<String>           dataMatrixAbbreviations;
	private List<String>           dataMatrixNames;
	private Boolean                expandHomozygotes;
	private List<String>           germplasmDbIds;
	private List<String>           germplasmNames;
	private List<String>           germplasmPUIs;
	private AlleleMatrixPagination pagination;
	private List<String>           positionRanges;
	private Boolean                preview = false;
	private List<String>           sampleDbIds;
	private String                 sepPhased;
	private String                 sepUnphased;
	private String                 unknownString;
	private List<String>           variantDbIds;
	private List<String>           variantSetDbIds;
}
