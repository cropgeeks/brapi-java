package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.MiniGermplasm;

import java.net.URI;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Reference extends BrapiObject
{
	private String                                               commonCropName;
	private List<uk.ac.hutton.ics.brapi.resource.base.Reference> externalReferences;
	private Boolean                                              isDerived;
	private Long                                                 length;
	private String                                               md5checksum;
	private String                                               referenceDbId;
	private String                                               referenceName;
	private String                                               referenceSetDbId;
	private String                                               referenceSetName;
	private List<String>                                         sourceAccessions;
	private Float                                                sourceDivergence;
	private List<MiniGermplasm>                                  sourceGermplasm;
	private String                                               sourceURI;
	private Species                                              species;
}
