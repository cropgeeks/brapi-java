package uk.ac.hutton.ics.brapi.resource.germplasm.seedlot;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.sql.Timestamp;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class SeedLot extends BrapiObject
{
	private Integer         amount;
	private List<Mixture>   contentMixture;
	private Timestamp       createdDate;
	private List<Reference> externalReferences;
	private Timestamp       lastUpdated;
	private String          locationDbId;
	private String          locationName;
	private String          programDbId;
	private String          programName;
	private String          seedLotDbId;
	private String          seedLotDescription;
	private String          seedLotName;
	private String          sourceCollection;
	private String          storageLocation;
	private String          units;
}
