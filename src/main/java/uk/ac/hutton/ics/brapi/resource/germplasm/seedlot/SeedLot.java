package uk.ac.hutton.ics.brapi.resource.germplasm.seedlot;

import java.sql.Timestamp;
import java.util.List;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class SeedLot extends BrapiObject
{
	private Integer         amount;
	private Timestamp       createdDate;
	private List<Reference> externalReferences;
	private String          germplasmDbId;
	private Timestamp       lastUpdated;
	private String          locationDbId;
	private String          programDbId;
	private String          seedLotDbId;
	private String          seedLotDescription;
	private String          seedLotName;
	private String          sourceCollection;
	private String          storageLocation;
	private String          units;
}
