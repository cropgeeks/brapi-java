package uk.ac.hutton.ics.brapi.resource.genotyping.reference;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.BrapiObject;
import uk.ac.hutton.ics.brapi.resource.base.Reference;
import uk.ac.hutton.ics.brapi.resource.germplasm.germplasm.MiniGermplasm;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ReferenceSet extends BrapiObject
{
	private String              assemblyPUI;
	private String              commonCropName;
	private String              description;
	private List<Reference>     externalReferences;
	private Boolean             isDerived;
	private String              md5checksum;
	private String              referenceSetDbId;
	private String              referenceSetName;
	private List<String>        sourceAccessions;
	private List<MiniGermplasm> sourceGermplasm;
	private String              sourceURI;
	private Species             species;
}
