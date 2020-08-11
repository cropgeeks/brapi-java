package uk.ac.hutton.ics.brapi.resource.base;

import com.google.gson.annotations.SerializedName;

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

	public TokenMetadata getMetadata()
	{
		return metadata;
	}

	public TokenBaseResult<T> setMetadata(TokenMetadata metadata)
	{
		this.metadata = metadata;
		return this;
	}

	public T getResult()
	{
		return result;
	}

	public TokenBaseResult<T> setResult(T result)
	{
		this.result = result;
		return this;
	}
}
