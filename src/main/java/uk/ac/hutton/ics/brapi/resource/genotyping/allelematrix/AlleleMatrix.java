package uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AlleleMatrix
{
	private List<String>                 callSetDbIds;
	private List<DataMatrix>             dataMatrices;
	private Boolean                      expandHomozygotes;
	private List<AlleleMatrixPagination> pagination;
	private String                       sepPhased;
	private String                       sepUnphased;
	private String                       unknownString;
	private List<String>                 variantDbIds;
	private List<String>                 variantSetDbIds;
}
