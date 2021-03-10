package uk.ac.hutton.ics.brapi.resource.base;

public class TokenPagination
{
	private int    pageSize;
	private int    currentPage;
	private long   totalCount;
	private int    totalPages;
	private String currentPageToken;
	private String nextPageToken;
	private String prevPageToken;

	public TokenPagination()
	{
	}

	public TokenPagination(int pageSize, String currentPageToken, long totalCount, int desiredPageSize)
	{
		this.pageSize = pageSize;
		this.currentPageToken = currentPageToken;
		this.totalCount = totalCount;
		this.totalPages = (int) Math.ceil(totalCount / (float) desiredPageSize);

		// If we can, generate values for prevPageToken and nextPageToken
		int currentPage = Integer.parseInt(currentPageToken);
		if (currentPage >= 1)
			prevPageToken = String.valueOf(currentPage - 1);
		if (currentPage < totalPages - 1)
			nextPageToken = String.valueOf(currentPage + 1);
	}

	public int getCurrentPage()
	{
		return currentPage;
	}

	public TokenPagination setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
		return this;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public TokenPagination setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
		return this;
	}

	public long getTotalCount()
	{
		return totalCount;
	}

	public TokenPagination setTotalCount(long totalCount)
	{
		this.totalCount = totalCount;
		return this;
	}

	public int getTotalPages()
	{
		return totalPages;
	}

	public TokenPagination setTotalPages(int totalPages)
	{
		this.totalPages = totalPages;
		return this;
	}

	public String getCurrentPageToken()
	{
		return currentPageToken;
	}

	public TokenPagination setCurrentPageToken(String currentPageToken)
	{
		this.currentPageToken = currentPageToken;
		return this;
	}

	public String getNextPageToken()
	{
		return nextPageToken;
	}

	public TokenPagination setNextPageToken(String nextPageToken)
	{
		this.nextPageToken = nextPageToken;
		return this;
	}

	public String getPrevPageToken()
	{
		return prevPageToken;
	}

	public TokenPagination setPrevPageToken(String prevPageToken)
	{
		this.prevPageToken = prevPageToken;
		return this;
	}
}
