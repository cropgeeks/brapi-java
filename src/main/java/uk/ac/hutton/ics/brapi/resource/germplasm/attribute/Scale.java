package uk.ac.hutton.ics.brapi.resource.germplasm.attribute;

import lombok.*;
import lombok.experimental.Accessors;
import uk.ac.hutton.ics.brapi.resource.base.*;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Scale extends BrapiObject
{
	private DataType          dataType;
	private Integer           decimalPlaces;
	private List<Reference>   externalReferences;
	private OntologyReference ontologyReference;
	private String            scaleDbId;
	private String            scaleName;
	private String            scalePUI;
	private String            units;
	private ValidValues       validValues;

	/**
	 * Scale data type
	 */
	public enum DataType {
		/** Numerical scales express the trait with real numbers. The numerical scale defines the unit e.g. centimeter, ton per hectare, branches. */
		NUMERICAL("Numerical"),
		/** Ordinal scales are scales composed of ordered categories. */
		ORDINAL("Ordinal"),
		/** Categorical scale that can take one of a limited and fixed number of categories. There is no intrinsic ordering to the categories. */
		NOMINAL("Nominal"),
		/** A free text is used to express the trait. */
		TEXT("Text"),
		/**  This scale class is exceptionally used to express complex traits. Code is a nominal scale that combines the expressions of the different traits composing the complex trait. For example a severity trait might be expressed by a 2 digit and 2 character code. The first 2 digits are the percentage of the plant covered by a fungus and the 2 characters refer to the delay in development, e.g. "75VD" means "75 %" of the plant is infected and the plant is very delayed. */
		CODE("Code"),
		/** The date class is for events expressed in a time format, See ISO 8601. */
		DATE("Date"),
		/** The Duration class is for time elapsed between two events expressed in a time format, e.g. days, hours, months. */
		DURATION("Duration");

		String value;

		private DataType(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}
	}
}
