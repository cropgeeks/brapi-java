package uk.ac.hutton.ics.brapi.resource.base;

import com.google.gson.annotations.SerializedName;

public class BaseResult<T>
{
	@SerializedName("@context")
	private String[] context  = new String[]{"https://brapi.org/jsonld/context/metadata.jsonld"};
	private Metadata metadata = new Metadata();
	private T        result;

	public BaseResult()
	{
	}

	public BaseResult(T result, int currentPage, int pageSize, long totalCount)
	{
		this.result = result;
		metadata.setPagination(new Pagination(pageSize, currentPage, totalCount, pageSize));
	}

	public Metadata getMetadata()
	{
		return metadata;
	}

	public BaseResult<T> setMetadata(Metadata metadata)
	{
		this.metadata = metadata;
		return this;
	}

	public T getResult()
	{
		return result;
	}

	public BaseResult<T> setResult(T result)
	{
		this.result = result;
		return this;
	}
}
