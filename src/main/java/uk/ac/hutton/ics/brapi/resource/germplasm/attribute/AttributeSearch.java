package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AttributeSearch
{
	private List<String> attributeCategories;
	private List<String> attributeDbIds;
	private List<String> attributeNames;
	private List<String> attributePUIs;
	private List<String> commonCropNames;
	private List<String> dataTypes;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> methodDbIds;
	private List<String> methodNames;
	private List<String> methodPUIs;
	private List<String> ontologyDbIds;
	private List<String> programNames;
	private List<String> scaleDbIds;
	private List<String> scaleNames;
	private List<String> scalePUIs;
	private List<String> studyDbIds;
	private List<String> studyNames;
	private List<String> traitAttributePUIs;
	private List<String> traitAttributes;
	private List<String> traitClasses;
	private List<String> traitDbIds;
	private List<String> traitEntities;
	private List<String> traitEntityPUIs;
	private List<String> traitNames;
	private List<String> traitPUIs;
	private List<String> trialDbIds;
	private List<String> trialNames;
}
