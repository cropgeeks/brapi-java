package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class AttributeValueSearch
{
	private List<String> attributeDbIds;
	private List<String> attributeNames;
	private List<String> attributeValueDbIds;
	private List<String> commonCropNames;
	private List<String> dataTypes;
	private List<String> externalReferenceIds;
	private List<String> externalReferenceSources;
	private List<String> germplasmDbIds;
	private List<String> germplasmNames;
	private List<String> methodDbIds;
	private List<String> ontologyDbIds;
	private List<String> programDbIds;
	private List<String> programNames;
	private List<String> scaleDbIds;
	private List<String> traitClasses;
	private List<String> traitDbIds;
}
