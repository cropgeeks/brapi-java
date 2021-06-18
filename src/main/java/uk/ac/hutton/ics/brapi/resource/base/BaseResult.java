package uk.ac.hutton.ics.brapi.resource.base;

import com.fasterxml.jackson.annotation.*;
import com.google.gson.annotations.SerializedName;
import lombok.*;
import lombok.experimental.Accessors;

@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class BaseResult<T>
{
	@SerializedName("@context")
	@JsonProperty(value = "@context")
	@Getter(onMethod_ = {@JsonGetter(value = "@context")})
	private String[] context  = new String[]{"https://brapi.org/jsonld/context/metadata.jsonld"};
	private Metadata metadata = new Metadata();
	private T        result;

	public BaseResult(T result, int currentPage, int pageSize, long totalCount)
	{
		this.result = result;
		metadata.setPagination(new Pagination(pageSize, currentPage, totalCount, pageSize));
	}
}
