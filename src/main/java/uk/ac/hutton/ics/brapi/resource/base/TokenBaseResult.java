package uk.ac.hutton.ics.brapi.resource.base;

import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class TokenBaseResult<T>
{
	@SerializedName("@context")
	private String[]      context  = new String[]{"https://brapi.org/jsonld/context/metadata.jsonld"};
	private TokenMetadata metadata = new TokenMetadata();
	private T             result;

	public TokenBaseResult(T result, int currentPage, int pageSize, long totalCount)
	{
		this.result = result;
		metadata.setPagination(new TokenPagination(pageSize, Integer.toString(currentPage), totalCount, pageSize));
	}
}
