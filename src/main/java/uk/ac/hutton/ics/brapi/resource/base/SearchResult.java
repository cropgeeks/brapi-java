package uk.ac.hutton.ics.brapi.resource.base;

public class SearchResult
{
	private String searchResultsDbId;

	public String getSearchResultsDbId()
	{
		return searchResultsDbId;
	}

	public SearchResult setSearchResultsDbId(String searchResultsDbId)
	{
		this.searchResultsDbId = searchResultsDbId;
		return this;
	}
}
