package uk.ac.hutton.ics.brapi.resource.germplasm.pedigree;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class Pedigree extends BrapiObject
{
	private String          breedingMethodDbId;
	private String          breedingMethodName;
	private String          crossingProjectDbId;
	private Integer         crossingYear;
	private String          defaultDisplayName;
	private List<Reference> externalReferences;
	private String          familyCode;
	private String          germplasmDbId;
	private String          germplasmName;
	private String          germplasmPUI;
	private String          pedigreeString;
	private Set<Parent>     parents;
	private Set<Parent>     progeny;
	private Set<Sibling>    siblings;

	public void addProgeny(Parent toAdd)
	{
		if (this.progeny == null)
			this.progeny = new HashSet<>();

		this.progeny.add(toAdd);
	}

	public void addParent(Parent toAdd)
	{
		if (this.parents == null)
			this.parents = new HashSet<>();

		this.parents.add(toAdd);
	}

	public void addSibling(Sibling toAdd)
	{
		if (this.siblings == null)
			this.siblings = new HashSet<>();

		this.siblings.add(toAdd);
	}

	public List<Parent> getParents()
	{
		return this.parents == null ? null : new ArrayList<>(this.parents);
	}

	public List<Parent> getProgeny()
	{
		return this.progeny == null ? null : new ArrayList<>(this.progeny);
	}

	public List<Sibling> getSiblings()
	{
		return this.siblings == null ? null : new ArrayList<>(this.siblings);
	}

	public Parent toParent(String type)
	{
		return new Parent()
			.setGermplasmName(this.getGermplasmName())
			.setGermplasmDbId(this.getGermplasmDbId())
			.setParentType(type);
	}
}
