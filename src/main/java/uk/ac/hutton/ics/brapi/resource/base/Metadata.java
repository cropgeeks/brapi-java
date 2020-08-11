package uk.ac.hutton.ics.brapi.resource.base;

import java.util.List;

public class Metadata
{
	private List<DataFile> datafiles;
	private Pagination     pagination;
	private List<Status>   status;

	public List<DataFile> getDatafiles()
	{
		return datafiles;
	}

	public Metadata setDatafiles(List<DataFile> datafiles)
	{
		this.datafiles = datafiles;
		return this;
	}

	public Pagination getPagination()
	{
		return pagination;
	}

	public Metadata setPagination(Pagination pagination)
	{
		this.pagination = pagination;
		return this;
	}

	public List<Status> getStatus()
	{
		return status;
	}

	public Metadata setStatus(List<Status> status)
	{
		this.status = status;
		return this;
	}
}
