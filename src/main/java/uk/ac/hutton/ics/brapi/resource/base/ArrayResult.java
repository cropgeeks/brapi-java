package uk.ac.hutton.ics.brapi.resource.base;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class ArrayResult<T>
{
	private List<T> data;

	public ArrayResult(List<T> data) {
		this.data = data;
	}
}
