package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Trait extends BrapiObject
{
	private List<String>      alternativeAbbreviations;
	private String            attribute;
	private String            attributePUI;
	private String            entity;
	private String            entityPUI;
	private List<Reference>   externalReferences;
	private String            mainAbbreviation;
	private OntologyReference ontologyReference;
	private String            status;
	private List<String>      synonyms;
	private String            traitClass;
	private String            traitDbId;
	private String            traitDescription;
	private String            traitName;
	private String            traitPUI;
}
