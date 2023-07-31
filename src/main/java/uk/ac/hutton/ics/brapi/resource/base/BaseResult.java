package uk.ac.hutton.ics.brapi.resource.base;

import java.util.List;

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

	public BaseResult(T result, int currentPage, int pageSize, long totalCount, int totalPages)
	{
		this.result = result;
		metadata.setPagination(new Pagination().setCurrentPage(currentPage).setPageSize(pageSize).setTotalCount(totalCount).setTotalPages(totalPages));
	}

	public BaseResult(T result, List<Status> status)
	{
		this.result = result;
		metadata.setStatus(status);
	}
}
