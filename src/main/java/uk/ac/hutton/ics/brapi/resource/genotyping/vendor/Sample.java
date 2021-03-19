package uk.ac.hutton.ics.brapi.resource.genotyping.vendor;

import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.germplasm.attribute.OntologyReference;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Sample
{
	private String                  clientSampleBarCode;
	private String                  clientSampleId;
	private Integer                 column;
	private String                  comments;
	private Amount                  concentration;
	private String                  organismName;
	private String                  row;
	private String                  speciesName;
	private List<OntologyReference> taxonomyOntologyReference;
	private String                  tissueType;
	private List<OntologyReference> tissueTypeOntologyReference;
	private Amount                  volume;
	private String                  well;
}
