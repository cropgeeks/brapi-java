package uk.ac.hutton.ics.brapi.resource.base;

import java.util.List;

public class TokenMetadata
{
	private List<DataFile>  datafiles;
	private TokenPagination pagination;
	private List<Status>    status;

	public List<DataFile> getDatafiles()
	{
		return datafiles;
	}

	public TokenMetadata setDatafiles(List<DataFile> datafiles)
	{
		this.datafiles = datafiles;
		return this;
	}

	public TokenPagination getPagination()
	{
		return pagination;
	}

	public TokenMetadata setPagination(TokenPagination pagination)
	{
		this.pagination = pagination;
		return this;
	}

	public List<Status> getStatus()
	{
		return status;
	}

	public TokenMetadata setStatus(List<Status> status)
	{
		this.status = status;
		return this;
	}
}
