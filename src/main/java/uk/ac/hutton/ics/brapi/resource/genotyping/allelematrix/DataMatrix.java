package uk.ac.hutton.ics.brapi.resource.genotyping.allelematrix;

import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class DataMatrix
{
	private String[][] dataMatrix;
	private String     dataMatrixAbbreviation;
	private String     dataMatrixName;
	private String     dataType;
}
