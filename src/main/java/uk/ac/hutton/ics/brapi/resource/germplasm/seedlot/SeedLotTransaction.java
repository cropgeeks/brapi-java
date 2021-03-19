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
public class SeedLotTransaction extends BrapiObject
{
	private Integer         amount;
	private List<Reference> externalReferences;
	private String          fromSeedLotDbId;
	private String          toSeedLotDbId;
	private String          transactionDbId;
	private String          transactionDescription;
	private Timestamp       transactionTimestamp;
	private String          units;
}
