package uk.ac.hutton.ics.brapi.resource.base;

public class Pagination
{
	private int  pageSize;
	private int  currentPage;
	private long totalCount;
	private int  totalPages;

	public Pagination()
	{
	}

	public Pagination(int pageSize, int currentPage, long totalCount, int desiredPageSize)
	{
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.totalPages = (int) Math.ceil(totalCount / (float) desiredPageSize);
	}

	public int getCurrentPage()
	{
		return currentPage;
	}

	public Pagination setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
		return this;
	}

	public int getPageSize()
	{
		return pageSize;
	}

	public Pagination setPageSize(int pageSize)
	{
		this.pageSize = pageSize;
		return this;
	}

	public long getTotalCount()
	{
		return totalCount;
	}

	public Pagination setTotalCount(long totalCount)
	{
		this.totalCount = totalCount;
		return this;
	}

	public int getTotalPages()
	{
		return totalPages;
	}

	public Pagination setTotalPages(int totalPages)
	{
		this.totalPages = totalPages;
		return this;
	}
}
