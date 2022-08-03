package uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.Pagination;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AlleleMatrixPagination extends Pagination
{
	private String dimension;
}
