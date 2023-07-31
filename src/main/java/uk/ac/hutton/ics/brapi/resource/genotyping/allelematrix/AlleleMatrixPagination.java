package uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AlleleMatrixPagination
{
	private String dimension;
	private Integer page;
	private Integer pageSize;
	private Integer totalCount;
	private Integer totalPages;
}
